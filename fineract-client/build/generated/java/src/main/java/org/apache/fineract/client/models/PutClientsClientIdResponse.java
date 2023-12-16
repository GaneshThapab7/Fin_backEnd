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
import org.apache.fineract.client.models.PutClientsClientIdRequest;

/**
 * PutClientsClientIdResponse
 */
@ApiModel(description = "PutClientsClientIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutClientsClientIdResponse {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private PutClientsClientIdRequest changes;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Integer resourceId;

  public PutClientsClientIdResponse() { 
  }

  public PutClientsClientIdResponse changes(PutClientsClientIdRequest changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PutClientsClientIdRequest getChanges() {
    return changes;
  }


  public void setChanges(PutClientsClientIdRequest changes) {
    this.changes = changes;
  }


  public PutClientsClientIdResponse clientId(Integer clientId) {
    
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


  public PutClientsClientIdResponse officeId(Integer officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  public PutClientsClientIdResponse resourceId(Integer resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getResourceId() {
    return resourceId;
  }


  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutClientsClientIdResponse putClientsClientIdResponse = (PutClientsClientIdResponse) o;
    return Objects.equals(this.changes, putClientsClientIdResponse.changes) &&
        Objects.equals(this.clientId, putClientsClientIdResponse.clientId) &&
        Objects.equals(this.officeId, putClientsClientIdResponse.officeId) &&
        Objects.equals(this.resourceId, putClientsClientIdResponse.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, clientId, officeId, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutClientsClientIdResponse {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

