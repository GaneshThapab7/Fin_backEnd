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
 * GetAccountsTypePurchasedShares
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountsTypePurchasedShares {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NUMBER_OF_SHARES = "numberOfShares";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SHARES)
  private Integer numberOfShares;

  public static final String SERIALIZED_NAME_PURCHASED_DATE = "purchasedDate";
  @SerializedName(SERIALIZED_NAME_PURCHASED_DATE)
  private String purchasedDate;

  public static final String SERIALIZED_NAME_PURCHASED_PRICE = "purchasedPrice";
  @SerializedName(SERIALIZED_NAME_PURCHASED_PRICE)
  private Integer purchasedPrice;

  public GetAccountsTypePurchasedShares() { 
  }

  public GetAccountsTypePurchasedShares id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetAccountsTypePurchasedShares numberOfShares(Integer numberOfShares) {
    
    this.numberOfShares = numberOfShares;
    return this;
  }

   /**
   * Get numberOfShares
   * @return numberOfShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getNumberOfShares() {
    return numberOfShares;
  }


  public void setNumberOfShares(Integer numberOfShares) {
    this.numberOfShares = numberOfShares;
  }


  public GetAccountsTypePurchasedShares purchasedDate(String purchasedDate) {
    
    this.purchasedDate = purchasedDate;
    return this;
  }

   /**
   * Get purchasedDate
   * @return purchasedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01 May 2013", value = "")

  public String getPurchasedDate() {
    return purchasedDate;
  }


  public void setPurchasedDate(String purchasedDate) {
    this.purchasedDate = purchasedDate;
  }


  public GetAccountsTypePurchasedShares purchasedPrice(Integer purchasedPrice) {
    
    this.purchasedPrice = purchasedPrice;
    return this;
  }

   /**
   * Get purchasedPrice
   * @return purchasedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getPurchasedPrice() {
    return purchasedPrice;
  }


  public void setPurchasedPrice(Integer purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsTypePurchasedShares getAccountsTypePurchasedShares = (GetAccountsTypePurchasedShares) o;
    return Objects.equals(this.id, getAccountsTypePurchasedShares.id) &&
        Objects.equals(this.numberOfShares, getAccountsTypePurchasedShares.numberOfShares) &&
        Objects.equals(this.purchasedDate, getAccountsTypePurchasedShares.purchasedDate) &&
        Objects.equals(this.purchasedPrice, getAccountsTypePurchasedShares.purchasedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numberOfShares, purchasedDate, purchasedPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsTypePurchasedShares {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    purchasedDate: ").append(toIndentedString(purchasedDate)).append("\n");
    sb.append("    purchasedPrice: ").append(toIndentedString(purchasedPrice)).append("\n");
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

