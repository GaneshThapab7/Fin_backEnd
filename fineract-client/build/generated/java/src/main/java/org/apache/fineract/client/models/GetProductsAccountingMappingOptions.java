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
import org.apache.fineract.client.models.GetProductsAssetAccountOptions;
import org.apache.fineract.client.models.GetProductsEquityAccountOptions;
import org.apache.fineract.client.models.GetProductsIncomeAccountOptions;
import org.apache.fineract.client.models.GetProductsLiabilityAccountOptions;

/**
 * GetProductsAccountingMappingOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProductsAccountingMappingOptions {
  public static final String SERIALIZED_NAME_ASSET_ACCOUNT_OPTIONS = "assetAccountOptions";
  @SerializedName(SERIALIZED_NAME_ASSET_ACCOUNT_OPTIONS)
  private Set<GetProductsAssetAccountOptions> assetAccountOptions = null;

  public static final String SERIALIZED_NAME_EQUITY_ACCOUNT_OPTIONS = "equityAccountOptions";
  @SerializedName(SERIALIZED_NAME_EQUITY_ACCOUNT_OPTIONS)
  private Set<GetProductsEquityAccountOptions> equityAccountOptions = null;

  public static final String SERIALIZED_NAME_INCOME_ACCOUNT_OPTIONS = "incomeAccountOptions";
  @SerializedName(SERIALIZED_NAME_INCOME_ACCOUNT_OPTIONS)
  private Set<GetProductsIncomeAccountOptions> incomeAccountOptions = null;

  public static final String SERIALIZED_NAME_LIABILITY_ACCOUNT_OPTIONS = "liabilityAccountOptions";
  @SerializedName(SERIALIZED_NAME_LIABILITY_ACCOUNT_OPTIONS)
  private Set<GetProductsLiabilityAccountOptions> liabilityAccountOptions = null;

  public GetProductsAccountingMappingOptions() { 
  }

  public GetProductsAccountingMappingOptions assetAccountOptions(Set<GetProductsAssetAccountOptions> assetAccountOptions) {
    
    this.assetAccountOptions = assetAccountOptions;
    return this;
  }

  public GetProductsAccountingMappingOptions addAssetAccountOptionsItem(GetProductsAssetAccountOptions assetAccountOptionsItem) {
    if (this.assetAccountOptions == null) {
      this.assetAccountOptions = new LinkedHashSet<>();
    }
    this.assetAccountOptions.add(assetAccountOptionsItem);
    return this;
  }

   /**
   * Get assetAccountOptions
   * @return assetAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetProductsAssetAccountOptions> getAssetAccountOptions() {
    return assetAccountOptions;
  }


  public void setAssetAccountOptions(Set<GetProductsAssetAccountOptions> assetAccountOptions) {
    this.assetAccountOptions = assetAccountOptions;
  }


  public GetProductsAccountingMappingOptions equityAccountOptions(Set<GetProductsEquityAccountOptions> equityAccountOptions) {
    
    this.equityAccountOptions = equityAccountOptions;
    return this;
  }

  public GetProductsAccountingMappingOptions addEquityAccountOptionsItem(GetProductsEquityAccountOptions equityAccountOptionsItem) {
    if (this.equityAccountOptions == null) {
      this.equityAccountOptions = new LinkedHashSet<>();
    }
    this.equityAccountOptions.add(equityAccountOptionsItem);
    return this;
  }

   /**
   * Get equityAccountOptions
   * @return equityAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetProductsEquityAccountOptions> getEquityAccountOptions() {
    return equityAccountOptions;
  }


  public void setEquityAccountOptions(Set<GetProductsEquityAccountOptions> equityAccountOptions) {
    this.equityAccountOptions = equityAccountOptions;
  }


  public GetProductsAccountingMappingOptions incomeAccountOptions(Set<GetProductsIncomeAccountOptions> incomeAccountOptions) {
    
    this.incomeAccountOptions = incomeAccountOptions;
    return this;
  }

  public GetProductsAccountingMappingOptions addIncomeAccountOptionsItem(GetProductsIncomeAccountOptions incomeAccountOptionsItem) {
    if (this.incomeAccountOptions == null) {
      this.incomeAccountOptions = new LinkedHashSet<>();
    }
    this.incomeAccountOptions.add(incomeAccountOptionsItem);
    return this;
  }

   /**
   * Get incomeAccountOptions
   * @return incomeAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetProductsIncomeAccountOptions> getIncomeAccountOptions() {
    return incomeAccountOptions;
  }


  public void setIncomeAccountOptions(Set<GetProductsIncomeAccountOptions> incomeAccountOptions) {
    this.incomeAccountOptions = incomeAccountOptions;
  }


  public GetProductsAccountingMappingOptions liabilityAccountOptions(Set<GetProductsLiabilityAccountOptions> liabilityAccountOptions) {
    
    this.liabilityAccountOptions = liabilityAccountOptions;
    return this;
  }

  public GetProductsAccountingMappingOptions addLiabilityAccountOptionsItem(GetProductsLiabilityAccountOptions liabilityAccountOptionsItem) {
    if (this.liabilityAccountOptions == null) {
      this.liabilityAccountOptions = new LinkedHashSet<>();
    }
    this.liabilityAccountOptions.add(liabilityAccountOptionsItem);
    return this;
  }

   /**
   * Get liabilityAccountOptions
   * @return liabilityAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetProductsLiabilityAccountOptions> getLiabilityAccountOptions() {
    return liabilityAccountOptions;
  }


  public void setLiabilityAccountOptions(Set<GetProductsLiabilityAccountOptions> liabilityAccountOptions) {
    this.liabilityAccountOptions = liabilityAccountOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductsAccountingMappingOptions getProductsAccountingMappingOptions = (GetProductsAccountingMappingOptions) o;
    return Objects.equals(this.assetAccountOptions, getProductsAccountingMappingOptions.assetAccountOptions) &&
        Objects.equals(this.equityAccountOptions, getProductsAccountingMappingOptions.equityAccountOptions) &&
        Objects.equals(this.incomeAccountOptions, getProductsAccountingMappingOptions.incomeAccountOptions) &&
        Objects.equals(this.liabilityAccountOptions, getProductsAccountingMappingOptions.liabilityAccountOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetAccountOptions, equityAccountOptions, incomeAccountOptions, liabilityAccountOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsAccountingMappingOptions {\n");
    sb.append("    assetAccountOptions: ").append(toIndentedString(assetAccountOptions)).append("\n");
    sb.append("    equityAccountOptions: ").append(toIndentedString(equityAccountOptions)).append("\n");
    sb.append("    incomeAccountOptions: ").append(toIndentedString(incomeAccountOptions)).append("\n");
    sb.append("    liabilityAccountOptions: ").append(toIndentedString(liabilityAccountOptions)).append("\n");
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

