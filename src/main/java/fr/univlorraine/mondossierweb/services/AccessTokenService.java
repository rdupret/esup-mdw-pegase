/**
 *
 *  ESUP-Portail ESUP-MONDOSSIERWEB-PEGASE - Copyright (c) 2021 ESUP-Portail consortium
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package fr.univlorraine.mondossierweb.services;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import fr.univlorraine.mondossierweb.controllers.ConfigController;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;


@Service
@SuppressWarnings("serial")
@Slf4j
public class AccessTokenService implements Serializable {


	private transient String tokenUrl;	
	private transient String username;	
	private transient String password;
	private transient Long duration;

	private String token;
	private LocalDateTime tokenCreatedDateTime;
	
	@Autowired
	private transient ConfigController configController;


	private void getTokenUrl() {
		tokenUrl = configController.getAccesTokenUrl();
	}
	
	private void getUsername() {
			username = configController.getAccesTokenUsername();
	}
	
	private void getPassword() {
		password = configController.getAccesTokenPassword();
	}
	
	private void getDuration() {
		String d = configController.getAccesTokenDuration();
		if(d != null) {
			duration = Long.parseLong(d);
		}
	}
	
	public void refreshParameters() {
		// Maj des paramétres depuis la bdd
		getTokenUrl();
		getUsername();
		getPassword();
		getDuration();
		// suppression de l'ancien token
		token = null;
	}
	
	@PostConstruct
	public void init() {	
		refreshParameters();
	}
	
	private void getAccessToken() {
		// Si l'url de récupération du token est paramétrée
		if(StringUtils.hasText(tokenUrl)){
			// Headers
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

			// URL
			String url = tokenUrl + "?username={username}&password={password}&token=true";

			// Paramètres
			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("username", username);
			uriVariables.put("password", password);

			// RestTemplate
			RestTemplate restTemplate = new RestTemplate();
			log.info("Demande du Access Token à Pegase...");
			ResponseEntity<String> tokenResponse = restTemplate.exchange(url, HttpMethod.POST, null, String.class, uriVariables);
			// Récupération du token dans la réponse
			if(tokenResponse.getStatusCode().is2xxSuccessful() 
				&& StringUtils.hasText(tokenResponse.getBody())) {
				this.token= tokenResponse.getBody();
				this.tokenCreatedDateTime = LocalDateTime.now();
				log.info("Access Token récupéré : {}", this.token);
			} else {
				log.error("Anomalie lors de la récupération de access token PEGASE : {}", tokenResponse.getStatusCode());
			}
		}
	}

	@Synchronized
	private void checkToken() {
		log.info("Check Access Token");
		if(token == null || tokenExpired()) {
			getAccessToken();
		}
	}

	private boolean tokenExpired() {
		LocalDateTime ldt = LocalDateTime.now();
		return (tokenCreatedDateTime.until( ldt, ChronoUnit.HOURS ) > duration);
	}

	public String getToken() {
		if(token == null) {
			checkToken();
		}
		return token;
	}

	@Scheduled(fixedRate = 60000)
	public void cronJobCheckToken() {
		checkToken();
	}

}
