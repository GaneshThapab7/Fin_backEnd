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
import org.apache.fineract.client.models.GetShareAccountsIncomeFromFeeAccountId;
import org.apache.fineract.client.models.GetShareAccountsShareEquityId;
import org.apache.fineract.client.models.GetShareAccountsShareReferenceId;
import org.apache.fineract.client.models.GetShareAccountsShareSuspenseId;

/**
 * GetClientIdProductIdAccountingMappings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientIdProductIdAccountingMappings {
  public static final String SERIALIZED_NAME_SHARE_EQUITY_ID = "ShareEquityId";
  @SerializedName(SERIALIZED_NAME_SHARE_EQUITY_ID)
  private GetShareAccountsShareEquityId shareEquityId;

  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID = "incomeFromFeeAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID)
  private GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId;

  public static final String SERIALIZED_NAME_SHARE_REFERENCE_ID = "shareReferenceId";
  @SerializedName(SERIALIZED_NAME_SHARE_REFERENCE_ID)
  private GetShareAccountsShareReferenceId shareReferenceId;

  public static final String SERIALIZED_NAME_SHARE_SUSPENSE_ID = "shareSuspenseId";
  @SerializedName(SERIALIZED_NAME_SHARE_SUSPENSE_ID)
  private GetShareAccountsShareSuspenseId shareSuspenseId;

  public GetClientIdProductIdAccountingMappings() { 
  }

  public GetClientIdProductIdAccountingMappings shareEquityId(GetShareAccountsShareEquityId shareEquityId) {
    
    this.shareEquityId = shareEquityId;
    return this;
  }

   /**
   * Get shareEquityId
   * @return shareEquityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsShareEquityId getShareEquityId() {
    return shareEquityId;
  }


  public void setShareEquityId(GetShareAccountsShareEquityId shareEquityId) {
    this.shareEquityId = shareEquityId;
  }


  public GetClientIdProductIdAccountingMappings incomeFromFeeAccountId(GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId) {
    
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    return this;
  }

   /**
   * Get incomeFromFeeAccountId
   * @return incomeFromFeeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsIncomeFromFeeAccountId getIncomeFromFeeAccountId() {
    return incomeFromFeeAccountId;
  }


  public void setIncomeFromFeeAccountId(GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
  }


  public GetClientIdProductIdAccountingMappings shareReferenceId(GetShareAccountsShareReferenceId shareReferenceId) {
    
    this.shareReferenceId = shareReferenceId;
    return this;
  }

   /**
   * Get shareReferenceId
   * @return shareReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsShareReferenceId getShareReferenceId() {
    return shareReferenceId;
  }


  public void setShareReferenceId(GetShareAccountsShareReferenceId shareReferenceId) {
    this.shareReferenceId = shareReferenceId;
  }


  public GetClientIdProductIdAccountingMappings shareSuspenseId(GetShareAccountsShareSuspenseId shareSuspenseId) {
    
    this.shareSuspenseId = shareSuspenseId;
    return this;
  }

   /**
   * Get shareSuspenseId
   * @return shareSuspenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareAccountsShareSuspenseId getShareSuspenseId() {
    return shareSuspenseId;
  }


  public void setShareSuspenseId(GetShareAccountsShareSuspenseId shareSuspenseId) {
    this.shareSuspenseId = shareSuspenseId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientIdProductIdAccountingMappings getClientIdProductIdAccountingMappings = (GetClientIdProductIdAccountingMappings) o;
    return Objects.equals(this.shareEquityId, getClientIdProductIdAccountingMappings.shareEquityId) &&
        Objects.equals(this.incomeFromFeeAccountId, getClientIdProductIdAccountingMappings.incomeFromFeeAccountId) &&
        Objects.equals(this.shareReferenceId, getClientIdProductIdAccountingMappings.shareReferenceId) &&
        Objects.equals(this.shareSuspenseId, getClientIdProductIdAccountingMappings.shareSuspenseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareEquityId, incomeFromFeeAccountId, shareReferenceId, shareSuspenseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientIdProductIdAccountingMappings {\n");
    sb.append("    shareEquityId: ").append(toIndentedString(shareEquityId)).append("\n");
    sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
    sb.append("    shareReferenceId: ").append(toIndentedString(shareReferenceId)).append("\n");
    sb.append("    shareSuspenseId: ").append(toIndentedString(shareSuspenseId)).append("\n");
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

