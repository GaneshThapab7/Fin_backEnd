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
 * GetProvisioningCriteriaResponse
 */
@ApiModel(description = "GetProvisioningCriteriaResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProvisioningCriteriaResponse {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CRITERIA_ID = "criteriaId";
  @SerializedName(SERIALIZED_NAME_CRITERIA_ID)
  private Long criteriaId;

  public static final String SERIALIZED_NAME_CRITERIA_NAME = "criteriaName";
  @SerializedName(SERIALIZED_NAME_CRITERIA_NAME)
  private String criteriaName;

  public GetProvisioningCriteriaResponse() { 
  }

  public GetProvisioningCriteriaResponse createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GetProvisioningCriteriaResponse criteriaId(Long criteriaId) {
    
    this.criteriaId = criteriaId;
    return this;
  }

   /**
   * Get criteriaId
   * @return criteriaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getCriteriaId() {
    return criteriaId;
  }


  public void setCriteriaId(Long criteriaId) {
    this.criteriaId = criteriaId;
  }


  public GetProvisioningCriteriaResponse criteriaName(String criteriaName) {
    
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Get criteriaName
   * @return criteriaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "High Risk Products Criteria", value = "")

  public String getCriteriaName() {
    return criteriaName;
  }


  public void setCriteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProvisioningCriteriaResponse getProvisioningCriteriaResponse = (GetProvisioningCriteriaResponse) o;
    return Objects.equals(this.createdBy, getProvisioningCriteriaResponse.createdBy) &&
        Objects.equals(this.criteriaId, getProvisioningCriteriaResponse.criteriaId) &&
        Objects.equals(this.criteriaName, getProvisioningCriteriaResponse.criteriaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, criteriaId, criteriaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProvisioningCriteriaResponse {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    criteriaId: ").append(toIndentedString(criteriaId)).append("\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
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
