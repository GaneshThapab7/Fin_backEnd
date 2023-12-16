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
import org.apache.fineract.client.models.GetSelfLoansProductOptions;
import org.apache.fineract.client.models.GetSelfLoansTimeline;

/**
 * GetSelfLoansTemplateResponse
 */
@ApiModel(description = "GetSelfLoansTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSelfLoansTemplateResponse {
  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENT_OFFICE_ID = "clientOfficeId";
  @SerializedName(SERIALIZED_NAME_CLIENT_OFFICE_ID)
  private Integer clientOfficeId;

  public static final String SERIALIZED_NAME_PRODUCT_OPTIONS = "productOptions";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OPTIONS)
  private Set<GetSelfLoansProductOptions> productOptions = null;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetSelfLoansTimeline timeline;

  public GetSelfLoansTemplateResponse() { 
  }

  public GetSelfLoansTemplateResponse clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public GetSelfLoansTemplateResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kampala first Client", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetSelfLoansTemplateResponse clientOfficeId(Integer clientOfficeId) {
    
    this.clientOfficeId = clientOfficeId;
    return this;
  }

   /**
   * Get clientOfficeId
   * @return clientOfficeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getClientOfficeId() {
    return clientOfficeId;
  }


  public void setClientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
  }


  public GetSelfLoansTemplateResponse productOptions(Set<GetSelfLoansProductOptions> productOptions) {
    
    this.productOptions = productOptions;
    return this;
  }

  public GetSelfLoansTemplateResponse addProductOptionsItem(GetSelfLoansProductOptions productOptionsItem) {
    if (this.productOptions == null) {
      this.productOptions = new LinkedHashSet<>();
    }
    this.productOptions.add(productOptionsItem);
    return this;
  }

   /**
   * Get productOptions
   * @return productOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetSelfLoansProductOptions> getProductOptions() {
    return productOptions;
  }


  public void setProductOptions(Set<GetSelfLoansProductOptions> productOptions) {
    this.productOptions = productOptions;
  }


  public GetSelfLoansTemplateResponse timeline(GetSelfLoansTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfLoansTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetSelfLoansTimeline timeline) {
    this.timeline = timeline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfLoansTemplateResponse getSelfLoansTemplateResponse = (GetSelfLoansTemplateResponse) o;
    return Objects.equals(this.clientId, getSelfLoansTemplateResponse.clientId) &&
        Objects.equals(this.clientName, getSelfLoansTemplateResponse.clientName) &&
        Objects.equals(this.clientOfficeId, getSelfLoansTemplateResponse.clientOfficeId) &&
        Objects.equals(this.productOptions, getSelfLoansTemplateResponse.productOptions) &&
        Objects.equals(this.timeline, getSelfLoansTemplateResponse.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientName, clientOfficeId, productOptions, timeline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfLoansTemplateResponse {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientOfficeId: ").append(toIndentedString(clientOfficeId)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

