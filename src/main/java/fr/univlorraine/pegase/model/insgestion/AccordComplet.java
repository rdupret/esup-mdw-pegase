/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.4.0
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
import fr.univlorraine.pegase.model.insgestion.DocumentAApprouver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * L&#39;état d&#39;un accord et sa référence
 */
@ApiModel(description = "L'état d'un accord et sa référence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-27T10:35:31.587+02:00[Europe/Paris]")
public class AccordComplet {
  public static final String SERIALIZED_NAME_DATE_VALIDATION = "dateValidation";
  @SerializedName(SERIALIZED_NAME_DATE_VALIDATION)
  private String dateValidation;

  public static final String SERIALIZED_NAME_EST_ACCEPTE = "estAccepte";
  @SerializedName(SERIALIZED_NAME_EST_ACCEPTE)
  private Boolean estAccepte;

  public static final String SERIALIZED_NAME_DOCUMENT_A_APPROUVER = "documentAApprouver";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_A_APPROUVER)
  private DocumentAApprouver documentAApprouver;


  public AccordComplet dateValidation(String dateValidation) {
    
    this.dateValidation = dateValidation;
    return this;
  }

   /**
   * Date de validation de l&#39;accord
   * @return dateValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date de validation de l'accord")

  public String getDateValidation() {
    return dateValidation;
  }


  public void setDateValidation(String dateValidation) {
    this.dateValidation = dateValidation;
  }


  public AccordComplet estAccepte(Boolean estAccepte) {
    
    this.estAccepte = estAccepte;
    return this;
  }

   /**
   * Témoin pour savoir si le document a été accepté ou refusé
   * @return estAccepte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin pour savoir si le document a été accepté ou refusé")

  public Boolean getEstAccepte() {
    return estAccepte;
  }


  public void setEstAccepte(Boolean estAccepte) {
    this.estAccepte = estAccepte;
  }


  public AccordComplet documentAApprouver(DocumentAApprouver documentAApprouver) {
    
    this.documentAApprouver = documentAApprouver;
    return this;
  }

   /**
   * Get documentAApprouver
   * @return documentAApprouver
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentAApprouver getDocumentAApprouver() {
    return documentAApprouver;
  }


  public void setDocumentAApprouver(DocumentAApprouver documentAApprouver) {
    this.documentAApprouver = documentAApprouver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccordComplet accordComplet = (AccordComplet) o;
    return Objects.equals(this.dateValidation, accordComplet.dateValidation) &&
        Objects.equals(this.estAccepte, accordComplet.estAccepte) &&
        Objects.equals(this.documentAApprouver, accordComplet.documentAApprouver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateValidation, estAccepte, documentAApprouver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccordComplet {\n");
    sb.append("    dateValidation: ").append(toIndentedString(dateValidation)).append("\n");
    sb.append("    estAccepte: ").append(toIndentedString(estAccepte)).append("\n");
    sb.append("    documentAApprouver: ").append(toIndentedString(documentAApprouver)).append("\n");
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

