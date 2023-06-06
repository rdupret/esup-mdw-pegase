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
import java.math.BigDecimal;

/**
 * Paiement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class Paiement {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_MONTANT = "montant";
  @SerializedName(SERIALIZED_NAME_MONTANT)
  private String montant;

  public static final String SERIALIZED_NAME_MONTANT_PAYE = "montantPaye";
  @SerializedName(SERIALIZED_NAME_MONTANT_PAYE)
  private BigDecimal montantPaye;

  public static final String SERIALIZED_NAME_DATE_HEURE = "dateHeure";
  @SerializedName(SERIALIZED_NAME_DATE_HEURE)
  private String dateHeure;

  /**
   * Gets or Sets paiementEnLigneEnCours
   */
  @JsonAdapter(PaiementEnLigneEnCoursEnum.Adapter.class)
  public enum PaiementEnLigneEnCoursEnum {
    PAYBOX("paybox");

    private String value;

    PaiementEnLigneEnCoursEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaiementEnLigneEnCoursEnum fromValue(String value) {
      for (PaiementEnLigneEnCoursEnum b : PaiementEnLigneEnCoursEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaiementEnLigneEnCoursEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaiementEnLigneEnCoursEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaiementEnLigneEnCoursEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaiementEnLigneEnCoursEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAIEMENT_EN_LIGNE_EN_COURS = "paiementEnLigneEnCours";
  @SerializedName(SERIALIZED_NAME_PAIEMENT_EN_LIGNE_EN_COURS)
  private PaiementEnLigneEnCoursEnum paiementEnLigneEnCours;

  public Paiement() { 
  }

  public Paiement mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * mode de paiement selectionné
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mode de paiement selectionné")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public Paiement reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Référence ou motif de paiement
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Référence ou motif de paiement")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Paiement montant(String montant) {
    
    this.montant = montant;
    return this;
  }

   /**
   * Montant du paiement deprecated
   * @return montant
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Montant du paiement deprecated")

  public String getMontant() {
    return montant;
  }


  public void setMontant(String montant) {
    this.montant = montant;
  }


  public Paiement montantPaye(BigDecimal montantPaye) {
    
    this.montantPaye = montantPaye;
    return this;
  }

   /**
   * Montant du paiement
   * @return montantPaye
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Montant du paiement")

  public BigDecimal getMontantPaye() {
    return montantPaye;
  }


  public void setMontantPaye(BigDecimal montantPaye) {
    this.montantPaye = montantPaye;
  }


  public Paiement dateHeure(String dateHeure) {
    
    this.dateHeure = dateHeure;
    return this;
  }

   /**
   * La date et l&#39;heure du paiement
   * @return dateHeure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La date et l'heure du paiement")

  public String getDateHeure() {
    return dateHeure;
  }


  public void setDateHeure(String dateHeure) {
    this.dateHeure = dateHeure;
  }


  public Paiement paiementEnLigneEnCours(PaiementEnLigneEnCoursEnum paiementEnLigneEnCours) {
    
    this.paiementEnLigneEnCours = paiementEnLigneEnCours;
    return this;
  }

   /**
   * Get paiementEnLigneEnCours
   * @return paiementEnLigneEnCours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaiementEnLigneEnCoursEnum getPaiementEnLigneEnCours() {
    return paiementEnLigneEnCours;
  }


  public void setPaiementEnLigneEnCours(PaiementEnLigneEnCoursEnum paiementEnLigneEnCours) {
    this.paiementEnLigneEnCours = paiementEnLigneEnCours;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paiement paiement = (Paiement) o;
    return Objects.equals(this.mode, paiement.mode) &&
        Objects.equals(this.reference, paiement.reference) &&
        Objects.equals(this.montant, paiement.montant) &&
        Objects.equals(this.montantPaye, paiement.montantPaye) &&
        Objects.equals(this.dateHeure, paiement.dateHeure) &&
        Objects.equals(this.paiementEnLigneEnCours, paiement.paiementEnLigneEnCours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, reference, montant, montantPaye, dateHeure, paiementEnLigneEnCours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paiement {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    montant: ").append(toIndentedString(montant)).append("\n");
    sb.append("    montantPaye: ").append(toIndentedString(montantPaye)).append("\n");
    sb.append("    dateHeure: ").append(toIndentedString(dateHeure)).append("\n");
    sb.append("    paiementEnLigneEnCours: ").append(toIndentedString(paiementEnLigneEnCours)).append("\n");
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

