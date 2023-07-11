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
import fr.univlorraine.pegase.model.insgestion.BourseOuAide;
import fr.univlorraine.pegase.model.insgestion.RegimeInscription;
import fr.univlorraine.pegase.model.insgestion.SituationAnneePrecedente;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Occurrence de nomenclature par défaut
 */
@ApiModel(description = "Occurrence de nomenclature par défaut")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class Nomenclature {
  public static final String SERIALIZED_NAME_TYPE_NOMENCLATURE = "typeNomenclature";
  @SerializedName(SERIALIZED_NAME_TYPE_NOMENCLATURE)
  protected String typeNomenclature;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_LIBELLE = "libelle";
  @SerializedName(SERIALIZED_NAME_LIBELLE)
  private String libelle;

  public static final String SERIALIZED_NAME_PRIORITE_AFFICHAGE = "prioriteAffichage";
  @SerializedName(SERIALIZED_NAME_PRIORITE_AFFICHAGE)
  private Integer prioriteAffichage;

  public Nomenclature() { 
    this.typeNomenclature = this.getClass().getSimpleName();
  }

  public Nomenclature typeNomenclature(String typeNomenclature) {
    
    this.typeNomenclature = typeNomenclature;
    return this;
  }

   /**
   * Get typeNomenclature
   * @return typeNomenclature
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTypeNomenclature() {
    return typeNomenclature;
  }


  public void setTypeNomenclature(String typeNomenclature) {
    this.typeNomenclature = typeNomenclature;
  }


  public Nomenclature code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * code de l&#39;occurrence de nomenclature
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "code de l'occurrence de nomenclature")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Nomenclature libelle(String libelle) {
    
    this.libelle = libelle;
    return this;
  }

   /**
   * libelle de l&#39;occurrence destinée à l&#39;affichage
   * @return libelle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "libelle de l'occurrence destinée à l'affichage")

  public String getLibelle() {
    return libelle;
  }


  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }


  public Nomenclature prioriteAffichage(Integer prioriteAffichage) {
    
    this.prioriteAffichage = prioriteAffichage;
    return this;
  }

   /**
   * priorité d&#39;affichage de l&#39;occurrence de nomenclature
   * @return prioriteAffichage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "priorité d'affichage de l'occurrence de nomenclature")

  public Integer getPrioriteAffichage() {
    return prioriteAffichage;
  }


  public void setPrioriteAffichage(Integer prioriteAffichage) {
    this.prioriteAffichage = prioriteAffichage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nomenclature nomenclature = (Nomenclature) o;
    return Objects.equals(this.typeNomenclature, nomenclature.typeNomenclature) &&
        Objects.equals(this.code, nomenclature.code) &&
        Objects.equals(this.libelle, nomenclature.libelle) &&
        Objects.equals(this.prioriteAffichage, nomenclature.prioriteAffichage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeNomenclature, code, libelle, prioriteAffichage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nomenclature {\n");
    sb.append("    typeNomenclature: ").append(toIndentedString(typeNomenclature)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    libelle: ").append(toIndentedString(libelle)).append("\n");
    sb.append("    prioriteAffichage: ").append(toIndentedString(prioriteAffichage)).append("\n");
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

