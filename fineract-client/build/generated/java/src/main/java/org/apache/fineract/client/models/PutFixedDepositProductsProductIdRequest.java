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
 * PutFixedDepositProductsProductIdRequest
 */
@ApiModel(description = "PutFixedDepositProductsProductIdRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutFixedDepositProductsProductIdRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM = "minDepositTerm";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM)
  private Integer minDepositTerm;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE_ID = "minDepositTermTypeId";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE_ID)
  private Integer minDepositTermTypeId;

  public PutFixedDepositProductsProductIdRequest() { 
  }

  public PutFixedDepositProductsProductIdRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fixed deposit product new offerings", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PutFixedDepositProductsProductIdRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PutFixedDepositProductsProductIdRequest minDepositTerm(Integer minDepositTerm) {
    
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }


  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }


  public PutFixedDepositProductsProductIdRequest minDepositTermTypeId(Integer minDepositTermTypeId) {
    
    this.minDepositTermTypeId = minDepositTermTypeId;
    return this;
  }

   /**
   * Get minDepositTermTypeId
   * @return minDepositTermTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getMinDepositTermTypeId() {
    return minDepositTermTypeId;
  }


  public void setMinDepositTermTypeId(Integer minDepositTermTypeId) {
    this.minDepositTermTypeId = minDepositTermTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFixedDepositProductsProductIdRequest putFixedDepositProductsProductIdRequest = (PutFixedDepositProductsProductIdRequest) o;
    return Objects.equals(this.description, putFixedDepositProductsProductIdRequest.description) &&
        Objects.equals(this.locale, putFixedDepositProductsProductIdRequest.locale) &&
        Objects.equals(this.minDepositTerm, putFixedDepositProductsProductIdRequest.minDepositTerm) &&
        Objects.equals(this.minDepositTermTypeId, putFixedDepositProductsProductIdRequest.minDepositTermTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, locale, minDepositTerm, minDepositTermTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFixedDepositProductsProductIdRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    minDepositTermTypeId: ").append(toIndentedString(minDepositTermTypeId)).append("\n");
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

