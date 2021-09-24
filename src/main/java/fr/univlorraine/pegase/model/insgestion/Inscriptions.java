/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 2.2.0
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
import fr.univlorraine.pegase.model.insgestion.Inscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Inscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-23T16:13:33.468+02:00[Europe/Paris]")
public class Inscriptions {
  public static final String SERIALIZED_NAME_NOMBRE = "nombre";
  @SerializedName(SERIALIZED_NAME_NOMBRE)
  private Long nombre;

  public static final String SERIALIZED_NAME_RESULTATS = "resultats";
  @SerializedName(SERIALIZED_NAME_RESULTATS)
  private List<Inscription> resultats = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUT_INSCRIPTION = "statutInscription";
  @SerializedName(SERIALIZED_NAME_STATUT_INSCRIPTION)
  private Map<String, Long> statutInscription = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUT_PIECES = "statutPieces";
  @SerializedName(SERIALIZED_NAME_STATUT_PIECES)
  private Map<String, Long> statutPieces = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUT_PAIEMENT = "statutPaiement";
  @SerializedName(SERIALIZED_NAME_STATUT_PAIEMENT)
  private Map<String, Long> statutPaiement = new HashMap<>();


  public Inscriptions nombre(Long nombre) {
    
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getNombre() {
    return nombre;
  }


  public void setNombre(Long nombre) {
    this.nombre = nombre;
  }


  public Inscriptions resultats(List<Inscription> resultats) {
    
    this.resultats = resultats;
    return this;
  }

  public Inscriptions addResultatsItem(Inscription resultatsItem) {
    this.resultats.add(resultatsItem);
    return this;
  }

   /**
   * Get resultats
   * @return resultats
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Inscription> getResultats() {
    return resultats;
  }


  public void setResultats(List<Inscription> resultats) {
    this.resultats = resultats;
  }


  public Inscriptions statutInscription(Map<String, Long> statutInscription) {
    
    this.statutInscription = statutInscription;
    return this;
  }

  public Inscriptions putStatutInscriptionItem(String key, Long statutInscriptionItem) {
    this.statutInscription.put(key, statutInscriptionItem);
    return this;
  }

   /**
   * Get statutInscription
   * @return statutInscription
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Long> getStatutInscription() {
    return statutInscription;
  }


  public void setStatutInscription(Map<String, Long> statutInscription) {
    this.statutInscription = statutInscription;
  }


  public Inscriptions statutPieces(Map<String, Long> statutPieces) {
    
    this.statutPieces = statutPieces;
    return this;
  }

  public Inscriptions putStatutPiecesItem(String key, Long statutPiecesItem) {
    this.statutPieces.put(key, statutPiecesItem);
    return this;
  }

   /**
   * Get statutPieces
   * @return statutPieces
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Long> getStatutPieces() {
    return statutPieces;
  }


  public void setStatutPieces(Map<String, Long> statutPieces) {
    this.statutPieces = statutPieces;
  }


  public Inscriptions statutPaiement(Map<String, Long> statutPaiement) {
    
    this.statutPaiement = statutPaiement;
    return this;
  }

  public Inscriptions putStatutPaiementItem(String key, Long statutPaiementItem) {
    this.statutPaiement.put(key, statutPaiementItem);
    return this;
  }

   /**
   * Get statutPaiement
   * @return statutPaiement
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Long> getStatutPaiement() {
    return statutPaiement;
  }


  public void setStatutPaiement(Map<String, Long> statutPaiement) {
    this.statutPaiement = statutPaiement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inscriptions inscriptions = (Inscriptions) o;
    return Objects.equals(this.nombre, inscriptions.nombre) &&
        Objects.equals(this.resultats, inscriptions.resultats) &&
        Objects.equals(this.statutInscription, inscriptions.statutInscription) &&
        Objects.equals(this.statutPieces, inscriptions.statutPieces) &&
        Objects.equals(this.statutPaiement, inscriptions.statutPaiement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, resultats, statutInscription, statutPieces, statutPaiement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inscriptions {\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    resultats: ").append(toIndentedString(resultats)).append("\n");
    sb.append("    statutInscription: ").append(toIndentedString(statutInscription)).append("\n");
    sb.append("    statutPieces: ").append(toIndentedString(statutPieces)).append("\n");
    sb.append("    statutPaiement: ").append(toIndentedString(statutPaiement)).append("\n");
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

