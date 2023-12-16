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
 * PostDataTablesResponse
 */
@ApiModel(description = "PostDataTablesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostDataTablesResponse {
  public static final String SERIALIZED_NAME_RESOURCE_IDENTIFIER = "resourceIdentifier";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDENTIFIER)
  private String resourceIdentifier;

  public PostDataTablesResponse() { 
  }

  public PostDataTablesResponse resourceIdentifier(String resourceIdentifier) {
    
    this.resourceIdentifier = resourceIdentifier;
    return this;
  }

   /**
   * Get resourceIdentifier
   * @return resourceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "extra_client_details", value = "")

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
    PostDataTablesResponse postDataTablesResponse = (PostDataTablesResponse) o;
    return Objects.equals(this.resourceIdentifier, postDataTablesResponse.resourceIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDataTablesResponse {\n");
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

