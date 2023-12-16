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
import java.time.OffsetDateTime;

/**
 * ReportMailingJobRunHistoryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportMailingJobRunHistoryData {
  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_ERROR_LOG = "errorLog";
  @SerializedName(SERIALIZED_NAME_ERROR_LOG)
  private String errorLog;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REPORT_MAILING_JOB_ID = "reportMailingJobId";
  @SerializedName(SERIALIZED_NAME_REPORT_MAILING_JOB_ID)
  private Long reportMailingJobId;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ReportMailingJobRunHistoryData() { 
  }

  public ReportMailingJobRunHistoryData endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public ReportMailingJobRunHistoryData errorLog(String errorLog) {
    
    this.errorLog = errorLog;
    return this;
  }

   /**
   * Get errorLog
   * @return errorLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorLog() {
    return errorLog;
  }


  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }


  public ReportMailingJobRunHistoryData errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ReportMailingJobRunHistoryData id(Long id) {
    
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


  public ReportMailingJobRunHistoryData reportMailingJobId(Long reportMailingJobId) {
    
    this.reportMailingJobId = reportMailingJobId;
    return this;
  }

   /**
   * Get reportMailingJobId
   * @return reportMailingJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getReportMailingJobId() {
    return reportMailingJobId;
  }


  public void setReportMailingJobId(Long reportMailingJobId) {
    this.reportMailingJobId = reportMailingJobId;
  }


  public ReportMailingJobRunHistoryData startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public ReportMailingJobRunHistoryData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
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
    ReportMailingJobRunHistoryData reportMailingJobRunHistoryData = (ReportMailingJobRunHistoryData) o;
    return Objects.equals(this.endDateTime, reportMailingJobRunHistoryData.endDateTime) &&
        Objects.equals(this.errorLog, reportMailingJobRunHistoryData.errorLog) &&
        Objects.equals(this.errorMessage, reportMailingJobRunHistoryData.errorMessage) &&
        Objects.equals(this.id, reportMailingJobRunHistoryData.id) &&
        Objects.equals(this.reportMailingJobId, reportMailingJobRunHistoryData.reportMailingJobId) &&
        Objects.equals(this.startDateTime, reportMailingJobRunHistoryData.startDateTime) &&
        Objects.equals(this.status, reportMailingJobRunHistoryData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, errorLog, errorMessage, id, reportMailingJobId, startDateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMailingJobRunHistoryData {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportMailingJobId: ").append(toIndentedString(reportMailingJobId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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
