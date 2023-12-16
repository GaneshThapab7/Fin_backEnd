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
import org.apache.fineract.client.models.GetChargesAppliesTo;
import org.apache.fineract.client.models.GetChargesChargeCalculationType;
import org.apache.fineract.client.models.GetChargesCurrencyResponse;
import org.apache.fineract.client.models.GetSavingsChargesChargeTimeType;

/**
 * GetSavingsChargesOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSavingsChargesOptions {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetChargesChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetSavingsChargesChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_CHARGES_APPLIES_TO = "chargesAppliesTo";
  @SerializedName(SERIALIZED_NAME_CHARGES_APPLIES_TO)
  private GetChargesAppliesTo chargesAppliesTo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetChargesCurrencyResponse currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public GetSavingsChargesOptions() { 
  }

  public GetSavingsChargesOptions active(Boolean active) {
    
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


  public GetSavingsChargesOptions amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetSavingsChargesOptions chargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetSavingsChargesOptions chargeTimeType(GetSavingsChargesChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsChargesChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetSavingsChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetSavingsChargesOptions chargesAppliesTo(GetChargesAppliesTo chargesAppliesTo) {
    
    this.chargesAppliesTo = chargesAppliesTo;
    return this;
  }

   /**
   * Get chargesAppliesTo
   * @return chargesAppliesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesAppliesTo getChargesAppliesTo() {
    return chargesAppliesTo;
  }


  public void setChargesAppliesTo(GetChargesAppliesTo chargesAppliesTo) {
    this.chargesAppliesTo = chargesAppliesTo;
  }


  public GetSavingsChargesOptions currency(GetChargesCurrencyResponse currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesCurrencyResponse getCurrency() {
    return currency;
  }


  public void setCurrency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
  }


  public GetSavingsChargesOptions id(Integer id) {
    
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


  public GetSavingsChargesOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Passbook Fee", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetSavingsChargesOptions penalty(Boolean penalty) {
    
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
    GetSavingsChargesOptions getSavingsChargesOptions = (GetSavingsChargesOptions) o;
    return Objects.equals(this.active, getSavingsChargesOptions.active) &&
        Objects.equals(this.amount, getSavingsChargesOptions.amount) &&
        Objects.equals(this.chargeCalculationType, getSavingsChargesOptions.chargeCalculationType) &&
        Objects.equals(this.chargeTimeType, getSavingsChargesOptions.chargeTimeType) &&
        Objects.equals(this.chargesAppliesTo, getSavingsChargesOptions.chargesAppliesTo) &&
        Objects.equals(this.currency, getSavingsChargesOptions.currency) &&
        Objects.equals(this.id, getSavingsChargesOptions.id) &&
        Objects.equals(this.name, getSavingsChargesOptions.name) &&
        Objects.equals(this.penalty, getSavingsChargesOptions.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, amount, chargeCalculationType, chargeTimeType, chargesAppliesTo, currency, id, name, penalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsChargesOptions {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargesAppliesTo: ").append(toIndentedString(chargesAppliesTo)).append("\n");
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

