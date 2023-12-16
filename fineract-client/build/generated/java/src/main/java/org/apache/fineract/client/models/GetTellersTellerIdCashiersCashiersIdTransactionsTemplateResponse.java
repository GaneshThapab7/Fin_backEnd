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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.CashierData;
import org.apache.fineract.client.models.CurrencyData;

/**
 * GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse
 */
@ApiModel(description = "GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse {
  public static final String SERIALIZED_NAME_CASHIER_DATA = "cashierData";
  @SerializedName(SERIALIZED_NAME_CASHIER_DATA)
  private CashierData cashierData;

  public static final String SERIALIZED_NAME_CASHIER_ID = "cashierId";
  @SerializedName(SERIALIZED_NAME_CASHIER_ID)
  private Long cashierId;

  public static final String SERIALIZED_NAME_CASHIER_NAME = "cashierName";
  @SerializedName(SERIALIZED_NAME_CASHIER_NAME)
  private String cashierName;

  public static final String SERIALIZED_NAME_CURRENCY_OPTIONS = "currencyOptions";
  @SerializedName(SERIALIZED_NAME_CURRENCY_OPTIONS)
  private List<CurrencyData> currencyOptions = null;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_TELLER_ID = "tellerId";
  @SerializedName(SERIALIZED_NAME_TELLER_ID)
  private Long tellerId;

  public static final String SERIALIZED_NAME_TELLER_NAME = "tellerName";
  @SerializedName(SERIALIZED_NAME_TELLER_NAME)
  private String tellerName;

  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse() { 
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse cashierData(CashierData cashierData) {
    
    this.cashierData = cashierData;
    return this;
  }

   /**
   * Get cashierData
   * @return cashierData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashierData getCashierData() {
    return cashierData;
  }


  public void setCashierData(CashierData cashierData) {
    this.cashierData = cashierData;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse cashierId(Long cashierId) {
    
    this.cashierId = cashierId;
    return this;
  }

   /**
   * Get cashierId
   * @return cashierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getCashierId() {
    return cashierId;
  }


  public void setCashierId(Long cashierId) {
    this.cashierId = cashierId;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse cashierName(String cashierName) {
    
    this.cashierName = cashierName;
    return this;
  }

   /**
   * Get cashierName
   * @return cashierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Staff1, Test", value = "")

  public String getCashierName() {
    return cashierName;
  }


  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse currencyOptions(List<CurrencyData> currencyOptions) {
    
    this.currencyOptions = currencyOptions;
    return this;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse addCurrencyOptionsItem(CurrencyData currencyOptionsItem) {
    if (this.currencyOptions == null) {
      this.currencyOptions = new ArrayList<>();
    }
    this.currencyOptions.add(currencyOptionsItem);
    return this;
  }

   /**
   * Get currencyOptions
   * @return currencyOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CurrencyData> getCurrencyOptions() {
    return currencyOptions;
  }


  public void setCurrencyOptions(List<CurrencyData> currencyOptions) {
    this.currencyOptions = currencyOptions;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse tellerId(Long tellerId) {
    
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getTellerId() {
    return tellerId;
  }


  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse tellerName(String tellerName) {
    
    this.tellerName = tellerName;
    return this;
  }

   /**
   * Get tellerName
   * @return tellerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Teller1", value = "")

  public String getTellerName() {
    return tellerName;
  }


  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse = (GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse) o;
    return Objects.equals(this.cashierData, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.cashierData) &&
        Objects.equals(this.cashierId, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.cashierId) &&
        Objects.equals(this.cashierName, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.cashierName) &&
        Objects.equals(this.currencyOptions, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.currencyOptions) &&
        Objects.equals(this.endDate, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.endDate) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.officeName) &&
        Objects.equals(this.startDate, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.startDate) &&
        Objects.equals(this.tellerId, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.tellerId) &&
        Objects.equals(this.tellerName, getTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.tellerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashierData, cashierId, cashierName, currencyOptions, endDate, officeName, startDate, tellerId, tellerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse {\n");
    sb.append("    cashierData: ").append(toIndentedString(cashierData)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
    sb.append("    currencyOptions: ").append(toIndentedString(currencyOptions)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
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

