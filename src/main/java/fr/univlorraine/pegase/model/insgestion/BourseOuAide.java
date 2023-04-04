/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 16.0.0
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
import fr.univlorraine.pegase.model.insgestion.BourseOuAideAllOf;
import fr.univlorraine.pegase.model.insgestion.Nomenclature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BourseOuAide
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T10:46:47.317+02:00[Europe/Paris]")
public class BourseOuAide extends Nomenclature {
  public static final String SERIALIZED_NAME_TYPE_BOURSE = "typeBourse";
  @SerializedName(SERIALIZED_NAME_TYPE_BOURSE)
  private String typeBourse;

  public static final String SERIALIZED_NAME_TEMOIN_EXONERE = "temoinExonere";
  @SerializedName(SERIALIZED_NAME_TEMOIN_EXONERE)
  private Boolean temoinExonere;

  public BourseOuAide() { 
    this.typeNomenclature = this.getClass().getSimpleName();
  }

  public BourseOuAide typeBourse(String typeBourse) {
    
    this.typeBourse = typeBourse;
    return this;
  }

   /**
   * Le type de la bourse oude l&#39;aide
   * @return typeBourse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le type de la bourse oude l'aide")

  public String getTypeBourse() {
    return typeBourse;
  }


  public void setTypeBourse(String typeBourse) {
    this.typeBourse = typeBourse;
  }


  public BourseOuAide temoinExonere(Boolean temoinExonere) {
    
    this.temoinExonere = temoinExonere;
    return this;
  }

   /**
   * Indique si l&#39;étudiant est exonéré
   * @return temoinExonere
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indique si l'étudiant est exonéré")

  public Boolean getTemoinExonere() {
    return temoinExonere;
  }


  public void setTemoinExonere(Boolean temoinExonere) {
    this.temoinExonere = temoinExonere;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BourseOuAide bourseOuAide = (BourseOuAide) o;
    return Objects.equals(this.typeBourse, bourseOuAide.typeBourse) &&
        Objects.equals(this.temoinExonere, bourseOuAide.temoinExonere) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeBourse, temoinExonere, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BourseOuAide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    typeBourse: ").append(toIndentedString(typeBourse)).append("\n");
    sb.append("    temoinExonere: ").append(toIndentedString(temoinExonere)).append("\n");
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

