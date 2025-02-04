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
package fr.univlorraine.mondossierweb.utils;

/**
 * Outils pour la gestion des préférences de l'application
 * @author Charlie Dubois
 */
public final class PrefUtils {

	public static final String DARK_MODE = "DARK_MODE";
	public static final String HIDE_WELCOME_MESSAGE = "HIDE_WELCOME_MESSAGE ";

	private PrefUtils() {
		throw new IllegalStateException("Utility class");
	}
	
	public static Boolean getBooleanValue(String valeur) {
		return (valeur != null && valeur.equalsIgnoreCase("true"));	
	}

}
