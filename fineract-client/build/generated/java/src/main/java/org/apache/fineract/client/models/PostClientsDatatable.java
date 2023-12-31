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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List of PostClientsDatatable
 */
@ApiModel(description = "List of PostClientsDatatable")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostClientsDatatable {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, Object> data = null;

  public static final String SERIALIZED_NAME_REGISTERED_TABLE_NAME = "registeredTableName";
  @SerializedName(SERIALIZED_NAME_REGISTERED_TABLE_NAME)
  private String registeredTableName;

  public PostClientsDatatable() { 
  }

  public PostClientsDatatable data(Map<String, Object> data) {
    
    this.data = data;
    return this;
  }

  public PostClientsDatatable putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "data", value = "")

  public Map<String, Object> getData() {
    return data;
  }


  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  public PostClientsDatatable registeredTableName(String registeredTableName) {
    
    this.registeredTableName = registeredTableName;
    return this;
  }

   /**
   * Get registeredTableName
   * @return registeredTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Beneficiary information", value = "")

  public String getRegisteredTableName() {
    return registeredTableName;
  }


  public void setRegisteredTableName(String registeredTableName) {
    this.registeredTableName = registeredTableName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostClientsDatatable postClientsDatatable = (PostClientsDatatable) o;
    return Objects.equals(this.data, postClientsDatatable.data) &&
        Objects.equals(this.registeredTableName, postClientsDatatable.registeredTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, registeredTableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostClientsDatatable {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    registeredTableName: ").append(toIndentedString(registeredTableName)).append("\n");
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

