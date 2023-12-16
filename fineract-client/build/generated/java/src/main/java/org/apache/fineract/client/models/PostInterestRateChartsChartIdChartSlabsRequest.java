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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsIncentives;

/**
 * PostInterestRateChartsChartIdChartSlabsRequest
 */
@ApiModel(description = "PostInterestRateChartsChartIdChartSlabsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostInterestRateChartsChartIdChartSlabsRequest {
  public static final String SERIALIZED_NAME_ANNUAL_INTEREST_RATE = "annualInterestRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INTEREST_RATE)
  private Double annualInterestRate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FROM_PERIOD = "fromPeriod";
  @SerializedName(SERIALIZED_NAME_FROM_PERIOD)
  private Integer fromPeriod;

  public static final String SERIALIZED_NAME_INCENTIVES = "incentives";
  @SerializedName(SERIALIZED_NAME_INCENTIVES)
  private Set<PostInterestRateChartsChartIdChartSlabsIncentives> incentives = null;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "periodType";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private Integer periodType;

  public static final String SERIALIZED_NAME_TO_PERIOD = "toPeriod";
  @SerializedName(SERIALIZED_NAME_TO_PERIOD)
  private Integer toPeriod;

  public PostInterestRateChartsChartIdChartSlabsRequest() { 
  }

  public PostInterestRateChartsChartIdChartSlabsRequest annualInterestRate(Double annualInterestRate) {
    
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getAnnualInterestRate() {
    return annualInterestRate;
  }


  public void setAnnualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5% interest from 1 day till 180 days of deposit", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest fromPeriod(Integer fromPeriod) {
    
    this.fromPeriod = fromPeriod;
    return this;
  }

   /**
   * Get fromPeriod
   * @return fromPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFromPeriod() {
    return fromPeriod;
  }


  public void setFromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest incentives(Set<PostInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    
    this.incentives = incentives;
    return this;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest addIncentivesItem(PostInterestRateChartsChartIdChartSlabsIncentives incentivesItem) {
    if (this.incentives == null) {
      this.incentives = new LinkedHashSet<>();
    }
    this.incentives.add(incentivesItem);
    return this;
  }

   /**
   * Get incentives
   * @return incentives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<PostInterestRateChartsChartIdChartSlabsIncentives> getIncentives() {
    return incentives;
  }


  public void setIncentives(Set<PostInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest periodType(Integer periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * Get periodType
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getPeriodType() {
    return periodType;
  }


  public void setPeriodType(Integer periodType) {
    this.periodType = periodType;
  }


  public PostInterestRateChartsChartIdChartSlabsRequest toPeriod(Integer toPeriod) {
    
    this.toPeriod = toPeriod;
    return this;
  }

   /**
   * Get toPeriod
   * @return toPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "180", value = "")

  public Integer getToPeriod() {
    return toPeriod;
  }


  public void setToPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInterestRateChartsChartIdChartSlabsRequest postInterestRateChartsChartIdChartSlabsRequest = (PostInterestRateChartsChartIdChartSlabsRequest) o;
    return Objects.equals(this.annualInterestRate, postInterestRateChartsChartIdChartSlabsRequest.annualInterestRate) &&
        Objects.equals(this.description, postInterestRateChartsChartIdChartSlabsRequest.description) &&
        Objects.equals(this.fromPeriod, postInterestRateChartsChartIdChartSlabsRequest.fromPeriod) &&
        Objects.equals(this.incentives, postInterestRateChartsChartIdChartSlabsRequest.incentives) &&
        Objects.equals(this.locale, postInterestRateChartsChartIdChartSlabsRequest.locale) &&
        Objects.equals(this.periodType, postInterestRateChartsChartIdChartSlabsRequest.periodType) &&
        Objects.equals(this.toPeriod, postInterestRateChartsChartIdChartSlabsRequest.toPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualInterestRate, description, fromPeriod, incentives, locale, periodType, toPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInterestRateChartsChartIdChartSlabsRequest {\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
    sb.append("    incentives: ").append(toIndentedString(incentives)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
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
