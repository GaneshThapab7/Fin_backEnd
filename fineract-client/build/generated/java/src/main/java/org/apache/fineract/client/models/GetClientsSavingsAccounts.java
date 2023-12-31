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
import org.apache.fineract.client.models.GetClientsSavingsAccountsCurrency;
import org.apache.fineract.client.models.GetClientsSavingsAccountsDepositType;
import org.apache.fineract.client.models.GetClientsSavingsAccountsStatus;

/**
 * GetClientsSavingsAccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsSavingsAccounts {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetClientsSavingsAccountsCurrency currency;

  public static final String SERIALIZED_NAME_DEPOSIT_TYPE = "depositType";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_TYPE)
  private GetClientsSavingsAccountsDepositType depositType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_SHORT_PRODUCT_NAME = "shortProductName";
  @SerializedName(SERIALIZED_NAME_SHORT_PRODUCT_NAME)
  private String shortProductName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetClientsSavingsAccountsStatus status;

  public GetClientsSavingsAccounts() { 
  }

  public GetClientsSavingsAccounts accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000000007", value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public GetClientsSavingsAccounts currency(GetClientsSavingsAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsSavingsAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetClientsSavingsAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetClientsSavingsAccounts depositType(GetClientsSavingsAccountsDepositType depositType) {
    
    this.depositType = depositType;
    return this;
  }

   /**
   * Get depositType
   * @return depositType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsSavingsAccountsDepositType getDepositType() {
    return depositType;
  }


  public void setDepositType(GetClientsSavingsAccountsDepositType depositType) {
    this.depositType = depositType;
  }


  public GetClientsSavingsAccounts id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetClientsSavingsAccounts productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetClientsSavingsAccounts productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Other product", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetClientsSavingsAccounts shortProductName(String shortProductName) {
    
    this.shortProductName = shortProductName;
    return this;
  }

   /**
   * Get shortProductName
   * @return shortProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OP", value = "")

  public String getShortProductName() {
    return shortProductName;
  }


  public void setShortProductName(String shortProductName) {
    this.shortProductName = shortProductName;
  }


  public GetClientsSavingsAccounts status(GetClientsSavingsAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientsSavingsAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetClientsSavingsAccountsStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsSavingsAccounts getClientsSavingsAccounts = (GetClientsSavingsAccounts) o;
    return Objects.equals(this.accountNo, getClientsSavingsAccounts.accountNo) &&
        Objects.equals(this.currency, getClientsSavingsAccounts.currency) &&
        Objects.equals(this.depositType, getClientsSavingsAccounts.depositType) &&
        Objects.equals(this.id, getClientsSavingsAccounts.id) &&
        Objects.equals(this.productId, getClientsSavingsAccounts.productId) &&
        Objects.equals(this.productName, getClientsSavingsAccounts.productName) &&
        Objects.equals(this.shortProductName, getClientsSavingsAccounts.shortProductName) &&
        Objects.equals(this.status, getClientsSavingsAccounts.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, currency, depositType, id, productId, productName, shortProductName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsSavingsAccounts {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    shortProductName: ").append(toIndentedString(shortProductName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

