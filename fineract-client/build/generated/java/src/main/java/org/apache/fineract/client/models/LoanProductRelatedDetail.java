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
import org.apache.fineract.client.models.MonetaryCurrency;
import org.apache.fineract.client.models.Money;

/**
 * LoanProductRelatedDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LoanProductRelatedDetail {
  public static final String SERIALIZED_NAME_ALLOW_PARTIAL_PERIOD_INTEREST_CALCUALTION = "allowPartialPeriodInterestCalcualtion";
  @SerializedName(SERIALIZED_NAME_ALLOW_PARTIAL_PERIOD_INTEREST_CALCUALTION)
  private Boolean allowPartialPeriodInterestCalcualtion;

  /**
   * Gets or Sets amortizationMethod
   */
  @JsonAdapter(AmortizationMethodEnum.Adapter.class)
  public enum AmortizationMethodEnum {
    EQUAL_PRINCIPAL("EQUAL_PRINCIPAL"),
    
    EQUAL_INSTALLMENTS("EQUAL_INSTALLMENTS"),
    
    INVALID("INVALID");

    private String value;

    AmortizationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AmortizationMethodEnum fromValue(String value) {
      for (AmortizationMethodEnum b : AmortizationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AmortizationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmortizationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmortizationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmortizationMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AMORTIZATION_METHOD = "amortizationMethod";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_METHOD)
  private AmortizationMethodEnum amortizationMethod;

  public static final String SERIALIZED_NAME_ANNUAL_NOMINAL_INTEREST_RATE = "annualNominalInterestRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_NOMINAL_INTEREST_RATE)
  private BigDecimal annualNominalInterestRate;

  public static final String SERIALIZED_NAME_ARREARS_TOLERANCE = "arrearsTolerance";
  @SerializedName(SERIALIZED_NAME_ARREARS_TOLERANCE)
  private BigDecimal arrearsTolerance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private MonetaryCurrency currency;

  public static final String SERIALIZED_NAME_EQUAL_AMORTIZATION = "equalAmortization";
  @SerializedName(SERIALIZED_NAME_EQUAL_AMORTIZATION)
  private Boolean equalAmortization;

  public static final String SERIALIZED_NAME_GRACE_ON_ARREARS_AGEING = "graceOnArrearsAgeing";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_ARREARS_AGEING)
  private Integer graceOnArrearsAgeing;

  public static final String SERIALIZED_NAME_GRACE_ON_DUE_DATE = "graceOnDueDate";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_DUE_DATE)
  private Integer graceOnDueDate;

  public static final String SERIALIZED_NAME_GRACE_ON_INTEREST_PAYMENT = "graceOnInterestPayment";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_INTEREST_PAYMENT)
  private Integer graceOnInterestPayment;

  public static final String SERIALIZED_NAME_GRACE_ON_PRINCIPAL_PAYMENT = "graceOnPrincipalPayment";
  @SerializedName(SERIALIZED_NAME_GRACE_ON_PRINCIPAL_PAYMENT)
  private Integer graceOnPrincipalPayment;

  public static final String SERIALIZED_NAME_IN_ARREARS_TOLERANCE = "inArrearsTolerance";
  @SerializedName(SERIALIZED_NAME_IN_ARREARS_TOLERANCE)
  private Money inArrearsTolerance;

  /**
   * Gets or Sets interestCalculationPeriodMethod
   */
  @JsonAdapter(InterestCalculationPeriodMethodEnum.Adapter.class)
  public enum InterestCalculationPeriodMethodEnum {
    DAILY("DAILY"),
    
    SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),
    
    INVALID("INVALID");

    private String value;

    InterestCalculationPeriodMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterestCalculationPeriodMethodEnum fromValue(String value) {
      for (InterestCalculationPeriodMethodEnum b : InterestCalculationPeriodMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InterestCalculationPeriodMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterestCalculationPeriodMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterestCalculationPeriodMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InterestCalculationPeriodMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_METHOD = "interestCalculationPeriodMethod";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_METHOD)
  private InterestCalculationPeriodMethodEnum interestCalculationPeriodMethod;

  /**
   * Gets or Sets interestMethod
   */
  @JsonAdapter(InterestMethodEnum.Adapter.class)
  public enum InterestMethodEnum {
    DECLINING_BALANCE("DECLINING_BALANCE"),
    
    FLAT("FLAT"),
    
    INVALID("INVALID");

    private String value;

    InterestMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterestMethodEnum fromValue(String value) {
      for (InterestMethodEnum b : InterestMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InterestMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterestMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterestMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InterestMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTEREST_METHOD = "interestMethod";
  @SerializedName(SERIALIZED_NAME_INTEREST_METHOD)
  private InterestMethodEnum interestMethod;

  /**
   * Gets or Sets interestPeriodFrequencyType
   */
  @JsonAdapter(InterestPeriodFrequencyTypeEnum.Adapter.class)
  public enum InterestPeriodFrequencyTypeEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS"),
    
    WHOLE_TERM("WHOLE_TERM"),
    
    INVALID("INVALID");

    private String value;

    InterestPeriodFrequencyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterestPeriodFrequencyTypeEnum fromValue(String value) {
      for (InterestPeriodFrequencyTypeEnum b : InterestPeriodFrequencyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InterestPeriodFrequencyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterestPeriodFrequencyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterestPeriodFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InterestPeriodFrequencyTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTEREST_PERIOD_FREQUENCY_TYPE = "interestPeriodFrequencyType";
  @SerializedName(SERIALIZED_NAME_INTEREST_PERIOD_FREQUENCY_TYPE)
  private InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType;

  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_ENABLED = "interestRecalculationEnabled";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_ENABLED)
  private Boolean interestRecalculationEnabled;

  public static final String SERIALIZED_NAME_NOMINAL_INTEREST_RATE_PER_PERIOD = "nominalInterestRatePerPeriod";
  @SerializedName(SERIALIZED_NAME_NOMINAL_INTEREST_RATE_PER_PERIOD)
  private BigDecimal nominalInterestRatePerPeriod;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "numberOfRepayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Money principal;

  public static final String SERIALIZED_NAME_REPAY_EVERY = "repayEvery";
  @SerializedName(SERIALIZED_NAME_REPAY_EVERY)
  private Integer repayEvery;

  /**
   * Gets or Sets repaymentPeriodFrequencyType
   */
  @JsonAdapter(RepaymentPeriodFrequencyTypeEnum.Adapter.class)
  public enum RepaymentPeriodFrequencyTypeEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS"),
    
    WHOLE_TERM("WHOLE_TERM"),
    
    INVALID("INVALID");

    private String value;

    RepaymentPeriodFrequencyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepaymentPeriodFrequencyTypeEnum fromValue(String value) {
      for (RepaymentPeriodFrequencyTypeEnum b : RepaymentPeriodFrequencyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepaymentPeriodFrequencyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepaymentPeriodFrequencyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepaymentPeriodFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepaymentPeriodFrequencyTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPAYMENT_PERIOD_FREQUENCY_TYPE = "repaymentPeriodFrequencyType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_PERIOD_FREQUENCY_TYPE)
  private RepaymentPeriodFrequencyTypeEnum repaymentPeriodFrequencyType;

  public LoanProductRelatedDetail() { 
  }

  public LoanProductRelatedDetail allowPartialPeriodInterestCalcualtion(Boolean allowPartialPeriodInterestCalcualtion) {
    
    this.allowPartialPeriodInterestCalcualtion = allowPartialPeriodInterestCalcualtion;
    return this;
  }

   /**
   * Get allowPartialPeriodInterestCalcualtion
   * @return allowPartialPeriodInterestCalcualtion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowPartialPeriodInterestCalcualtion() {
    return allowPartialPeriodInterestCalcualtion;
  }


  public void setAllowPartialPeriodInterestCalcualtion(Boolean allowPartialPeriodInterestCalcualtion) {
    this.allowPartialPeriodInterestCalcualtion = allowPartialPeriodInterestCalcualtion;
  }


  public LoanProductRelatedDetail amortizationMethod(AmortizationMethodEnum amortizationMethod) {
    
    this.amortizationMethod = amortizationMethod;
    return this;
  }

   /**
   * Get amortizationMethod
   * @return amortizationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AmortizationMethodEnum getAmortizationMethod() {
    return amortizationMethod;
  }


  public void setAmortizationMethod(AmortizationMethodEnum amortizationMethod) {
    this.amortizationMethod = amortizationMethod;
  }


  public LoanProductRelatedDetail annualNominalInterestRate(BigDecimal annualNominalInterestRate) {
    
    this.annualNominalInterestRate = annualNominalInterestRate;
    return this;
  }

   /**
   * Get annualNominalInterestRate
   * @return annualNominalInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAnnualNominalInterestRate() {
    return annualNominalInterestRate;
  }


  public void setAnnualNominalInterestRate(BigDecimal annualNominalInterestRate) {
    this.annualNominalInterestRate = annualNominalInterestRate;
  }


  public LoanProductRelatedDetail arrearsTolerance(BigDecimal arrearsTolerance) {
    
    this.arrearsTolerance = arrearsTolerance;
    return this;
  }

   /**
   * Get arrearsTolerance
   * @return arrearsTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getArrearsTolerance() {
    return arrearsTolerance;
  }


  public void setArrearsTolerance(BigDecimal arrearsTolerance) {
    this.arrearsTolerance = arrearsTolerance;
  }


  public LoanProductRelatedDetail currency(MonetaryCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MonetaryCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(MonetaryCurrency currency) {
    this.currency = currency;
  }


  public LoanProductRelatedDetail equalAmortization(Boolean equalAmortization) {
    
    this.equalAmortization = equalAmortization;
    return this;
  }

   /**
   * Get equalAmortization
   * @return equalAmortization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEqualAmortization() {
    return equalAmortization;
  }


  public void setEqualAmortization(Boolean equalAmortization) {
    this.equalAmortization = equalAmortization;
  }


  public LoanProductRelatedDetail graceOnArrearsAgeing(Integer graceOnArrearsAgeing) {
    
    this.graceOnArrearsAgeing = graceOnArrearsAgeing;
    return this;
  }

   /**
   * Get graceOnArrearsAgeing
   * @return graceOnArrearsAgeing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGraceOnArrearsAgeing() {
    return graceOnArrearsAgeing;
  }


  public void setGraceOnArrearsAgeing(Integer graceOnArrearsAgeing) {
    this.graceOnArrearsAgeing = graceOnArrearsAgeing;
  }


  public LoanProductRelatedDetail graceOnDueDate(Integer graceOnDueDate) {
    
    this.graceOnDueDate = graceOnDueDate;
    return this;
  }

   /**
   * Get graceOnDueDate
   * @return graceOnDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGraceOnDueDate() {
    return graceOnDueDate;
  }


  public void setGraceOnDueDate(Integer graceOnDueDate) {
    this.graceOnDueDate = graceOnDueDate;
  }


  public LoanProductRelatedDetail graceOnInterestPayment(Integer graceOnInterestPayment) {
    
    this.graceOnInterestPayment = graceOnInterestPayment;
    return this;
  }

   /**
   * Get graceOnInterestPayment
   * @return graceOnInterestPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGraceOnInterestPayment() {
    return graceOnInterestPayment;
  }


  public void setGraceOnInterestPayment(Integer graceOnInterestPayment) {
    this.graceOnInterestPayment = graceOnInterestPayment;
  }


  public LoanProductRelatedDetail graceOnPrincipalPayment(Integer graceOnPrincipalPayment) {
    
    this.graceOnPrincipalPayment = graceOnPrincipalPayment;
    return this;
  }

   /**
   * Get graceOnPrincipalPayment
   * @return graceOnPrincipalPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGraceOnPrincipalPayment() {
    return graceOnPrincipalPayment;
  }


  public void setGraceOnPrincipalPayment(Integer graceOnPrincipalPayment) {
    this.graceOnPrincipalPayment = graceOnPrincipalPayment;
  }


  public LoanProductRelatedDetail inArrearsTolerance(Money inArrearsTolerance) {
    
    this.inArrearsTolerance = inArrearsTolerance;
    return this;
  }

   /**
   * Get inArrearsTolerance
   * @return inArrearsTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getInArrearsTolerance() {
    return inArrearsTolerance;
  }


  public void setInArrearsTolerance(Money inArrearsTolerance) {
    this.inArrearsTolerance = inArrearsTolerance;
  }


  public LoanProductRelatedDetail interestCalculationPeriodMethod(InterestCalculationPeriodMethodEnum interestCalculationPeriodMethod) {
    
    this.interestCalculationPeriodMethod = interestCalculationPeriodMethod;
    return this;
  }

   /**
   * Get interestCalculationPeriodMethod
   * @return interestCalculationPeriodMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InterestCalculationPeriodMethodEnum getInterestCalculationPeriodMethod() {
    return interestCalculationPeriodMethod;
  }


  public void setInterestCalculationPeriodMethod(InterestCalculationPeriodMethodEnum interestCalculationPeriodMethod) {
    this.interestCalculationPeriodMethod = interestCalculationPeriodMethod;
  }


  public LoanProductRelatedDetail interestMethod(InterestMethodEnum interestMethod) {
    
    this.interestMethod = interestMethod;
    return this;
  }

   /**
   * Get interestMethod
   * @return interestMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InterestMethodEnum getInterestMethod() {
    return interestMethod;
  }


  public void setInterestMethod(InterestMethodEnum interestMethod) {
    this.interestMethod = interestMethod;
  }


  public LoanProductRelatedDetail interestPeriodFrequencyType(InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType) {
    
    this.interestPeriodFrequencyType = interestPeriodFrequencyType;
    return this;
  }

   /**
   * Get interestPeriodFrequencyType
   * @return interestPeriodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InterestPeriodFrequencyTypeEnum getInterestPeriodFrequencyType() {
    return interestPeriodFrequencyType;
  }


  public void setInterestPeriodFrequencyType(InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType) {
    this.interestPeriodFrequencyType = interestPeriodFrequencyType;
  }


  public LoanProductRelatedDetail interestRecalculationEnabled(Boolean interestRecalculationEnabled) {
    
    this.interestRecalculationEnabled = interestRecalculationEnabled;
    return this;
  }

   /**
   * Get interestRecalculationEnabled
   * @return interestRecalculationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInterestRecalculationEnabled() {
    return interestRecalculationEnabled;
  }


  public void setInterestRecalculationEnabled(Boolean interestRecalculationEnabled) {
    this.interestRecalculationEnabled = interestRecalculationEnabled;
  }


  public LoanProductRelatedDetail nominalInterestRatePerPeriod(BigDecimal nominalInterestRatePerPeriod) {
    
    this.nominalInterestRatePerPeriod = nominalInterestRatePerPeriod;
    return this;
  }

   /**
   * Get nominalInterestRatePerPeriod
   * @return nominalInterestRatePerPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNominalInterestRatePerPeriod() {
    return nominalInterestRatePerPeriod;
  }


  public void setNominalInterestRatePerPeriod(BigDecimal nominalInterestRatePerPeriod) {
    this.nominalInterestRatePerPeriod = nominalInterestRatePerPeriod;
  }


  public LoanProductRelatedDetail numberOfRepayments(Integer numberOfRepayments) {
    
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }


  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }


  public LoanProductRelatedDetail principal(Money principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPrincipal() {
    return principal;
  }


  public void setPrincipal(Money principal) {
    this.principal = principal;
  }


  public LoanProductRelatedDetail repayEvery(Integer repayEvery) {
    
    this.repayEvery = repayEvery;
    return this;
  }

   /**
   * Get repayEvery
   * @return repayEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRepayEvery() {
    return repayEvery;
  }


  public void setRepayEvery(Integer repayEvery) {
    this.repayEvery = repayEvery;
  }


  public LoanProductRelatedDetail repaymentPeriodFrequencyType(RepaymentPeriodFrequencyTypeEnum repaymentPeriodFrequencyType) {
    
    this.repaymentPeriodFrequencyType = repaymentPeriodFrequencyType;
    return this;
  }

   /**
   * Get repaymentPeriodFrequencyType
   * @return repaymentPeriodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RepaymentPeriodFrequencyTypeEnum getRepaymentPeriodFrequencyType() {
    return repaymentPeriodFrequencyType;
  }


  public void setRepaymentPeriodFrequencyType(RepaymentPeriodFrequencyTypeEnum repaymentPeriodFrequencyType) {
    this.repaymentPeriodFrequencyType = repaymentPeriodFrequencyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductRelatedDetail loanProductRelatedDetail = (LoanProductRelatedDetail) o;
    return Objects.equals(this.allowPartialPeriodInterestCalcualtion, loanProductRelatedDetail.allowPartialPeriodInterestCalcualtion) &&
        Objects.equals(this.amortizationMethod, loanProductRelatedDetail.amortizationMethod) &&
        Objects.equals(this.annualNominalInterestRate, loanProductRelatedDetail.annualNominalInterestRate) &&
        Objects.equals(this.arrearsTolerance, loanProductRelatedDetail.arrearsTolerance) &&
        Objects.equals(this.currency, loanProductRelatedDetail.currency) &&
        Objects.equals(this.equalAmortization, loanProductRelatedDetail.equalAmortization) &&
        Objects.equals(this.graceOnArrearsAgeing, loanProductRelatedDetail.graceOnArrearsAgeing) &&
        Objects.equals(this.graceOnDueDate, loanProductRelatedDetail.graceOnDueDate) &&
        Objects.equals(this.graceOnInterestPayment, loanProductRelatedDetail.graceOnInterestPayment) &&
        Objects.equals(this.graceOnPrincipalPayment, loanProductRelatedDetail.graceOnPrincipalPayment) &&
        Objects.equals(this.inArrearsTolerance, loanProductRelatedDetail.inArrearsTolerance) &&
        Objects.equals(this.interestCalculationPeriodMethod, loanProductRelatedDetail.interestCalculationPeriodMethod) &&
        Objects.equals(this.interestMethod, loanProductRelatedDetail.interestMethod) &&
        Objects.equals(this.interestPeriodFrequencyType, loanProductRelatedDetail.interestPeriodFrequencyType) &&
        Objects.equals(this.interestRecalculationEnabled, loanProductRelatedDetail.interestRecalculationEnabled) &&
        Objects.equals(this.nominalInterestRatePerPeriod, loanProductRelatedDetail.nominalInterestRatePerPeriod) &&
        Objects.equals(this.numberOfRepayments, loanProductRelatedDetail.numberOfRepayments) &&
        Objects.equals(this.principal, loanProductRelatedDetail.principal) &&
        Objects.equals(this.repayEvery, loanProductRelatedDetail.repayEvery) &&
        Objects.equals(this.repaymentPeriodFrequencyType, loanProductRelatedDetail.repaymentPeriodFrequencyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPartialPeriodInterestCalcualtion, amortizationMethod, annualNominalInterestRate, arrearsTolerance, currency, equalAmortization, graceOnArrearsAgeing, graceOnDueDate, graceOnInterestPayment, graceOnPrincipalPayment, inArrearsTolerance, interestCalculationPeriodMethod, interestMethod, interestPeriodFrequencyType, interestRecalculationEnabled, nominalInterestRatePerPeriod, numberOfRepayments, principal, repayEvery, repaymentPeriodFrequencyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductRelatedDetail {\n");
    sb.append("    allowPartialPeriodInterestCalcualtion: ").append(toIndentedString(allowPartialPeriodInterestCalcualtion)).append("\n");
    sb.append("    amortizationMethod: ").append(toIndentedString(amortizationMethod)).append("\n");
    sb.append("    annualNominalInterestRate: ").append(toIndentedString(annualNominalInterestRate)).append("\n");
    sb.append("    arrearsTolerance: ").append(toIndentedString(arrearsTolerance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    equalAmortization: ").append(toIndentedString(equalAmortization)).append("\n");
    sb.append("    graceOnArrearsAgeing: ").append(toIndentedString(graceOnArrearsAgeing)).append("\n");
    sb.append("    graceOnDueDate: ").append(toIndentedString(graceOnDueDate)).append("\n");
    sb.append("    graceOnInterestPayment: ").append(toIndentedString(graceOnInterestPayment)).append("\n");
    sb.append("    graceOnPrincipalPayment: ").append(toIndentedString(graceOnPrincipalPayment)).append("\n");
    sb.append("    inArrearsTolerance: ").append(toIndentedString(inArrearsTolerance)).append("\n");
    sb.append("    interestCalculationPeriodMethod: ").append(toIndentedString(interestCalculationPeriodMethod)).append("\n");
    sb.append("    interestMethod: ").append(toIndentedString(interestMethod)).append("\n");
    sb.append("    interestPeriodFrequencyType: ").append(toIndentedString(interestPeriodFrequencyType)).append("\n");
    sb.append("    interestRecalculationEnabled: ").append(toIndentedString(interestRecalculationEnabled)).append("\n");
    sb.append("    nominalInterestRatePerPeriod: ").append(toIndentedString(nominalInterestRatePerPeriod)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    repayEvery: ").append(toIndentedString(repayEvery)).append("\n");
    sb.append("    repaymentPeriodFrequencyType: ").append(toIndentedString(repaymentPeriodFrequencyType)).append("\n");
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
