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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FormDataContentDisposition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FormDataContentDisposition {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = null;

  public static final String SERIALIZED_NAME_READ_DATE = "readDate";
  @SerializedName(SERIALIZED_NAME_READ_DATE)
  private OffsetDateTime readDate;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public FormDataContentDisposition() { 
  }

  public FormDataContentDisposition creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public FormDataContentDisposition fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FormDataContentDisposition modificationDate(OffsetDateTime modificationDate) {
    
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }


  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public FormDataContentDisposition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FormDataContentDisposition parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public FormDataContentDisposition putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public FormDataContentDisposition readDate(OffsetDateTime readDate) {
    
    this.readDate = readDate;
    return this;
  }

   /**
   * Get readDate
   * @return readDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getReadDate() {
    return readDate;
  }


  public void setReadDate(OffsetDateTime readDate) {
    this.readDate = readDate;
  }


  public FormDataContentDisposition size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public FormDataContentDisposition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    FormDataContentDisposition formDataContentDisposition = (FormDataContentDisposition) o;
    return Objects.equals(this.creationDate, formDataContentDisposition.creationDate) &&
        Objects.equals(this.fileName, formDataContentDisposition.fileName) &&
        Objects.equals(this.modificationDate, formDataContentDisposition.modificationDate) &&
        Objects.equals(this.name, formDataContentDisposition.name) &&
        Objects.equals(this.parameters, formDataContentDisposition.parameters) &&
        Objects.equals(this.readDate, formDataContentDisposition.readDate) &&
        Objects.equals(this.size, formDataContentDisposition.size) &&
        Objects.equals(this.type, formDataContentDisposition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, fileName, modificationDate, name, parameters, readDate, size, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataContentDisposition {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
