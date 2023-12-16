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
 * IdDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdDocument {
  public static final String SERIALIZED_NAME_ID_NUMBER = "idNumber";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_OTHER_ID_DESCRIPTION = "otherIdDescription";
  @SerializedName(SERIALIZED_NAME_OTHER_ID_DESCRIPTION)
  private String otherIdDescription;

  public IdDocument() { 
  }

  public IdDocument idNumber(String idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public IdDocument idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdType() {
    return idType;
  }


  public void setIdType(String idType) {
    this.idType = idType;
  }


  public IdDocument issuerCountry(String issuerCountry) {
    
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * Get issuerCountry
   * @return issuerCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerCountry() {
    return issuerCountry;
  }


  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }


  public IdDocument otherIdDescription(String otherIdDescription) {
    
    this.otherIdDescription = otherIdDescription;
    return this;
  }

   /**
   * Get otherIdDescription
   * @return otherIdDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOtherIdDescription() {
    return otherIdDescription;
  }


  public void setOtherIdDescription(String otherIdDescription) {
    this.otherIdDescription = otherIdDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdDocument idDocument = (IdDocument) o;
    return Objects.equals(this.idNumber, idDocument.idNumber) &&
        Objects.equals(this.idType, idDocument.idType) &&
        Objects.equals(this.issuerCountry, idDocument.issuerCountry) &&
        Objects.equals(this.otherIdDescription, idDocument.otherIdDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, idType, issuerCountry, otherIdDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdDocument {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    otherIdDescription: ").append(toIndentedString(otherIdDescription)).append("\n");
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

