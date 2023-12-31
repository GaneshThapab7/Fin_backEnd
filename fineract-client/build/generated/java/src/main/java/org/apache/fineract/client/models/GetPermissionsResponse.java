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
 * GetPermissionsResponse
 */
@ApiModel(description = "GetPermissionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPermissionsResponse {
  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entityName";
  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_GROUPING = "grouping";
  @SerializedName(SERIALIZED_NAME_GROUPING)
  private String grouping;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;

  public GetPermissionsResponse() { 
  }

  public GetPermissionsResponse actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READ", value = "")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public GetPermissionsResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READ_PERMISSION", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetPermissionsResponse entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERMISSION", value = "")

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public GetPermissionsResponse grouping(String grouping) {
    
    this.grouping = grouping;
    return this;
  }

   /**
   * Get grouping
   * @return grouping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorisation", value = "")

  public String getGrouping() {
    return grouping;
  }


  public void setGrouping(String grouping) {
    this.grouping = grouping;
  }


  public GetPermissionsResponse selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSelected() {
    return selected;
  }


  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPermissionsResponse getPermissionsResponse = (GetPermissionsResponse) o;
    return Objects.equals(this.actionName, getPermissionsResponse.actionName) &&
        Objects.equals(this.code, getPermissionsResponse.code) &&
        Objects.equals(this.entityName, getPermissionsResponse.entityName) &&
        Objects.equals(this.grouping, getPermissionsResponse.grouping) &&
        Objects.equals(this.selected, getPermissionsResponse.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, code, entityName, grouping, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPermissionsResponse {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

