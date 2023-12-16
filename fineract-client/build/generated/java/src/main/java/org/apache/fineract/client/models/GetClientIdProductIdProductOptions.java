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
import org.apache.fineract.client.models.GetClientIdProductIdAccountingMappings;
import org.apache.fineract.client.models.GetClientIdProductIdLockinPeriodFrequencyTypeOptions;
import org.apache.fineract.client.models.GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions;
import org.apache.fineract.client.models.GetShareAccountsChargeOptions;
import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdAccountingRule;
import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdLockPeriodTypeEnum;
import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum;
import org.apache.fineract.client.models.GetShareAccountsCurrency;

/**
 * GetClientIdProductIdProductOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientIdProductIdProductOptions {
  public static final String SERIALIZED_NAME_ACCOUNTING_MAPPING_OPTIONS = "accountingMappingOptions";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_MAPPING_OPTIONS)
  private Object accountingMappingOptions;

  public static final String SERIALIZED_NAME_ACCOUNTING_MAPPINGS = "accountingMappings";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_MAPPINGS)
  private GetClientIdProductIdAccountingMappings accountingMappings;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE = "accountingRule";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE)
  private GetShareAccountsClientIdProductIdAccountingRule accountingRule;

  public static final String SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS = "allowDividendCalculationForInactiveClients";
  @SerializedName(SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS)
  private Boolean allowDividendCalculationForInactiveClients;

  public static final String SERIALIZED_NAME_CHARGE_OPTIONS = "chargeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_OPTIONS)
  private GetShareAccountsChargeOptions chargeOptions;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private String charges;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetShareAccountsCurrency currency;

  public static final String SERIALIZED_NAME_CURRENCY_OPTIONS = "currencyOptions";
  @SerializedName(SERIALIZED_NAME_CURRENCY_OPTIONS)
  private GetShareAccountsCurrency currencyOptions;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD = "lockinPeriod";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD)
  private Integer lockinPeriod;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_ENUM = "lockinPeriodEnum";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_ENUM)
  private GetShareAccountsClientIdProductIdLockPeriodTypeEnum lockinPeriodEnum;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE_OPTIONS = "lockinPeriodFrequencyTypeOptions";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE_OPTIONS)
  private GetClientIdProductIdLockinPeriodFrequencyTypeOptions lockinPeriodFrequencyTypeOptions;

  public static final String SERIALIZED_NAME_MARKET_PRICE = "marketPrice";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE)
  private String marketPrice;

  public static final String SERIALIZED_NAME_MAXIMUM_SHARES = "maximumShares";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_SHARES)
  private Integer maximumShares;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD = "minimumActivePeriod";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD)
  private Integer minimumActivePeriod;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FOR_DIVIDENDS_TYPE_ENUM = "minimumActivePeriodForDividendsTypeEnum";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FOR_DIVIDENDS_TYPE_ENUM)
  private GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum minimumActivePeriodForDividendsTypeEnum;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FREQUENCY_TYPE_OPTIONS = "minimumActivePeriodFrequencyTypeOptions";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FREQUENCY_TYPE_OPTIONS)
  private GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions minimumActivePeriodFrequencyTypeOptions;

  public static final String SERIALIZED_NAME_MINIMUM_SHARES = "minimumShares";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SHARES)
  private Integer minimumShares;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NORMINAL_SHARES = "norminalShares";
  @SerializedName(SERIALIZED_NAME_NORMINAL_SHARES)
  private Integer norminalShares;

  public static final String SERIALIZED_NAME_SHARE_CAPITAL = "shareCapital";
  @SerializedName(SERIALIZED_NAME_SHARE_CAPITAL)
  private Integer shareCapital;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_TOTAL_SHARES = "totalShares";
  @SerializedName(SERIALIZED_NAME_TOTAL_SHARES)
  private Integer totalShares;

  public static final String SERIALIZED_NAME_TOTAL_SHARES_ISSUED = "totalSharesIssued";
  @SerializedName(SERIALIZED_NAME_TOTAL_SHARES_ISSUED)
  private Integer totalSharesIssued;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Integer unitPrice;

  public GetClientIdProductIdProductOptions() { 
  }

  public GetClientIdProductIdProductOptions accountingMappingOptions(Object accountingMappingOptions) {
    
    this.accountingMappingOptions = accountingMappingOptions;
    return this;
  }

   /**
   * Get accountingMappingOptions
   * @return accountingMappingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAccountingMappingOptions() {
    return accountingMappingOptions;
  }


  public void setAccountingMappingOptions(Object accountingMappingOptions) {
    this.accountingMappingOptions = accountingMappingOptions;
  }


  public GetClientIdProductIdProductOptions accountingMappings(GetClientIdProductIdAccountingMappings accountingMappings) {
    
    this.accountingMappings = accountingMappings;
    return this;
  }

   /**
   * Get accountingMappings
   * @return accountingMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientIdProductIdAccountingMappings getAccountingMappings() {
    return accountingMappings;
  }


  public void setAccountingMappings(GetClientIdProductIdAccountingMappings accountingMappings) {
    this.accountingMappings = accountingMappings;
  }


  public GetClientIdProductIdProductOptions accountingRule(GetShareAccountsClientIdProductIdAccountingRule accountingRule) {
    
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsClientIdProductIdAccountingRule getAccountingRule() {
    return accountingRule;
  }


  public void setAccountingRule(GetShareAccountsClientIdProductIdAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
  }


  public GetClientIdProductIdProductOptions allowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
    return this;
  }

   /**
   * Get allowDividendCalculationForInactiveClients
   * @return allowDividendCalculationForInactiveClients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getAllowDividendCalculationForInactiveClients() {
    return allowDividendCalculationForInactiveClients;
  }


  public void setAllowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
  }


  public GetClientIdProductIdProductOptions chargeOptions(GetShareAccountsChargeOptions chargeOptions) {
    
    this.chargeOptions = chargeOptions;
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsChargeOptions getChargeOptions() {
    return chargeOptions;
  }


  public void setChargeOptions(GetShareAccountsChargeOptions chargeOptions) {
    this.chargeOptions = chargeOptions;
  }


  public GetClientIdProductIdProductOptions charges(String charges) {
    
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public String getCharges() {
    return charges;
  }


  public void setCharges(String charges) {
    this.charges = charges;
  }


  public GetClientIdProductIdProductOptions currency(GetShareAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetShareAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetClientIdProductIdProductOptions currencyOptions(GetShareAccountsCurrency currencyOptions) {
    
    this.currencyOptions = currencyOptions;
    return this;
  }

   /**
   * Get currencyOptions
   * @return currencyOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsCurrency getCurrencyOptions() {
    return currencyOptions;
  }


  public void setCurrencyOptions(GetShareAccountsCurrency currencyOptions) {
    this.currencyOptions = currencyOptions;
  }


  public GetClientIdProductIdProductOptions description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP1", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetClientIdProductIdProductOptions id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetClientIdProductIdProductOptions lockinPeriod(Integer lockinPeriod) {
    
    this.lockinPeriod = lockinPeriod;
    return this;
  }

   /**
   * Get lockinPeriod
   * @return lockinPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")

  public Integer getLockinPeriod() {
    return lockinPeriod;
  }


  public void setLockinPeriod(Integer lockinPeriod) {
    this.lockinPeriod = lockinPeriod;
  }


  public GetClientIdProductIdProductOptions lockinPeriodEnum(GetShareAccountsClientIdProductIdLockPeriodTypeEnum lockinPeriodEnum) {
    
    this.lockinPeriodEnum = lockinPeriodEnum;
    return this;
  }

   /**
   * Get lockinPeriodEnum
   * @return lockinPeriodEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsClientIdProductIdLockPeriodTypeEnum getLockinPeriodEnum() {
    return lockinPeriodEnum;
  }


  public void setLockinPeriodEnum(GetShareAccountsClientIdProductIdLockPeriodTypeEnum lockinPeriodEnum) {
    this.lockinPeriodEnum = lockinPeriodEnum;
  }


  public GetClientIdProductIdProductOptions lockinPeriodFrequencyTypeOptions(GetClientIdProductIdLockinPeriodFrequencyTypeOptions lockinPeriodFrequencyTypeOptions) {
    
    this.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions;
    return this;
  }

   /**
   * Get lockinPeriodFrequencyTypeOptions
   * @return lockinPeriodFrequencyTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientIdProductIdLockinPeriodFrequencyTypeOptions getLockinPeriodFrequencyTypeOptions() {
    return lockinPeriodFrequencyTypeOptions;
  }


  public void setLockinPeriodFrequencyTypeOptions(GetClientIdProductIdLockinPeriodFrequencyTypeOptions lockinPeriodFrequencyTypeOptions) {
    this.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions;
  }


  public GetClientIdProductIdProductOptions marketPrice(String marketPrice) {
    
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * Get marketPrice
   * @return marketPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public String getMarketPrice() {
    return marketPrice;
  }


  public void setMarketPrice(String marketPrice) {
    this.marketPrice = marketPrice;
  }


  public GetClientIdProductIdProductOptions maximumShares(Integer maximumShares) {
    
    this.maximumShares = maximumShares;
    return this;
  }

   /**
   * Get maximumShares
   * @return maximumShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "")

  public Integer getMaximumShares() {
    return maximumShares;
  }


  public void setMaximumShares(Integer maximumShares) {
    this.maximumShares = maximumShares;
  }


  public GetClientIdProductIdProductOptions minimumActivePeriod(Integer minimumActivePeriod) {
    
    this.minimumActivePeriod = minimumActivePeriod;
    return this;
  }

   /**
   * Get minimumActivePeriod
   * @return minimumActivePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getMinimumActivePeriod() {
    return minimumActivePeriod;
  }


  public void setMinimumActivePeriod(Integer minimumActivePeriod) {
    this.minimumActivePeriod = minimumActivePeriod;
  }


  public GetClientIdProductIdProductOptions minimumActivePeriodForDividendsTypeEnum(GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum minimumActivePeriodForDividendsTypeEnum) {
    
    this.minimumActivePeriodForDividendsTypeEnum = minimumActivePeriodForDividendsTypeEnum;
    return this;
  }

   /**
   * Get minimumActivePeriodForDividendsTypeEnum
   * @return minimumActivePeriodForDividendsTypeEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum getMinimumActivePeriodForDividendsTypeEnum() {
    return minimumActivePeriodForDividendsTypeEnum;
  }


  public void setMinimumActivePeriodForDividendsTypeEnum(GetShareAccountsClientIdProductIdMinimumActivePeriodForDividendsTypeEnum minimumActivePeriodForDividendsTypeEnum) {
    this.minimumActivePeriodForDividendsTypeEnum = minimumActivePeriodForDividendsTypeEnum;
  }


  public GetClientIdProductIdProductOptions minimumActivePeriodFrequencyTypeOptions(GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions minimumActivePeriodFrequencyTypeOptions) {
    
    this.minimumActivePeriodFrequencyTypeOptions = minimumActivePeriodFrequencyTypeOptions;
    return this;
  }

   /**
   * Get minimumActivePeriodFrequencyTypeOptions
   * @return minimumActivePeriodFrequencyTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions getMinimumActivePeriodFrequencyTypeOptions() {
    return minimumActivePeriodFrequencyTypeOptions;
  }


  public void setMinimumActivePeriodFrequencyTypeOptions(GetClientIdProductIdMinimumActivePeriodFrequencyTypeOptions minimumActivePeriodFrequencyTypeOptions) {
    this.minimumActivePeriodFrequencyTypeOptions = minimumActivePeriodFrequencyTypeOptions;
  }


  public GetClientIdProductIdProductOptions minimumShares(Integer minimumShares) {
    
    this.minimumShares = minimumShares;
    return this;
  }

   /**
   * Get minimumShares
   * @return minimumShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Integer getMinimumShares() {
    return minimumShares;
  }


  public void setMinimumShares(Integer minimumShares) {
    this.minimumShares = minimumShares;
  }


  public GetClientIdProductIdProductOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetClientIdProductIdProductOptions norminalShares(Integer norminalShares) {
    
    this.norminalShares = norminalShares;
    return this;
  }

   /**
   * Get norminalShares
   * @return norminalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "")

  public Integer getNorminalShares() {
    return norminalShares;
  }


  public void setNorminalShares(Integer norminalShares) {
    this.norminalShares = norminalShares;
  }


  public GetClientIdProductIdProductOptions shareCapital(Integer shareCapital) {
    
    this.shareCapital = shareCapital;
    return this;
  }

   /**
   * Get shareCapital
   * @return shareCapital
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "")

  public Integer getShareCapital() {
    return shareCapital;
  }


  public void setShareCapital(Integer shareCapital) {
    this.shareCapital = shareCapital;
  }


  public GetClientIdProductIdProductOptions shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public GetClientIdProductIdProductOptions totalShares(Integer totalShares) {
    
    this.totalShares = totalShares;
    return this;
  }

   /**
   * Get totalShares
   * @return totalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public Integer getTotalShares() {
    return totalShares;
  }


  public void setTotalShares(Integer totalShares) {
    this.totalShares = totalShares;
  }


  public GetClientIdProductIdProductOptions totalSharesIssued(Integer totalSharesIssued) {
    
    this.totalSharesIssued = totalSharesIssued;
    return this;
  }

   /**
   * Get totalSharesIssued
   * @return totalSharesIssued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "")

  public Integer getTotalSharesIssued() {
    return totalSharesIssued;
  }


  public void setTotalSharesIssued(Integer totalSharesIssued) {
    this.totalSharesIssued = totalSharesIssued;
  }


  public GetClientIdProductIdProductOptions unitPrice(Integer unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientIdProductIdProductOptions getClientIdProductIdProductOptions = (GetClientIdProductIdProductOptions) o;
    return Objects.equals(this.accountingMappingOptions, getClientIdProductIdProductOptions.accountingMappingOptions) &&
        Objects.equals(this.accountingMappings, getClientIdProductIdProductOptions.accountingMappings) &&
        Objects.equals(this.accountingRule, getClientIdProductIdProductOptions.accountingRule) &&
        Objects.equals(this.allowDividendCalculationForInactiveClients, getClientIdProductIdProductOptions.allowDividendCalculationForInactiveClients) &&
        Objects.equals(this.chargeOptions, getClientIdProductIdProductOptions.chargeOptions) &&
        Objects.equals(this.charges, getClientIdProductIdProductOptions.charges) &&
        Objects.equals(this.currency, getClientIdProductIdProductOptions.currency) &&
        Objects.equals(this.currencyOptions, getClientIdProductIdProductOptions.currencyOptions) &&
        Objects.equals(this.description, getClientIdProductIdProductOptions.description) &&
        Objects.equals(this.id, getClientIdProductIdProductOptions.id) &&
        Objects.equals(this.lockinPeriod, getClientIdProductIdProductOptions.lockinPeriod) &&
        Objects.equals(this.lockinPeriodEnum, getClientIdProductIdProductOptions.lockinPeriodEnum) &&
        Objects.equals(this.lockinPeriodFrequencyTypeOptions, getClientIdProductIdProductOptions.lockinPeriodFrequencyTypeOptions) &&
        Objects.equals(this.marketPrice, getClientIdProductIdProductOptions.marketPrice) &&
        Objects.equals(this.maximumShares, getClientIdProductIdProductOptions.maximumShares) &&
        Objects.equals(this.minimumActivePeriod, getClientIdProductIdProductOptions.minimumActivePeriod) &&
        Objects.equals(this.minimumActivePeriodForDividendsTypeEnum, getClientIdProductIdProductOptions.minimumActivePeriodForDividendsTypeEnum) &&
        Objects.equals(this.minimumActivePeriodFrequencyTypeOptions, getClientIdProductIdProductOptions.minimumActivePeriodFrequencyTypeOptions) &&
        Objects.equals(this.minimumShares, getClientIdProductIdProductOptions.minimumShares) &&
        Objects.equals(this.name, getClientIdProductIdProductOptions.name) &&
        Objects.equals(this.norminalShares, getClientIdProductIdProductOptions.norminalShares) &&
        Objects.equals(this.shareCapital, getClientIdProductIdProductOptions.shareCapital) &&
        Objects.equals(this.shortName, getClientIdProductIdProductOptions.shortName) &&
        Objects.equals(this.totalShares, getClientIdProductIdProductOptions.totalShares) &&
        Objects.equals(this.totalSharesIssued, getClientIdProductIdProductOptions.totalSharesIssued) &&
        Objects.equals(this.unitPrice, getClientIdProductIdProductOptions.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingMappingOptions, accountingMappings, accountingRule, allowDividendCalculationForInactiveClients, chargeOptions, charges, currency, currencyOptions, description, id, lockinPeriod, lockinPeriodEnum, lockinPeriodFrequencyTypeOptions, marketPrice, maximumShares, minimumActivePeriod, minimumActivePeriodForDividendsTypeEnum, minimumActivePeriodFrequencyTypeOptions, minimumShares, name, norminalShares, shareCapital, shortName, totalShares, totalSharesIssued, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientIdProductIdProductOptions {\n");
    sb.append("    accountingMappingOptions: ").append(toIndentedString(accountingMappingOptions)).append("\n");
    sb.append("    accountingMappings: ").append(toIndentedString(accountingMappings)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
    sb.append("    allowDividendCalculationForInactiveClients: ").append(toIndentedString(allowDividendCalculationForInactiveClients)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyOptions: ").append(toIndentedString(currencyOptions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockinPeriod: ").append(toIndentedString(lockinPeriod)).append("\n");
    sb.append("    lockinPeriodEnum: ").append(toIndentedString(lockinPeriodEnum)).append("\n");
    sb.append("    lockinPeriodFrequencyTypeOptions: ").append(toIndentedString(lockinPeriodFrequencyTypeOptions)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    maximumShares: ").append(toIndentedString(maximumShares)).append("\n");
    sb.append("    minimumActivePeriod: ").append(toIndentedString(minimumActivePeriod)).append("\n");
    sb.append("    minimumActivePeriodForDividendsTypeEnum: ").append(toIndentedString(minimumActivePeriodForDividendsTypeEnum)).append("\n");
    sb.append("    minimumActivePeriodFrequencyTypeOptions: ").append(toIndentedString(minimumActivePeriodFrequencyTypeOptions)).append("\n");
    sb.append("    minimumShares: ").append(toIndentedString(minimumShares)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    norminalShares: ").append(toIndentedString(norminalShares)).append("\n");
    sb.append("    shareCapital: ").append(toIndentedString(shareCapital)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    totalShares: ").append(toIndentedString(totalShares)).append("\n");
    sb.append("    totalSharesIssued: ").append(toIndentedString(totalSharesIssued)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
