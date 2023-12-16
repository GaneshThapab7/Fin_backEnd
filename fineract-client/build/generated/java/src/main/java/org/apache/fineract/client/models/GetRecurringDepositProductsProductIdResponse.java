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
import org.apache.fineract.client.models.GetRecurringDepositProductsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetRecurringDepositProductsInterestCalculationType;
import org.apache.fineract.client.models.GetRecurringDepositProductsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdAccountingMappings;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdActiveChart;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdCurrency;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdMaxDepositTermType;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdMinDepositTermType;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType;
import org.apache.fineract.client.models.GetRecurringDepositProductsRecurringDepositFrequencyType;

/**
 * GetRecurringDepositProductsProductIdResponse
 */
@ApiModel(description = "GetRecurringDepositProductsProductIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetRecurringDepositProductsProductIdResponse {
  public static final String SERIALIZED_NAME_ACCOUNTING_MAPPINGS = "accountingMappings";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_MAPPINGS)
  private GetRecurringDepositProductsProductIdAccountingMappings accountingMappings;

  public static final String SERIALIZED_NAME_ACTIVE_CHART = "activeChart";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CHART)
  private GetRecurringDepositProductsProductIdActiveChart activeChart;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetRecurringDepositProductsProductIdCurrency currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEE_TO_INCOME_ACCOUNT_MAPPINGS = "feeToIncomeAccountMappings";
  @SerializedName(SERIALIZED_NAME_FEE_TO_INCOME_ACCOUNT_MAPPINGS)
  private Set<GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private GetRecurringDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private GetRecurringDepositProductsInterestCalculationType interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private GetRecurringDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private GetRecurringDepositProductsInterestPostingPeriodType interestPostingPeriodType;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM = "maxDepositTerm";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM)
  private Integer maxDepositTerm;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE = "maxDepositTermType";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE)
  private GetRecurringDepositProductsProductIdMaxDepositTermType maxDepositTermType;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM = "minDepositTerm";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM)
  private Integer minDepositTerm;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE = "minDepositTermType";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE)
  private GetRecurringDepositProductsProductIdMinDepositTermType minDepositTermType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PENALTY_TO_INCOME_ACCOUNT_MAPPINGS = "penaltyToIncomeAccountMappings";
  @SerializedName(SERIALIZED_NAME_PENALTY_TO_INCOME_ACCOUNT_MAPPINGS)
  private Set<GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings = null;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE = "preClosurePenalApplicable";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE)
  private Boolean preClosurePenalApplicable;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST = "preClosurePenalInterest";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST)
  private Double preClosurePenalInterest;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST_ON_TYPE = "preClosurePenalInterestOnType";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST_ON_TYPE)
  private GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType;

  public static final String SERIALIZED_NAME_RECURRING_DEPOSIT_FREQUENCY = "recurringDepositFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRING_DEPOSIT_FREQUENCY)
  private Integer recurringDepositFrequency;

  public static final String SERIALIZED_NAME_RECURRING_DEPOSIT_FREQUENCY_TYPE = "recurringDepositFrequencyType";
  @SerializedName(SERIALIZED_NAME_RECURRING_DEPOSIT_FREQUENCY_TYPE)
  private GetRecurringDepositProductsRecurringDepositFrequencyType recurringDepositFrequencyType;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public GetRecurringDepositProductsProductIdResponse() { 
  }

  public GetRecurringDepositProductsProductIdResponse accountingMappings(GetRecurringDepositProductsProductIdAccountingMappings accountingMappings) {
    
    this.accountingMappings = accountingMappings;
    return this;
  }

   /**
   * Get accountingMappings
   * @return accountingMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdAccountingMappings getAccountingMappings() {
    return accountingMappings;
  }


  public void setAccountingMappings(GetRecurringDepositProductsProductIdAccountingMappings accountingMappings) {
    this.accountingMappings = accountingMappings;
  }


  public GetRecurringDepositProductsProductIdResponse activeChart(GetRecurringDepositProductsProductIdActiveChart activeChart) {
    
    this.activeChart = activeChart;
    return this;
  }

   /**
   * Get activeChart
   * @return activeChart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdActiveChart getActiveChart() {
    return activeChart;
  }


  public void setActiveChart(GetRecurringDepositProductsProductIdActiveChart activeChart) {
    this.activeChart = activeChart;
  }


  public GetRecurringDepositProductsProductIdResponse currency(GetRecurringDepositProductsProductIdCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetRecurringDepositProductsProductIdCurrency currency) {
    this.currency = currency;
  }


  public GetRecurringDepositProductsProductIdResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daily compounding using Daily Balance, 5% per year, 365 days in year", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetRecurringDepositProductsProductIdResponse feeToIncomeAccountMappings(Set<GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
    return this;
  }

  public GetRecurringDepositProductsProductIdResponse addFeeToIncomeAccountMappingsItem(GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings feeToIncomeAccountMappingsItem) {
    if (this.feeToIncomeAccountMappings == null) {
      this.feeToIncomeAccountMappings = new LinkedHashSet<>();
    }
    this.feeToIncomeAccountMappings.add(feeToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get feeToIncomeAccountMappings
   * @return feeToIncomeAccountMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings> getFeeToIncomeAccountMappings() {
    return feeToIncomeAccountMappings;
  }


  public void setFeeToIncomeAccountMappings(Set<GetRecurringDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
  }


  public GetRecurringDepositProductsProductIdResponse id(Integer id) {
    
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


  public GetRecurringDepositProductsProductIdResponse interestCalculationDaysInYearType(GetRecurringDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(GetRecurringDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public GetRecurringDepositProductsProductIdResponse interestCalculationType(GetRecurringDepositProductsInterestCalculationType interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(GetRecurringDepositProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public GetRecurringDepositProductsProductIdResponse interestCompoundingPeriodType(GetRecurringDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(GetRecurringDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public GetRecurringDepositProductsProductIdResponse interestPostingPeriodType(GetRecurringDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(GetRecurringDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public GetRecurringDepositProductsProductIdResponse maxDepositTerm(Integer maxDepositTerm) {
    
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }


  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }


  public GetRecurringDepositProductsProductIdResponse maxDepositTermType(GetRecurringDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }


  public void setMaxDepositTermType(GetRecurringDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }


  public GetRecurringDepositProductsProductIdResponse minDepositTerm(Integer minDepositTerm) {
    
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }


  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }


  public GetRecurringDepositProductsProductIdResponse minDepositTermType(GetRecurringDepositProductsProductIdMinDepositTermType minDepositTermType) {
    
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }


  public void setMinDepositTermType(GetRecurringDepositProductsProductIdMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }


  public GetRecurringDepositProductsProductIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Recurring deposit product", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetRecurringDepositProductsProductIdResponse penaltyToIncomeAccountMappings(Set<GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
    return this;
  }

  public GetRecurringDepositProductsProductIdResponse addPenaltyToIncomeAccountMappingsItem(GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings penaltyToIncomeAccountMappingsItem) {
    if (this.penaltyToIncomeAccountMappings == null) {
      this.penaltyToIncomeAccountMappings = new LinkedHashSet<>();
    }
    this.penaltyToIncomeAccountMappings.add(penaltyToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get penaltyToIncomeAccountMappings
   * @return penaltyToIncomeAccountMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings> getPenaltyToIncomeAccountMappings() {
    return penaltyToIncomeAccountMappings;
  }


  public void setPenaltyToIncomeAccountMappings(Set<GetRecurringDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
  }


  public GetRecurringDepositProductsProductIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }


  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }


  public GetRecurringDepositProductsProductIdResponse preClosurePenalInterest(Double preClosurePenalInterest) {
    
    this.preClosurePenalInterest = preClosurePenalInterest;
    return this;
  }

   /**
   * Get preClosurePenalInterest
   * @return preClosurePenalInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.75", value = "")

  public Double getPreClosurePenalInterest() {
    return preClosurePenalInterest;
  }


  public void setPreClosurePenalInterest(Double preClosurePenalInterest) {
    this.preClosurePenalInterest = preClosurePenalInterest;
  }


  public GetRecurringDepositProductsProductIdResponse preClosurePenalInterestOnType(GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
    return this;
  }

   /**
   * Get preClosurePenalInterestOnType
   * @return preClosurePenalInterestOnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType getPreClosurePenalInterestOnType() {
    return preClosurePenalInterestOnType;
  }


  public void setPreClosurePenalInterestOnType(GetRecurringDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
  }


  public GetRecurringDepositProductsProductIdResponse recurringDepositFrequency(Integer recurringDepositFrequency) {
    
    this.recurringDepositFrequency = recurringDepositFrequency;
    return this;
  }

   /**
   * Get recurringDepositFrequency
   * @return recurringDepositFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRecurringDepositFrequency() {
    return recurringDepositFrequency;
  }


  public void setRecurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
  }


  public GetRecurringDepositProductsProductIdResponse recurringDepositFrequencyType(GetRecurringDepositProductsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
    return this;
  }

   /**
   * Get recurringDepositFrequencyType
   * @return recurringDepositFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringDepositProductsRecurringDepositFrequencyType getRecurringDepositFrequencyType() {
    return recurringDepositFrequencyType;
  }


  public void setRecurringDepositFrequencyType(GetRecurringDepositProductsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
  }


  public GetRecurringDepositProductsProductIdResponse shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RD01", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositProductsProductIdResponse getRecurringDepositProductsProductIdResponse = (GetRecurringDepositProductsProductIdResponse) o;
    return Objects.equals(this.accountingMappings, getRecurringDepositProductsProductIdResponse.accountingMappings) &&
        Objects.equals(this.activeChart, getRecurringDepositProductsProductIdResponse.activeChart) &&
        Objects.equals(this.currency, getRecurringDepositProductsProductIdResponse.currency) &&
        Objects.equals(this.description, getRecurringDepositProductsProductIdResponse.description) &&
        Objects.equals(this.feeToIncomeAccountMappings, getRecurringDepositProductsProductIdResponse.feeToIncomeAccountMappings) &&
        Objects.equals(this.id, getRecurringDepositProductsProductIdResponse.id) &&
        Objects.equals(this.interestCalculationDaysInYearType, getRecurringDepositProductsProductIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.interestCalculationType, getRecurringDepositProductsProductIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCompoundingPeriodType, getRecurringDepositProductsProductIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getRecurringDepositProductsProductIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.maxDepositTerm, getRecurringDepositProductsProductIdResponse.maxDepositTerm) &&
        Objects.equals(this.maxDepositTermType, getRecurringDepositProductsProductIdResponse.maxDepositTermType) &&
        Objects.equals(this.minDepositTerm, getRecurringDepositProductsProductIdResponse.minDepositTerm) &&
        Objects.equals(this.minDepositTermType, getRecurringDepositProductsProductIdResponse.minDepositTermType) &&
        Objects.equals(this.name, getRecurringDepositProductsProductIdResponse.name) &&
        Objects.equals(this.penaltyToIncomeAccountMappings, getRecurringDepositProductsProductIdResponse.penaltyToIncomeAccountMappings) &&
        Objects.equals(this.preClosurePenalApplicable, getRecurringDepositProductsProductIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.preClosurePenalInterest, getRecurringDepositProductsProductIdResponse.preClosurePenalInterest) &&
        Objects.equals(this.preClosurePenalInterestOnType, getRecurringDepositProductsProductIdResponse.preClosurePenalInterestOnType) &&
        Objects.equals(this.recurringDepositFrequency, getRecurringDepositProductsProductIdResponse.recurringDepositFrequency) &&
        Objects.equals(this.recurringDepositFrequencyType, getRecurringDepositProductsProductIdResponse.recurringDepositFrequencyType) &&
        Objects.equals(this.shortName, getRecurringDepositProductsProductIdResponse.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingMappings, activeChart, currency, description, feeToIncomeAccountMappings, id, interestCalculationDaysInYearType, interestCalculationType, interestCompoundingPeriodType, interestPostingPeriodType, maxDepositTerm, maxDepositTermType, minDepositTerm, minDepositTermType, name, penaltyToIncomeAccountMappings, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnType, recurringDepositFrequency, recurringDepositFrequencyType, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositProductsProductIdResponse {\n");
    sb.append("    accountingMappings: ").append(toIndentedString(accountingMappings)).append("\n");
    sb.append("    activeChart: ").append(toIndentedString(activeChart)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feeToIncomeAccountMappings: ").append(toIndentedString(feeToIncomeAccountMappings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    penaltyToIncomeAccountMappings: ").append(toIndentedString(penaltyToIncomeAccountMappings)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    preClosurePenalInterest: ").append(toIndentedString(preClosurePenalInterest)).append("\n");
    sb.append("    preClosurePenalInterestOnType: ").append(toIndentedString(preClosurePenalInterestOnType)).append("\n");
    sb.append("    recurringDepositFrequency: ").append(toIndentedString(recurringDepositFrequency)).append("\n");
    sb.append("    recurringDepositFrequencyType: ").append(toIndentedString(recurringDepositFrequencyType)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

