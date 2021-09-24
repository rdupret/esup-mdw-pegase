/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.insgestion;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Le statut de l&#39;inscription
 */
@JsonAdapter(StatutInscriptionVoeu.Adapter.class)
public enum StatutInscriptionVoeu {
  
  PREINSCRIT("preinscrit"),
  
  NON_DEMARRE("non_demarre"),
  
  EN_COURS("en_cours"),
  
  VALIDE("valide"),
  
  EN_ACTUALISATION("en_actualisation"),
  
  VALIDEE_EN_MULTI_CURSUS("validee_en_multi_cursus"),
  
  ANNULEE("annulee");

  private String value;

  StatutInscriptionVoeu(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatutInscriptionVoeu fromValue(String value) {
    for (StatutInscriptionVoeu b : StatutInscriptionVoeu.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StatutInscriptionVoeu> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatutInscriptionVoeu enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StatutInscriptionVoeu read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StatutInscriptionVoeu.fromValue(value);
    }
  }
}

