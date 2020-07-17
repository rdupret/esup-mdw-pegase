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
import java.math.BigDecimal;

/**
 * SituationPrecedente
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-17T14:31:10.718+02:00[Europe/Paris]")
public class SituationPrecedente {
  public static final String SERIALIZED_NAME_ANNEE_PRECEDENTE = "anneePrecedente";
  @SerializedName(SERIALIZED_NAME_ANNEE_PRECEDENTE)
  private BigDecimal anneePrecedente;

  public static final String SERIALIZED_NAME_SITUATION_PRECEDENTE = "situationPrecedente";
  @SerializedName(SERIALIZED_NAME_SITUATION_PRECEDENTE)
  private String situationPrecedente;

  public static final String SERIALIZED_NAME_ANNEE_OBTENTION_DU_DERNIER_DIPLOME = "anneeObtentionDuDernierDiplome";
  @SerializedName(SERIALIZED_NAME_ANNEE_OBTENTION_DU_DERNIER_DIPLOME)
  private BigDecimal anneeObtentionDuDernierDiplome;

  public static final String SERIALIZED_NAME_DERNIER_DIPLOME = "dernierDiplome";
  @SerializedName(SERIALIZED_NAME_DERNIER_DIPLOME)
  private String dernierDiplome;


  public SituationPrecedente anneePrecedente(BigDecimal anneePrecedente) {
    
    this.anneePrecedente = anneePrecedente;
    return this;
  }

   /**
   * L&#39;année universitaire précédent l&#39;inscription en cours
   * @return anneePrecedente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'année universitaire précédent l'inscription en cours")

  public BigDecimal getAnneePrecedente() {
    return anneePrecedente;
  }


  public void setAnneePrecedente(BigDecimal anneePrecedente) {
    this.anneePrecedente = anneePrecedente;
  }


  public SituationPrecedente situationPrecedente(String situationPrecedente) {
    
    this.situationPrecedente = situationPrecedente;
    return this;
  }

   /**
   * La situation durant l&#39;année universitaire précédent l&#39;inscription en cours
   * @return situationPrecedente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La situation durant l'année universitaire précédent l'inscription en cours")

  public String getSituationPrecedente() {
    return situationPrecedente;
  }


  public void setSituationPrecedente(String situationPrecedente) {
    this.situationPrecedente = situationPrecedente;
  }


  public SituationPrecedente anneeObtentionDuDernierDiplome(BigDecimal anneeObtentionDuDernierDiplome) {
    
    this.anneeObtentionDuDernierDiplome = anneeObtentionDuDernierDiplome;
    return this;
  }

   /**
   * L&#39;année d&#39;obtention du dernier diplôme
   * @return anneeObtentionDuDernierDiplome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'année d'obtention du dernier diplôme")

  public BigDecimal getAnneeObtentionDuDernierDiplome() {
    return anneeObtentionDuDernierDiplome;
  }


  public void setAnneeObtentionDuDernierDiplome(BigDecimal anneeObtentionDuDernierDiplome) {
    this.anneeObtentionDuDernierDiplome = anneeObtentionDuDernierDiplome;
  }


  public SituationPrecedente dernierDiplome(String dernierDiplome) {
    
    this.dernierDiplome = dernierDiplome;
    return this;
  }

   /**
   * Le type du dernier diplôme obtenu
   * @return dernierDiplome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le type du dernier diplôme obtenu")

  public String getDernierDiplome() {
    return dernierDiplome;
  }


  public void setDernierDiplome(String dernierDiplome) {
    this.dernierDiplome = dernierDiplome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationPrecedente situationPrecedente = (SituationPrecedente) o;
    return Objects.equals(this.anneePrecedente, situationPrecedente.anneePrecedente) &&
        Objects.equals(this.situationPrecedente, situationPrecedente.situationPrecedente) &&
        Objects.equals(this.anneeObtentionDuDernierDiplome, situationPrecedente.anneeObtentionDuDernierDiplome) &&
        Objects.equals(this.dernierDiplome, situationPrecedente.dernierDiplome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anneePrecedente, situationPrecedente, anneeObtentionDuDernierDiplome, dernierDiplome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationPrecedente {\n");
    sb.append("    anneePrecedente: ").append(toIndentedString(anneePrecedente)).append("\n");
    sb.append("    situationPrecedente: ").append(toIndentedString(situationPrecedente)).append("\n");
    sb.append("    anneeObtentionDuDernierDiplome: ").append(toIndentedString(anneeObtentionDuDernierDiplome)).append("\n");
    sb.append("    dernierDiplome: ").append(toIndentedString(dernierDiplome)).append("\n");
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

