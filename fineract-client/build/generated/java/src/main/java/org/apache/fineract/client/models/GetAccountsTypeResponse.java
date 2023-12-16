/*
 * Apache Fineract REST API
 * Apache Fineract is a secure, multi-tenanted microfinance platform. The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The https://cui.fineract.dev[reference app] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation. Until we complete the new REST API documentation you still have the legacy documentation available https://fineract.apache.org/legacy-docs/apiLive.htm[here]. Please check https://fineract.apache.org/docs/current[the Fineract documentation] for more information.
 *
 * The version of the OpenAPI document: 0.0.0-NOT_A_GIT_REPOSITORY
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.GetAccountsPageItems;

/**
 * GetAccountsTypeResponse
 */
@ApiModel(description = "GetAccountsTypeResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountsTypeResponse {
  public static final String SERIALIZED_NAME_PAGE_ITEMS = "pageItems";
  @SerializedName(SERIALIZED_NAME_PAGE_ITEMS)
  private Set<GetAccountsPageItems> pageItems = null;

  public static final String SERIALIZED_NAME_TOTAL_FILTERED_RECORDS = "totalFilteredRecords";
  @SerializedName(SERIALIZED_NAME_TOTAL_FILTERED_RECORDS)
  private Integer totalFilteredRecords;

  public GetAccountsTypeResponse() { 
  }

  public GetAccountsTypeResponse pageItems(Set<GetAccountsPageItems> pageItems) {
    
    this.pageItems = pageItems;
    return this;
  }

  public GetAccountsTypeResponse addPageItemsItem(GetAccountsPageItems pageItemsItem) {
    if (this.pageItems == null) {
      this.pageItems = new LinkedHashSet<>();
    }
    this.pageItems.add(pageItemsItem);
    return this;
  }

   /**
   * Get pageItems
   * @return pageItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetAccountsPageItems> getPageItems() {
    return pageItems;
  }


  public void setPageItems(Set<GetAccountsPageItems> pageItems) {
    this.pageItems = pageItems;
  }


  public GetAccountsTypeResponse totalFilteredRecords(Integer totalFilteredRecords) {
    
    this.totalFilteredRecords = totalFilteredRecords;
    return this;
  }

   /**
   * Get totalFilteredRecords
   * @return totalFilteredRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTotalFilteredRecords() {
    return totalFilteredRecords;
  }


  public void setTotalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsTypeResponse getAccountsTypeResponse = (GetAccountsTypeResponse) o;
    return Objects.equals(this.pageItems, getAccountsTypeResponse.pageItems) &&
        Objects.equals(this.totalFilteredRecords, getAccountsTypeResponse.totalFilteredRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageItems, totalFilteredRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsTypeResponse {\n");
    sb.append("    pageItems: ").append(toIndentedString(pageItems)).append("\n");
    sb.append("    totalFilteredRecords: ").append(toIndentedString(totalFilteredRecords)).append("\n");
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

