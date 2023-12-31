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
import org.apache.fineract.client.models.GetClientIdProductIdChargeOptions;
import org.apache.fineract.client.models.GetClientIdProductIdProductOptions;

/**
 * GetShareAccountsClientIdProductIdResponse
 */
@ApiModel(description = "GetShareAccountsClientIdProductIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetShareAccountsClientIdProductIdResponse {
  public static final String SERIALIZED_NAME_CHARGE_OPTIONS = "chargeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_OPTIONS)
  private Set<GetClientIdProductIdChargeOptions> chargeOptions = null;

  public static final String SERIALIZED_NAME_PRODUCT_OPTIONS = "productOptions";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OPTIONS)
  private Set<GetClientIdProductIdProductOptions> productOptions = null;

  public GetShareAccountsClientIdProductIdResponse() { 
  }

  public GetShareAccountsClientIdProductIdResponse chargeOptions(Set<GetClientIdProductIdChargeOptions> chargeOptions) {
    
    this.chargeOptions = chargeOptions;
    return this;
  }

  public GetShareAccountsClientIdProductIdResponse addChargeOptionsItem(GetClientIdProductIdChargeOptions chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new LinkedHashSet<>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientIdProductIdChargeOptions> getChargeOptions() {
    return chargeOptions;
  }


  public void setChargeOptions(Set<GetClientIdProductIdChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }


  public GetShareAccountsClientIdProductIdResponse productOptions(Set<GetClientIdProductIdProductOptions> productOptions) {
    
    this.productOptions = productOptions;
    return this;
  }

  public GetShareAccountsClientIdProductIdResponse addProductOptionsItem(GetClientIdProductIdProductOptions productOptionsItem) {
    if (this.productOptions == null) {
      this.productOptions = new LinkedHashSet<>();
    }
    this.productOptions.add(productOptionsItem);
    return this;
  }

   /**
   * Get productOptions
   * @return productOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientIdProductIdProductOptions> getProductOptions() {
    return productOptions;
  }


  public void setProductOptions(Set<GetClientIdProductIdProductOptions> productOptions) {
    this.productOptions = productOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShareAccountsClientIdProductIdResponse getShareAccountsClientIdProductIdResponse = (GetShareAccountsClientIdProductIdResponse) o;
    return Objects.equals(this.chargeOptions, getShareAccountsClientIdProductIdResponse.chargeOptions) &&
        Objects.equals(this.productOptions, getShareAccountsClientIdProductIdResponse.productOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeOptions, productOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShareAccountsClientIdProductIdResponse {\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
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

