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
import java.time.OffsetDateTime;
import org.apache.fineract.client.models.EnumOptionData;

/**
 * SmsCampaignData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmsCampaignData {
  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaignStatus";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private EnumOptionData campaignStatus;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaignType";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private EnumOptionData campaignType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LAST_TRIGGER_DATE = "lastTriggerDate";
  @SerializedName(SERIALIZED_NAME_LAST_TRIGGER_DATE)
  private LocalDate lastTriggerDate;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NEXT_TRIGGER_DATE = "nextTriggerDate";
  @SerializedName(SERIALIZED_NAME_NEXT_TRIGGER_DATE)
  private OffsetDateTime nextTriggerDate;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private Boolean notification;

  public static final String SERIALIZED_NAME_PARAM_VALUE = "paramValue";
  @SerializedName(SERIALIZED_NAME_PARAM_VALUE)
  private String paramValue;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private String recurrence;

  public static final String SERIALIZED_NAME_RECURRENCE_START_DATE = "recurrenceStartDate";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_START_DATE)
  private OffsetDateTime recurrenceStartDate;

  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_RUN_REPORT_ID = "runReportId";
  @SerializedName(SERIALIZED_NAME_RUN_REPORT_ID)
  private Long runReportId;

  public SmsCampaignData() { 
  }

  public SmsCampaignData campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public SmsCampaignData campaignStatus(EnumOptionData campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getCampaignStatus() {
    return campaignStatus;
  }


  public void setCampaignStatus(EnumOptionData campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  public SmsCampaignData campaignType(EnumOptionData campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(EnumOptionData campaignType) {
    this.campaignType = campaignType;
  }


  public SmsCampaignData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public SmsCampaignData lastTriggerDate(LocalDate lastTriggerDate) {
    
    this.lastTriggerDate = lastTriggerDate;
    return this;
  }

   /**
   * Get lastTriggerDate
   * @return lastTriggerDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getLastTriggerDate() {
    return lastTriggerDate;
  }


  public void setLastTriggerDate(LocalDate lastTriggerDate) {
    this.lastTriggerDate = lastTriggerDate;
  }


  public SmsCampaignData message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SmsCampaignData nextTriggerDate(OffsetDateTime nextTriggerDate) {
    
    this.nextTriggerDate = nextTriggerDate;
    return this;
  }

   /**
   * Get nextTriggerDate
   * @return nextTriggerDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextTriggerDate() {
    return nextTriggerDate;
  }


  public void setNextTriggerDate(OffsetDateTime nextTriggerDate) {
    this.nextTriggerDate = nextTriggerDate;
  }


  public SmsCampaignData notification(Boolean notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotification() {
    return notification;
  }


  public void setNotification(Boolean notification) {
    this.notification = notification;
  }


  public SmsCampaignData paramValue(String paramValue) {
    
    this.paramValue = paramValue;
    return this;
  }

   /**
   * Get paramValue
   * @return paramValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParamValue() {
    return paramValue;
  }


  public void setParamValue(String paramValue) {
    this.paramValue = paramValue;
  }


  public SmsCampaignData recurrence(String recurrence) {
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }


  public SmsCampaignData recurrenceStartDate(OffsetDateTime recurrenceStartDate) {
    
    this.recurrenceStartDate = recurrenceStartDate;
    return this;
  }

   /**
   * Get recurrenceStartDate
   * @return recurrenceStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRecurrenceStartDate() {
    return recurrenceStartDate;
  }


  public void setRecurrenceStartDate(OffsetDateTime recurrenceStartDate) {
    this.recurrenceStartDate = recurrenceStartDate;
  }


  public SmsCampaignData reportName(String reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportName() {
    return reportName;
  }


  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public SmsCampaignData runReportId(Long runReportId) {
    
    this.runReportId = runReportId;
    return this;
  }

   /**
   * Get runReportId
   * @return runReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunReportId() {
    return runReportId;
  }


  public void setRunReportId(Long runReportId) {
    this.runReportId = runReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsCampaignData smsCampaignData = (SmsCampaignData) o;
    return Objects.equals(this.campaignName, smsCampaignData.campaignName) &&
        Objects.equals(this.campaignStatus, smsCampaignData.campaignStatus) &&
        Objects.equals(this.campaignType, smsCampaignData.campaignType) &&
        Objects.equals(this.id, smsCampaignData.id) &&
        Objects.equals(this.lastTriggerDate, smsCampaignData.lastTriggerDate) &&
        Objects.equals(this.message, smsCampaignData.message) &&
        Objects.equals(this.nextTriggerDate, smsCampaignData.nextTriggerDate) &&
        Objects.equals(this.notification, smsCampaignData.notification) &&
        Objects.equals(this.paramValue, smsCampaignData.paramValue) &&
        Objects.equals(this.recurrence, smsCampaignData.recurrence) &&
        Objects.equals(this.recurrenceStartDate, smsCampaignData.recurrenceStartDate) &&
        Objects.equals(this.reportName, smsCampaignData.reportName) &&
        Objects.equals(this.runReportId, smsCampaignData.runReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignName, campaignStatus, campaignType, id, lastTriggerDate, message, nextTriggerDate, notification, paramValue, recurrence, recurrenceStartDate, reportName, runReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCampaignData {\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastTriggerDate: ").append(toIndentedString(lastTriggerDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nextTriggerDate: ").append(toIndentedString(nextTriggerDate)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    recurrenceStartDate: ").append(toIndentedString(recurrenceStartDate)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    runReportId: ").append(toIndentedString(runReportId)).append("\n");
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

