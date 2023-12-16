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
import org.apache.fineract.client.models.GetSelfSavingsChargeCalculationType;
import org.apache.fineract.client.models.GetSelfSavingsChargeTimeType;
import org.apache.fineract.client.models.GetSelfSavingsCurrency;

/**
 * GetSelfSavingsAccountsAccountIdChargesResponse
 */
@ApiModel(description = "GetSelfSavingsAccountsAccountIdChargesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSelfSavingsAccountsAccountIdChargesResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_AMOUNT_OR_PERCENTAGE = "amountOrPercentage";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OR_PERCENTAGE)
  private Integer amountOrPercentage;

  public static final String SERIALIZED_NAME_AMOUNT_OUTSTANDING = "amountOutstanding";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUTSTANDING)
  private Integer amountOutstanding;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Integer amountPaid;

  public static final String SERIALIZED_NAME_AMOUNT_PERCENTAGE_APPLIED_TO = "amountPercentageAppliedTo";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PERCENTAGE_APPLIED_TO)
  private Double amountPercentageAppliedTo;

  public static final String SERIALIZED_NAME_AMOUNT_WAIVED = "amountWaived";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WAIVED)
  private Integer amountWaived;

  public static final String SERIALIZED_NAME_AMOUNT_WRITTEN_OFF = "amountWrittenOff";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WRITTEN_OFF)
  private Integer amountWrittenOff;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetSelfSavingsChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_CHARGE_ID = "chargeId";
  @SerializedName(SERIALIZED_NAME_CHARGE_ID)
  private Integer chargeId;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetSelfSavingsChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetSelfSavingsCurrency currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public GetSelfSavingsAccountsAccountIdChargesResponse() { 
  }

  public GetSelfSavingsAccountsAccountIdChargesResponse accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "57", value = "")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountOrPercentage(Integer amountOrPercentage) {
    
    this.amountOrPercentage = amountOrPercentage;
    return this;
  }

   /**
   * Get amountOrPercentage
   * @return amountOrPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getAmountOrPercentage() {
    return amountOrPercentage;
  }


  public void setAmountOrPercentage(Integer amountOrPercentage) {
    this.amountOrPercentage = amountOrPercentage;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountOutstanding(Integer amountOutstanding) {
    
    this.amountOutstanding = amountOutstanding;
    return this;
  }

   /**
   * Get amountOutstanding
   * @return amountOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getAmountOutstanding() {
    return amountOutstanding;
  }


  public void setAmountOutstanding(Integer amountOutstanding) {
    this.amountOutstanding = amountOutstanding;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountPaid(Integer amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
    return this;
  }

   /**
   * Get amountPercentageAppliedTo
   * @return amountPercentageAppliedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getAmountPercentageAppliedTo() {
    return amountPercentageAppliedTo;
  }


  public void setAmountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountWaived(Integer amountWaived) {
    
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAmountWaived() {
    return amountWaived;
  }


  public void setAmountWaived(Integer amountWaived) {
    this.amountWaived = amountWaived;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse amountWrittenOff(Integer amountWrittenOff) {
    
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAmountWrittenOff() {
    return amountWrittenOff;
  }


  public void setAmountWrittenOff(Integer amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse chargeCalculationType(GetSelfSavingsChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfSavingsChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetSelfSavingsChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse chargeId(Integer chargeId) {
    
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getChargeId() {
    return chargeId;
  }


  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse chargeTimeType(GetSelfSavingsChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfSavingsChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetSelfSavingsChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse currency(GetSelfSavingsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfSavingsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetSelfSavingsCurrency currency) {
    this.currency = currency;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse id(Integer id) {
    
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


  public GetSelfSavingsAccountsAccountIdChargesResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Savings account maintenance fee", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetSelfSavingsAccountsAccountIdChargesResponse penalty(Boolean penalty) {
    
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


  public GetSelfSavingsAccountsAccountIdChargesResponse percentage(Double percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfSavingsAccountsAccountIdChargesResponse getSelfSavingsAccountsAccountIdChargesResponse = (GetSelfSavingsAccountsAccountIdChargesResponse) o;
    return Objects.equals(this.accountId, getSelfSavingsAccountsAccountIdChargesResponse.accountId) &&
        Objects.equals(this.amount, getSelfSavingsAccountsAccountIdChargesResponse.amount) &&
        Objects.equals(this.amountOrPercentage, getSelfSavingsAccountsAccountIdChargesResponse.amountOrPercentage) &&
        Objects.equals(this.amountOutstanding, getSelfSavingsAccountsAccountIdChargesResponse.amountOutstanding) &&
        Objects.equals(this.amountPaid, getSelfSavingsAccountsAccountIdChargesResponse.amountPaid) &&
        Objects.equals(this.amountPercentageAppliedTo, getSelfSavingsAccountsAccountIdChargesResponse.amountPercentageAppliedTo) &&
        Objects.equals(this.amountWaived, getSelfSavingsAccountsAccountIdChargesResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getSelfSavingsAccountsAccountIdChargesResponse.amountWrittenOff) &&
        Objects.equals(this.chargeCalculationType, getSelfSavingsAccountsAccountIdChargesResponse.chargeCalculationType) &&
        Objects.equals(this.chargeId, getSelfSavingsAccountsAccountIdChargesResponse.chargeId) &&
        Objects.equals(this.chargeTimeType, getSelfSavingsAccountsAccountIdChargesResponse.chargeTimeType) &&
        Objects.equals(this.currency, getSelfSavingsAccountsAccountIdChargesResponse.currency) &&
        Objects.equals(this.id, getSelfSavingsAccountsAccountIdChargesResponse.id) &&
        Objects.equals(this.name, getSelfSavingsAccountsAccountIdChargesResponse.name) &&
        Objects.equals(this.penalty, getSelfSavingsAccountsAccountIdChargesResponse.penalty) &&
        Objects.equals(this.percentage, getSelfSavingsAccountsAccountIdChargesResponse.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, amountOrPercentage, amountOutstanding, amountPaid, amountPercentageAppliedTo, amountWaived, amountWrittenOff, chargeCalculationType, chargeId, chargeTimeType, currency, id, name, penalty, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfSavingsAccountsAccountIdChargesResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountOrPercentage: ").append(toIndentedString(amountOrPercentage)).append("\n");
    sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountPercentageAppliedTo: ").append(toIndentedString(amountPercentageAppliedTo)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

