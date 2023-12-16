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
import org.apache.fineract.client.models.GetGroupsTemplateColumnHeaderData;

/**
 * GetGroupsTemplateDatatables
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetGroupsTemplateDatatables {
  public static final String SERIALIZED_NAME_APPLICATION_TABLE_NAME = "applicationTableName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TABLE_NAME)
  private String applicationTableName;

  public static final String SERIALIZED_NAME_COLUMN_HEADER_DATA = "columnHeaderData";
  @SerializedName(SERIALIZED_NAME_COLUMN_HEADER_DATA)
  private Set<GetGroupsTemplateColumnHeaderData> columnHeaderData = null;

  public static final String SERIALIZED_NAME_REGISTERED_TABLE_NAME = "registeredTableName";
  @SerializedName(SERIALIZED_NAME_REGISTERED_TABLE_NAME)
  private String registeredTableName;

  public GetGroupsTemplateDatatables() { 
  }

  public GetGroupsTemplateDatatables applicationTableName(String applicationTableName) {
    
    this.applicationTableName = applicationTableName;
    return this;
  }

   /**
   * Get applicationTableName
   * @return applicationTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "m_group", value = "")

  public String getApplicationTableName() {
    return applicationTableName;
  }


  public void setApplicationTableName(String applicationTableName) {
    this.applicationTableName = applicationTableName;
  }


  public GetGroupsTemplateDatatables columnHeaderData(Set<GetGroupsTemplateColumnHeaderData> columnHeaderData) {
    
    this.columnHeaderData = columnHeaderData;
    return this;
  }

  public GetGroupsTemplateDatatables addColumnHeaderDataItem(GetGroupsTemplateColumnHeaderData columnHeaderDataItem) {
    if (this.columnHeaderData == null) {
      this.columnHeaderData = new LinkedHashSet<>();
    }
    this.columnHeaderData.add(columnHeaderDataItem);
    return this;
  }

   /**
   * Get columnHeaderData
   * @return columnHeaderData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetGroupsTemplateColumnHeaderData> getColumnHeaderData() {
    return columnHeaderData;
  }


  public void setColumnHeaderData(Set<GetGroupsTemplateColumnHeaderData> columnHeaderData) {
    this.columnHeaderData = columnHeaderData;
  }


  public GetGroupsTemplateDatatables registeredTableName(String registeredTableName) {
    
    this.registeredTableName = registeredTableName;
    return this;
  }

   /**
   * Get registeredTableName
   * @return registeredTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Group Activation Data", value = "")

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
    GetGroupsTemplateDatatables getGroupsTemplateDatatables = (GetGroupsTemplateDatatables) o;
    return Objects.equals(this.applicationTableName, getGroupsTemplateDatatables.applicationTableName) &&
        Objects.equals(this.columnHeaderData, getGroupsTemplateDatatables.columnHeaderData) &&
        Objects.equals(this.registeredTableName, getGroupsTemplateDatatables.registeredTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationTableName, columnHeaderData, registeredTableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsTemplateDatatables {\n");
    sb.append("    applicationTableName: ").append(toIndentedString(applicationTableName)).append("\n");
    sb.append("    columnHeaderData: ").append(toIndentedString(columnHeaderData)).append("\n");
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
