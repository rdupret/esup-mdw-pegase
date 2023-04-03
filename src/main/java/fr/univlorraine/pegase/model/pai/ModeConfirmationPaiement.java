/*
 * PAI v1 - Paiement
 * API pour la gestion des paiements
 *
 * The version of the OpenAPI document: 16.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.pai;

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
 * Défini le moment de confirmation du paiement :   * confirmation_choix_mode_paiement : Confirmation au choix du mode de paiement   * confirmation_reception_paiement : Confirmation après saisie de la réception du paiement   * confirmation_encaissement_paiement : Confirmation après saisie de l&#39;encaissement du paiement 
 */
@JsonAdapter(ModeConfirmationPaiement.Adapter.class)
public enum ModeConfirmationPaiement {
  
  CHOIX_MODE_PAIEMENT("confirmation_choix_mode_paiement"),
  
  RECEPTION_PAIEMENT("confirmation_reception_paiement"),
  
  ENCAISSEMENT_PAIEMENT("confirmation_encaissement_paiement");

  private String value;

  ModeConfirmationPaiement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ModeConfirmationPaiement fromValue(String value) {
    for (ModeConfirmationPaiement b : ModeConfirmationPaiement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ModeConfirmationPaiement> {
    @Override
    public void write(final JsonWriter jsonWriter, final ModeConfirmationPaiement enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ModeConfirmationPaiement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ModeConfirmationPaiement.fromValue(value);
    }
  }
}

