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
import java.time.LocalDate;
import org.apache.fineract.client.models.GetTaxesGroupTaxComponent;

/**
 * GetTaxesGroupTaxAssociations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTaxesGroupTaxAssociations {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_TAX_COMPONENT = "taxComponent";
  @SerializedName(SERIALIZED_NAME_TAX_COMPONENT)
  private GetTaxesGroupTaxComponent taxComponent;

  public GetTaxesGroupTaxAssociations() { 
  }

  public GetTaxesGroupTaxAssociations id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetTaxesGroupTaxAssociations startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public GetTaxesGroupTaxAssociations taxComponent(GetTaxesGroupTaxComponent taxComponent) {
    
    this.taxComponent = taxComponent;
    return this;
  }

   /**
   * Get taxComponent
   * @return taxComponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTaxesGroupTaxComponent getTaxComponent() {
    return taxComponent;
  }


  public void setTaxComponent(GetTaxesGroupTaxComponent taxComponent) {
    this.taxComponent = taxComponent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTaxesGroupTaxAssociations getTaxesGroupTaxAssociations = (GetTaxesGroupTaxAssociations) o;
    return Objects.equals(this.id, getTaxesGroupTaxAssociations.id) &&
        Objects.equals(this.startDate, getTaxesGroupTaxAssociations.startDate) &&
        Objects.equals(this.taxComponent, getTaxesGroupTaxAssociations.taxComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, taxComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTaxesGroupTaxAssociations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    taxComponent: ").append(toIndentedString(taxComponent)).append("\n");
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

