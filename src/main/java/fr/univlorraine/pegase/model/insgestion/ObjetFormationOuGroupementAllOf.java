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
 * ObjetFormationOuGroupementAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T15:07:55.881+02:00[Europe/Paris]")
public class ObjetFormationOuGroupementAllOf {
  /**
   * le type d&#39;objet
   */
  @JsonAdapter(NatureEnum.Adapter.class)
  public enum NatureEnum {
    OBJETFORMATION("ObjetFormation"),
    
    GROUPEMENT("Groupement");

    private String value;

    NatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NatureEnum fromValue(String value) {
      for (NatureEnum b : NatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NatureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NATURE = "nature";
  @SerializedName(SERIALIZED_NAME_NATURE)
  private NatureEnum nature;

  public ObjetFormationOuGroupementAllOf() { 
  }

  public ObjetFormationOuGroupementAllOf nature(NatureEnum nature) {
    
    this.nature = nature;
    return this;
  }

   /**
   * le type d&#39;objet
   * @return nature
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "le type d'objet")

  public NatureEnum getNature() {
    return nature;
  }


  public void setNature(NatureEnum nature) {
    this.nature = nature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjetFormationOuGroupementAllOf objetFormationOuGroupementAllOf = (ObjetFormationOuGroupementAllOf) o;
    return Objects.equals(this.nature, objetFormationOuGroupementAllOf.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetFormationOuGroupementAllOf {\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

