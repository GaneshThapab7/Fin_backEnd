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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.PutDataTablesRequestAddColumns;
import org.apache.fineract.client.models.PutDataTablesRequestChangeColumns;
import org.apache.fineract.client.models.PutDataTablesRequestDropColumns;

/**
 * PutDataTablesRequest
 */
@ApiModel(description = "PutDataTablesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutDataTablesRequest {
  public static final String SERIALIZED_NAME_CHANGE_COLUMNS = "ChangeColumns";
  @SerializedName(SERIALIZED_NAME_CHANGE_COLUMNS)
  private List<PutDataTablesRequestChangeColumns> changeColumns = null;

  public static final String SERIALIZED_NAME_ADD_COLUMNS = "addColumns";
  @SerializedName(SERIALIZED_NAME_ADD_COLUMNS)
  private List<PutDataTablesRequestAddColumns> addColumns = null;

  public static final String SERIALIZED_NAME_APP_TABLE_NAME = "appTableName";
  @SerializedName(SERIALIZED_NAME_APP_TABLE_NAME)
  private String appTableName;

  public static final String SERIALIZED_NAME_DROP_COLUMNS = "dropColumns";
  @SerializedName(SERIALIZED_NAME_DROP_COLUMNS)
  private List<PutDataTablesRequestDropColumns> dropColumns = null;

  public PutDataTablesRequest() { 
  }

  public PutDataTablesRequest changeColumns(List<PutDataTablesRequestChangeColumns> changeColumns) {
    
    this.changeColumns = changeColumns;
    return this;
  }

  public PutDataTablesRequest addChangeColumnsItem(PutDataTablesRequestChangeColumns changeColumnsItem) {
    if (this.changeColumns == null) {
      this.changeColumns = new ArrayList<>();
    }
    this.changeColumns.add(changeColumnsItem);
    return this;
  }

   /**
   * Get changeColumns
   * @return changeColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PutDataTablesRequestChangeColumns> getChangeColumns() {
    return changeColumns;
  }


  public void setChangeColumns(List<PutDataTablesRequestChangeColumns> changeColumns) {
    this.changeColumns = changeColumns;
  }


  public PutDataTablesRequest addColumns(List<PutDataTablesRequestAddColumns> addColumns) {
    
    this.addColumns = addColumns;
    return this;
  }

  public PutDataTablesRequest addAddColumnsItem(PutDataTablesRequestAddColumns addColumnsItem) {
    if (this.addColumns == null) {
      this.addColumns = new ArrayList<>();
    }
    this.addColumns.add(addColumnsItem);
    return this;
  }

   /**
   * Get addColumns
   * @return addColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PutDataTablesRequestAddColumns> getAddColumns() {
    return addColumns;
  }


  public void setAddColumns(List<PutDataTablesRequestAddColumns> addColumns) {
    this.addColumns = addColumns;
  }


  public PutDataTablesRequest appTableName(String appTableName) {
    
    this.appTableName = appTableName;
    return this;
  }

   /**
   * Get appTableName
   * @return appTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "m_client", value = "")

  public String getAppTableName() {
    return appTableName;
  }


  public void setAppTableName(String appTableName) {
    this.appTableName = appTableName;
  }


  public PutDataTablesRequest dropColumns(List<PutDataTablesRequestDropColumns> dropColumns) {
    
    this.dropColumns = dropColumns;
    return this;
  }

  public PutDataTablesRequest addDropColumnsItem(PutDataTablesRequestDropColumns dropColumnsItem) {
    if (this.dropColumns == null) {
      this.dropColumns = new ArrayList<>();
    }
    this.dropColumns.add(dropColumnsItem);
    return this;
  }

   /**
   * Get dropColumns
   * @return dropColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PutDataTablesRequestDropColumns> getDropColumns() {
    return dropColumns;
  }


  public void setDropColumns(List<PutDataTablesRequestDropColumns> dropColumns) {
    this.dropColumns = dropColumns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutDataTablesRequest putDataTablesRequest = (PutDataTablesRequest) o;
    return Objects.equals(this.changeColumns, putDataTablesRequest.changeColumns) &&
        Objects.equals(this.addColumns, putDataTablesRequest.addColumns) &&
        Objects.equals(this.appTableName, putDataTablesRequest.appTableName) &&
        Objects.equals(this.dropColumns, putDataTablesRequest.dropColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeColumns, addColumns, appTableName, dropColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutDataTablesRequest {\n");
    sb.append("    changeColumns: ").append(toIndentedString(changeColumns)).append("\n");
    sb.append("    addColumns: ").append(toIndentedString(addColumns)).append("\n");
    sb.append("    appTableName: ").append(toIndentedString(appTableName)).append("\n");
    sb.append("    dropColumns: ").append(toIndentedString(dropColumns)).append("\n");
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

