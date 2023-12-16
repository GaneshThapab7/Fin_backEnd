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
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferCurrency;

/**
 * GetAccountTransfersTemplateRefundByTransferFromAccountOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountTransfersTemplateRefundByTransferFromAccountOptions {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetAccountTransfersTemplateRefundByTransferCurrency currency;

  public static final String SERIALIZED_NAME_FIELD_OFFICER_ID = "fieldOfficerId";
  @SerializedName(SERIALIZED_NAME_FIELD_OFFICER_ID)
  private Integer fieldOfficerId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions() { 
  }

  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions clientId(Integer clientId) {
    
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


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daniel Owusu", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions currency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersTemplateRefundByTransferCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    this.currency = currency;
  }


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions fieldOfficerId(Integer fieldOfficerId) {
    
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }


  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions id(Integer id) {
    
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


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetAccountTransfersTemplateRefundByTransferFromAccountOptions productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CTRL", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTemplateRefundByTransferFromAccountOptions getAccountTransfersTemplateRefundByTransferFromAccountOptions = (GetAccountTransfersTemplateRefundByTransferFromAccountOptions) o;
    return Objects.equals(this.accountNo, getAccountTransfersTemplateRefundByTransferFromAccountOptions.accountNo) &&
        Objects.equals(this.clientId, getAccountTransfersTemplateRefundByTransferFromAccountOptions.clientId) &&
        Objects.equals(this.clientName, getAccountTransfersTemplateRefundByTransferFromAccountOptions.clientName) &&
        Objects.equals(this.currency, getAccountTransfersTemplateRefundByTransferFromAccountOptions.currency) &&
        Objects.equals(this.fieldOfficerId, getAccountTransfersTemplateRefundByTransferFromAccountOptions.fieldOfficerId) &&
        Objects.equals(this.id, getAccountTransfersTemplateRefundByTransferFromAccountOptions.id) &&
        Objects.equals(this.productId, getAccountTransfersTemplateRefundByTransferFromAccountOptions.productId) &&
        Objects.equals(this.productName, getAccountTransfersTemplateRefundByTransferFromAccountOptions.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, clientId, clientName, currency, fieldOfficerId, id, productId, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTemplateRefundByTransferFromAccountOptions {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
