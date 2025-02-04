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

/**
 * EtatCivil
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class EtatCivil {
  public static final String SERIALIZED_NAME_NOM_DE_NAISSANCE = "nomDeNaissance";
  @SerializedName(SERIALIZED_NAME_NOM_DE_NAISSANCE)
  private String nomDeNaissance;

  public static final String SERIALIZED_NAME_NOM_USUEL = "nomUsuel";
  @SerializedName(SERIALIZED_NAME_NOM_USUEL)
  private String nomUsuel;

  public static final String SERIALIZED_NAME_PRENOM = "prenom";
  @SerializedName(SERIALIZED_NAME_PRENOM)
  private String prenom;

  public static final String SERIALIZED_NAME_DEUXIEME_PRENOM = "deuxiemePrenom";
  @SerializedName(SERIALIZED_NAME_DEUXIEME_PRENOM)
  private String deuxiemePrenom;

  public static final String SERIALIZED_NAME_TROISIEME_PRENOM = "troisiemePrenom";
  @SerializedName(SERIALIZED_NAME_TROISIEME_PRENOM)
  private String troisiemePrenom;

  public static final String SERIALIZED_NAME_GENRE = "genre";
  @SerializedName(SERIALIZED_NAME_GENRE)
  private String genre;

  public EtatCivil() { 
  }

  public EtatCivil nomDeNaissance(String nomDeNaissance) {
    
    this.nomDeNaissance = nomDeNaissance;
    return this;
  }

   /**
   * Le nom de naissance
   * @return nomDeNaissance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le nom de naissance")

  public String getNomDeNaissance() {
    return nomDeNaissance;
  }


  public void setNomDeNaissance(String nomDeNaissance) {
    this.nomDeNaissance = nomDeNaissance;
  }


  public EtatCivil nomUsuel(String nomUsuel) {
    
    this.nomUsuel = nomUsuel;
    return this;
  }

   /**
   * Le nom usuel
   * @return nomUsuel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le nom usuel")

  public String getNomUsuel() {
    return nomUsuel;
  }


  public void setNomUsuel(String nomUsuel) {
    this.nomUsuel = nomUsuel;
  }


  public EtatCivil prenom(String prenom) {
    
    this.prenom = prenom;
    return this;
  }

   /**
   * Le prénom
   * @return prenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le prénom")

  public String getPrenom() {
    return prenom;
  }


  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  public EtatCivil deuxiemePrenom(String deuxiemePrenom) {
    
    this.deuxiemePrenom = deuxiemePrenom;
    return this;
  }

   /**
   * Le deuxième prénom
   * @return deuxiemePrenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le deuxième prénom")

  public String getDeuxiemePrenom() {
    return deuxiemePrenom;
  }


  public void setDeuxiemePrenom(String deuxiemePrenom) {
    this.deuxiemePrenom = deuxiemePrenom;
  }


  public EtatCivil troisiemePrenom(String troisiemePrenom) {
    
    this.troisiemePrenom = troisiemePrenom;
    return this;
  }

   /**
   * Le troisième prénom
   * @return troisiemePrenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le troisième prénom")

  public String getTroisiemePrenom() {
    return troisiemePrenom;
  }


  public void setTroisiemePrenom(String troisiemePrenom) {
    this.troisiemePrenom = troisiemePrenom;
  }


  public EtatCivil genre(String genre) {
    
    this.genre = genre;
    return this;
  }

   /**
   * Les valeurs &#x60;M&#x60; ou &#x60;F&#x60; sont acceptées
   * @return genre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Les valeurs `M` ou `F` sont acceptées")

  public String getGenre() {
    return genre;
  }


  public void setGenre(String genre) {
    this.genre = genre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtatCivil etatCivil = (EtatCivil) o;
    return Objects.equals(this.nomDeNaissance, etatCivil.nomDeNaissance) &&
        Objects.equals(this.nomUsuel, etatCivil.nomUsuel) &&
        Objects.equals(this.prenom, etatCivil.prenom) &&
        Objects.equals(this.deuxiemePrenom, etatCivil.deuxiemePrenom) &&
        Objects.equals(this.troisiemePrenom, etatCivil.troisiemePrenom) &&
        Objects.equals(this.genre, etatCivil.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomDeNaissance, nomUsuel, prenom, deuxiemePrenom, troisiemePrenom, genre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtatCivil {\n");
    sb.append("    nomDeNaissance: ").append(toIndentedString(nomDeNaissance)).append("\n");
    sb.append("    nomUsuel: ").append(toIndentedString(nomUsuel)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    deuxiemePrenom: ").append(toIndentedString(deuxiemePrenom)).append("\n");
    sb.append("    troisiemePrenom: ").append(toIndentedString(troisiemePrenom)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
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

