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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VueContactAdresseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T10:46:47.317+02:00[Europe/Paris]")
public class VueContactAdresseAllOf {
  public static final String SERIALIZED_NAME_PAYS = "pays";
  @SerializedName(SERIALIZED_NAME_PAYS)
  private String pays;

  public static final String SERIALIZED_NAME_LIGNE1_OU_ETAGE = "ligne1OuEtage";
  @SerializedName(SERIALIZED_NAME_LIGNE1_OU_ETAGE)
  private String ligne1OuEtage;

  public static final String SERIALIZED_NAME_LIGNE2_OU_BATIMENT = "ligne2OuBatiment";
  @SerializedName(SERIALIZED_NAME_LIGNE2_OU_BATIMENT)
  private String ligne2OuBatiment;

  public static final String SERIALIZED_NAME_LIGNE3_OU_VOIE = "ligne3OuVoie";
  @SerializedName(SERIALIZED_NAME_LIGNE3_OU_VOIE)
  private String ligne3OuVoie;

  public static final String SERIALIZED_NAME_LIGNE4_OU_COMPLEMENT = "ligne4OuComplement";
  @SerializedName(SERIALIZED_NAME_LIGNE4_OU_COMPLEMENT)
  private String ligne4OuComplement;

  public static final String SERIALIZED_NAME_LIGNE5_ETRANGER = "ligne5Etranger";
  @SerializedName(SERIALIZED_NAME_LIGNE5_ETRANGER)
  private String ligne5Etranger;

  public static final String SERIALIZED_NAME_CODE_POSTAL = "codePostal";
  @SerializedName(SERIALIZED_NAME_CODE_POSTAL)
  private String codePostal;

  public static final String SERIALIZED_NAME_COMMUNE = "commune";
  @SerializedName(SERIALIZED_NAME_COMMUNE)
  private String commune;

  public VueContactAdresseAllOf() { 
  }

  public VueContactAdresseAllOf pays(String pays) {
    
    this.pays = pays;
    return this;
  }

   /**
   * Code INSEE du pays (100 pour la France, sinon l&#39;adresse est à l&#39;étranger)
   * @return pays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Code INSEE du pays (100 pour la France, sinon l'adresse est à l'étranger)")

  public String getPays() {
    return pays;
  }


  public void setPays(String pays) {
    this.pays = pays;
  }


  public VueContactAdresseAllOf ligne1OuEtage(String ligne1OuEtage) {
    
    this.ligne1OuEtage = ligne1OuEtage;
    return this;
  }

   /**
   * Le n°app/étage/couloir/esc/chez ou ligne 1 de l&#39;adresse étrangère
   * @return ligne1OuEtage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le n°app/étage/couloir/esc/chez ou ligne 1 de l'adresse étrangère")

  public String getLigne1OuEtage() {
    return ligne1OuEtage;
  }


  public void setLigne1OuEtage(String ligne1OuEtage) {
    this.ligne1OuEtage = ligne1OuEtage;
  }


  public VueContactAdresseAllOf ligne2OuBatiment(String ligne2OuBatiment) {
    
    this.ligne2OuBatiment = ligne2OuBatiment;
    return this;
  }

   /**
   * L&#39;entrée/bâtiment/immeuble/résidence ou ligne 2 de l&#39;adresse étrangère
   * @return ligne2OuBatiment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'entrée/bâtiment/immeuble/résidence ou ligne 2 de l'adresse étrangère")

  public String getLigne2OuBatiment() {
    return ligne2OuBatiment;
  }


  public void setLigne2OuBatiment(String ligne2OuBatiment) {
    this.ligne2OuBatiment = ligne2OuBatiment;
  }


  public VueContactAdresseAllOf ligne3OuVoie(String ligne3OuVoie) {
    
    this.ligne3OuVoie = ligne3OuVoie;
    return this;
  }

   /**
   * Le numéro et le libellé de la voie ou ligne 3 de l&#39;adresse étrangère
   * @return ligne3OuVoie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le numéro et le libellé de la voie ou ligne 3 de l'adresse étrangère")

  public String getLigne3OuVoie() {
    return ligne3OuVoie;
  }


  public void setLigne3OuVoie(String ligne3OuVoie) {
    this.ligne3OuVoie = ligne3OuVoie;
  }


  public VueContactAdresseAllOf ligne4OuComplement(String ligne4OuComplement) {
    
    this.ligne4OuComplement = ligne4OuComplement;
    return this;
  }

   /**
   * Le lieu-dit ou service particulier de distribution ou ligne 4 de l&#39;adresse étrangère
   * @return ligne4OuComplement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le lieu-dit ou service particulier de distribution ou ligne 4 de l'adresse étrangère")

  public String getLigne4OuComplement() {
    return ligne4OuComplement;
  }


  public void setLigne4OuComplement(String ligne4OuComplement) {
    this.ligne4OuComplement = ligne4OuComplement;
  }


  public VueContactAdresseAllOf ligne5Etranger(String ligne5Etranger) {
    
    this.ligne5Etranger = ligne5Etranger;
    return this;
  }

   /**
   * Ligne 5 de l&#39;adresse étrangère (vide si adresse en France)
   * @return ligne5Etranger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ligne 5 de l'adresse étrangère (vide si adresse en France)")

  public String getLigne5Etranger() {
    return ligne5Etranger;
  }


  public void setLigne5Etranger(String ligne5Etranger) {
    this.ligne5Etranger = ligne5Etranger;
  }


  public VueContactAdresseAllOf codePostal(String codePostal) {
    
    this.codePostal = codePostal;
    return this;
  }

   /**
   * Le code postal de l&#39;adresse en France (vide si adresse étrangère)
   * @return codePostal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code postal de l'adresse en France (vide si adresse étrangère)")

  public String getCodePostal() {
    return codePostal;
  }


  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }


  public VueContactAdresseAllOf commune(String commune) {
    
    this.commune = commune;
    return this;
  }

   /**
   * Le code INSEE de la commune de l&#39;adresse en France (vide si adresse étrangère)
   * @return commune
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code INSEE de la commune de l'adresse en France (vide si adresse étrangère)")

  public String getCommune() {
    return commune;
  }


  public void setCommune(String commune) {
    this.commune = commune;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VueContactAdresseAllOf vueContactAdresseAllOf = (VueContactAdresseAllOf) o;
    return Objects.equals(this.pays, vueContactAdresseAllOf.pays) &&
        Objects.equals(this.ligne1OuEtage, vueContactAdresseAllOf.ligne1OuEtage) &&
        Objects.equals(this.ligne2OuBatiment, vueContactAdresseAllOf.ligne2OuBatiment) &&
        Objects.equals(this.ligne3OuVoie, vueContactAdresseAllOf.ligne3OuVoie) &&
        Objects.equals(this.ligne4OuComplement, vueContactAdresseAllOf.ligne4OuComplement) &&
        Objects.equals(this.ligne5Etranger, vueContactAdresseAllOf.ligne5Etranger) &&
        Objects.equals(this.codePostal, vueContactAdresseAllOf.codePostal) &&
        Objects.equals(this.commune, vueContactAdresseAllOf.commune);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pays, ligne1OuEtage, ligne2OuBatiment, ligne3OuVoie, ligne4OuComplement, ligne5Etranger, codePostal, commune);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VueContactAdresseAllOf {\n");
    sb.append("    pays: ").append(toIndentedString(pays)).append("\n");
    sb.append("    ligne1OuEtage: ").append(toIndentedString(ligne1OuEtage)).append("\n");
    sb.append("    ligne2OuBatiment: ").append(toIndentedString(ligne2OuBatiment)).append("\n");
    sb.append("    ligne3OuVoie: ").append(toIndentedString(ligne3OuVoie)).append("\n");
    sb.append("    ligne4OuComplement: ").append(toIndentedString(ligne4OuComplement)).append("\n");
    sb.append("    ligne5Etranger: ").append(toIndentedString(ligne5Etranger)).append("\n");
    sb.append("    codePostal: ").append(toIndentedString(codePostal)).append("\n");
    sb.append("    commune: ").append(toIndentedString(commune)).append("\n");
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

