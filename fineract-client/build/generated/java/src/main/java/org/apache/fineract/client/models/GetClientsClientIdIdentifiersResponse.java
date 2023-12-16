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
import org.apache.fineract.client.models.GetClientsDocumentType;

/**
 * GetClientsClientIdIdentifiersResponse
 */
@ApiModel(description = "GetClientsClientIdIdentifiersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsClientIdIdentifiersResponse {
  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private GetClientsDocumentType documentType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public GetClientsClientIdIdentifiersResponse() { 
  }

  public GetClientsClientIdIdentifiersResponse clientId(Integer clientId) {
    
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


  public GetClientsClientIdIdentifiersResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Issued in the year 2--7", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetClientsClientIdIdentifiersResponse documentKey(String documentKey) {
    
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "")

  public String getDocumentKey() {
    return documentKey;
  }


  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }


  public GetClientsClientIdIdentifiersResponse documentType(GetClientsDocumentType documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsDocumentType getDocumentType() {
    return documentType;
  }


  public void setDocumentType(GetClientsDocumentType documentType) {
    this.documentType = documentType;
  }


  public GetClientsClientIdIdentifiersResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdIdentifiersResponse getClientsClientIdIdentifiersResponse = (GetClientsClientIdIdentifiersResponse) o;
    return Objects.equals(this.clientId, getClientsClientIdIdentifiersResponse.clientId) &&
        Objects.equals(this.description, getClientsClientIdIdentifiersResponse.description) &&
        Objects.equals(this.documentKey, getClientsClientIdIdentifiersResponse.documentKey) &&
        Objects.equals(this.documentType, getClientsClientIdIdentifiersResponse.documentType) &&
        Objects.equals(this.id, getClientsClientIdIdentifiersResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, description, documentKey, documentType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdIdentifiersResponse {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

