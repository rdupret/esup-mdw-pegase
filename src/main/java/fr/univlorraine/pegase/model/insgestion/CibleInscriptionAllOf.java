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
import fr.univlorraine.pegase.model.insgestion.Formation;
import fr.univlorraine.pegase.model.insgestion.ObjetFormationOuGroupement;
import fr.univlorraine.pegase.model.insgestion.Periode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CibleInscriptionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-23T16:13:33.468+02:00[Europe/Paris]")
public class CibleInscriptionAllOf {
  public static final String SERIALIZED_NAME_CODE_STRUCTURE = "codeStructure";
  @SerializedName(SERIALIZED_NAME_CODE_STRUCTURE)
  private String codeStructure;

  public static final String SERIALIZED_NAME_FORMATION = "formation";
  @SerializedName(SERIALIZED_NAME_FORMATION)
  private Formation formation = null;

  public static final String SERIALIZED_NAME_CHEMIN = "chemin";
  @SerializedName(SERIALIZED_NAME_CHEMIN)
  private List<ObjetFormationOuGroupement> chemin = null;

  public static final String SERIALIZED_NAME_PERIODE = "periode";
  @SerializedName(SERIALIZED_NAME_PERIODE)
  private Periode periode = null;


  public CibleInscriptionAllOf codeStructure(String codeStructure) {
    
    this.codeStructure = codeStructure;
    return this;
  }

   /**
   * Le code de la structure issu de la nomenclature Structures organisationnelles
   * @return codeStructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ETAB00", value = "Le code de la structure issu de la nomenclature Structures organisationnelles")

  public String getCodeStructure() {
    return codeStructure;
  }


  public void setCodeStructure(String codeStructure) {
    this.codeStructure = codeStructure;
  }


  public CibleInscriptionAllOf formation(Formation formation) {
    
    this.formation = formation;
    return this;
  }

   /**
   * Get formation
   * @return formation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Formation getFormation() {
    return formation;
  }


  public void setFormation(Formation formation) {
    this.formation = formation;
  }


  public CibleInscriptionAllOf chemin(List<ObjetFormationOuGroupement> chemin) {
    
    this.chemin = chemin;
    return this;
  }

  public CibleInscriptionAllOf addCheminItem(ObjetFormationOuGroupement cheminItem) {
    if (this.chemin == null) {
      this.chemin = new ArrayList<>();
    }
    this.chemin.add(cheminItem);
    return this;
  }

   /**
   * liste des codes ObjetFormation ou Groupement depuis la Formation racine jusqu&#39;à l&#39;ObjetFormation feuille (même code que CiblePourInscription), peut être vide
   * @return chemin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "liste des codes ObjetFormation ou Groupement depuis la Formation racine jusqu'à l'ObjetFormation feuille (même code que CiblePourInscription), peut être vide")

  public List<ObjetFormationOuGroupement> getChemin() {
    return chemin;
  }


  public void setChemin(List<ObjetFormationOuGroupement> chemin) {
    this.chemin = chemin;
  }


  public CibleInscriptionAllOf periode(Periode periode) {
    
    this.periode = periode;
    return this;
  }

   /**
   * Get periode
   * @return periode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Periode getPeriode() {
    return periode;
  }


  public void setPeriode(Periode periode) {
    this.periode = periode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CibleInscriptionAllOf cibleInscriptionAllOf = (CibleInscriptionAllOf) o;
    return Objects.equals(this.codeStructure, cibleInscriptionAllOf.codeStructure) &&
        Objects.equals(this.formation, cibleInscriptionAllOf.formation) &&
        Objects.equals(this.chemin, cibleInscriptionAllOf.chemin) &&
        Objects.equals(this.periode, cibleInscriptionAllOf.periode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeStructure, formation, chemin, periode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CibleInscriptionAllOf {\n");
    sb.append("    codeStructure: ").append(toIndentedString(codeStructure)).append("\n");
    sb.append("    formation: ").append(toIndentedString(formation)).append("\n");
    sb.append("    chemin: ").append(toIndentedString(chemin)).append("\n");
    sb.append("    periode: ").append(toIndentedString(periode)).append("\n");
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

