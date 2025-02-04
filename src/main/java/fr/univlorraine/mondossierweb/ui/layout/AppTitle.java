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
package fr.univlorraine.mondossierweb.ui.layout;

import java.io.ByteArrayInputStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.i18n.LocaleChangeEvent;
import com.vaadin.flow.i18n.LocaleChangeObserver;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.spring.annotation.UIScope;

import fr.univlorraine.mondossierweb.controllers.ConfigController;
import fr.univlorraine.mondossierweb.services.CurrentUiService;
import fr.univlorraine.mondossierweb.utils.CSSColorUtils;
import fr.univlorraine.mondossierweb.utils.ReactiveUtils;
import fr.univlorraine.mondossierweb.utils.Utils;

@Component
@UIScope
@SuppressWarnings("serial")
public class AppTitle extends HorizontalLayout implements LocaleChangeObserver {
	
	@Autowired
	private transient CurrentUiService currentUiService;
	@Autowired
	private transient BuildProperties buildProperties;
	@Autowired
	private transient ConfigController configController;
	
	private transient String srcLogo = "";
	private transient String srcLogoDark = "";
	
	private HorizontalLayout titleLayout = new HorizontalLayout();
	private final Image logo = new Image();


	@PostConstruct
	private void init() {
		byte[] imgLogo = configController.getUnivLogoImg();
		
		setAlignItems(Alignment.END);
		getStyle().set(CSSColorUtils.MARGIN_LEFT, CSSColorUtils.AUTO);
		getStyle().set("height", "3.75em");
		

		ReactiveUtils.subscribeWhenAttached(this,
			currentUiService.getDarkModeFlux()
				.map(darkMode -> Boolean.TRUE.equals(darkMode) ? srcLogoDark : srcLogo)
				.map(logoSrc -> () -> updateLogo(imgLogo)));

		titleLayout.add(logo);

		Div appNameTitle = new Div(new Text(buildProperties.getName()));
		appNameTitle.getElement().getStyle().set("font-size", "var(--lumo-font-size-xl)");
		appNameTitle.addClassName("tracking-in-expand");
		titleLayout.add(appNameTitle);
		
		titleLayout.getStyle().set(CSSColorUtils.MARGIN_LEFT, CSSColorUtils.AUTO);
		titleLayout.getStyle().set(CSSColorUtils.MARGIN_RIGHT, CSSColorUtils.AUTO);
		titleLayout.setWidthFull();
		titleLayout.getStyle().set("max-width", "16em");
		titleLayout.getStyle().set(CSSColorUtils.PADDING_LEFT, "1em");
		titleLayout.getStyle().set(CSSColorUtils.MARGIN_TOP, CSSColorUtils.AUTO);
		titleLayout.getStyle().set(CSSColorUtils.MARGIN_BOTTOM, CSSColorUtils.AUTO);
		
		getStyle().set(CSSColorUtils.BACKGROUND_COLOR, CSSColorUtils.MAIN_COLOR);
		getStyle().set(CSSColorUtils.COLOR, CSSColorUtils.WHITE);
		
		add(titleLayout);
		
		
	}

	private void updateLogo(byte[] logoImg) {
		if(logoImg != null) {
			StreamResource resource = new StreamResource("", () -> new ByteArrayInputStream(logoImg));
			logo.setSrc(resource);
		}
		logo.setHeight(Utils.LARGEUR_LOGO);
		logo.setWidth(Utils.HAUTEUR_LOGO);
	}

	/**
	 * @see com.vaadin.flow.i18n.LocaleChangeObserver#localeChange(com.vaadin.flow.i18n.LocaleChangeEvent)
	 */
	@Override
	public void localeChange(final LocaleChangeEvent event) {
		logo.setAlt(getTranslation("menu.alt-logo"));
	}

}
