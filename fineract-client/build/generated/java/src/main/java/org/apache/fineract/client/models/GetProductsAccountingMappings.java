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
import org.apache.fineract.client.models.GetIncomeFromFeeAccountId;
import org.apache.fineract.client.models.GetShareEquityId;
import org.apache.fineract.client.models.GetShareReferenceId;
import org.apache.fineract.client.models.GetShareSuspenseId;

/**
 * GetProductsAccountingMappings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProductsAccountingMappings {
  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID = "incomeFromFeeAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID)
  private GetIncomeFromFeeAccountId incomeFromFeeAccountId;

  public static final String SERIALIZED_NAME_SHARE_EQUITY_ID = "shareEquityId";
  @SerializedName(SERIALIZED_NAME_SHARE_EQUITY_ID)
  private GetShareEquityId shareEquityId;

  public static final String SERIALIZED_NAME_SHARE_REFERENCE_ID = "shareReferenceId";
  @SerializedName(SERIALIZED_NAME_SHARE_REFERENCE_ID)
  private GetShareReferenceId shareReferenceId;

  public static final String SERIALIZED_NAME_SHARE_SUSPENSE_ID = "shareSuspenseId";
  @SerializedName(SERIALIZED_NAME_SHARE_SUSPENSE_ID)
  private GetShareSuspenseId shareSuspenseId;

  public GetProductsAccountingMappings() { 
  }

  public GetProductsAccountingMappings incomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
    
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    return this;
  }

   /**
   * Get incomeFromFeeAccountId
   * @return incomeFromFeeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIncomeFromFeeAccountId getIncomeFromFeeAccountId() {
    return incomeFromFeeAccountId;
  }


  public void setIncomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
  }


  public GetProductsAccountingMappings shareEquityId(GetShareEquityId shareEquityId) {
    
    this.shareEquityId = shareEquityId;
    return this;
  }

   /**
   * Get shareEquityId
   * @return shareEquityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareEquityId getShareEquityId() {
    return shareEquityId;
  }


  public void setShareEquityId(GetShareEquityId shareEquityId) {
    this.shareEquityId = shareEquityId;
  }


  public GetProductsAccountingMappings shareReferenceId(GetShareReferenceId shareReferenceId) {
    
    this.shareReferenceId = shareReferenceId;
    return this;
  }

   /**
   * Get shareReferenceId
   * @return shareReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareReferenceId getShareReferenceId() {
    return shareReferenceId;
  }


  public void setShareReferenceId(GetShareReferenceId shareReferenceId) {
    this.shareReferenceId = shareReferenceId;
  }


  public GetProductsAccountingMappings shareSuspenseId(GetShareSuspenseId shareSuspenseId) {
    
    this.shareSuspenseId = shareSuspenseId;
    return this;
  }

   /**
   * Get shareSuspenseId
   * @return shareSuspenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareSuspenseId getShareSuspenseId() {
    return shareSuspenseId;
  }


  public void setShareSuspenseId(GetShareSuspenseId shareSuspenseId) {
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
    GetProductsAccountingMappings getProductsAccountingMappings = (GetProductsAccountingMappings) o;
    return Objects.equals(this.incomeFromFeeAccountId, getProductsAccountingMappings.incomeFromFeeAccountId) &&
        Objects.equals(this.shareEquityId, getProductsAccountingMappings.shareEquityId) &&
        Objects.equals(this.shareReferenceId, getProductsAccountingMappings.shareReferenceId) &&
        Objects.equals(this.shareSuspenseId, getProductsAccountingMappings.shareSuspenseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeFromFeeAccountId, shareEquityId, shareReferenceId, shareSuspenseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsAccountingMappings {\n");
    sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
    sb.append("    shareEquityId: ").append(toIndentedString(shareEquityId)).append("\n");
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

