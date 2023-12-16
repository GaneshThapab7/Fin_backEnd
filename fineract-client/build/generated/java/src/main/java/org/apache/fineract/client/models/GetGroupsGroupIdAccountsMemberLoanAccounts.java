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
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsMemberLoanStatus;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsMemberLoanType;

/**
 * GetGroupsGroupIdAccountsMemberLoanAccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetGroupsGroupIdAccountsMemberLoanAccounts {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOAN_TYPE = "loanType";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE)
  private GetGroupsGroupIdAccountsMemberLoanType loanType;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetGroupsGroupIdAccountsMemberLoanStatus status;

  public GetGroupsGroupIdAccountsMemberLoanAccounts() { 
  }

  public GetGroupsGroupIdAccountsMemberLoanAccounts accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetGroupsGroupIdAccountsMemberLoanAccounts id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetGroupsGroupIdAccountsMemberLoanAccounts loanType(GetGroupsGroupIdAccountsMemberLoanType loanType) {
    
    this.loanType = loanType;
    return this;
  }

   /**
   * Get loanType
   * @return loanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetGroupsGroupIdAccountsMemberLoanType getLoanType() {
    return loanType;
  }


  public void setLoanType(GetGroupsGroupIdAccountsMemberLoanType loanType) {
    this.loanType = loanType;
  }


  public GetGroupsGroupIdAccountsMemberLoanAccounts productId(Integer productId) {
    
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


  public GetGroupsGroupIdAccountsMemberLoanAccounts productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testLoan", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetGroupsGroupIdAccountsMemberLoanAccounts status(GetGroupsGroupIdAccountsMemberLoanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetGroupsGroupIdAccountsMemberLoanStatus getStatus() {
    return status;
  }


  public void setStatus(GetGroupsGroupIdAccountsMemberLoanStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdAccountsMemberLoanAccounts getGroupsGroupIdAccountsMemberLoanAccounts = (GetGroupsGroupIdAccountsMemberLoanAccounts) o;
    return Objects.equals(this.accountNo, getGroupsGroupIdAccountsMemberLoanAccounts.accountNo) &&
        Objects.equals(this.id, getGroupsGroupIdAccountsMemberLoanAccounts.id) &&
        Objects.equals(this.loanType, getGroupsGroupIdAccountsMemberLoanAccounts.loanType) &&
        Objects.equals(this.productId, getGroupsGroupIdAccountsMemberLoanAccounts.productId) &&
        Objects.equals(this.productName, getGroupsGroupIdAccountsMemberLoanAccounts.productName) &&
        Objects.equals(this.status, getGroupsGroupIdAccountsMemberLoanAccounts.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, id, loanType, productId, productName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdAccountsMemberLoanAccounts {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
