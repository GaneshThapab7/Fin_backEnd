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
 * GetEntityTypeEntityIdDocumentsResponse
 */
@ApiModel(description = "GetEntityTypeEntityIdDocumentsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetEntityTypeEntityIdDocumentsResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ENTITY_ID = "parentEntityId";
  @SerializedName(SERIALIZED_NAME_PARENT_ENTITY_ID)
  private Long parentEntityId;

  public static final String SERIALIZED_NAME_PARENT_ENTITY_TYPE = "parentEntityType";
  @SerializedName(SERIALIZED_NAME_PARENT_ENTITY_TYPE)
  private String parentEntityType;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private Integer storageType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetEntityTypeEntityIdDocumentsResponse() { 
  }

  public GetEntityTypeEntityIdDocumentsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A signed form signed by new member", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetEntityTypeEntityIdDocumentsResponse fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CGAP.pdf", value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public GetEntityTypeEntityIdDocumentsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetEntityTypeEntityIdDocumentsResponse location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public GetEntityTypeEntityIdDocumentsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Details Form", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetEntityTypeEntityIdDocumentsResponse parentEntityId(Long parentEntityId) {
    
    this.parentEntityId = parentEntityId;
    return this;
  }

   /**
   * Get parentEntityId
   * @return parentEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getParentEntityId() {
    return parentEntityId;
  }


  public void setParentEntityId(Long parentEntityId) {
    this.parentEntityId = parentEntityId;
  }


  public GetEntityTypeEntityIdDocumentsResponse parentEntityType(String parentEntityType) {
    
    this.parentEntityType = parentEntityType;
    return this;
  }

   /**
   * Get parentEntityType
   * @return parentEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "clients", value = "")

  public String getParentEntityType() {
    return parentEntityType;
  }


  public void setParentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
  }


  public GetEntityTypeEntityIdDocumentsResponse size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5246719", value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public GetEntityTypeEntityIdDocumentsResponse storageType(Integer storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStorageType() {
    return storageType;
  }


  public void setStorageType(Integer storageType) {
    this.storageType = storageType;
  }


  public GetEntityTypeEntityIdDocumentsResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/pdf", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEntityTypeEntityIdDocumentsResponse getEntityTypeEntityIdDocumentsResponse = (GetEntityTypeEntityIdDocumentsResponse) o;
    return Objects.equals(this.description, getEntityTypeEntityIdDocumentsResponse.description) &&
        Objects.equals(this.fileName, getEntityTypeEntityIdDocumentsResponse.fileName) &&
        Objects.equals(this.id, getEntityTypeEntityIdDocumentsResponse.id) &&
        Objects.equals(this.location, getEntityTypeEntityIdDocumentsResponse.location) &&
        Objects.equals(this.name, getEntityTypeEntityIdDocumentsResponse.name) &&
        Objects.equals(this.parentEntityId, getEntityTypeEntityIdDocumentsResponse.parentEntityId) &&
        Objects.equals(this.parentEntityType, getEntityTypeEntityIdDocumentsResponse.parentEntityType) &&
        Objects.equals(this.size, getEntityTypeEntityIdDocumentsResponse.size) &&
        Objects.equals(this.storageType, getEntityTypeEntityIdDocumentsResponse.storageType) &&
        Objects.equals(this.type, getEntityTypeEntityIdDocumentsResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fileName, id, location, name, parentEntityId, parentEntityType, size, storageType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEntityTypeEntityIdDocumentsResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    parentEntityType: ").append(toIndentedString(parentEntityType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

