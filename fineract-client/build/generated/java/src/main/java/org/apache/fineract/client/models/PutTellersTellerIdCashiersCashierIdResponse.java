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
import org.apache.fineract.client.models.PutTellersTellerIdCashiersCashierIdResponseChanges;

/**
 * PutTellersTellerIdCashiersCashierIdResponse
 */
@ApiModel(description = "PutTellersTellerIdCashiersCashierIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutTellersTellerIdCashiersCashierIdResponse {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private PutTellersTellerIdCashiersCashierIdResponseChanges changes;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId;

  public static final String SERIALIZED_NAME_SUB_RESOURCE_ID = "subResourceId";
  @SerializedName(SERIALIZED_NAME_SUB_RESOURCE_ID)
  private Long subResourceId;

  public PutTellersTellerIdCashiersCashierIdResponse() { 
  }

  public PutTellersTellerIdCashiersCashierIdResponse changes(PutTellersTellerIdCashiersCashierIdResponseChanges changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PutTellersTellerIdCashiersCashierIdResponseChanges getChanges() {
    return changes;
  }


  public void setChanges(PutTellersTellerIdCashiersCashierIdResponseChanges changes) {
    this.changes = changes;
  }


  public PutTellersTellerIdCashiersCashierIdResponse resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public PutTellersTellerIdCashiersCashierIdResponse subResourceId(Long subResourceId) {
    
    this.subResourceId = subResourceId;
    return this;
  }

   /**
   * Get subResourceId
   * @return subResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getSubResourceId() {
    return subResourceId;
  }


  public void setSubResourceId(Long subResourceId) {
    this.subResourceId = subResourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTellersTellerIdCashiersCashierIdResponse putTellersTellerIdCashiersCashierIdResponse = (PutTellersTellerIdCashiersCashierIdResponse) o;
    return Objects.equals(this.changes, putTellersTellerIdCashiersCashierIdResponse.changes) &&
        Objects.equals(this.resourceId, putTellersTellerIdCashiersCashierIdResponse.resourceId) &&
        Objects.equals(this.subResourceId, putTellersTellerIdCashiersCashierIdResponse.subResourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, resourceId, subResourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTellersTellerIdCashiersCashierIdResponse {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
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

