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
 * BodyPartMediaType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BodyPartMediaType {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = null;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WILDCARD_SUBTYPE = "wildcardSubtype";
  @SerializedName(SERIALIZED_NAME_WILDCARD_SUBTYPE)
  private Boolean wildcardSubtype;

  public static final String SERIALIZED_NAME_WILDCARD_TYPE = "wildcardType";
  @SerializedName(SERIALIZED_NAME_WILDCARD_TYPE)
  private Boolean wildcardType;

  public BodyPartMediaType() { 
  }

  public BodyPartMediaType parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public BodyPartMediaType putParametersItem(String key, String parametersItem) {
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


  public BodyPartMediaType subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public BodyPartMediaType type(String type) {
    
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


  public BodyPartMediaType wildcardSubtype(Boolean wildcardSubtype) {
    
    this.wildcardSubtype = wildcardSubtype;
    return this;
  }

   /**
   * Get wildcardSubtype
   * @return wildcardSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWildcardSubtype() {
    return wildcardSubtype;
  }


  public void setWildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
  }


  public BodyPartMediaType wildcardType(Boolean wildcardType) {
    
    this.wildcardType = wildcardType;
    return this;
  }

   /**
   * Get wildcardType
   * @return wildcardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWildcardType() {
    return wildcardType;
  }


  public void setWildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyPartMediaType bodyPartMediaType = (BodyPartMediaType) o;
    return Objects.equals(this.parameters, bodyPartMediaType.parameters) &&
        Objects.equals(this.subtype, bodyPartMediaType.subtype) &&
        Objects.equals(this.type, bodyPartMediaType.type) &&
        Objects.equals(this.wildcardSubtype, bodyPartMediaType.wildcardSubtype) &&
        Objects.equals(this.wildcardType, bodyPartMediaType.wildcardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, subtype, type, wildcardSubtype, wildcardType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyPartMediaType {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
    sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
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
