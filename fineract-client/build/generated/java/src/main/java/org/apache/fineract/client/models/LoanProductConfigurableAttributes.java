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
import org.apache.fineract.client.models.LoanProduct;

/**
 * LoanProductConfigurableAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LoanProductConfigurableAttributes {
  public static final String SERIALIZED_NAME_AMORTIZATION_BOOLEAN = "amortizationBoolean";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_BOOLEAN)
  private Boolean amortizationBoolean;

  public static final String SERIALIZED_NAME_AMORTIZATION_TYPE = "amortizationType";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_TYPE)
  private Boolean amortizationType;

  public static final String SERIALIZED_NAME_ARREARS_TOLERANCE_BOOLEAN = "arrearsToleranceBoolean";
  @SerializedName(SERIALIZED_NAME_ARREARS_TOLERANCE_BOOLEAN)
  private Boolean arrearsToleranceBoolean;

  public static final String SERIALIZED_NAME_GRACE_ON_ARREARS_AGEING = "graceOnArrearsAgeing";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_ARREARS_AGEING)
  private Boolean graceOnArrearsAgeing;

  public static final String SERIALIZED_NAME_GRACE_ON_ARREARS_AGING_BOOLEAN = "graceOnArrearsAgingBoolean";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_ARREARS_AGING_BOOLEAN)
  private Boolean graceOnArrearsAgingBoolean;

  public static final String SERIALIZED_NAME_GRACE_ON_PRINCIPAL_AND_INTEREST_PAYMENT = "graceOnPrincipalAndInterestPayment";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_PRINCIPAL_AND_INTEREST_PAYMENT)
  private Boolean graceOnPrincipalAndInterestPayment;

  public static final String SERIALIZED_NAME_GRACE_ON_PRINCIPAL_AND_INTEREST_PAYMENT_BOOLEAN = "graceOnPrincipalAndInterestPaymentBoolean";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_PRINCIPAL_AND_INTEREST_PAYMENT_BOOLEAN)
  private Boolean graceOnPrincipalAndInterestPaymentBoolean;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IN_ARREARS_TOLERANCE = "inArrearsTolerance";
  @SerializedName(SERIALIZED_NAME_IN_ARREARS_TOLERANCE)
  private Boolean inArrearsTolerance;

  public static final String SERIALIZED_NAME_INTEREST_CALC_PERIOD_BOOLEAN = "interestCalcPeriodBoolean";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALC_PERIOD_BOOLEAN)
  private Boolean interestCalcPeriodBoolean;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE = "interestCalculationPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE)
  private Boolean interestCalculationPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_METHOD_BOOLEAN = "interestMethodBoolean";
  @SerializedName(SERIALIZED_NAME_INTEREST_METHOD_BOOLEAN)
  private Boolean interestMethodBoolean;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private Boolean interestType;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT = "loanProduct";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT)
  private LoanProduct loanProduct;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY = "repaymentEvery";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY)
  private Boolean repaymentEvery;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY_BOOLEAN = "repaymentEveryBoolean";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY_BOOLEAN)
  private Boolean repaymentEveryBoolean;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_BOOLEAN = "transactionProcessingStrategyBoolean";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_BOOLEAN)
  private Boolean transactionProcessingStrategyBoolean;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID = "transactionProcessingStrategyId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID)
  private Boolean transactionProcessingStrategyId;

  public LoanProductConfigurableAttributes() { 
  }

  public LoanProductConfigurableAttributes amortizationBoolean(Boolean amortizationBoolean) {
    
    this.amortizationBoolean = amortizationBoolean;
    return this;
  }

   /**
   * Get amortizationBoolean
   * @return amortizationBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAmortizationBoolean() {
    return amortizationBoolean;
  }


  public void setAmortizationBoolean(Boolean amortizationBoolean) {
    this.amortizationBoolean = amortizationBoolean;
  }


  public LoanProductConfigurableAttributes amortizationType(Boolean amortizationType) {
    
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAmortizationType() {
    return amortizationType;
  }


  public void setAmortizationType(Boolean amortizationType) {
    this.amortizationType = amortizationType;
  }


  public LoanProductConfigurableAttributes arrearsToleranceBoolean(Boolean arrearsToleranceBoolean) {
    
    this.arrearsToleranceBoolean = arrearsToleranceBoolean;
    return this;
  }

   /**
   * Get arrearsToleranceBoolean
   * @return arrearsToleranceBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArrearsToleranceBoolean() {
    return arrearsToleranceBoolean;
  }


  public void setArrearsToleranceBoolean(Boolean arrearsToleranceBoolean) {
    this.arrearsToleranceBoolean = arrearsToleranceBoolean;
  }


  public LoanProductConfigurableAttributes graceOnArrearsAgeing(Boolean graceOnArrearsAgeing) {
    
    this.graceOnArrearsAgeing = graceOnArrearsAgeing;
    return this;
  }

   /**
   * Get graceOnArrearsAgeing
   * @return graceOnArrearsAgeing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGraceOnArrearsAgeing() {
    return graceOnArrearsAgeing;
  }


  public void setGraceOnArrearsAgeing(Boolean graceOnArrearsAgeing) {
    this.graceOnArrearsAgeing = graceOnArrearsAgeing;
  }


  public LoanProductConfigurableAttributes graceOnArrearsAgingBoolean(Boolean graceOnArrearsAgingBoolean) {
    
    this.graceOnArrearsAgingBoolean = graceOnArrearsAgingBoolean;
    return this;
  }

   /**
   * Get graceOnArrearsAgingBoolean
   * @return graceOnArrearsAgingBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGraceOnArrearsAgingBoolean() {
    return graceOnArrearsAgingBoolean;
  }


  public void setGraceOnArrearsAgingBoolean(Boolean graceOnArrearsAgingBoolean) {
    this.graceOnArrearsAgingBoolean = graceOnArrearsAgingBoolean;
  }


  public LoanProductConfigurableAttributes graceOnPrincipalAndInterestPayment(Boolean graceOnPrincipalAndInterestPayment) {
    
    this.graceOnPrincipalAndInterestPayment = graceOnPrincipalAndInterestPayment;
    return this;
  }

   /**
   * Get graceOnPrincipalAndInterestPayment
   * @return graceOnPrincipalAndInterestPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGraceOnPrincipalAndInterestPayment() {
    return graceOnPrincipalAndInterestPayment;
  }


  public void setGraceOnPrincipalAndInterestPayment(Boolean graceOnPrincipalAndInterestPayment) {
    this.graceOnPrincipalAndInterestPayment = graceOnPrincipalAndInterestPayment;
  }


  public LoanProductConfigurableAttributes graceOnPrincipalAndInterestPaymentBoolean(Boolean graceOnPrincipalAndInterestPaymentBoolean) {
    
    this.graceOnPrincipalAndInterestPaymentBoolean = graceOnPrincipalAndInterestPaymentBoolean;
    return this;
  }

   /**
   * Get graceOnPrincipalAndInterestPaymentBoolean
   * @return graceOnPrincipalAndInterestPaymentBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGraceOnPrincipalAndInterestPaymentBoolean() {
    return graceOnPrincipalAndInterestPaymentBoolean;
  }


  public void setGraceOnPrincipalAndInterestPaymentBoolean(Boolean graceOnPrincipalAndInterestPaymentBoolean) {
    this.graceOnPrincipalAndInterestPaymentBoolean = graceOnPrincipalAndInterestPaymentBoolean;
  }


  public LoanProductConfigurableAttributes id(Long id) {
    
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


  public LoanProductConfigurableAttributes inArrearsTolerance(Boolean inArrearsTolerance) {
    
    this.inArrearsTolerance = inArrearsTolerance;
    return this;
  }

   /**
   * Get inArrearsTolerance
   * @return inArrearsTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInArrearsTolerance() {
    return inArrearsTolerance;
  }


  public void setInArrearsTolerance(Boolean inArrearsTolerance) {
    this.inArrearsTolerance = inArrearsTolerance;
  }


  public LoanProductConfigurableAttributes interestCalcPeriodBoolean(Boolean interestCalcPeriodBoolean) {
    
    this.interestCalcPeriodBoolean = interestCalcPeriodBoolean;
    return this;
  }

   /**
   * Get interestCalcPeriodBoolean
   * @return interestCalcPeriodBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInterestCalcPeriodBoolean() {
    return interestCalcPeriodBoolean;
  }


  public void setInterestCalcPeriodBoolean(Boolean interestCalcPeriodBoolean) {
    this.interestCalcPeriodBoolean = interestCalcPeriodBoolean;
  }


  public LoanProductConfigurableAttributes interestCalculationPeriodType(Boolean interestCalculationPeriodType) {
    
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }


  public void setInterestCalculationPeriodType(Boolean interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }


  public LoanProductConfigurableAttributes interestMethodBoolean(Boolean interestMethodBoolean) {
    
    this.interestMethodBoolean = interestMethodBoolean;
    return this;
  }

   /**
   * Get interestMethodBoolean
   * @return interestMethodBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInterestMethodBoolean() {
    return interestMethodBoolean;
  }


  public void setInterestMethodBoolean(Boolean interestMethodBoolean) {
    this.interestMethodBoolean = interestMethodBoolean;
  }


  public LoanProductConfigurableAttributes interestType(Boolean interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInterestType() {
    return interestType;
  }


  public void setInterestType(Boolean interestType) {
    this.interestType = interestType;
  }


  public LoanProductConfigurableAttributes loanProduct(LoanProduct loanProduct) {
    
    this.loanProduct = loanProduct;
    return this;
  }

   /**
   * Get loanProduct
   * @return loanProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoanProduct getLoanProduct() {
    return loanProduct;
  }


  public void setLoanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
  }


  public LoanProductConfigurableAttributes _new(Boolean _new) {
    
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


  public LoanProductConfigurableAttributes repaymentEvery(Boolean repaymentEvery) {
    
    this.repaymentEvery = repaymentEvery;
    return this;
  }

   /**
   * Get repaymentEvery
   * @return repaymentEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRepaymentEvery() {
    return repaymentEvery;
  }


  public void setRepaymentEvery(Boolean repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
  }


  public LoanProductConfigurableAttributes repaymentEveryBoolean(Boolean repaymentEveryBoolean) {
    
    this.repaymentEveryBoolean = repaymentEveryBoolean;
    return this;
  }

   /**
   * Get repaymentEveryBoolean
   * @return repaymentEveryBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRepaymentEveryBoolean() {
    return repaymentEveryBoolean;
  }


  public void setRepaymentEveryBoolean(Boolean repaymentEveryBoolean) {
    this.repaymentEveryBoolean = repaymentEveryBoolean;
  }


  public LoanProductConfigurableAttributes transactionProcessingStrategyBoolean(Boolean transactionProcessingStrategyBoolean) {
    
    this.transactionProcessingStrategyBoolean = transactionProcessingStrategyBoolean;
    return this;
  }

   /**
   * Get transactionProcessingStrategyBoolean
   * @return transactionProcessingStrategyBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransactionProcessingStrategyBoolean() {
    return transactionProcessingStrategyBoolean;
  }


  public void setTransactionProcessingStrategyBoolean(Boolean transactionProcessingStrategyBoolean) {
    this.transactionProcessingStrategyBoolean = transactionProcessingStrategyBoolean;
  }


  public LoanProductConfigurableAttributes transactionProcessingStrategyId(Boolean transactionProcessingStrategyId) {
    
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    return this;
  }

   /**
   * Get transactionProcessingStrategyId
   * @return transactionProcessingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransactionProcessingStrategyId() {
    return transactionProcessingStrategyId;
  }


  public void setTransactionProcessingStrategyId(Boolean transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductConfigurableAttributes loanProductConfigurableAttributes = (LoanProductConfigurableAttributes) o;
    return Objects.equals(this.amortizationBoolean, loanProductConfigurableAttributes.amortizationBoolean) &&
        Objects.equals(this.amortizationType, loanProductConfigurableAttributes.amortizationType) &&
        Objects.equals(this.arrearsToleranceBoolean, loanProductConfigurableAttributes.arrearsToleranceBoolean) &&
        Objects.equals(this.graceOnArrearsAgeing, loanProductConfigurableAttributes.graceOnArrearsAgeing) &&
        Objects.equals(this.graceOnArrearsAgingBoolean, loanProductConfigurableAttributes.graceOnArrearsAgingBoolean) &&
        Objects.equals(this.graceOnPrincipalAndInterestPayment, loanProductConfigurableAttributes.graceOnPrincipalAndInterestPayment) &&
        Objects.equals(this.graceOnPrincipalAndInterestPaymentBoolean, loanProductConfigurableAttributes.graceOnPrincipalAndInterestPaymentBoolean) &&
        Objects.equals(this.id, loanProductConfigurableAttributes.id) &&
        Objects.equals(this.inArrearsTolerance, loanProductConfigurableAttributes.inArrearsTolerance) &&
        Objects.equals(this.interestCalcPeriodBoolean, loanProductConfigurableAttributes.interestCalcPeriodBoolean) &&
        Objects.equals(this.interestCalculationPeriodType, loanProductConfigurableAttributes.interestCalculationPeriodType) &&
        Objects.equals(this.interestMethodBoolean, loanProductConfigurableAttributes.interestMethodBoolean) &&
        Objects.equals(this.interestType, loanProductConfigurableAttributes.interestType) &&
        Objects.equals(this.loanProduct, loanProductConfigurableAttributes.loanProduct) &&
        Objects.equals(this._new, loanProductConfigurableAttributes._new) &&
        Objects.equals(this.repaymentEvery, loanProductConfigurableAttributes.repaymentEvery) &&
        Objects.equals(this.repaymentEveryBoolean, loanProductConfigurableAttributes.repaymentEveryBoolean) &&
        Objects.equals(this.transactionProcessingStrategyBoolean, loanProductConfigurableAttributes.transactionProcessingStrategyBoolean) &&
        Objects.equals(this.transactionProcessingStrategyId, loanProductConfigurableAttributes.transactionProcessingStrategyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amortizationBoolean, amortizationType, arrearsToleranceBoolean, graceOnArrearsAgeing, graceOnArrearsAgingBoolean, graceOnPrincipalAndInterestPayment, graceOnPrincipalAndInterestPaymentBoolean, id, inArrearsTolerance, interestCalcPeriodBoolean, interestCalculationPeriodType, interestMethodBoolean, interestType, loanProduct, _new, repaymentEvery, repaymentEveryBoolean, transactionProcessingStrategyBoolean, transactionProcessingStrategyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductConfigurableAttributes {\n");
    sb.append("    amortizationBoolean: ").append(toIndentedString(amortizationBoolean)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    arrearsToleranceBoolean: ").append(toIndentedString(arrearsToleranceBoolean)).append("\n");
    sb.append("    graceOnArrearsAgeing: ").append(toIndentedString(graceOnArrearsAgeing)).append("\n");
    sb.append("    graceOnArrearsAgingBoolean: ").append(toIndentedString(graceOnArrearsAgingBoolean)).append("\n");
    sb.append("    graceOnPrincipalAndInterestPayment: ").append(toIndentedString(graceOnPrincipalAndInterestPayment)).append("\n");
    sb.append("    graceOnPrincipalAndInterestPaymentBoolean: ").append(toIndentedString(graceOnPrincipalAndInterestPaymentBoolean)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inArrearsTolerance: ").append(toIndentedString(inArrearsTolerance)).append("\n");
    sb.append("    interestCalcPeriodBoolean: ").append(toIndentedString(interestCalcPeriodBoolean)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    interestMethodBoolean: ").append(toIndentedString(interestMethodBoolean)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    loanProduct: ").append(toIndentedString(loanProduct)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentEveryBoolean: ").append(toIndentedString(repaymentEveryBoolean)).append("\n");
    sb.append("    transactionProcessingStrategyBoolean: ").append(toIndentedString(transactionProcessingStrategyBoolean)).append("\n");
    sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
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

