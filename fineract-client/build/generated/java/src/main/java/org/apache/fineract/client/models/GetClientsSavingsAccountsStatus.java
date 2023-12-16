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

/**
 * GetClientsSavingsAccountsStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsSavingsAccountsStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MATURED = "matured";
  @SerializedName(SERIALIZED_NAME_MATURED)
  private Boolean matured;

  public static final String SERIALIZED_NAME_PREMATURE_CLOSED = "prematureClosed";
  @SerializedName(SERIALIZED_NAME_PREMATURE_CLOSED)
  private Boolean prematureClosed;

  public static final String SERIALIZED_NAME_REJECTED = "rejected";
  @SerializedName(SERIALIZED_NAME_REJECTED)
  private Boolean rejected;

  public static final String SERIALIZED_NAME_SUBMITTED_AND_PENDING_APPROVAL = "submittedAndPendingApproval";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AND_PENDING_APPROVAL)
  private Boolean submittedAndPendingApproval;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS = "transferInProgress";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS)
  private Boolean transferInProgress;

  public static final String SERIALIZED_NAME_TRANSFER_ON_HOLD = "transferOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ON_HOLD)
  private Boolean transferOnHold;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_WITHDRAWN_BY_APPLICANT = "withdrawnByApplicant";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN_BY_APPLICANT)
  private Boolean withdrawnByApplicant;

  public GetClientsSavingsAccountsStatus() { 
  }

  public GetClientsSavingsAccountsStatus active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetClientsSavingsAccountsStatus approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public GetClientsSavingsAccountsStatus closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public GetClientsSavingsAccountsStatus code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "savingsAccountStatusType.submitted.and.pending.approval", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetClientsSavingsAccountsStatus id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetClientsSavingsAccountsStatus matured(Boolean matured) {
    
    this.matured = matured;
    return this;
  }

   /**
   * Get matured
   * @return matured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getMatured() {
    return matured;
  }


  public void setMatured(Boolean matured) {
    this.matured = matured;
  }


  public GetClientsSavingsAccountsStatus prematureClosed(Boolean prematureClosed) {
    
    this.prematureClosed = prematureClosed;
    return this;
  }

   /**
   * Get prematureClosed
   * @return prematureClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPrematureClosed() {
    return prematureClosed;
  }


  public void setPrematureClosed(Boolean prematureClosed) {
    this.prematureClosed = prematureClosed;
  }


  public GetClientsSavingsAccountsStatus rejected(Boolean rejected) {
    
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRejected() {
    return rejected;
  }


  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }


  public GetClientsSavingsAccountsStatus submittedAndPendingApproval(Boolean submittedAndPendingApproval) {
    
    this.submittedAndPendingApproval = submittedAndPendingApproval;
    return this;
  }

   /**
   * Get submittedAndPendingApproval
   * @return submittedAndPendingApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSubmittedAndPendingApproval() {
    return submittedAndPendingApproval;
  }


  public void setSubmittedAndPendingApproval(Boolean submittedAndPendingApproval) {
    this.submittedAndPendingApproval = submittedAndPendingApproval;
  }


  public GetClientsSavingsAccountsStatus transferInProgress(Boolean transferInProgress) {
    
    this.transferInProgress = transferInProgress;
    return this;
  }

   /**
   * Get transferInProgress
   * @return transferInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getTransferInProgress() {
    return transferInProgress;
  }


  public void setTransferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
  }


  public GetClientsSavingsAccountsStatus transferOnHold(Boolean transferOnHold) {
    
    this.transferOnHold = transferOnHold;
    return this;
  }

   /**
   * Get transferOnHold
   * @return transferOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getTransferOnHold() {
    return transferOnHold;
  }


  public void setTransferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
  }


  public GetClientsSavingsAccountsStatus value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Submitted and pending approval", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public GetClientsSavingsAccountsStatus withdrawnByApplicant(Boolean withdrawnByApplicant) {
    
    this.withdrawnByApplicant = withdrawnByApplicant;
    return this;
  }

   /**
   * Get withdrawnByApplicant
   * @return withdrawnByApplicant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWithdrawnByApplicant() {
    return withdrawnByApplicant;
  }


  public void setWithdrawnByApplicant(Boolean withdrawnByApplicant) {
    this.withdrawnByApplicant = withdrawnByApplicant;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsSavingsAccountsStatus getClientsSavingsAccountsStatus = (GetClientsSavingsAccountsStatus) o;
    return Objects.equals(this.active, getClientsSavingsAccountsStatus.active) &&
        Objects.equals(this.approved, getClientsSavingsAccountsStatus.approved) &&
        Objects.equals(this.closed, getClientsSavingsAccountsStatus.closed) &&
        Objects.equals(this.code, getClientsSavingsAccountsStatus.code) &&
        Objects.equals(this.id, getClientsSavingsAccountsStatus.id) &&
        Objects.equals(this.matured, getClientsSavingsAccountsStatus.matured) &&
        Objects.equals(this.prematureClosed, getClientsSavingsAccountsStatus.prematureClosed) &&
        Objects.equals(this.rejected, getClientsSavingsAccountsStatus.rejected) &&
        Objects.equals(this.submittedAndPendingApproval, getClientsSavingsAccountsStatus.submittedAndPendingApproval) &&
        Objects.equals(this.transferInProgress, getClientsSavingsAccountsStatus.transferInProgress) &&
        Objects.equals(this.transferOnHold, getClientsSavingsAccountsStatus.transferOnHold) &&
        Objects.equals(this.value, getClientsSavingsAccountsStatus.value) &&
        Objects.equals(this.withdrawnByApplicant, getClientsSavingsAccountsStatus.withdrawnByApplicant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, approved, closed, code, id, matured, prematureClosed, rejected, submittedAndPendingApproval, transferInProgress, transferOnHold, value, withdrawnByApplicant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsSavingsAccountsStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matured: ").append(toIndentedString(matured)).append("\n");
    sb.append("    prematureClosed: ").append(toIndentedString(prematureClosed)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    submittedAndPendingApproval: ").append(toIndentedString(submittedAndPendingApproval)).append("\n");
    sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
    sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    withdrawnByApplicant: ").append(toIndentedString(withdrawnByApplicant)).append("\n");
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
