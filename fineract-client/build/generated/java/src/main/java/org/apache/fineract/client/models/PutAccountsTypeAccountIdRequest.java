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
 * PutAccountsTypeAccountIdRequest
 */
@ApiModel(description = "PutAccountsTypeAccountIdRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutAccountsTypeAccountIdRequest {
  public static final String SERIALIZED_NAME_APPLICATION_DATE = "applicationDate";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private String applicationDate;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_REQUESTED_SHARES = "requestedShares";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SHARES)
  private Integer requestedShares;

  public PutAccountsTypeAccountIdRequest() { 
  }

  public PutAccountsTypeAccountIdRequest applicationDate(String applicationDate) {
    
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * Get applicationDate
   * @return applicationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01 April 2016", value = "")

  public String getApplicationDate() {
    return applicationDate;
  }


  public void setApplicationDate(String applicationDate) {
    this.applicationDate = applicationDate;
  }


  public PutAccountsTypeAccountIdRequest dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public PutAccountsTypeAccountIdRequest locale(String locale) {
    
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


  public PutAccountsTypeAccountIdRequest requestedShares(Integer requestedShares) {
    
    this.requestedShares = requestedShares;
    return this;
  }

   /**
   * Get requestedShares
   * @return requestedShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public Integer getRequestedShares() {
    return requestedShares;
  }


  public void setRequestedShares(Integer requestedShares) {
    this.requestedShares = requestedShares;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutAccountsTypeAccountIdRequest putAccountsTypeAccountIdRequest = (PutAccountsTypeAccountIdRequest) o;
    return Objects.equals(this.applicationDate, putAccountsTypeAccountIdRequest.applicationDate) &&
        Objects.equals(this.dateFormat, putAccountsTypeAccountIdRequest.dateFormat) &&
        Objects.equals(this.locale, putAccountsTypeAccountIdRequest.locale) &&
        Objects.equals(this.requestedShares, putAccountsTypeAccountIdRequest.requestedShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationDate, dateFormat, locale, requestedShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutAccountsTypeAccountIdRequest {\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
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
