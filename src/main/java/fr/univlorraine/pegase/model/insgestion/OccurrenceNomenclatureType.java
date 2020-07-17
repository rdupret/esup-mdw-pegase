/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.insgestion;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * le type d&#39;occurrence de nomenclature
 */
@JsonAdapter(OccurrenceNomenclatureType.Adapter.class)
public enum OccurrenceNomenclatureType {
  
  REGIMEINSCRIPTION("RegimeInscription"),
  
  BOURSEAIDEFINANCIERE("BourseAideFinanciere");

  private String value;

  OccurrenceNomenclatureType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OccurrenceNomenclatureType fromValue(String value) {
    for (OccurrenceNomenclatureType b : OccurrenceNomenclatureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OccurrenceNomenclatureType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OccurrenceNomenclatureType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OccurrenceNomenclatureType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OccurrenceNomenclatureType.fromValue(value);
    }
  }
}

