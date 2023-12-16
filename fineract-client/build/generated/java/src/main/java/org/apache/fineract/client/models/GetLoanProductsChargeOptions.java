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
import org.apache.fineract.client.models.GetLoanChargeCalculationType;
import org.apache.fineract.client.models.GetLoanChargeTimeType;
import org.apache.fineract.client.models.GetLoanProductsChargeAppliesTo;
import org.apache.fineract.client.models.GetLoanProductsCurrencyOptions;
import org.apache.fineract.client.models.GetLoansChargePaymentMode;

/**
 * GetLoanProductsChargeOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetLoanProductsChargeOptions {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CHARGE_APPLIES_TO = "chargeAppliesTo";
  @SerializedName(SERIALIZED_NAME_CHARGE_APPLIES_TO)
  private GetLoanProductsChargeAppliesTo chargeAppliesTo;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetLoanChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_CHARGE_PAYMENT_MODE = "chargePaymentMode";
  @SerializedName(SERIALIZED_NAME_CHARGE_PAYMENT_MODE)
  private GetLoansChargePaymentMode chargePaymentMode;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetLoanChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetLoanProductsCurrencyOptions currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public GetLoanProductsChargeOptions() { 
  }

  public GetLoanProductsChargeOptions active(Boolean active) {
    
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


  public GetLoanProductsChargeOptions amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public GetLoanProductsChargeOptions chargeAppliesTo(GetLoanProductsChargeAppliesTo chargeAppliesTo) {
    
    this.chargeAppliesTo = chargeAppliesTo;
    return this;
  }

   /**
   * Get chargeAppliesTo
   * @return chargeAppliesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsChargeAppliesTo getChargeAppliesTo() {
    return chargeAppliesTo;
  }


  public void setChargeAppliesTo(GetLoanProductsChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
  }


  public GetLoanProductsChargeOptions chargeCalculationType(GetLoanChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetLoanChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetLoanProductsChargeOptions chargePaymentMode(GetLoansChargePaymentMode chargePaymentMode) {
    
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansChargePaymentMode getChargePaymentMode() {
    return chargePaymentMode;
  }


  public void setChargePaymentMode(GetLoansChargePaymentMode chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }


  public GetLoanProductsChargeOptions chargeTimeType(GetLoanChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetLoanChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetLoanProductsChargeOptions currency(GetLoanProductsCurrencyOptions currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsCurrencyOptions getCurrency() {
    return currency;
  }


  public void setCurrency(GetLoanProductsCurrencyOptions currency) {
    this.currency = currency;
  }


  public GetLoanProductsChargeOptions id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetLoanProductsChargeOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "des charges", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetLoanProductsChargeOptions penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

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
    GetLoanProductsChargeOptions getLoanProductsChargeOptions = (GetLoanProductsChargeOptions) o;
    return Objects.equals(this.active, getLoanProductsChargeOptions.active) &&
        Objects.equals(this.amount, getLoanProductsChargeOptions.amount) &&
        Objects.equals(this.chargeAppliesTo, getLoanProductsChargeOptions.chargeAppliesTo) &&
        Objects.equals(this.chargeCalculationType, getLoanProductsChargeOptions.chargeCalculationType) &&
        Objects.equals(this.chargePaymentMode, getLoanProductsChargeOptions.chargePaymentMode) &&
        Objects.equals(this.chargeTimeType, getLoanProductsChargeOptions.chargeTimeType) &&
        Objects.equals(this.currency, getLoanProductsChargeOptions.currency) &&
        Objects.equals(this.id, getLoanProductsChargeOptions.id) &&
        Objects.equals(this.name, getLoanProductsChargeOptions.name) &&
        Objects.equals(this.penalty, getLoanProductsChargeOptions.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, amount, chargeAppliesTo, chargeCalculationType, chargePaymentMode, chargeTimeType, currency, id, name, penalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanProductsChargeOptions {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
