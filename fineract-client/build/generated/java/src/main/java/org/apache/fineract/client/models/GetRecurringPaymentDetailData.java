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
import org.apache.fineract.client.models.GetRecurringPaymentType;

/**
 * GetRecurringPaymentDetailData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetRecurringPaymentDetailData {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private Integer accountNumber;

  public static final String SERIALIZED_NAME_BANK_NUMBER = "bankNumber";
  @SerializedName(SERIALIZED_NAME_BANK_NUMBER)
  private Integer bankNumber;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private Integer checkNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private GetRecurringPaymentType paymentType;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private Integer receiptNumber;

  public static final String SERIALIZED_NAME_ROUTING_CODE = "routingCode";
  @SerializedName(SERIALIZED_NAME_ROUTING_CODE)
  private Integer routingCode;

  public GetRecurringPaymentDetailData() { 
  }

  public GetRecurringPaymentDetailData accountNumber(Integer accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(Integer accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetRecurringPaymentDetailData bankNumber(Integer bankNumber) {
    
    this.bankNumber = bankNumber;
    return this;
  }

   /**
   * Get bankNumber
   * @return bankNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBankNumber() {
    return bankNumber;
  }


  public void setBankNumber(Integer bankNumber) {
    this.bankNumber = bankNumber;
  }


  public GetRecurringPaymentDetailData checkNumber(Integer checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }


  public GetRecurringPaymentDetailData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "62", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringPaymentDetailData paymentType(GetRecurringPaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringPaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(GetRecurringPaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public GetRecurringPaymentDetailData receiptNumber(Integer receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(Integer receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public GetRecurringPaymentDetailData routingCode(Integer routingCode) {
    
    this.routingCode = routingCode;
    return this;
  }

   /**
   * Get routingCode
   * @return routingCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRoutingCode() {
    return routingCode;
  }


  public void setRoutingCode(Integer routingCode) {
    this.routingCode = routingCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringPaymentDetailData getRecurringPaymentDetailData = (GetRecurringPaymentDetailData) o;
    return Objects.equals(this.accountNumber, getRecurringPaymentDetailData.accountNumber) &&
        Objects.equals(this.bankNumber, getRecurringPaymentDetailData.bankNumber) &&
        Objects.equals(this.checkNumber, getRecurringPaymentDetailData.checkNumber) &&
        Objects.equals(this.id, getRecurringPaymentDetailData.id) &&
        Objects.equals(this.paymentType, getRecurringPaymentDetailData.paymentType) &&
        Objects.equals(this.receiptNumber, getRecurringPaymentDetailData.receiptNumber) &&
        Objects.equals(this.routingCode, getRecurringPaymentDetailData.routingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankNumber, checkNumber, id, paymentType, receiptNumber, routingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringPaymentDetailData {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankNumber: ").append(toIndentedString(bankNumber)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    routingCode: ").append(toIndentedString(routingCode)).append("\n");
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

