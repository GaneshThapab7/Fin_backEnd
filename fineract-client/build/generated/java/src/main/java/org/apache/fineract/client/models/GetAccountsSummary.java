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
import org.apache.fineract.client.models.GetAccountsCurrency;
import org.apache.fineract.client.models.GetAccountsStatus;
import org.apache.fineract.client.models.GetAccountsTimeline;

/**
 * GetAccountsSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountsSummary {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetAccountsCurrency currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetAccountsStatus status;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetAccountsTimeline timeline;

  public static final String SERIALIZED_NAME_TOTAL_APPROVED_SHARES = "totalApprovedShares";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPROVED_SHARES)
  private Integer totalApprovedShares;

  public static final String SERIALIZED_NAME_TOTAL_PENDING_FOR_APPROVAL_SHARES = "totalPendingForApprovalShares";
  @SerializedName(SERIALIZED_NAME_TOTAL_PENDING_FOR_APPROVAL_SHARES)
  private Integer totalPendingForApprovalShares;

  public GetAccountsSummary() { 
  }

  public GetAccountsSummary accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetAccountsSummary currency(GetAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetAccountsSummary id(Integer id) {
    
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


  public GetAccountsSummary productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetAccountsSummary productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conflux Share Product", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetAccountsSummary status(GetAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetAccountsStatus status) {
    this.status = status;
  }


  public GetAccountsSummary timeline(GetAccountsTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetAccountsTimeline timeline) {
    this.timeline = timeline;
  }


  public GetAccountsSummary totalApprovedShares(Integer totalApprovedShares) {
    
    this.totalApprovedShares = totalApprovedShares;
    return this;
  }

   /**
   * Get totalApprovedShares
   * @return totalApprovedShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTotalApprovedShares() {
    return totalApprovedShares;
  }


  public void setTotalApprovedShares(Integer totalApprovedShares) {
    this.totalApprovedShares = totalApprovedShares;
  }


  public GetAccountsSummary totalPendingForApprovalShares(Integer totalPendingForApprovalShares) {
    
    this.totalPendingForApprovalShares = totalPendingForApprovalShares;
    return this;
  }

   /**
   * Get totalPendingForApprovalShares
   * @return totalPendingForApprovalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getTotalPendingForApprovalShares() {
    return totalPendingForApprovalShares;
  }


  public void setTotalPendingForApprovalShares(Integer totalPendingForApprovalShares) {
    this.totalPendingForApprovalShares = totalPendingForApprovalShares;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsSummary getAccountsSummary = (GetAccountsSummary) o;
    return Objects.equals(this.accountNo, getAccountsSummary.accountNo) &&
        Objects.equals(this.currency, getAccountsSummary.currency) &&
        Objects.equals(this.id, getAccountsSummary.id) &&
        Objects.equals(this.productId, getAccountsSummary.productId) &&
        Objects.equals(this.productName, getAccountsSummary.productName) &&
        Objects.equals(this.status, getAccountsSummary.status) &&
        Objects.equals(this.timeline, getAccountsSummary.timeline) &&
        Objects.equals(this.totalApprovedShares, getAccountsSummary.totalApprovedShares) &&
        Objects.equals(this.totalPendingForApprovalShares, getAccountsSummary.totalPendingForApprovalShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, currency, id, productId, productName, status, timeline, totalApprovedShares, totalPendingForApprovalShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsSummary {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    totalApprovedShares: ").append(toIndentedString(totalApprovedShares)).append("\n");
    sb.append("    totalPendingForApprovalShares: ").append(toIndentedString(totalPendingForApprovalShares)).append("\n");
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

