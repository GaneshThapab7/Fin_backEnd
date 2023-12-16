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
import java.util.ArrayList;
import java.util.List;

/**
 * GetReportsResponse
 */
@ApiModel(description = "GetReportsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetReportsResponse {
  public static final String SERIALIZED_NAME_CORE_REPORT = "coreReport";
  @SerializedName(SERIALIZED_NAME_CORE_REPORT)
  private Boolean coreReport;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "reportCategory";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "reportParameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private List<Object> reportParameters = null;

  public static final String SERIALIZED_NAME_REPORT_SQL = "reportSql";
  @SerializedName(SERIALIZED_NAME_REPORT_SQL)
  private String reportSql;

  public static final String SERIALIZED_NAME_REPORT_SUB_TYPE = "reportSubType";
  @SerializedName(SERIALIZED_NAME_REPORT_SUB_TYPE)
  private String reportSubType;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public static final String SERIALIZED_NAME_USE_REPORT = "useReport";
  @SerializedName(SERIALIZED_NAME_USE_REPORT)
  private Boolean useReport;

  public GetReportsResponse() { 
  }

  public GetReportsResponse coreReport(Boolean coreReport) {
    
    this.coreReport = coreReport;
    return this;
  }

   /**
   * Get coreReport
   * @return coreReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getCoreReport() {
    return coreReport;
  }


  public void setCoreReport(Boolean coreReport) {
    this.coreReport = coreReport;
  }


  public GetReportsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Individual Client Report Lists the small number of defined fields on the client table.  Would expect to copy this report and add any one to one additional data for specific tenant needs. Can be run for any size MFI but you expect it only to be run within a branch for larger ones.  Depending on how many columns are displayed, there is probably is a limit of about 20/50k clients returned for html display (export to excel doesnt have that client browser/memory impact).", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetReportsResponse id(Long id) {
    
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


  public GetReportsResponse reportCategory(String reportCategory) {
    
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client", value = "")

  public String getReportCategory() {
    return reportCategory;
  }


  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public GetReportsResponse reportName(String reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Listing", value = "")

  public String getReportName() {
    return reportName;
  }


  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public GetReportsResponse reportParameters(List<Object> reportParameters) {
    
    this.reportParameters = reportParameters;
    return this;
  }

  public GetReportsResponse addReportParametersItem(Object reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getReportParameters() {
    return reportParameters;
  }


  public void setReportParameters(List<Object> reportParameters) {
    this.reportParameters = reportParameters;
  }


  public GetReportsResponse reportSql(String reportSql) {
    
    this.reportSql = reportSql;
    return this;
  }

   /**
   * Get reportSql
   * @return reportSql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportSql() {
    return reportSql;
  }


  public void setReportSql(String reportSql) {
    this.reportSql = reportSql;
  }


  public GetReportsResponse reportSubType(String reportSubType) {
    
    this.reportSubType = reportSubType;
    return this;
  }

   /**
   * Get reportSubType
   * @return reportSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportSubType() {
    return reportSubType;
  }


  public void setReportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
  }


  public GetReportsResponse reportType(String reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Table", value = "")

  public String getReportType() {
    return reportType;
  }


  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public GetReportsResponse useReport(Boolean useReport) {
    
    this.useReport = useReport;
    return this;
  }

   /**
   * Get useReport
   * @return useReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getUseReport() {
    return useReport;
  }


  public void setUseReport(Boolean useReport) {
    this.useReport = useReport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportsResponse getReportsResponse = (GetReportsResponse) o;
    return Objects.equals(this.coreReport, getReportsResponse.coreReport) &&
        Objects.equals(this.description, getReportsResponse.description) &&
        Objects.equals(this.id, getReportsResponse.id) &&
        Objects.equals(this.reportCategory, getReportsResponse.reportCategory) &&
        Objects.equals(this.reportName, getReportsResponse.reportName) &&
        Objects.equals(this.reportParameters, getReportsResponse.reportParameters) &&
        Objects.equals(this.reportSql, getReportsResponse.reportSql) &&
        Objects.equals(this.reportSubType, getReportsResponse.reportSubType) &&
        Objects.equals(this.reportType, getReportsResponse.reportType) &&
        Objects.equals(this.useReport, getReportsResponse.useReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreReport, description, id, reportCategory, reportName, reportParameters, reportSql, reportSubType, reportType, useReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsResponse {\n");
    sb.append("    coreReport: ").append(toIndentedString(coreReport)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
    sb.append("    reportSql: ").append(toIndentedString(reportSql)).append("\n");
    sb.append("    reportSubType: ").append(toIndentedString(reportSubType)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    useReport: ").append(toIndentedString(useReport)).append("\n");
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

