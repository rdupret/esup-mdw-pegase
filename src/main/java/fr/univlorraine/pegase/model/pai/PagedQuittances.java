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
import fr.univlorraine.pegase.model.pai.Paging;
import fr.univlorraine.pegase.model.pai.Quittance;
import fr.univlorraine.pegase.model.pai.Quittances;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PagedQuittances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-23T11:55:43.060+02:00[Europe/Paris]")
public class PagedQuittances {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Quittance> items = null;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Long totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_TAILLE = "taille";
  @SerializedName(SERIALIZED_NAME_TAILLE)
  private Integer taille;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;


  public PagedQuittances items(List<Quittance> items) {
    
    this.items = items;
    return this;
  }

  public PagedQuittances addItemsItem(Quittance itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Quittance> getItems() {
    return items;
  }


  public void setItems(List<Quittance> items) {
    this.items = items;
  }


  public PagedQuittances totalElements(Long totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Nombre total de d&#39;enregistrements existants en base 
   * @return totalElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nombre total de d'enregistrements existants en base ")

  public Long getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }


  public PagedQuittances totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Nombre de pages totales existantes 
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nombre de pages totales existantes ")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PagedQuittances taille(Integer taille) {
    
    this.taille = taille;
    return this;
  }

   /**
   * Nombre d&#39;enregistrements demandés par page 
   * @return taille
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nombre d'enregistrements demandés par page ")

  public Integer getTaille() {
    return taille;
  }


  public void setTaille(Integer taille) {
    this.taille = taille;
  }


  public PagedQuittances page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Numéro de la page retournée (commence à 0) 
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numéro de la page retournée (commence à 0) ")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedQuittances pagedQuittances = (PagedQuittances) o;
    return Objects.equals(this.items, pagedQuittances.items) &&
        Objects.equals(this.totalElements, pagedQuittances.totalElements) &&
        Objects.equals(this.totalPages, pagedQuittances.totalPages) &&
        Objects.equals(this.taille, pagedQuittances.taille) &&
        Objects.equals(this.page, pagedQuittances.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalElements, totalPages, taille, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedQuittances {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    taille: ").append(toIndentedString(taille)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

