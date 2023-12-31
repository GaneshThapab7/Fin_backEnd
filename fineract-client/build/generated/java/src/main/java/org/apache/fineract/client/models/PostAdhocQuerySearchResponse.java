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

/**
 * PostAdhocQuerySearchResponse
 */
@ApiModel(description = "PostAdhocQuerySearchResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostAdhocQuerySearchResponse {
  public static final String SERIALIZED_NAME_LOAN_OUT_STANDING = "loanOutStanding";
  @SerializedName(SERIALIZED_NAME_LOAN_OUT_STANDING)
  private Long loanOutStanding;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT_NAME = "loanProductName";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT_NAME)
  private String loanProductName;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Long percentage;

  public PostAdhocQuerySearchResponse() { 
  }

  public PostAdhocQuerySearchResponse loanOutStanding(Long loanOutStanding) {
    
    this.loanOutStanding = loanOutStanding;
    return this;
  }

   /**
   * Get loanOutStanding
   * @return loanOutStanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoanOutStanding() {
    return loanOutStanding;
  }


  public void setLoanOutStanding(Long loanOutStanding) {
    this.loanOutStanding = loanOutStanding;
  }


  public PostAdhocQuerySearchResponse loanProductName(String loanProductName) {
    
    this.loanProductName = loanProductName;
    return this;
  }

   /**
   * Get loanProductName
   * @return loanProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01 BC3M", value = "")

  public String getLoanProductName() {
    return loanProductName;
  }


  public void setLoanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
  }


  public PostAdhocQuerySearchResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HFC", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public PostAdhocQuerySearchResponse percentage(Long percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPercentage() {
    return percentage;
  }


  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAdhocQuerySearchResponse postAdhocQuerySearchResponse = (PostAdhocQuerySearchResponse) o;
    return Objects.equals(this.loanOutStanding, postAdhocQuerySearchResponse.loanOutStanding) &&
        Objects.equals(this.loanProductName, postAdhocQuerySearchResponse.loanProductName) &&
        Objects.equals(this.officeName, postAdhocQuerySearchResponse.officeName) &&
        Objects.equals(this.percentage, postAdhocQuerySearchResponse.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanOutStanding, loanProductName, officeName, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAdhocQuerySearchResponse {\n");
    sb.append("    loanOutStanding: ").append(toIndentedString(loanOutStanding)).append("\n");
    sb.append("    loanProductName: ").append(toIndentedString(loanProductName)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

