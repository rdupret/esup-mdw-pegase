/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.4.0
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

/**
 * DemandeDeContactAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-27T10:35:31.587+02:00[Europe/Paris]")
public class DemandeDeContactAllOf {
  public static final String SERIALIZED_NAME_DATE_DEBUT_VALIDITE = "dateDebutValidite";
  @SerializedName(SERIALIZED_NAME_DATE_DEBUT_VALIDITE)
  private String dateDebutValidite;

  public static final String SERIALIZED_NAME_DATE_FIN_VALIDITE = "dateFinValidite";
  @SerializedName(SERIALIZED_NAME_DATE_FIN_VALIDITE)
  private String dateFinValidite;

  public static final String SERIALIZED_NAME_PRIORITE_AFFICHAGE = "prioriteAffichage";
  @SerializedName(SERIALIZED_NAME_PRIORITE_AFFICHAGE)
  private Integer prioriteAffichage;

  public static final String SERIALIZED_NAME_TEMOIN_LIVRE = "temoinLivre";
  @SerializedName(SERIALIZED_NAME_TEMOIN_LIVRE)
  private Boolean temoinLivre;


  public DemandeDeContactAllOf dateDebutValidite(String dateDebutValidite) {
    
    this.dateDebutValidite = dateDebutValidite;
    return this;
  }

   /**
   * La date de début de validité
   * @return dateDebutValidite
  **/
  @ApiModelProperty(required = true, value = "La date de début de validité")

  public String getDateDebutValidite() {
    return dateDebutValidite;
  }


  public void setDateDebutValidite(String dateDebutValidite) {
    this.dateDebutValidite = dateDebutValidite;
  }


  public DemandeDeContactAllOf dateFinValidite(String dateFinValidite) {
    
    this.dateFinValidite = dateFinValidite;
    return this;
  }

   /**
   * La date de fin de validité
   * @return dateFinValidite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La date de fin de validité")

  public String getDateFinValidite() {
    return dateFinValidite;
  }


  public void setDateFinValidite(String dateFinValidite) {
    this.dateFinValidite = dateFinValidite;
  }


  public DemandeDeContactAllOf prioriteAffichage(Integer prioriteAffichage) {
    
    this.prioriteAffichage = prioriteAffichage;
    return this;
  }

   /**
   * La priorité d&#39;affichage
   * @return prioriteAffichage
  **/
  @ApiModelProperty(required = true, value = "La priorité d'affichage")

  public Integer getPrioriteAffichage() {
    return prioriteAffichage;
  }


  public void setPrioriteAffichage(Integer prioriteAffichage) {
    this.prioriteAffichage = prioriteAffichage;
  }


  public DemandeDeContactAllOf temoinLivre(Boolean temoinLivre) {
    
    this.temoinLivre = temoinLivre;
    return this;
  }

   /**
   * Le témoin livré
   * @return temoinLivre
  **/
  @ApiModelProperty(required = true, value = "Le témoin livré")

  public Boolean getTemoinLivre() {
    return temoinLivre;
  }


  public void setTemoinLivre(Boolean temoinLivre) {
    this.temoinLivre = temoinLivre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandeDeContactAllOf demandeDeContactAllOf = (DemandeDeContactAllOf) o;
    return Objects.equals(this.dateDebutValidite, demandeDeContactAllOf.dateDebutValidite) &&
        Objects.equals(this.dateFinValidite, demandeDeContactAllOf.dateFinValidite) &&
        Objects.equals(this.prioriteAffichage, demandeDeContactAllOf.prioriteAffichage) &&
        Objects.equals(this.temoinLivre, demandeDeContactAllOf.temoinLivre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateDebutValidite, dateFinValidite, prioriteAffichage, temoinLivre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandeDeContactAllOf {\n");
    sb.append("    dateDebutValidite: ").append(toIndentedString(dateDebutValidite)).append("\n");
    sb.append("    dateFinValidite: ").append(toIndentedString(dateFinValidite)).append("\n");
    sb.append("    prioriteAffichage: ").append(toIndentedString(prioriteAffichage)).append("\n");
    sb.append("    temoinLivre: ").append(toIndentedString(temoinLivre)).append("\n");
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

