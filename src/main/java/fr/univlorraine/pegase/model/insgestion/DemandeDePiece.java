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
import fr.univlorraine.pegase.model.insgestion.TemoinTeleversement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DemandeDePiece
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class DemandeDePiece {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CODE_STRUCTURE = "codeStructure";
  @SerializedName(SERIALIZED_NAME_CODE_STRUCTURE)
  private String codeStructure;

  public static final String SERIALIZED_NAME_LIBELLE_AFFICHAGE = "libelleAffichage";
  @SerializedName(SERIALIZED_NAME_LIBELLE_AFFICHAGE)
  private String libelleAffichage;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE_DEBUT_VALIDITE = "dateDebutValidite";
  @SerializedName(SERIALIZED_NAME_DATE_DEBUT_VALIDITE)
  private String dateDebutValidite;

  public static final String SERIALIZED_NAME_DATE_FIN_VALIDITE = "dateFinValidite";
  @SerializedName(SERIALIZED_NAME_DATE_FIN_VALIDITE)
  private String dateFinValidite;

  public static final String SERIALIZED_NAME_CODE_PIECE_A_FOURNIR = "codePieceAFournir";
  @SerializedName(SERIALIZED_NAME_CODE_PIECE_A_FOURNIR)
  private String codePieceAFournir;

  public static final String SERIALIZED_NAME_TEMOIN_PRIMO = "temoinPrimo";
  @SerializedName(SERIALIZED_NAME_TEMOIN_PRIMO)
  private Boolean temoinPrimo;

  public static final String SERIALIZED_NAME_TEMOIN_REINS = "temoinReins";
  @SerializedName(SERIALIZED_NAME_TEMOIN_REINS)
  private Boolean temoinReins;

  public static final String SERIALIZED_NAME_TEMOIN_TELEVERSEMENT = "temoinTeleversement";
  @SerializedName(SERIALIZED_NAME_TEMOIN_TELEVERSEMENT)
  private TemoinTeleversement temoinTeleversement;

  public static final String SERIALIZED_NAME_TEMOIN_OBLIGATOIRE = "temoinObligatoire";
  @SerializedName(SERIALIZED_NAME_TEMOIN_OBLIGATOIRE)
  private Boolean temoinObligatoire;

  public static final String SERIALIZED_NAME_PRIORITE_AFFICHAGE = "prioriteAffichage";
  @SerializedName(SERIALIZED_NAME_PRIORITE_AFFICHAGE)
  private Integer prioriteAffichage;

  public static final String SERIALIZED_NAME_TEMOIN_LIVRE = "temoinLivre";
  @SerializedName(SERIALIZED_NAME_TEMOIN_LIVRE)
  private Boolean temoinLivre;

  public static final String SERIALIZED_NAME_TEMOIN_PHOTO = "temoinPhoto";
  @SerializedName(SERIALIZED_NAME_TEMOIN_PHOTO)
  private Boolean temoinPhoto;

  public DemandeDePiece() { 
  }

  public DemandeDePiece code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Le code metier en saisie libre
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le code metier en saisie libre")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public DemandeDePiece codeStructure(String codeStructure) {
    
    this.codeStructure = codeStructure;
    return this;
  }

   /**
   * Le code de l&#39;établissement (structure)
   * @return codeStructure
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le code de l'établissement (structure)")

  public String getCodeStructure() {
    return codeStructure;
  }


  public void setCodeStructure(String codeStructure) {
    this.codeStructure = codeStructure;
  }


  public DemandeDePiece libelleAffichage(String libelleAffichage) {
    
    this.libelleAffichage = libelleAffichage;
    return this;
  }

   /**
   * Le libellé d&#39;affichage
   * @return libelleAffichage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le libellé d'affichage")

  public String getLibelleAffichage() {
    return libelleAffichage;
  }


  public void setLibelleAffichage(String libelleAffichage) {
    this.libelleAffichage = libelleAffichage;
  }


  public DemandeDePiece description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * La description détaillée de la demande de pièces
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La description détaillée de la demande de pièces")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DemandeDePiece dateDebutValidite(String dateDebutValidite) {
    
    this.dateDebutValidite = dateDebutValidite;
    return this;
  }

   /**
   * La date de début de validité
   * @return dateDebutValidite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "La date de début de validité")

  public String getDateDebutValidite() {
    return dateDebutValidite;
  }


  public void setDateDebutValidite(String dateDebutValidite) {
    this.dateDebutValidite = dateDebutValidite;
  }


  public DemandeDePiece dateFinValidite(String dateFinValidite) {
    
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


  public DemandeDePiece codePieceAFournir(String codePieceAFournir) {
    
    this.codePieceAFournir = codePieceAFournir;
    return this;
  }

   /**
   * Le code de la pièce à fournir issu de la nomenclature des pièces à fournir dans référentiel.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : PAF 
   * @return codePieceAFournir
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le code de la pièce à fournir issu de la nomenclature des pièces à fournir dans référentiel.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : PAF ")

  public String getCodePieceAFournir() {
    return codePieceAFournir;
  }


  public void setCodePieceAFournir(String codePieceAFournir) {
    this.codePieceAFournir = codePieceAFournir;
  }


  public DemandeDePiece temoinPrimo(Boolean temoinPrimo) {
    
    this.temoinPrimo = temoinPrimo;
    return this;
  }

   /**
   * Le témoin pièce demandée pour les primo-entrants
   * @return temoinPrimo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le témoin pièce demandée pour les primo-entrants")

  public Boolean getTemoinPrimo() {
    return temoinPrimo;
  }


  public void setTemoinPrimo(Boolean temoinPrimo) {
    this.temoinPrimo = temoinPrimo;
  }


  public DemandeDePiece temoinReins(Boolean temoinReins) {
    
    this.temoinReins = temoinReins;
    return this;
  }

   /**
   * Le témoin pièce demandée pour les réinscriptions
   * @return temoinReins
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le témoin pièce demandée pour les réinscriptions")

  public Boolean getTemoinReins() {
    return temoinReins;
  }


  public void setTemoinReins(Boolean temoinReins) {
    this.temoinReins = temoinReins;
  }


  public DemandeDePiece temoinTeleversement(TemoinTeleversement temoinTeleversement) {
    
    this.temoinTeleversement = temoinTeleversement;
    return this;
  }

   /**
   * Get temoinTeleversement
   * @return temoinTeleversement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TemoinTeleversement getTemoinTeleversement() {
    return temoinTeleversement;
  }


  public void setTemoinTeleversement(TemoinTeleversement temoinTeleversement) {
    this.temoinTeleversement = temoinTeleversement;
  }


  public DemandeDePiece temoinObligatoire(Boolean temoinObligatoire) {
    
    this.temoinObligatoire = temoinObligatoire;
    return this;
  }

   /**
   * Le témoin pièce obligatoire (true) ou facultative (false)
   * @return temoinObligatoire
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le témoin pièce obligatoire (true) ou facultative (false)")

  public Boolean getTemoinObligatoire() {
    return temoinObligatoire;
  }


  public void setTemoinObligatoire(Boolean temoinObligatoire) {
    this.temoinObligatoire = temoinObligatoire;
  }


  public DemandeDePiece prioriteAffichage(Integer prioriteAffichage) {
    
    this.prioriteAffichage = prioriteAffichage;
    return this;
  }

   /**
   * La priorité d&#39;affichage : Plus le nombre est élevé, plus la demande de pièce apparaît en priorité dans la liste de valeurs 
   * @return prioriteAffichage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "La priorité d'affichage : Plus le nombre est élevé, plus la demande de pièce apparaît en priorité dans la liste de valeurs ")

  public Integer getPrioriteAffichage() {
    return prioriteAffichage;
  }


  public void setPrioriteAffichage(Integer prioriteAffichage) {
    this.prioriteAffichage = prioriteAffichage;
  }


  public DemandeDePiece temoinLivre(Boolean temoinLivre) {
    
    this.temoinLivre = temoinLivre;
    return this;
  }

   /**
   * Le témoin livré
   * @return temoinLivre
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le témoin livré")

  public Boolean getTemoinLivre() {
    return temoinLivre;
  }


  public void setTemoinLivre(Boolean temoinLivre) {
    this.temoinLivre = temoinLivre;
  }


  public DemandeDePiece temoinPhoto(Boolean temoinPhoto) {
    
    this.temoinPhoto = temoinPhoto;
    return this;
  }

   /**
   * Le témoin de la pièce de type photo d&#39;identité
   * @return temoinPhoto
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le témoin de la pièce de type photo d'identité")

  public Boolean getTemoinPhoto() {
    return temoinPhoto;
  }


  public void setTemoinPhoto(Boolean temoinPhoto) {
    this.temoinPhoto = temoinPhoto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandeDePiece demandeDePiece = (DemandeDePiece) o;
    return Objects.equals(this.code, demandeDePiece.code) &&
        Objects.equals(this.codeStructure, demandeDePiece.codeStructure) &&
        Objects.equals(this.libelleAffichage, demandeDePiece.libelleAffichage) &&
        Objects.equals(this.description, demandeDePiece.description) &&
        Objects.equals(this.dateDebutValidite, demandeDePiece.dateDebutValidite) &&
        Objects.equals(this.dateFinValidite, demandeDePiece.dateFinValidite) &&
        Objects.equals(this.codePieceAFournir, demandeDePiece.codePieceAFournir) &&
        Objects.equals(this.temoinPrimo, demandeDePiece.temoinPrimo) &&
        Objects.equals(this.temoinReins, demandeDePiece.temoinReins) &&
        Objects.equals(this.temoinTeleversement, demandeDePiece.temoinTeleversement) &&
        Objects.equals(this.temoinObligatoire, demandeDePiece.temoinObligatoire) &&
        Objects.equals(this.prioriteAffichage, demandeDePiece.prioriteAffichage) &&
        Objects.equals(this.temoinLivre, demandeDePiece.temoinLivre) &&
        Objects.equals(this.temoinPhoto, demandeDePiece.temoinPhoto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeStructure, libelleAffichage, description, dateDebutValidite, dateFinValidite, codePieceAFournir, temoinPrimo, temoinReins, temoinTeleversement, temoinObligatoire, prioriteAffichage, temoinLivre, temoinPhoto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandeDePiece {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeStructure: ").append(toIndentedString(codeStructure)).append("\n");
    sb.append("    libelleAffichage: ").append(toIndentedString(libelleAffichage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateDebutValidite: ").append(toIndentedString(dateDebutValidite)).append("\n");
    sb.append("    dateFinValidite: ").append(toIndentedString(dateFinValidite)).append("\n");
    sb.append("    codePieceAFournir: ").append(toIndentedString(codePieceAFournir)).append("\n");
    sb.append("    temoinPrimo: ").append(toIndentedString(temoinPrimo)).append("\n");
    sb.append("    temoinReins: ").append(toIndentedString(temoinReins)).append("\n");
    sb.append("    temoinTeleversement: ").append(toIndentedString(temoinTeleversement)).append("\n");
    sb.append("    temoinObligatoire: ").append(toIndentedString(temoinObligatoire)).append("\n");
    sb.append("    prioriteAffichage: ").append(toIndentedString(prioriteAffichage)).append("\n");
    sb.append("    temoinLivre: ").append(toIndentedString(temoinLivre)).append("\n");
    sb.append("    temoinPhoto: ").append(toIndentedString(temoinPhoto)).append("\n");
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

