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
import java.time.LocalDate;
import org.apache.fineract.client.models.GetFromAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetInstructionTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetPriorityStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceFrequencyStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetStatusStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetTransferTypeStandingInstructionSwagger;

/**
 * GetStandingInstructionsStandingInstructionIdResponse
 */
@ApiModel(description = "GetStandingInstructionsStandingInstructionIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetStandingInstructionsStandingInstructionIdResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_DETAIL_ID = "accountDetailId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DETAIL_ID)
  private Long accountDetailId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "fromAccount";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private GetFromAccountStandingInstructionSwagger fromAccount;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT_TYPE = "fromAccountType";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_TYPE)
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType;

  public static final String SERIALIZED_NAME_FROM_CLIENT = "fromClient";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT)
  private GetFromClientStandingInstructionSwagger fromClient;

  public static final String SERIALIZED_NAME_FROM_OFFICE = "fromOffice";
  @SerializedName(SERIALIZED_NAME_FROM_OFFICE)
  private GetFromOfficeStandingInstructionSwagger fromOffice;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_INSTRUCTION_TYPE = "instructionType";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_TYPE)
  private GetInstructionTypeStandingInstructionSwagger instructionType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private GetPriorityStandingInstructionSwagger priority;

  public static final String SERIALIZED_NAME_RECURRENCE_FREQUENCY = "recurrenceFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_FREQUENCY)
  private GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency;

  public static final String SERIALIZED_NAME_RECURRENCE_INTERVAL = "recurrenceInterval";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_INTERVAL)
  private Integer recurrenceInterval;

  public static final String SERIALIZED_NAME_RECURRENCE_ON_MONTH_DAY = "recurrenceOnMonthDay";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_ON_MONTH_DAY)
  private LocalDate recurrenceOnMonthDay;

  public static final String SERIALIZED_NAME_RECURRENCE_TYPE = "recurrenceType";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_TYPE)
  private GetRecurrenceTypeStandingInstructionSwagger recurrenceType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetStatusStandingInstructionSwagger status;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "toAccount";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private GetToAccountStandingInstructionSwagger toAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_TYPE = "toAccountType";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_TYPE)
  private GetToAccountTypeStandingInstructionSwagger toAccountType;

  public static final String SERIALIZED_NAME_TO_CLIENT = "toClient";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT)
  private GetToClientStandingInstructionSwagger toClient;

  public static final String SERIALIZED_NAME_TO_OFFICE = "toOffice";
  @SerializedName(SERIALIZED_NAME_TO_OFFICE)
  private GetToOfficeStandingInstructionSwagger toOffice;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transferType";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private GetTransferTypeStandingInstructionSwagger transferType;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private LocalDate validFrom;

  public GetStandingInstructionsStandingInstructionIdResponse() { 
  }

  public GetStandingInstructionsStandingInstructionIdResponse accountDetailId(Long accountDetailId) {
    
    this.accountDetailId = accountDetailId;
    return this;
  }

   /**
   * Get accountDetailId
   * @return accountDetailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Long getAccountDetailId() {
    return accountDetailId;
  }


  public void setAccountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
  }


  public GetStandingInstructionsStandingInstructionIdResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150.0", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetStandingInstructionsStandingInstructionIdResponse fromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromAccountStandingInstructionSwagger getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetStandingInstructionsStandingInstructionIdResponse fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }


  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public GetStandingInstructionsStandingInstructionIdResponse fromClient(GetFromClientStandingInstructionSwagger fromClient) {
    
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromClientStandingInstructionSwagger getFromClient() {
    return fromClient;
  }


  public void setFromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
  }


  public GetStandingInstructionsStandingInstructionIdResponse fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }


  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }


  public GetStandingInstructionsStandingInstructionIdResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetStandingInstructionsStandingInstructionIdResponse instructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Get instructionType
   * @return instructionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetInstructionTypeStandingInstructionSwagger getInstructionType() {
    return instructionType;
  }


  public void setInstructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
  }


  public GetStandingInstructionsStandingInstructionIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test standing", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetStandingInstructionsStandingInstructionIdResponse priority(GetPriorityStandingInstructionSwagger priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetPriorityStandingInstructionSwagger getPriority() {
    return priority;
  }


  public void setPriority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
  }


  public GetStandingInstructionsStandingInstructionIdResponse recurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

   /**
   * Get recurrenceFrequency
   * @return recurrenceFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurrenceFrequencyStandingInstructionSwagger getRecurrenceFrequency() {
    return recurrenceFrequency;
  }


  public void setRecurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
  }


  public GetStandingInstructionsStandingInstructionIdResponse recurrenceInterval(Integer recurrenceInterval) {
    
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }


  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }


  public GetStandingInstructionsStandingInstructionIdResponse recurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
    return this;
  }

   /**
   * Get recurrenceOnMonthDay
   * @return recurrenceOnMonthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getRecurrenceOnMonthDay() {
    return recurrenceOnMonthDay;
  }


  public void setRecurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
  }


  public GetStandingInstructionsStandingInstructionIdResponse recurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurrenceTypeStandingInstructionSwagger getRecurrenceType() {
    return recurrenceType;
  }


  public void setRecurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
  }


  public GetStandingInstructionsStandingInstructionIdResponse status(GetStatusStandingInstructionSwagger status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStatusStandingInstructionSwagger getStatus() {
    return status;
  }


  public void setStatus(GetStatusStandingInstructionSwagger status) {
    this.status = status;
  }


  public GetStandingInstructionsStandingInstructionIdResponse toAccount(GetToAccountStandingInstructionSwagger toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToAccountStandingInstructionSwagger getToAccount() {
    return toAccount;
  }


  public void setToAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
  }


  public GetStandingInstructionsStandingInstructionIdResponse toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }


  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }


  public GetStandingInstructionsStandingInstructionIdResponse toClient(GetToClientStandingInstructionSwagger toClient) {
    
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToClientStandingInstructionSwagger getToClient() {
    return toClient;
  }


  public void setToClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
  }


  public GetStandingInstructionsStandingInstructionIdResponse toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }


  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }


  public GetStandingInstructionsStandingInstructionIdResponse transferType(GetTransferTypeStandingInstructionSwagger transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTransferTypeStandingInstructionSwagger getTransferType() {
    return transferType;
  }


  public void setTransferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
  }


  public GetStandingInstructionsStandingInstructionIdResponse validFrom(LocalDate validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStandingInstructionsStandingInstructionIdResponse getStandingInstructionsStandingInstructionIdResponse = (GetStandingInstructionsStandingInstructionIdResponse) o;
    return Objects.equals(this.accountDetailId, getStandingInstructionsStandingInstructionIdResponse.accountDetailId) &&
        Objects.equals(this.amount, getStandingInstructionsStandingInstructionIdResponse.amount) &&
        Objects.equals(this.fromAccount, getStandingInstructionsStandingInstructionIdResponse.fromAccount) &&
        Objects.equals(this.fromAccountType, getStandingInstructionsStandingInstructionIdResponse.fromAccountType) &&
        Objects.equals(this.fromClient, getStandingInstructionsStandingInstructionIdResponse.fromClient) &&
        Objects.equals(this.fromOffice, getStandingInstructionsStandingInstructionIdResponse.fromOffice) &&
        Objects.equals(this.id, getStandingInstructionsStandingInstructionIdResponse.id) &&
        Objects.equals(this.instructionType, getStandingInstructionsStandingInstructionIdResponse.instructionType) &&
        Objects.equals(this.name, getStandingInstructionsStandingInstructionIdResponse.name) &&
        Objects.equals(this.priority, getStandingInstructionsStandingInstructionIdResponse.priority) &&
        Objects.equals(this.recurrenceFrequency, getStandingInstructionsStandingInstructionIdResponse.recurrenceFrequency) &&
        Objects.equals(this.recurrenceInterval, getStandingInstructionsStandingInstructionIdResponse.recurrenceInterval) &&
        Objects.equals(this.recurrenceOnMonthDay, getStandingInstructionsStandingInstructionIdResponse.recurrenceOnMonthDay) &&
        Objects.equals(this.recurrenceType, getStandingInstructionsStandingInstructionIdResponse.recurrenceType) &&
        Objects.equals(this.status, getStandingInstructionsStandingInstructionIdResponse.status) &&
        Objects.equals(this.toAccount, getStandingInstructionsStandingInstructionIdResponse.toAccount) &&
        Objects.equals(this.toAccountType, getStandingInstructionsStandingInstructionIdResponse.toAccountType) &&
        Objects.equals(this.toClient, getStandingInstructionsStandingInstructionIdResponse.toClient) &&
        Objects.equals(this.toOffice, getStandingInstructionsStandingInstructionIdResponse.toOffice) &&
        Objects.equals(this.transferType, getStandingInstructionsStandingInstructionIdResponse.transferType) &&
        Objects.equals(this.validFrom, getStandingInstructionsStandingInstructionIdResponse.validFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDetailId, amount, fromAccount, fromAccountType, fromClient, fromOffice, id, instructionType, name, priority, recurrenceFrequency, recurrenceInterval, recurrenceOnMonthDay, recurrenceType, status, toAccount, toAccountType, toClient, toOffice, transferType, validFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStandingInstructionsStandingInstructionIdResponse {\n");
    sb.append("    accountDetailId: ").append(toIndentedString(accountDetailId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurrenceFrequency: ").append(toIndentedString(recurrenceFrequency)).append("\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceOnMonthDay: ").append(toIndentedString(recurrenceOnMonthDay)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
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

