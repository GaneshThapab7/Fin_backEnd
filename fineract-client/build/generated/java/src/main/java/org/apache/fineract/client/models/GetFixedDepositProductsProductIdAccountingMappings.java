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
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdIncomeFromFeeAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdIncomeFromPenaltyAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdInterestOnSavingsAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdSavingsControlAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdSavingsReferenceAccount;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdTransfersInSuspenseAccount;

/**
 * GetFixedDepositProductsProductIdAccountingMappings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFixedDepositProductsProductIdAccountingMappings {
  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT = "incomeFromFeeAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT)
  private GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount;

  public static final String SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT = "incomeFromPenaltyAccount";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT)
  private GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount;

  public static final String SERIALIZED_NAME_INTEREST_ON_SAVINGS_ACCOUNT = "interestOnSavingsAccount";
  @SerializedName(SERIALIZED_NAME_INTEREST_ON_SAVINGS_ACCOUNT)
  private GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount;

  public static final String SERIALIZED_NAME_SAVINGS_CONTROL_ACCOUNT = "savingsControlAccount";
  @SerializedName(SERIALIZED_NAME_SAVINGS_CONTROL_ACCOUNT)
  private GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount;

  public static final String SERIALIZED_NAME_SAVINGS_REFERENCE_ACCOUNT = "savingsReferenceAccount";
  @SerializedName(SERIALIZED_NAME_SAVINGS_REFERENCE_ACCOUNT)
  private GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount;

  public static final String SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT = "transfersInSuspenseAccount";
  @SerializedName(SERIALIZED_NAME_TRANSFERS_IN_SUSPENSE_ACCOUNT)
  private GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount;

  public GetFixedDepositProductsProductIdAccountingMappings() { 
  }

  public GetFixedDepositProductsProductIdAccountingMappings incomeFromFeeAccount(GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    
    this.incomeFromFeeAccount = incomeFromFeeAccount;
    return this;
  }

   /**
   * Get incomeFromFeeAccount
   * @return incomeFromFeeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdIncomeFromFeeAccount getIncomeFromFeeAccount() {
    return incomeFromFeeAccount;
  }


  public void setIncomeFromFeeAccount(GetFixedDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings incomeFromPenaltyAccount(GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccount
   * @return incomeFromPenaltyAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdIncomeFromPenaltyAccount getIncomeFromPenaltyAccount() {
    return incomeFromPenaltyAccount;
  }


  public void setIncomeFromPenaltyAccount(GetFixedDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings interestOnSavingsAccount(GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    
    this.interestOnSavingsAccount = interestOnSavingsAccount;
    return this;
  }

   /**
   * Get interestOnSavingsAccount
   * @return interestOnSavingsAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdInterestOnSavingsAccount getInterestOnSavingsAccount() {
    return interestOnSavingsAccount;
  }


  public void setInterestOnSavingsAccount(GetFixedDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    this.interestOnSavingsAccount = interestOnSavingsAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings savingsControlAccount(GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    
    this.savingsControlAccount = savingsControlAccount;
    return this;
  }

   /**
   * Get savingsControlAccount
   * @return savingsControlAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdSavingsControlAccount getSavingsControlAccount() {
    return savingsControlAccount;
  }


  public void setSavingsControlAccount(GetFixedDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    this.savingsControlAccount = savingsControlAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings savingsReferenceAccount(GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    
    this.savingsReferenceAccount = savingsReferenceAccount;
    return this;
  }

   /**
   * Get savingsReferenceAccount
   * @return savingsReferenceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdSavingsReferenceAccount getSavingsReferenceAccount() {
    return savingsReferenceAccount;
  }


  public void setSavingsReferenceAccount(GetFixedDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    this.savingsReferenceAccount = savingsReferenceAccount;
  }


  public GetFixedDepositProductsProductIdAccountingMappings transfersInSuspenseAccount(GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
    return this;
  }

   /**
   * Get transfersInSuspenseAccount
   * @return transfersInSuspenseAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdTransfersInSuspenseAccount getTransfersInSuspenseAccount() {
    return transfersInSuspenseAccount;
  }


  public void setTransfersInSuspenseAccount(GetFixedDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositProductsProductIdAccountingMappings getFixedDepositProductsProductIdAccountingMappings = (GetFixedDepositProductsProductIdAccountingMappings) o;
    return Objects.equals(this.incomeFromFeeAccount, getFixedDepositProductsProductIdAccountingMappings.incomeFromFeeAccount) &&
        Objects.equals(this.incomeFromPenaltyAccount, getFixedDepositProductsProductIdAccountingMappings.incomeFromPenaltyAccount) &&
        Objects.equals(this.interestOnSavingsAccount, getFixedDepositProductsProductIdAccountingMappings.interestOnSavingsAccount) &&
        Objects.equals(this.savingsControlAccount, getFixedDepositProductsProductIdAccountingMappings.savingsControlAccount) &&
        Objects.equals(this.savingsReferenceAccount, getFixedDepositProductsProductIdAccountingMappings.savingsReferenceAccount) &&
        Objects.equals(this.transfersInSuspenseAccount, getFixedDepositProductsProductIdAccountingMappings.transfersInSuspenseAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeFromFeeAccount, incomeFromPenaltyAccount, interestOnSavingsAccount, savingsControlAccount, savingsReferenceAccount, transfersInSuspenseAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositProductsProductIdAccountingMappings {\n");
    sb.append("    incomeFromFeeAccount: ").append(toIndentedString(incomeFromFeeAccount)).append("\n");
    sb.append("    incomeFromPenaltyAccount: ").append(toIndentedString(incomeFromPenaltyAccount)).append("\n");
    sb.append("    interestOnSavingsAccount: ").append(toIndentedString(interestOnSavingsAccount)).append("\n");
    sb.append("    savingsControlAccount: ").append(toIndentedString(savingsControlAccount)).append("\n");
    sb.append("    savingsReferenceAccount: ").append(toIndentedString(savingsReferenceAccount)).append("\n");
    sb.append("    transfersInSuspenseAccount: ").append(toIndentedString(transfersInSuspenseAccount)).append("\n");
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

