/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.0.0
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-17T14:31:10.718+02:00[Europe/Paris]")
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
   * Souhait d&#39;un aménagement
   * @return souhaitAmenagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Souhait d'un aménagement")

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
   * Liste des profils spécifiques
   * @return profilsSpecifiques
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liste des profils spécifiques")

  public List<String> getProfilsSpecifiques() {
    return profilsSpecifiques;
  }


  public void setProfilsSpecifiques(List<String> profilsSpecifiques) {
    this.profilsSpecifiques = profilsSpecifiques;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

