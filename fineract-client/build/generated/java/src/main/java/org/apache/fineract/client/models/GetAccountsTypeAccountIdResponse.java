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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.GetAccountsCharges;
import org.apache.fineract.client.models.GetAccountsCurrency;
import org.apache.fineract.client.models.GetAccountsLockPeriodTypeEnum;
import org.apache.fineract.client.models.GetAccountsPurchasedShares;
import org.apache.fineract.client.models.GetAccountsStatus;
import org.apache.fineract.client.models.GetAccountsSummary;
import org.apache.fineract.client.models.GetAccountsTimeline;

/**
 * GetAccountsTypeAccountIdResponse
 */
@ApiModel(description = "GetAccountsTypeAccountIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountsTypeAccountIdResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS = "allowDividendCalculationForInactiveClients";
  @SerializedName(SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS)
  private Boolean allowDividendCalculationForInactiveClients;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private Set<GetAccountsCharges> charges = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetAccountsCurrency currency;

  public static final String SERIALIZED_NAME_CURRENT_MARKET_PRICE = "currentMarketPrice";
  @SerializedName(SERIALIZED_NAME_CURRENT_MARKET_PRICE)
  private Integer currentMarketPrice;

  public static final String SERIALIZED_NAME_DIVIDENDS = "dividends";
  @SerializedName(SERIALIZED_NAME_DIVIDENDS)
  private List<String> dividends = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOCK_PERIOD_TYPE_ENUM = "lockPeriodTypeEnum";
  @SerializedName(SERIALIZED_NAME_LOCK_PERIOD_TYPE_ENUM)
  private GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD = "lockinPeriod";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD)
  private Integer lockinPeriod;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD = "minimumActivePeriod";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD)
  private Integer minimumActivePeriod;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_TYPE_ENUM = "minimumActivePeriodTypeEnum";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_TYPE_ENUM)
  private GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PURCHASED_SHARES = "purchasedShares";
  @SerializedName(SERIALIZED_NAME_PURCHASED_SHARES)
  private Set<GetAccountsPurchasedShares> purchasedShares = null;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNT_ID = "savingsAccountId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNT_ID)
  private Integer savingsAccountId;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNT_NUMBER = "savingsAccountNumber";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNT_NUMBER)
  private Long savingsAccountNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetAccountsStatus status;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetAccountsSummary summary;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetAccountsTimeline timeline;

  public GetAccountsTypeAccountIdResponse() { 
  }

  public GetAccountsTypeAccountIdResponse accountNo(Long accountNo) {
    
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


  public GetAccountsTypeAccountIdResponse allowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
    return this;
  }

   /**
   * Get allowDividendCalculationForInactiveClients
   * @return allowDividendCalculationForInactiveClients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getAllowDividendCalculationForInactiveClients() {
    return allowDividendCalculationForInactiveClients;
  }


  public void setAllowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
  }


  public GetAccountsTypeAccountIdResponse charges(Set<GetAccountsCharges> charges) {
    
    this.charges = charges;
    return this;
  }

  public GetAccountsTypeAccountIdResponse addChargesItem(GetAccountsCharges chargesItem) {
    if (this.charges == null) {
      this.charges = new LinkedHashSet<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetAccountsCharges> getCharges() {
    return charges;
  }


  public void setCharges(Set<GetAccountsCharges> charges) {
    this.charges = charges;
  }


  public GetAccountsTypeAccountIdResponse clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public GetAccountsTypeAccountIdResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client_FirstName_2KX8C Client_LastName_NWNG", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetAccountsTypeAccountIdResponse currency(GetAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetAccountsTypeAccountIdResponse currentMarketPrice(Integer currentMarketPrice) {
    
    this.currentMarketPrice = currentMarketPrice;
    return this;
  }

   /**
   * Get currentMarketPrice
   * @return currentMarketPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getCurrentMarketPrice() {
    return currentMarketPrice;
  }


  public void setCurrentMarketPrice(Integer currentMarketPrice) {
    this.currentMarketPrice = currentMarketPrice;
  }


  public GetAccountsTypeAccountIdResponse dividends(List<String> dividends) {
    
    this.dividends = dividends;
    return this;
  }

  public GetAccountsTypeAccountIdResponse addDividendsItem(String dividendsItem) {
    if (this.dividends == null) {
      this.dividends = new ArrayList<>();
    }
    this.dividends.add(dividendsItem);
    return this;
  }

   /**
   * Get dividends
   * @return dividends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDividends() {
    return dividends;
  }


  public void setDividends(List<String> dividends) {
    this.dividends = dividends;
  }


  public GetAccountsTypeAccountIdResponse id(Integer id) {
    
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


  public GetAccountsTypeAccountIdResponse lockPeriodTypeEnum(GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum) {
    
    this.lockPeriodTypeEnum = lockPeriodTypeEnum;
    return this;
  }

   /**
   * Get lockPeriodTypeEnum
   * @return lockPeriodTypeEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsLockPeriodTypeEnum getLockPeriodTypeEnum() {
    return lockPeriodTypeEnum;
  }


  public void setLockPeriodTypeEnum(GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum) {
    this.lockPeriodTypeEnum = lockPeriodTypeEnum;
  }


  public GetAccountsTypeAccountIdResponse lockinPeriod(Integer lockinPeriod) {
    
    this.lockinPeriod = lockinPeriod;
    return this;
  }

   /**
   * Get lockinPeriod
   * @return lockinPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLockinPeriod() {
    return lockinPeriod;
  }


  public void setLockinPeriod(Integer lockinPeriod) {
    this.lockinPeriod = lockinPeriod;
  }


  public GetAccountsTypeAccountIdResponse minimumActivePeriod(Integer minimumActivePeriod) {
    
    this.minimumActivePeriod = minimumActivePeriod;
    return this;
  }

   /**
   * Get minimumActivePeriod
   * @return minimumActivePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getMinimumActivePeriod() {
    return minimumActivePeriod;
  }


  public void setMinimumActivePeriod(Integer minimumActivePeriod) {
    this.minimumActivePeriod = minimumActivePeriod;
  }


  public GetAccountsTypeAccountIdResponse minimumActivePeriodTypeEnum(GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum) {
    
    this.minimumActivePeriodTypeEnum = minimumActivePeriodTypeEnum;
    return this;
  }

   /**
   * Get minimumActivePeriodTypeEnum
   * @return minimumActivePeriodTypeEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsLockPeriodTypeEnum getMinimumActivePeriodTypeEnum() {
    return minimumActivePeriodTypeEnum;
  }


  public void setMinimumActivePeriodTypeEnum(GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum) {
    this.minimumActivePeriodTypeEnum = minimumActivePeriodTypeEnum;
  }


  public GetAccountsTypeAccountIdResponse productId(Integer productId) {
    
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


  public GetAccountsTypeAccountIdResponse productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Share Product", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetAccountsTypeAccountIdResponse purchasedShares(Set<GetAccountsPurchasedShares> purchasedShares) {
    
    this.purchasedShares = purchasedShares;
    return this;
  }

  public GetAccountsTypeAccountIdResponse addPurchasedSharesItem(GetAccountsPurchasedShares purchasedSharesItem) {
    if (this.purchasedShares == null) {
      this.purchasedShares = new LinkedHashSet<>();
    }
    this.purchasedShares.add(purchasedSharesItem);
    return this;
  }

   /**
   * Get purchasedShares
   * @return purchasedShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetAccountsPurchasedShares> getPurchasedShares() {
    return purchasedShares;
  }


  public void setPurchasedShares(Set<GetAccountsPurchasedShares> purchasedShares) {
    this.purchasedShares = purchasedShares;
  }


  public GetAccountsTypeAccountIdResponse savingsAccountId(Integer savingsAccountId) {
    
    this.savingsAccountId = savingsAccountId;
    return this;
  }

   /**
   * Get savingsAccountId
   * @return savingsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13", value = "")

  public Integer getSavingsAccountId() {
    return savingsAccountId;
  }


  public void setSavingsAccountId(Integer savingsAccountId) {
    this.savingsAccountId = savingsAccountId;
  }


  public GetAccountsTypeAccountIdResponse savingsAccountNumber(Long savingsAccountNumber) {
    
    this.savingsAccountNumber = savingsAccountNumber;
    return this;
  }

   /**
   * Get savingsAccountNumber
   * @return savingsAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13", value = "")

  public Long getSavingsAccountNumber() {
    return savingsAccountNumber;
  }


  public void setSavingsAccountNumber(Long savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
  }


  public GetAccountsTypeAccountIdResponse status(GetAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetAccountsStatus status) {
    this.status = status;
  }


  public GetAccountsTypeAccountIdResponse summary(GetAccountsSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsSummary getSummary() {
    return summary;
  }


  public void setSummary(GetAccountsSummary summary) {
    this.summary = summary;
  }


  public GetAccountsTypeAccountIdResponse timeline(GetAccountsTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetAccountsTimeline timeline) {
    this.timeline = timeline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsTypeAccountIdResponse getAccountsTypeAccountIdResponse = (GetAccountsTypeAccountIdResponse) o;
    return Objects.equals(this.accountNo, getAccountsTypeAccountIdResponse.accountNo) &&
        Objects.equals(this.allowDividendCalculationForInactiveClients, getAccountsTypeAccountIdResponse.allowDividendCalculationForInactiveClients) &&
        Objects.equals(this.charges, getAccountsTypeAccountIdResponse.charges) &&
        Objects.equals(this.clientId, getAccountsTypeAccountIdResponse.clientId) &&
        Objects.equals(this.clientName, getAccountsTypeAccountIdResponse.clientName) &&
        Objects.equals(this.currency, getAccountsTypeAccountIdResponse.currency) &&
        Objects.equals(this.currentMarketPrice, getAccountsTypeAccountIdResponse.currentMarketPrice) &&
        Objects.equals(this.dividends, getAccountsTypeAccountIdResponse.dividends) &&
        Objects.equals(this.id, getAccountsTypeAccountIdResponse.id) &&
        Objects.equals(this.lockPeriodTypeEnum, getAccountsTypeAccountIdResponse.lockPeriodTypeEnum) &&
        Objects.equals(this.lockinPeriod, getAccountsTypeAccountIdResponse.lockinPeriod) &&
        Objects.equals(this.minimumActivePeriod, getAccountsTypeAccountIdResponse.minimumActivePeriod) &&
        Objects.equals(this.minimumActivePeriodTypeEnum, getAccountsTypeAccountIdResponse.minimumActivePeriodTypeEnum) &&
        Objects.equals(this.productId, getAccountsTypeAccountIdResponse.productId) &&
        Objects.equals(this.productName, getAccountsTypeAccountIdResponse.productName) &&
        Objects.equals(this.purchasedShares, getAccountsTypeAccountIdResponse.purchasedShares) &&
        Objects.equals(this.savingsAccountId, getAccountsTypeAccountIdResponse.savingsAccountId) &&
        Objects.equals(this.savingsAccountNumber, getAccountsTypeAccountIdResponse.savingsAccountNumber) &&
        Objects.equals(this.status, getAccountsTypeAccountIdResponse.status) &&
        Objects.equals(this.summary, getAccountsTypeAccountIdResponse.summary) &&
        Objects.equals(this.timeline, getAccountsTypeAccountIdResponse.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, allowDividendCalculationForInactiveClients, charges, clientId, clientName, currency, currentMarketPrice, dividends, id, lockPeriodTypeEnum, lockinPeriod, minimumActivePeriod, minimumActivePeriodTypeEnum, productId, productName, purchasedShares, savingsAccountId, savingsAccountNumber, status, summary, timeline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsTypeAccountIdResponse {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    allowDividendCalculationForInactiveClients: ").append(toIndentedString(allowDividendCalculationForInactiveClients)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentMarketPrice: ").append(toIndentedString(currentMarketPrice)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockPeriodTypeEnum: ").append(toIndentedString(lockPeriodTypeEnum)).append("\n");
    sb.append("    lockinPeriod: ").append(toIndentedString(lockinPeriod)).append("\n");
    sb.append("    minimumActivePeriod: ").append(toIndentedString(minimumActivePeriod)).append("\n");
    sb.append("    minimumActivePeriodTypeEnum: ").append(toIndentedString(minimumActivePeriodTypeEnum)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    purchasedShares: ").append(toIndentedString(purchasedShares)).append("\n");
    sb.append("    savingsAccountId: ").append(toIndentedString(savingsAccountId)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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
