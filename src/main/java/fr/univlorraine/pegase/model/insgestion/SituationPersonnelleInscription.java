/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 20.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.insgestion;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SituationPersonnelleInscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class SituationPersonnelleInscription {
  public static final String SERIALIZED_NAME_AMENAGEMENTS_SPECIFIQUES = "amenagementsSpecifiques";
  @SerializedName(SERIALIZED_NAME_AMENAGEMENTS_SPECIFIQUES)
  private List<String> amenagementsSpecifiques = null;

  public static final String SERIALIZED_NAME_SOUHAIT_AMENAGEMENT = "souhaitAmenagement";
  @SerializedName(SERIALIZED_NAME_SOUHAIT_AMENAGEMENT)
  private Boolean souhaitAmenagement;

  public static final String SERIALIZED_NAME_PROFILS_SPECIFIQUES = "profilsSpecifiques";
  @SerializedName(SERIALIZED_NAME_PROFILS_SPECIFIQUES)
  private List<String> profilsSpecifiques = null;

  public SituationPersonnelleInscription() { 
  }

  public SituationPersonnelleInscription amenagementsSpecifiques(List<String> amenagementsSpecifiques) {
    
    this.amenagementsSpecifiques = amenagementsSpecifiques;
    return this;
  }

  public SituationPersonnelleInscription addAmenagementsSpecifiquesItem(String amenagementsSpecifiquesItem) {
    if (this.amenagementsSpecifiques == null) {
      this.amenagementsSpecifiques = new ArrayList<>();
    }
    this.amenagementsSpecifiques.add(amenagementsSpecifiquesItem);
    return this;
  }

   /**
   * Liste des situations donnant droit à des aménagements spécifiques
   * @return amenagementsSpecifiques
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liste des situations donnant droit à des aménagements spécifiques")

  public List<String> getAmenagementsSpecifiques() {
    return amenagementsSpecifiques;
  }


  public void setAmenagementsSpecifiques(List<String> amenagementsSpecifiques) {
    this.amenagementsSpecifiques = amenagementsSpecifiques;
  }


  public SituationPersonnelleInscription souhaitAmenagement(Boolean souhaitAmenagement) {
    
    this.souhaitAmenagement = souhaitAmenagement;
    return this;
  }

   /**
   * Réponse au souhait d&#39;un aménagement spécifique
   * @return souhaitAmenagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Réponse au souhait d'un aménagement spécifique")

  public Boolean getSouhaitAmenagement() {
    return souhaitAmenagement;
  }


  public void setSouhaitAmenagement(Boolean souhaitAmenagement) {
    this.souhaitAmenagement = souhaitAmenagement;
  }


  public SituationPersonnelleInscription profilsSpecifiques(List<String> profilsSpecifiques) {
    
    this.profilsSpecifiques = profilsSpecifiques;
    return this;
  }

  public SituationPersonnelleInscription addProfilsSpecifiquesItem(String profilsSpecifiquesItem) {
    if (this.profilsSpecifiques == null) {
      this.profilsSpecifiques = new ArrayList<>();
    }
    this.profilsSpecifiques.add(profilsSpecifiquesItem);
    return this;
  }

   /**
   * Code du profil spécifique issu de la nomenclature Profils exonérants  Codes de la nomenclature sur 6 caractères. Préfixe des codes : PRF 
   * @return profilsSpecifiques
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code du profil spécifique issu de la nomenclature Profils exonérants  Codes de la nomenclature sur 6 caractères. Préfixe des codes : PRF ")

  public List<String> getProfilsSpecifiques() {
    return profilsSpecifiques;
  }


  public void setProfilsSpecifiques(List<String> profilsSpecifiques) {
    this.profilsSpecifiques = profilsSpecifiques;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationPersonnelleInscription situationPersonnelleInscription = (SituationPersonnelleInscription) o;
    return Objects.equals(this.amenagementsSpecifiques, situationPersonnelleInscription.amenagementsSpecifiques) &&
        Objects.equals(this.souhaitAmenagement, situationPersonnelleInscription.souhaitAmenagement) &&
        Objects.equals(this.profilsSpecifiques, situationPersonnelleInscription.profilsSpecifiques);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amenagementsSpecifiques, souhaitAmenagement, profilsSpecifiques);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationPersonnelleInscription {\n");
    sb.append("    amenagementsSpecifiques: ").append(toIndentedString(amenagementsSpecifiques)).append("\n");
    sb.append("    souhaitAmenagement: ").append(toIndentedString(souhaitAmenagement)).append("\n");
    sb.append("    profilsSpecifiques: ").append(toIndentedString(profilsSpecifiques)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

