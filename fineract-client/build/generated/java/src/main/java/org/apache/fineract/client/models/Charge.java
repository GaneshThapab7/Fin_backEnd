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
import org.apache.fineract.client.models.ChargeFeeOnMonthDay;
import org.apache.fineract.client.models.GLAccount;
import org.apache.fineract.client.models.PaymentType;
import org.apache.fineract.client.models.TaxGroup;

/**
 * Charge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Charge {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private GLAccount account;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ALLOWED_CLIENT_CHARGE_CALCULATION_TYPE = "allowedClientChargeCalculationType";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CLIENT_CHARGE_CALCULATION_TYPE)
  private Boolean allowedClientChargeCalculationType;

  public static final String SERIALIZED_NAME_ALLOWED_CLIENT_CHARGE_TIME = "allowedClientChargeTime";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CLIENT_CHARGE_TIME)
  private Boolean allowedClientChargeTime;

  public static final String SERIALIZED_NAME_ALLOWED_LOAN_CHARGE_TIME = "allowedLoanChargeTime";
  @SerializedName(SERIALIZED_NAME_ALLOWED_LOAN_CHARGE_TIME)
  private Boolean allowedLoanChargeTime;

  public static final String SERIALIZED_NAME_ALLOWED_SAVINGS_CHARGE_CALCULATION_TYPE = "allowedSavingsChargeCalculationType";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SAVINGS_CHARGE_CALCULATION_TYPE)
  private Boolean allowedSavingsChargeCalculationType;

  public static final String SERIALIZED_NAME_ALLOWED_SAVINGS_CHARGE_TIME = "allowedSavingsChargeTime";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SAVINGS_CHARGE_TIME)
  private Boolean allowedSavingsChargeTime;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ANNUAL_FEE = "annualFee";
  @SerializedName(SERIALIZED_NAME_ANNUAL_FEE)
  private Boolean annualFee;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION = "chargeCalculation";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION)
  private Integer chargeCalculation;

  public static final String SERIALIZED_NAME_CHARGE_PAYMENT_MODE = "chargePaymentMode";
  @SerializedName(SERIALIZED_NAME_CHARGE_PAYMENT_MODE)
  private Integer chargePaymentMode;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private Integer chargeTimeType;

  public static final String SERIALIZED_NAME_CLIENT_CHARGE = "clientCharge";
  @SerializedName(SERIALIZED_NAME_CLIENT_CHARGE)
  private Boolean clientCharge;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DISBURSEMENT_CHARGE = "disbursementCharge";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_CHARGE)
  private Boolean disbursementCharge;

  public static final String SERIALIZED_NAME_ENABLE_FREE_WITHDRAWAL = "enableFreeWithdrawal";
  @SerializedName(SERIALIZED_NAME_ENABLE_FREE_WITHDRAWAL)
  private Boolean enableFreeWithdrawal;

  public static final String SERIALIZED_NAME_ENABLE_PAYMENT_TYPE = "enablePaymentType";
  @SerializedName(SERIALIZED_NAME_ENABLE_PAYMENT_TYPE)
  private Boolean enablePaymentType;

  public static final String SERIALIZED_NAME_FEE_INTERVAL = "feeInterval";
  @SerializedName(SERIALIZED_NAME_FEE_INTERVAL)
  private Integer feeInterval;

  public static final String SERIALIZED_NAME_FEE_ON_MONTH_DAY = "feeOnMonthDay";
  @SerializedName(SERIALIZED_NAME_FEE_ON_MONTH_DAY)
  private ChargeFeeOnMonthDay feeOnMonthDay;

  public static final String SERIALIZED_NAME_FREQUENCY_FREE_WITHDRAWAL_CHARGE = "frequencyFreeWithdrawalCharge";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_FREE_WITHDRAWAL_CHARGE)
  private Integer frequencyFreeWithdrawalCharge;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_INCOME_ACCOUNT_ID = "incomeAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_ACCOUNT_ID)
  private Long incomeAccountId;

  public static final String SERIALIZED_NAME_LOAN_CHARGE = "loanCharge";
  @SerializedName(SERIALIZED_NAME_LOAN_CHARGE)
  private Boolean loanCharge;

  public static final String SERIALIZED_NAME_MAX_CAP = "maxCap";
  @SerializedName(SERIALIZED_NAME_MAX_CAP)
  private BigDecimal maxCap;

  public static final String SERIALIZED_NAME_MIN_CAP = "minCap";
  @SerializedName(SERIALIZED_NAME_MIN_CAP)
  private BigDecimal minCap;

  public static final String SERIALIZED_NAME_MONTHLY_FEE = "monthlyFee";
  @SerializedName(SERIALIZED_NAME_MONTHLY_FEE)
  private Boolean monthlyFee;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public static final String SERIALIZED_NAME_OVERDUE_INSTALLMENT = "overdueInstallment";
  @SerializedName(SERIALIZED_NAME_OVERDUE_INSTALLMENT)
  private Boolean overdueInstallment;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentType paymentType;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public static final String SERIALIZED_NAME_PERCENTAGE_OF_APPROVED_AMOUNT = "percentageOfApprovedAmount";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_OF_APPROVED_AMOUNT)
  private Boolean percentageOfApprovedAmount;

  public static final String SERIALIZED_NAME_PERCENTAGE_OF_DISBURSEMENT_AMOUNT = "percentageOfDisbursementAmount";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_OF_DISBURSEMENT_AMOUNT)
  private Boolean percentageOfDisbursementAmount;

  public static final String SERIALIZED_NAME_RESTART_FREQUENCY = "restartFrequency";
  @SerializedName(SERIALIZED_NAME_RESTART_FREQUENCY)
  private Integer restartFrequency;

  public static final String SERIALIZED_NAME_RESTART_FREQUENCY_ENUM = "restartFrequencyEnum";
  @SerializedName(SERIALIZED_NAME_RESTART_FREQUENCY_ENUM)
  private Integer restartFrequencyEnum;

  public static final String SERIALIZED_NAME_SAVINGS_CHARGE = "savingsCharge";
  @SerializedName(SERIALIZED_NAME_SAVINGS_CHARGE)
  private Boolean savingsCharge;

  public static final String SERIALIZED_NAME_TAX_GROUP = "taxGroup";
  @SerializedName(SERIALIZED_NAME_TAX_GROUP)
  private TaxGroup taxGroup;

  public Charge() { 
  }

  public Charge account(GLAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GLAccount getAccount() {
    return account;
  }


  public void setAccount(GLAccount account) {
    this.account = account;
  }


  public Charge active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Charge allowedClientChargeCalculationType(Boolean allowedClientChargeCalculationType) {
    
    this.allowedClientChargeCalculationType = allowedClientChargeCalculationType;
    return this;
  }

   /**
   * Get allowedClientChargeCalculationType
   * @return allowedClientChargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowedClientChargeCalculationType() {
    return allowedClientChargeCalculationType;
  }


  public void setAllowedClientChargeCalculationType(Boolean allowedClientChargeCalculationType) {
    this.allowedClientChargeCalculationType = allowedClientChargeCalculationType;
  }


  public Charge allowedClientChargeTime(Boolean allowedClientChargeTime) {
    
    this.allowedClientChargeTime = allowedClientChargeTime;
    return this;
  }

   /**
   * Get allowedClientChargeTime
   * @return allowedClientChargeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowedClientChargeTime() {
    return allowedClientChargeTime;
  }


  public void setAllowedClientChargeTime(Boolean allowedClientChargeTime) {
    this.allowedClientChargeTime = allowedClientChargeTime;
  }


  public Charge allowedLoanChargeTime(Boolean allowedLoanChargeTime) {
    
    this.allowedLoanChargeTime = allowedLoanChargeTime;
    return this;
  }

   /**
   * Get allowedLoanChargeTime
   * @return allowedLoanChargeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowedLoanChargeTime() {
    return allowedLoanChargeTime;
  }


  public void setAllowedLoanChargeTime(Boolean allowedLoanChargeTime) {
    this.allowedLoanChargeTime = allowedLoanChargeTime;
  }


  public Charge allowedSavingsChargeCalculationType(Boolean allowedSavingsChargeCalculationType) {
    
    this.allowedSavingsChargeCalculationType = allowedSavingsChargeCalculationType;
    return this;
  }

   /**
   * Get allowedSavingsChargeCalculationType
   * @return allowedSavingsChargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowedSavingsChargeCalculationType() {
    return allowedSavingsChargeCalculationType;
  }


  public void setAllowedSavingsChargeCalculationType(Boolean allowedSavingsChargeCalculationType) {
    this.allowedSavingsChargeCalculationType = allowedSavingsChargeCalculationType;
  }


  public Charge allowedSavingsChargeTime(Boolean allowedSavingsChargeTime) {
    
    this.allowedSavingsChargeTime = allowedSavingsChargeTime;
    return this;
  }

   /**
   * Get allowedSavingsChargeTime
   * @return allowedSavingsChargeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowedSavingsChargeTime() {
    return allowedSavingsChargeTime;
  }


  public void setAllowedSavingsChargeTime(Boolean allowedSavingsChargeTime) {
    this.allowedSavingsChargeTime = allowedSavingsChargeTime;
  }


  public Charge amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public Charge annualFee(Boolean annualFee) {
    
    this.annualFee = annualFee;
    return this;
  }

   /**
   * Get annualFee
   * @return annualFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAnnualFee() {
    return annualFee;
  }


  public void setAnnualFee(Boolean annualFee) {
    this.annualFee = annualFee;
  }


  public Charge chargeCalculation(Integer chargeCalculation) {
    
    this.chargeCalculation = chargeCalculation;
    return this;
  }

   /**
   * Get chargeCalculation
   * @return chargeCalculation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChargeCalculation() {
    return chargeCalculation;
  }


  public void setChargeCalculation(Integer chargeCalculation) {
    this.chargeCalculation = chargeCalculation;
  }


  public Charge chargePaymentMode(Integer chargePaymentMode) {
    
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChargePaymentMode() {
    return chargePaymentMode;
  }


  public void setChargePaymentMode(Integer chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }


  public Charge chargeTimeType(Integer chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(Integer chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public Charge clientCharge(Boolean clientCharge) {
    
    this.clientCharge = clientCharge;
    return this;
  }

   /**
   * Get clientCharge
   * @return clientCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClientCharge() {
    return clientCharge;
  }


  public void setClientCharge(Boolean clientCharge) {
    this.clientCharge = clientCharge;
  }


  public Charge currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Charge deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Charge disbursementCharge(Boolean disbursementCharge) {
    
    this.disbursementCharge = disbursementCharge;
    return this;
  }

   /**
   * Get disbursementCharge
   * @return disbursementCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisbursementCharge() {
    return disbursementCharge;
  }


  public void setDisbursementCharge(Boolean disbursementCharge) {
    this.disbursementCharge = disbursementCharge;
  }


  public Charge enableFreeWithdrawal(Boolean enableFreeWithdrawal) {
    
    this.enableFreeWithdrawal = enableFreeWithdrawal;
    return this;
  }

   /**
   * Get enableFreeWithdrawal
   * @return enableFreeWithdrawal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableFreeWithdrawal() {
    return enableFreeWithdrawal;
  }


  public void setEnableFreeWithdrawal(Boolean enableFreeWithdrawal) {
    this.enableFreeWithdrawal = enableFreeWithdrawal;
  }


  public Charge enablePaymentType(Boolean enablePaymentType) {
    
    this.enablePaymentType = enablePaymentType;
    return this;
  }

   /**
   * Get enablePaymentType
   * @return enablePaymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnablePaymentType() {
    return enablePaymentType;
  }


  public void setEnablePaymentType(Boolean enablePaymentType) {
    this.enablePaymentType = enablePaymentType;
  }


  public Charge feeInterval(Integer feeInterval) {
    
    this.feeInterval = feeInterval;
    return this;
  }

   /**
   * Get feeInterval
   * @return feeInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFeeInterval() {
    return feeInterval;
  }


  public void setFeeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
  }


  public Charge feeOnMonthDay(ChargeFeeOnMonthDay feeOnMonthDay) {
    
    this.feeOnMonthDay = feeOnMonthDay;
    return this;
  }

   /**
   * Get feeOnMonthDay
   * @return feeOnMonthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChargeFeeOnMonthDay getFeeOnMonthDay() {
    return feeOnMonthDay;
  }


  public void setFeeOnMonthDay(ChargeFeeOnMonthDay feeOnMonthDay) {
    this.feeOnMonthDay = feeOnMonthDay;
  }


  public Charge frequencyFreeWithdrawalCharge(Integer frequencyFreeWithdrawalCharge) {
    
    this.frequencyFreeWithdrawalCharge = frequencyFreeWithdrawalCharge;
    return this;
  }

   /**
   * Get frequencyFreeWithdrawalCharge
   * @return frequencyFreeWithdrawalCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFrequencyFreeWithdrawalCharge() {
    return frequencyFreeWithdrawalCharge;
  }


  public void setFrequencyFreeWithdrawalCharge(Integer frequencyFreeWithdrawalCharge) {
    this.frequencyFreeWithdrawalCharge = frequencyFreeWithdrawalCharge;
  }


  public Charge id(Long id) {
    
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


  public Charge incomeAccountId(Long incomeAccountId) {
    
    this.incomeAccountId = incomeAccountId;
    return this;
  }

   /**
   * Get incomeAccountId
   * @return incomeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIncomeAccountId() {
    return incomeAccountId;
  }


  public void setIncomeAccountId(Long incomeAccountId) {
    this.incomeAccountId = incomeAccountId;
  }


  public Charge loanCharge(Boolean loanCharge) {
    
    this.loanCharge = loanCharge;
    return this;
  }

   /**
   * Get loanCharge
   * @return loanCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLoanCharge() {
    return loanCharge;
  }


  public void setLoanCharge(Boolean loanCharge) {
    this.loanCharge = loanCharge;
  }


  public Charge maxCap(BigDecimal maxCap) {
    
    this.maxCap = maxCap;
    return this;
  }

   /**
   * Get maxCap
   * @return maxCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxCap() {
    return maxCap;
  }


  public void setMaxCap(BigDecimal maxCap) {
    this.maxCap = maxCap;
  }


  public Charge minCap(BigDecimal minCap) {
    
    this.minCap = minCap;
    return this;
  }

   /**
   * Get minCap
   * @return minCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMinCap() {
    return minCap;
  }


  public void setMinCap(BigDecimal minCap) {
    this.minCap = minCap;
  }


  public Charge monthlyFee(Boolean monthlyFee) {
    
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * Get monthlyFee
   * @return monthlyFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMonthlyFee() {
    return monthlyFee;
  }


  public void setMonthlyFee(Boolean monthlyFee) {
    this.monthlyFee = monthlyFee;
  }


  public Charge name(String name) {
    
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


  public Charge _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  public Charge overdueInstallment(Boolean overdueInstallment) {
    
    this.overdueInstallment = overdueInstallment;
    return this;
  }

   /**
   * Get overdueInstallment
   * @return overdueInstallment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverdueInstallment() {
    return overdueInstallment;
  }


  public void setOverdueInstallment(Boolean overdueInstallment) {
    this.overdueInstallment = overdueInstallment;
  }


  public Charge paymentType(PaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public Charge penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPenalty() {
    return penalty;
  }


  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  public Charge percentageOfApprovedAmount(Boolean percentageOfApprovedAmount) {
    
    this.percentageOfApprovedAmount = percentageOfApprovedAmount;
    return this;
  }

   /**
   * Get percentageOfApprovedAmount
   * @return percentageOfApprovedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPercentageOfApprovedAmount() {
    return percentageOfApprovedAmount;
  }


  public void setPercentageOfApprovedAmount(Boolean percentageOfApprovedAmount) {
    this.percentageOfApprovedAmount = percentageOfApprovedAmount;
  }


  public Charge percentageOfDisbursementAmount(Boolean percentageOfDisbursementAmount) {
    
    this.percentageOfDisbursementAmount = percentageOfDisbursementAmount;
    return this;
  }

   /**
   * Get percentageOfDisbursementAmount
   * @return percentageOfDisbursementAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPercentageOfDisbursementAmount() {
    return percentageOfDisbursementAmount;
  }


  public void setPercentageOfDisbursementAmount(Boolean percentageOfDisbursementAmount) {
    this.percentageOfDisbursementAmount = percentageOfDisbursementAmount;
  }


  public Charge restartFrequency(Integer restartFrequency) {
    
    this.restartFrequency = restartFrequency;
    return this;
  }

   /**
   * Get restartFrequency
   * @return restartFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestartFrequency() {
    return restartFrequency;
  }


  public void setRestartFrequency(Integer restartFrequency) {
    this.restartFrequency = restartFrequency;
  }


  public Charge restartFrequencyEnum(Integer restartFrequencyEnum) {
    
    this.restartFrequencyEnum = restartFrequencyEnum;
    return this;
  }

   /**
   * Get restartFrequencyEnum
   * @return restartFrequencyEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestartFrequencyEnum() {
    return restartFrequencyEnum;
  }


  public void setRestartFrequencyEnum(Integer restartFrequencyEnum) {
    this.restartFrequencyEnum = restartFrequencyEnum;
  }


  public Charge savingsCharge(Boolean savingsCharge) {
    
    this.savingsCharge = savingsCharge;
    return this;
  }

   /**
   * Get savingsCharge
   * @return savingsCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSavingsCharge() {
    return savingsCharge;
  }


  public void setSavingsCharge(Boolean savingsCharge) {
    this.savingsCharge = savingsCharge;
  }


  public Charge taxGroup(TaxGroup taxGroup) {
    
    this.taxGroup = taxGroup;
    return this;
  }

   /**
   * Get taxGroup
   * @return taxGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxGroup getTaxGroup() {
    return taxGroup;
  }


  public void setTaxGroup(TaxGroup taxGroup) {
    this.taxGroup = taxGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.account, charge.account) &&
        Objects.equals(this.active, charge.active) &&
        Objects.equals(this.allowedClientChargeCalculationType, charge.allowedClientChargeCalculationType) &&
        Objects.equals(this.allowedClientChargeTime, charge.allowedClientChargeTime) &&
        Objects.equals(this.allowedLoanChargeTime, charge.allowedLoanChargeTime) &&
        Objects.equals(this.allowedSavingsChargeCalculationType, charge.allowedSavingsChargeCalculationType) &&
        Objects.equals(this.allowedSavingsChargeTime, charge.allowedSavingsChargeTime) &&
        Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.annualFee, charge.annualFee) &&
        Objects.equals(this.chargeCalculation, charge.chargeCalculation) &&
        Objects.equals(this.chargePaymentMode, charge.chargePaymentMode) &&
        Objects.equals(this.chargeTimeType, charge.chargeTimeType) &&
        Objects.equals(this.clientCharge, charge.clientCharge) &&
        Objects.equals(this.currencyCode, charge.currencyCode) &&
        Objects.equals(this.deleted, charge.deleted) &&
        Objects.equals(this.disbursementCharge, charge.disbursementCharge) &&
        Objects.equals(this.enableFreeWithdrawal, charge.enableFreeWithdrawal) &&
        Objects.equals(this.enablePaymentType, charge.enablePaymentType) &&
        Objects.equals(this.feeInterval, charge.feeInterval) &&
        Objects.equals(this.feeOnMonthDay, charge.feeOnMonthDay) &&
        Objects.equals(this.frequencyFreeWithdrawalCharge, charge.frequencyFreeWithdrawalCharge) &&
        Objects.equals(this.id, charge.id) &&
        Objects.equals(this.incomeAccountId, charge.incomeAccountId) &&
        Objects.equals(this.loanCharge, charge.loanCharge) &&
        Objects.equals(this.maxCap, charge.maxCap) &&
        Objects.equals(this.minCap, charge.minCap) &&
        Objects.equals(this.monthlyFee, charge.monthlyFee) &&
        Objects.equals(this.name, charge.name) &&
        Objects.equals(this._new, charge._new) &&
        Objects.equals(this.overdueInstallment, charge.overdueInstallment) &&
        Objects.equals(this.paymentType, charge.paymentType) &&
        Objects.equals(this.penalty, charge.penalty) &&
        Objects.equals(this.percentageOfApprovedAmount, charge.percentageOfApprovedAmount) &&
        Objects.equals(this.percentageOfDisbursementAmount, charge.percentageOfDisbursementAmount) &&
        Objects.equals(this.restartFrequency, charge.restartFrequency) &&
        Objects.equals(this.restartFrequencyEnum, charge.restartFrequencyEnum) &&
        Objects.equals(this.savingsCharge, charge.savingsCharge) &&
        Objects.equals(this.taxGroup, charge.taxGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, active, allowedClientChargeCalculationType, allowedClientChargeTime, allowedLoanChargeTime, allowedSavingsChargeCalculationType, allowedSavingsChargeTime, amount, annualFee, chargeCalculation, chargePaymentMode, chargeTimeType, clientCharge, currencyCode, deleted, disbursementCharge, enableFreeWithdrawal, enablePaymentType, feeInterval, feeOnMonthDay, frequencyFreeWithdrawalCharge, id, incomeAccountId, loanCharge, maxCap, minCap, monthlyFee, name, _new, overdueInstallment, paymentType, penalty, percentageOfApprovedAmount, percentageOfDisbursementAmount, restartFrequency, restartFrequencyEnum, savingsCharge, taxGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    allowedClientChargeCalculationType: ").append(toIndentedString(allowedClientChargeCalculationType)).append("\n");
    sb.append("    allowedClientChargeTime: ").append(toIndentedString(allowedClientChargeTime)).append("\n");
    sb.append("    allowedLoanChargeTime: ").append(toIndentedString(allowedLoanChargeTime)).append("\n");
    sb.append("    allowedSavingsChargeCalculationType: ").append(toIndentedString(allowedSavingsChargeCalculationType)).append("\n");
    sb.append("    allowedSavingsChargeTime: ").append(toIndentedString(allowedSavingsChargeTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    annualFee: ").append(toIndentedString(annualFee)).append("\n");
    sb.append("    chargeCalculation: ").append(toIndentedString(chargeCalculation)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    clientCharge: ").append(toIndentedString(clientCharge)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    disbursementCharge: ").append(toIndentedString(disbursementCharge)).append("\n");
    sb.append("    enableFreeWithdrawal: ").append(toIndentedString(enableFreeWithdrawal)).append("\n");
    sb.append("    enablePaymentType: ").append(toIndentedString(enablePaymentType)).append("\n");
    sb.append("    feeInterval: ").append(toIndentedString(feeInterval)).append("\n");
    sb.append("    feeOnMonthDay: ").append(toIndentedString(feeOnMonthDay)).append("\n");
    sb.append("    frequencyFreeWithdrawalCharge: ").append(toIndentedString(frequencyFreeWithdrawalCharge)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incomeAccountId: ").append(toIndentedString(incomeAccountId)).append("\n");
    sb.append("    loanCharge: ").append(toIndentedString(loanCharge)).append("\n");
    sb.append("    maxCap: ").append(toIndentedString(maxCap)).append("\n");
    sb.append("    minCap: ").append(toIndentedString(minCap)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    overdueInstallment: ").append(toIndentedString(overdueInstallment)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    percentageOfApprovedAmount: ").append(toIndentedString(percentageOfApprovedAmount)).append("\n");
    sb.append("    percentageOfDisbursementAmount: ").append(toIndentedString(percentageOfDisbursementAmount)).append("\n");
    sb.append("    restartFrequency: ").append(toIndentedString(restartFrequency)).append("\n");
    sb.append("    restartFrequencyEnum: ").append(toIndentedString(restartFrequencyEnum)).append("\n");
    sb.append("    savingsCharge: ").append(toIndentedString(savingsCharge)).append("\n");
    sb.append("    taxGroup: ").append(toIndentedString(taxGroup)).append("\n");
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

