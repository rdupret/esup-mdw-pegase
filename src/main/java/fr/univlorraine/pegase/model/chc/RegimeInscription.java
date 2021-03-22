/*
 * API CHC v4
 * Liste l'ensemble des services et des opérations disponibles dans le module choix des cursus v4
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.chc;

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
import java.time.LocalDate;

/**
 * RegimeInscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T10:55:46.355+01:00[Europe/Paris]")
public class RegimeInscription {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATE_DEBUT = "dateDebut";
  @SerializedName(SERIALIZED_NAME_DATE_DEBUT)
  private LocalDate dateDebut;

  public static final String SERIALIZED_NAME_LIBELLE_COURT = "libelleCourt";
  @SerializedName(SERIALIZED_NAME_LIBELLE_COURT)
  private String libelleCourt;


  public RegimeInscription code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Le code du régime d&#39;inscription - identifiant unique
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du régime d'inscription - identifiant unique")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public RegimeInscription dateDebut(LocalDate dateDebut) {
    
    this.dateDebut = dateDebut;
    return this;
  }

   /**
   * La date de début
   * @return dateDebut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La date de début")

  public LocalDate getDateDebut() {
    return dateDebut;
  }


  public void setDateDebut(LocalDate dateDebut) {
    this.dateDebut = dateDebut;
  }


  public RegimeInscription libelleCourt(String libelleCourt) {
    
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Le libellé court
   * @return libelleCourt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le libellé court")

  public String getLibelleCourt() {
    return libelleCourt;
  }


  public void setLibelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegimeInscription regimeInscription = (RegimeInscription) o;
    return Objects.equals(this.code, regimeInscription.code) &&
        Objects.equals(this.dateDebut, regimeInscription.dateDebut) &&
        Objects.equals(this.libelleCourt, regimeInscription.libelleCourt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, dateDebut, libelleCourt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegimeInscription {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateDebut: ").append(toIndentedString(dateDebut)).append("\n");
    sb.append("    libelleCourt: ").append(toIndentedString(libelleCourt)).append("\n");
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

