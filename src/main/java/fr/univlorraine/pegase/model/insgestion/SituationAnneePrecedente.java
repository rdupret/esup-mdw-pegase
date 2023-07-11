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
import fr.univlorraine.pegase.model.insgestion.Nomenclature;
import fr.univlorraine.pegase.model.insgestion.SituationAnneePrecedenteAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * La situation durant l&#39;année universitaire précédant l&#39;inscription en cours correspondante à la nomenclature Situations année précédente.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : SAP 
 */
@ApiModel(description = "La situation durant l'année universitaire précédant l'inscription en cours correspondante à la nomenclature Situations année précédente.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : SAP ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class SituationAnneePrecedente extends Nomenclature {
  public static final String SERIALIZED_NAME_CODE_BCN = "codeBcn";
  @SerializedName(SERIALIZED_NAME_CODE_BCN)
  private String codeBcn;

  public SituationAnneePrecedente() { 
    this.typeNomenclature = this.getClass().getSimpleName();
  }

  
  public SituationAnneePrecedente(
     String codeBcn
  ) {
    this();
    this.codeBcn = codeBcn;
  }

   /**
   * Le code BCN. Codes BCN de la nomenclature sur 1 caractères. Exemple: \&quot;P\&quot; 
   * @return codeBcn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code BCN. Codes BCN de la nomenclature sur 1 caractères. Exemple: \"P\" ")

  public String getCodeBcn() {
    return codeBcn;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationAnneePrecedente situationAnneePrecedente = (SituationAnneePrecedente) o;
    return Objects.equals(this.codeBcn, situationAnneePrecedente.codeBcn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeBcn, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationAnneePrecedente {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    codeBcn: ").append(toIndentedString(codeBcn)).append("\n");
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

