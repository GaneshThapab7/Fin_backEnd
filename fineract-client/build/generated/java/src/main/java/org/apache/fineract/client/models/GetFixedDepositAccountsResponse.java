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
import org.apache.fineract.client.models.GetFixedDepositAccountsCurrency;
import org.apache.fineract.client.models.GetFixedDepositAccountsDepositPeriodFrequency;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCalculationType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositAccountsMaxDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositAccountsMinDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositAccountsStatus;
import org.apache.fineract.client.models.GetFixedDepositAccountsSummary;
import org.apache.fineract.client.models.GetFixedDepositAccountsTimeline;

/**
 * GetFixedDepositAccountsResponse
 */
@ApiModel(description = "GetFixedDepositAccountsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFixedDepositAccountsResponse {
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
  private GetFixedDepositAccountsCurrency currency;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Float depositAmount;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD = "depositPeriod";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD)
  private Integer depositPeriod;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY = "depositPeriodFrequency";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY)
  private GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency;

  public static final String SERIALIZED_NAME_FIELD_OFFICER_ID = "fieldOfficerId";
  @SerializedName(SERIALIZED_NAME_FIELD_OFFICER_ID)
  private Integer fieldOfficerId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private GetFixedDepositAccountsInterestCalculationType interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_FREE_PERIOD_APPLICABLE = "interestFreePeriodApplicable";
  @SerializedName(SERIALIZED_NAME_INTEREST_FREE_PERIOD_APPLICABLE)
  private Boolean interestFreePeriodApplicable;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType;

  public static final String SERIALIZED_NAME_MATURITY_AMOUNT = "maturityAmount";
  @SerializedName(SERIALIZED_NAME_MATURITY_AMOUNT)
  private Float maturityAmount;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private LocalDate maturityDate;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM = "maxDepositTerm";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM)
  private Integer maxDepositTerm;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE = "maxDepositTermType";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE)
  private GetFixedDepositAccountsMaxDepositTermType maxDepositTermType;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM = "minDepositTerm";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM)
  private Integer minDepositTerm;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE = "minDepositTermType";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE)
  private GetFixedDepositAccountsMinDepositTermType minDepositTermType;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE = "preClosurePenalApplicable";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE)
  private Boolean preClosurePenalApplicable;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_ID = "savingsProductId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_ID)
  private Integer savingsProductId;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_NAME = "savingsProductName";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_NAME)
  private String savingsProductName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetFixedDepositAccountsStatus status;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetFixedDepositAccountsSummary summary;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetFixedDepositAccountsTimeline timeline;

  public GetFixedDepositAccountsResponse() { 
  }

  public GetFixedDepositAccountsResponse accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetFixedDepositAccountsResponse clientId(Integer clientId) {
    
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


  public GetFixedDepositAccountsResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sangamesh N", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetFixedDepositAccountsResponse currency(GetFixedDepositAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetFixedDepositAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetFixedDepositAccountsResponse depositAmount(Float depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "")

  public Float getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }


  public GetFixedDepositAccountsResponse depositPeriod(Integer depositPeriod) {
    
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Integer getDepositPeriod() {
    return depositPeriod;
  }


  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }


  public GetFixedDepositAccountsResponse depositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }


  public void setDepositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }


  public GetFixedDepositAccountsResponse fieldOfficerId(Integer fieldOfficerId) {
    
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


  public GetFixedDepositAccountsResponse id(Integer id) {
    
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


  public GetFixedDepositAccountsResponse interestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public GetFixedDepositAccountsResponse interestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public GetFixedDepositAccountsResponse interestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public GetFixedDepositAccountsResponse interestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
    return this;
  }

   /**
   * Get interestFreePeriodApplicable
   * @return interestFreePeriodApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getInterestFreePeriodApplicable() {
    return interestFreePeriodApplicable;
  }


  public void setInterestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
  }


  public GetFixedDepositAccountsResponse interestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public GetFixedDepositAccountsResponse maturityAmount(Float maturityAmount) {
    
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Get maturityAmount
   * @return maturityAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5140.25", value = "")

  public Float getMaturityAmount() {
    return maturityAmount;
  }


  public void setMaturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
  }


  public GetFixedDepositAccountsResponse maturityDate(LocalDate maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }


  public GetFixedDepositAccountsResponse maxDepositTerm(Integer maxDepositTerm) {
    
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }


  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }


  public GetFixedDepositAccountsResponse maxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }


  public void setMaxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }


  public GetFixedDepositAccountsResponse minDepositTerm(Integer minDepositTerm) {
    
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }


  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }


  public GetFixedDepositAccountsResponse minDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }


  public void setMinDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }


  public GetFixedDepositAccountsResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }


  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }


  public GetFixedDepositAccountsResponse savingsProductId(Integer savingsProductId) {
    
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getSavingsProductId() {
    return savingsProductId;
  }


  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }


  public GetFixedDepositAccountsResponse savingsProductName(String savingsProductName) {
    
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FD01", value = "")

  public String getSavingsProductName() {
    return savingsProductName;
  }


  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }


  public GetFixedDepositAccountsResponse status(GetFixedDepositAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetFixedDepositAccountsStatus status) {
    this.status = status;
  }


  public GetFixedDepositAccountsResponse summary(GetFixedDepositAccountsSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsSummary getSummary() {
    return summary;
  }


  public void setSummary(GetFixedDepositAccountsSummary summary) {
    this.summary = summary;
  }


  public GetFixedDepositAccountsResponse timeline(GetFixedDepositAccountsTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetFixedDepositAccountsTimeline timeline) {
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
    GetFixedDepositAccountsResponse getFixedDepositAccountsResponse = (GetFixedDepositAccountsResponse) o;
    return Objects.equals(this.accountNo, getFixedDepositAccountsResponse.accountNo) &&
        Objects.equals(this.clientId, getFixedDepositAccountsResponse.clientId) &&
        Objects.equals(this.clientName, getFixedDepositAccountsResponse.clientName) &&
        Objects.equals(this.currency, getFixedDepositAccountsResponse.currency) &&
        Objects.equals(this.depositAmount, getFixedDepositAccountsResponse.depositAmount) &&
        Objects.equals(this.depositPeriod, getFixedDepositAccountsResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getFixedDepositAccountsResponse.depositPeriodFrequency) &&
        Objects.equals(this.fieldOfficerId, getFixedDepositAccountsResponse.fieldOfficerId) &&
        Objects.equals(this.id, getFixedDepositAccountsResponse.id) &&
        Objects.equals(this.interestCalculationDaysInYearType, getFixedDepositAccountsResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.interestCalculationType, getFixedDepositAccountsResponse.interestCalculationType) &&
        Objects.equals(this.interestCompoundingPeriodType, getFixedDepositAccountsResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestFreePeriodApplicable, getFixedDepositAccountsResponse.interestFreePeriodApplicable) &&
        Objects.equals(this.interestPostingPeriodType, getFixedDepositAccountsResponse.interestPostingPeriodType) &&
        Objects.equals(this.maturityAmount, getFixedDepositAccountsResponse.maturityAmount) &&
        Objects.equals(this.maturityDate, getFixedDepositAccountsResponse.maturityDate) &&
        Objects.equals(this.maxDepositTerm, getFixedDepositAccountsResponse.maxDepositTerm) &&
        Objects.equals(this.maxDepositTermType, getFixedDepositAccountsResponse.maxDepositTermType) &&
        Objects.equals(this.minDepositTerm, getFixedDepositAccountsResponse.minDepositTerm) &&
        Objects.equals(this.minDepositTermType, getFixedDepositAccountsResponse.minDepositTermType) &&
        Objects.equals(this.preClosurePenalApplicable, getFixedDepositAccountsResponse.preClosurePenalApplicable) &&
        Objects.equals(this.savingsProductId, getFixedDepositAccountsResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getFixedDepositAccountsResponse.savingsProductName) &&
        Objects.equals(this.status, getFixedDepositAccountsResponse.status) &&
        Objects.equals(this.summary, getFixedDepositAccountsResponse.summary) &&
        Objects.equals(this.timeline, getFixedDepositAccountsResponse.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, clientId, clientName, currency, depositAmount, depositPeriod, depositPeriodFrequency, fieldOfficerId, id, interestCalculationDaysInYearType, interestCalculationType, interestCompoundingPeriodType, interestFreePeriodApplicable, interestPostingPeriodType, maturityAmount, maturityDate, maxDepositTerm, maxDepositTermType, minDepositTerm, minDepositTermType, preClosurePenalApplicable, savingsProductId, savingsProductName, status, summary, timeline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositAccountsResponse {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestFreePeriodApplicable: ").append(toIndentedString(interestFreePeriodApplicable)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
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

