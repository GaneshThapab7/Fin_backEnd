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
import org.apache.fineract.client.models.EnumOptionData;

/**
 * GetAccountNumberFormatsIdResponse
 */
@ApiModel(description = "GetAccountNumberFormatsIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountNumberFormatsIdResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private EnumOptionData accountType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PREFIX_TYPE = "prefixType";
  @SerializedName(SERIALIZED_NAME_PREFIX_TYPE)
  private EnumOptionData prefixType;

  public GetAccountNumberFormatsIdResponse() { 
  }

  public GetAccountNumberFormatsIdResponse accountType(EnumOptionData accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getAccountType() {
    return accountType;
  }


  public void setAccountType(EnumOptionData accountType) {
    this.accountType = accountType;
  }


  public GetAccountNumberFormatsIdResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetAccountNumberFormatsIdResponse prefixType(EnumOptionData prefixType) {
    
    this.prefixType = prefixType;
    return this;
  }

   /**
   * Get prefixType
   * @return prefixType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getPrefixType() {
    return prefixType;
  }


  public void setPrefixType(EnumOptionData prefixType) {
    this.prefixType = prefixType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountNumberFormatsIdResponse getAccountNumberFormatsIdResponse = (GetAccountNumberFormatsIdResponse) o;
    return Objects.equals(this.accountType, getAccountNumberFormatsIdResponse.accountType) &&
        Objects.equals(this.id, getAccountNumberFormatsIdResponse.id) &&
        Objects.equals(this.prefixType, getAccountNumberFormatsIdResponse.prefixType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, id, prefixType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountNumberFormatsIdResponse {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prefixType: ").append(toIndentedString(prefixType)).append("\n");
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
