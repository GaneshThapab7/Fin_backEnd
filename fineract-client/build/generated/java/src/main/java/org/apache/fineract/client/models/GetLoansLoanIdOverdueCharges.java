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
import org.apache.fineract.client.models.GetLoanChargeTemplateChargeAppliesTo;
import org.apache.fineract.client.models.GetLoanCurrency;
import org.apache.fineract.client.models.GetLoansLoanIdChargeCalculationType;
import org.apache.fineract.client.models.GetLoansLoanIdChargePaymentMode;
import org.apache.fineract.client.models.GetLoansLoanIdChargeTimeType;
import org.apache.fineract.client.models.GetLoansLoanIdFeeFrequency;

/**
 * GetLoansLoanIdOverdueCharges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetLoansLoanIdOverdueCharges {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_CHARGE_APPLIES_TO = "chargeAppliesTo";
  @SerializedName(SERIALIZED_NAME_CHARGE_APPLIES_TO)
  private GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetLoansLoanIdChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_CHARGE_PAYMENT_MODE = "chargePaymentMode";
  @SerializedName(SERIALIZED_NAME_CHARGE_PAYMENT_MODE)
  private GetLoansLoanIdChargePaymentMode chargePaymentMode;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetLoansLoanIdChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetLoanCurrency currency;

  public static final String SERIALIZED_NAME_FEE_FREQUENCY = "feeFrequency";
  @SerializedName(SERIALIZED_NAME_FEE_FREQUENCY)
  private GetLoansLoanIdFeeFrequency feeFrequency;

  public static final String SERIALIZED_NAME_FEE_INTERVAL = "feeInterval";
  @SerializedName(SERIALIZED_NAME_FEE_INTERVAL)
  private Integer feeInterval;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public GetLoansLoanIdOverdueCharges() { 
  }

  public GetLoansLoanIdOverdueCharges active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetLoansLoanIdOverdueCharges amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.0", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetLoansLoanIdOverdueCharges chargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    
    this.chargeAppliesTo = chargeAppliesTo;
    return this;
  }

   /**
   * Get chargeAppliesTo
   * @return chargeAppliesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanChargeTemplateChargeAppliesTo getChargeAppliesTo() {
    return chargeAppliesTo;
  }


  public void setChargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
  }


  public GetLoansLoanIdOverdueCharges chargeCalculationType(GetLoansLoanIdChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetLoansLoanIdChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetLoansLoanIdOverdueCharges chargePaymentMode(GetLoansLoanIdChargePaymentMode chargePaymentMode) {
    
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdChargePaymentMode getChargePaymentMode() {
    return chargePaymentMode;
  }


  public void setChargePaymentMode(GetLoansLoanIdChargePaymentMode chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }


  public GetLoansLoanIdOverdueCharges chargeTimeType(GetLoansLoanIdChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetLoansLoanIdChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetLoansLoanIdOverdueCharges currency(GetLoanCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetLoanCurrency currency) {
    this.currency = currency;
  }


  public GetLoansLoanIdOverdueCharges feeFrequency(GetLoansLoanIdFeeFrequency feeFrequency) {
    
    this.feeFrequency = feeFrequency;
    return this;
  }

   /**
   * Get feeFrequency
   * @return feeFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdFeeFrequency getFeeFrequency() {
    return feeFrequency;
  }


  public void setFeeFrequency(GetLoansLoanIdFeeFrequency feeFrequency) {
    this.feeFrequency = feeFrequency;
  }


  public GetLoansLoanIdOverdueCharges feeInterval(Integer feeInterval) {
    
    this.feeInterval = feeInterval;
    return this;
  }

   /**
   * Get feeInterval
   * @return feeInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getFeeInterval() {
    return feeInterval;
  }


  public void setFeeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
  }


  public GetLoansLoanIdOverdueCharges id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetLoansLoanIdOverdueCharges name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "overdraft penality", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetLoansLoanIdOverdueCharges penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPenalty() {
    return penalty;
  }


  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdOverdueCharges getLoansLoanIdOverdueCharges = (GetLoansLoanIdOverdueCharges) o;
    return Objects.equals(this.active, getLoansLoanIdOverdueCharges.active) &&
        Objects.equals(this.amount, getLoansLoanIdOverdueCharges.amount) &&
        Objects.equals(this.chargeAppliesTo, getLoansLoanIdOverdueCharges.chargeAppliesTo) &&
        Objects.equals(this.chargeCalculationType, getLoansLoanIdOverdueCharges.chargeCalculationType) &&
        Objects.equals(this.chargePaymentMode, getLoansLoanIdOverdueCharges.chargePaymentMode) &&
        Objects.equals(this.chargeTimeType, getLoansLoanIdOverdueCharges.chargeTimeType) &&
        Objects.equals(this.currency, getLoansLoanIdOverdueCharges.currency) &&
        Objects.equals(this.feeFrequency, getLoansLoanIdOverdueCharges.feeFrequency) &&
        Objects.equals(this.feeInterval, getLoansLoanIdOverdueCharges.feeInterval) &&
        Objects.equals(this.id, getLoansLoanIdOverdueCharges.id) &&
        Objects.equals(this.name, getLoansLoanIdOverdueCharges.name) &&
        Objects.equals(this.penalty, getLoansLoanIdOverdueCharges.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, amount, chargeAppliesTo, chargeCalculationType, chargePaymentMode, chargeTimeType, currency, feeFrequency, feeInterval, id, name, penalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdOverdueCharges {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    feeFrequency: ").append(toIndentedString(feeFrequency)).append("\n");
    sb.append("    feeInterval: ").append(toIndentedString(feeInterval)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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

