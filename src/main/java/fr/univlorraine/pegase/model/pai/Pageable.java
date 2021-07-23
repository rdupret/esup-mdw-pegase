/*
 * PAI v1 - Paiement
 * API pour la gestion des paiements
 *
 * The version of the OpenAPI document: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.pai;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Pageable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-23T11:55:43.060+02:00[Europe/Paris]")
public class Pageable {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_TAILLE = "taille";
  @SerializedName(SERIALIZED_NAME_TAILLE)
  private Integer taille = 10;

  public static final String SERIALIZED_NAME_TRI = "tri";
  @SerializedName(SERIALIZED_NAME_TRI)
  private List<String> tri = null;


  public Pageable page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * numéro de page demandée (commence à 0)
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "numéro de page demandée (commence à 0)")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public Pageable taille(Integer taille) {
    
    this.taille = taille;
    return this;
  }

   /**
   * nombre d&#39;élements par page
   * @return taille
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nombre d'élements par page")

  public Integer getTaille() {
    return taille;
  }


  public void setTaille(Integer taille) {
    this.taille = taille;
  }


  public Pageable tri(List<String> tri) {
    
    this.tri = tri;
    return this;
  }

  public Pageable addTriItem(String triItem) {
    if (this.tri == null) {
      this.tri = new ArrayList<>();
    }
    this.tri.add(triItem);
    return this;
  }

   /**
   * critères de tri, chaque tri est de la forme &lt;propriété&gt;[,asc|desc]
   * @return tri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "critères de tri, chaque tri est de la forme <propriété>[,asc|desc]")

  public List<String> getTri() {
    return tri;
  }


  public void setTri(List<String> tri) {
    this.tri = tri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.page, pageable.page) &&
        Objects.equals(this.taille, pageable.taille) &&
        Objects.equals(this.tri, pageable.tri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, taille, tri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    taille: ").append(toIndentedString(taille)).append("\n");
    sb.append("    tri: ").append(toIndentedString(tri)).append("\n");
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

