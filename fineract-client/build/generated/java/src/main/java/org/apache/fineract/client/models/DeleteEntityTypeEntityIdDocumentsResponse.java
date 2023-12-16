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
 * DeleteEntityTypeEntityIdDocumentsResponse
 */
@ApiModel(description = "DeleteEntityTypeEntityIdDocumentsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteEntityTypeEntityIdDocumentsResponse {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Object changes;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_IDENTIFIER = "resourceIdentifier";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDENTIFIER)
  private String resourceIdentifier;

  public DeleteEntityTypeEntityIdDocumentsResponse() { 
  }

  public DeleteEntityTypeEntityIdDocumentsResponse changes(Object changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getChanges() {
    return changes;
  }


  public void setChanges(Object changes) {
    this.changes = changes;
  }


  public DeleteEntityTypeEntityIdDocumentsResponse resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public DeleteEntityTypeEntityIdDocumentsResponse resourceIdentifier(String resourceIdentifier) {
    
    this.resourceIdentifier = resourceIdentifier;
    return this;
  }

   /**
   * Get resourceIdentifier
   * @return resourceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public String getResourceIdentifier() {
    return resourceIdentifier;
  }


  public void setResourceIdentifier(String resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEntityTypeEntityIdDocumentsResponse deleteEntityTypeEntityIdDocumentsResponse = (DeleteEntityTypeEntityIdDocumentsResponse) o;
    return Objects.equals(this.changes, deleteEntityTypeEntityIdDocumentsResponse.changes) &&
        Objects.equals(this.resourceId, deleteEntityTypeEntityIdDocumentsResponse.resourceId) &&
        Objects.equals(this.resourceIdentifier, deleteEntityTypeEntityIdDocumentsResponse.resourceIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, resourceId, resourceIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEntityTypeEntityIdDocumentsResponse {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
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

