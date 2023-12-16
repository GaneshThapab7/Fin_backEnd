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
import java.math.BigDecimal;
import org.apache.fineract.client.models.CurrencyData;
import org.apache.fineract.client.models.EnumOptionData;

/**
 * SavingsProductData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SavingsProductData {
  public static final String SERIALIZED_NAME_ACCRUAL_BASED_ACCOUNTING_ENABLED = "accrualBasedAccountingEnabled";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_BASED_ACCOUNTING_ENABLED)
  private Boolean accrualBasedAccountingEnabled;

  public static final String SERIALIZED_NAME_ALLOW_OVERDRAFT = "allowOverdraft";
  @SerializedName(SERIALIZED_NAME_ALLOW_OVERDRAFT)
  private Boolean allowOverdraft;

  public static final String SERIALIZED_NAME_CASH_BASED_ACCOUNTING_ENABLED = "cashBasedAccountingEnabled";
  @SerializedName(SERIALIZED_NAME_CASH_BASED_ACCOUNTING_ENABLED)
  private Boolean cashBasedAccountingEnabled;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyData currency;

  public static final String SERIALIZED_NAME_DEPOSIT_ACCOUNT_TYPE = "depositAccountType";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_ACCOUNT_TYPE)
  private String depositAccountType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private EnumOptionData interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private EnumOptionData interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private EnumOptionData interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private EnumOptionData interestPostingPeriodType;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY = "lockinPeriodFrequency";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY)
  private Integer lockinPeriodFrequency;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE = "lockinPeriodFrequencyType";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE)
  private EnumOptionData lockinPeriodFrequencyType;

  public static final String SERIALIZED_NAME_MAX_ALLOWED_LIEN_LIMIT = "maxAllowedLienLimit";
  @SerializedName(SERIALIZED_NAME_MAX_ALLOWED_LIEN_LIMIT)
  private BigDecimal maxAllowedLienLimit;

  public static final String SERIALIZED_NAME_MIN_REQUIRED_BALANCE = "minRequiredBalance";
  @SerializedName(SERIALIZED_NAME_MIN_REQUIRED_BALANCE)
  private BigDecimal minRequiredBalance;

  public static final String SERIALIZED_NAME_MIN_REQUIRED_OPENING_BALANCE = "minRequiredOpeningBalance";
  @SerializedName(SERIALIZED_NAME_MIN_REQUIRED_OPENING_BALANCE)
  private BigDecimal minRequiredOpeningBalance;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE = "nominalAnnualInterestRate";
  @SerializedName(SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE)
  private BigDecimal nominalAnnualInterestRate;

  public static final String SERIALIZED_NAME_OVERDRAFT_LIMIT = "overdraftLimit";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_LIMIT)
  private BigDecimal overdraftLimit;

  public static final String SERIALIZED_NAME_PERIODIC_ACCRUAL_ACCOUNTING = "periodicAccrualAccounting";
  @SerializedName(SERIALIZED_NAME_PERIODIC_ACCRUAL_ACCOUNTING)
  private Boolean periodicAccrualAccounting;

  public static final String SERIALIZED_NAME_UPFRONT_ACCRUAL_ACCOUNTING = "upfrontAccrualAccounting";
  @SerializedName(SERIALIZED_NAME_UPFRONT_ACCRUAL_ACCOUNTING)
  private Boolean upfrontAccrualAccounting;

  public static final String SERIALIZED_NAME_WITHDRAWAL_FEE_FOR_TRANSFERS = "withdrawalFeeForTransfers";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_FEE_FOR_TRANSFERS)
  private Boolean withdrawalFeeForTransfers;

  public SavingsProductData() { 
  }

  public SavingsProductData accrualBasedAccountingEnabled(Boolean accrualBasedAccountingEnabled) {
    
    this.accrualBasedAccountingEnabled = accrualBasedAccountingEnabled;
    return this;
  }

   /**
   * Get accrualBasedAccountingEnabled
   * @return accrualBasedAccountingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAccrualBasedAccountingEnabled() {
    return accrualBasedAccountingEnabled;
  }


  public void setAccrualBasedAccountingEnabled(Boolean accrualBasedAccountingEnabled) {
    this.accrualBasedAccountingEnabled = accrualBasedAccountingEnabled;
  }


  public SavingsProductData allowOverdraft(Boolean allowOverdraft) {
    
    this.allowOverdraft = allowOverdraft;
    return this;
  }

   /**
   * Get allowOverdraft
   * @return allowOverdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowOverdraft() {
    return allowOverdraft;
  }


  public void setAllowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
  }


  public SavingsProductData cashBasedAccountingEnabled(Boolean cashBasedAccountingEnabled) {
    
    this.cashBasedAccountingEnabled = cashBasedAccountingEnabled;
    return this;
  }

   /**
   * Get cashBasedAccountingEnabled
   * @return cashBasedAccountingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCashBasedAccountingEnabled() {
    return cashBasedAccountingEnabled;
  }


  public void setCashBasedAccountingEnabled(Boolean cashBasedAccountingEnabled) {
    this.cashBasedAccountingEnabled = cashBasedAccountingEnabled;
  }


  public SavingsProductData currency(CurrencyData currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CurrencyData getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyData currency) {
    this.currency = currency;
  }


  public SavingsProductData depositAccountType(String depositAccountType) {
    
    this.depositAccountType = depositAccountType;
    return this;
  }

   /**
   * Get depositAccountType
   * @return depositAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDepositAccountType() {
    return depositAccountType;
  }


  public void setDepositAccountType(String depositAccountType) {
    this.depositAccountType = depositAccountType;
  }


  public SavingsProductData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public SavingsProductData interestCalculationDaysInYearType(EnumOptionData interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(EnumOptionData interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public SavingsProductData interestCalculationType(EnumOptionData interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(EnumOptionData interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public SavingsProductData interestCompoundingPeriodType(EnumOptionData interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(EnumOptionData interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public SavingsProductData interestPostingPeriodType(EnumOptionData interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(EnumOptionData interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public SavingsProductData lockinPeriodFrequency(Integer lockinPeriodFrequency) {
    
    this.lockinPeriodFrequency = lockinPeriodFrequency;
    return this;
  }

   /**
   * Get lockinPeriodFrequency
   * @return lockinPeriodFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLockinPeriodFrequency() {
    return lockinPeriodFrequency;
  }


  public void setLockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
  }


  public SavingsProductData lockinPeriodFrequencyType(EnumOptionData lockinPeriodFrequencyType) {
    
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
    return this;
  }

   /**
   * Get lockinPeriodFrequencyType
   * @return lockinPeriodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getLockinPeriodFrequencyType() {
    return lockinPeriodFrequencyType;
  }


  public void setLockinPeriodFrequencyType(EnumOptionData lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
  }


  public SavingsProductData maxAllowedLienLimit(BigDecimal maxAllowedLienLimit) {
    
    this.maxAllowedLienLimit = maxAllowedLienLimit;
    return this;
  }

   /**
   * Get maxAllowedLienLimit
   * @return maxAllowedLienLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxAllowedLienLimit() {
    return maxAllowedLienLimit;
  }


  public void setMaxAllowedLienLimit(BigDecimal maxAllowedLienLimit) {
    this.maxAllowedLienLimit = maxAllowedLienLimit;
  }


  public SavingsProductData minRequiredBalance(BigDecimal minRequiredBalance) {
    
    this.minRequiredBalance = minRequiredBalance;
    return this;
  }

   /**
   * Get minRequiredBalance
   * @return minRequiredBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMinRequiredBalance() {
    return minRequiredBalance;
  }


  public void setMinRequiredBalance(BigDecimal minRequiredBalance) {
    this.minRequiredBalance = minRequiredBalance;
  }


  public SavingsProductData minRequiredOpeningBalance(BigDecimal minRequiredOpeningBalance) {
    
    this.minRequiredOpeningBalance = minRequiredOpeningBalance;
    return this;
  }

   /**
   * Get minRequiredOpeningBalance
   * @return minRequiredOpeningBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMinRequiredOpeningBalance() {
    return minRequiredOpeningBalance;
  }


  public void setMinRequiredOpeningBalance(BigDecimal minRequiredOpeningBalance) {
    this.minRequiredOpeningBalance = minRequiredOpeningBalance;
  }


  public SavingsProductData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SavingsProductData nominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }


  public void setNominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }


  public SavingsProductData overdraftLimit(BigDecimal overdraftLimit) {
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * @return overdraftLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOverdraftLimit() {
    return overdraftLimit;
  }


  public void setOverdraftLimit(BigDecimal overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }


  public SavingsProductData periodicAccrualAccounting(Boolean periodicAccrualAccounting) {
    
    this.periodicAccrualAccounting = periodicAccrualAccounting;
    return this;
  }

   /**
   * Get periodicAccrualAccounting
   * @return periodicAccrualAccounting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPeriodicAccrualAccounting() {
    return periodicAccrualAccounting;
  }


  public void setPeriodicAccrualAccounting(Boolean periodicAccrualAccounting) {
    this.periodicAccrualAccounting = periodicAccrualAccounting;
  }


  public SavingsProductData upfrontAccrualAccounting(Boolean upfrontAccrualAccounting) {
    
    this.upfrontAccrualAccounting = upfrontAccrualAccounting;
    return this;
  }

   /**
   * Get upfrontAccrualAccounting
   * @return upfrontAccrualAccounting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpfrontAccrualAccounting() {
    return upfrontAccrualAccounting;
  }


  public void setUpfrontAccrualAccounting(Boolean upfrontAccrualAccounting) {
    this.upfrontAccrualAccounting = upfrontAccrualAccounting;
  }


  public SavingsProductData withdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
    return this;
  }

   /**
   * Get withdrawalFeeForTransfers
   * @return withdrawalFeeForTransfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithdrawalFeeForTransfers() {
    return withdrawalFeeForTransfers;
  }


  public void setWithdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingsProductData savingsProductData = (SavingsProductData) o;
    return Objects.equals(this.accrualBasedAccountingEnabled, savingsProductData.accrualBasedAccountingEnabled) &&
        Objects.equals(this.allowOverdraft, savingsProductData.allowOverdraft) &&
        Objects.equals(this.cashBasedAccountingEnabled, savingsProductData.cashBasedAccountingEnabled) &&
        Objects.equals(this.currency, savingsProductData.currency) &&
        Objects.equals(this.depositAccountType, savingsProductData.depositAccountType) &&
        Objects.equals(this.id, savingsProductData.id) &&
        Objects.equals(this.interestCalculationDaysInYearType, savingsProductData.interestCalculationDaysInYearType) &&
        Objects.equals(this.interestCalculationType, savingsProductData.interestCalculationType) &&
        Objects.equals(this.interestCompoundingPeriodType, savingsProductData.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, savingsProductData.interestPostingPeriodType) &&
        Objects.equals(this.lockinPeriodFrequency, savingsProductData.lockinPeriodFrequency) &&
        Objects.equals(this.lockinPeriodFrequencyType, savingsProductData.lockinPeriodFrequencyType) &&
        Objects.equals(this.maxAllowedLienLimit, savingsProductData.maxAllowedLienLimit) &&
        Objects.equals(this.minRequiredBalance, savingsProductData.minRequiredBalance) &&
        Objects.equals(this.minRequiredOpeningBalance, savingsProductData.minRequiredOpeningBalance) &&
        Objects.equals(this.name, savingsProductData.name) &&
        Objects.equals(this.nominalAnnualInterestRate, savingsProductData.nominalAnnualInterestRate) &&
        Objects.equals(this.overdraftLimit, savingsProductData.overdraftLimit) &&
        Objects.equals(this.periodicAccrualAccounting, savingsProductData.periodicAccrualAccounting) &&
        Objects.equals(this.upfrontAccrualAccounting, savingsProductData.upfrontAccrualAccounting) &&
        Objects.equals(this.withdrawalFeeForTransfers, savingsProductData.withdrawalFeeForTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrualBasedAccountingEnabled, allowOverdraft, cashBasedAccountingEnabled, currency, depositAccountType, id, interestCalculationDaysInYearType, interestCalculationType, interestCompoundingPeriodType, interestPostingPeriodType, lockinPeriodFrequency, lockinPeriodFrequencyType, maxAllowedLienLimit, minRequiredBalance, minRequiredOpeningBalance, name, nominalAnnualInterestRate, overdraftLimit, periodicAccrualAccounting, upfrontAccrualAccounting, withdrawalFeeForTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingsProductData {\n");
    sb.append("    accrualBasedAccountingEnabled: ").append(toIndentedString(accrualBasedAccountingEnabled)).append("\n");
    sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
    sb.append("    cashBasedAccountingEnabled: ").append(toIndentedString(cashBasedAccountingEnabled)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    depositAccountType: ").append(toIndentedString(depositAccountType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    lockinPeriodFrequency: ").append(toIndentedString(lockinPeriodFrequency)).append("\n");
    sb.append("    lockinPeriodFrequencyType: ").append(toIndentedString(lockinPeriodFrequencyType)).append("\n");
    sb.append("    maxAllowedLienLimit: ").append(toIndentedString(maxAllowedLienLimit)).append("\n");
    sb.append("    minRequiredBalance: ").append(toIndentedString(minRequiredBalance)).append("\n");
    sb.append("    minRequiredOpeningBalance: ").append(toIndentedString(minRequiredOpeningBalance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    periodicAccrualAccounting: ").append(toIndentedString(periodicAccrualAccounting)).append("\n");
    sb.append("    upfrontAccrualAccounting: ").append(toIndentedString(upfrontAccrualAccounting)).append("\n");
    sb.append("    withdrawalFeeForTransfers: ").append(toIndentedString(withdrawalFeeForTransfers)).append("\n");
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
