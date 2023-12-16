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
import org.apache.fineract.client.models.PostCollectionSheetBulkRepaymentTransactions;

/**
 * PostCollectionSheetRequest
 */
@ApiModel(description = "PostCollectionSheetRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostCollectionSheetRequest {
  public static final String SERIALIZED_NAME_ACTUAL_DISBURSEMENT_DATE = "actualDisbursementDate";
  @SerializedName(SERIALIZED_NAME_ACTUAL_DISBURSEMENT_DATE)
  private String actualDisbursementDate;

  public static final String SERIALIZED_NAME_BULK_DISBURSEMENT_TRANSACTIONS = "bulkDisbursementTransactions";
  @SerializedName(SERIALIZED_NAME_BULK_DISBURSEMENT_TRANSACTIONS)
  private List<Integer> bulkDisbursementTransactions = null;

  public static final String SERIALIZED_NAME_BULK_REPAYMENT_TRANSACTIONS = "bulkRepaymentTransactions";
  @SerializedName(SERIALIZED_NAME_BULK_REPAYMENT_TRANSACTIONS)
  private PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions;

  public static final String SERIALIZED_NAME_BULK_SAVINGS_DUE_TRANSACTIONS = "bulkSavingsDueTransactions";
  @SerializedName(SERIALIZED_NAME_BULK_SAVINGS_DUE_TRANSACTIONS)
  private List<Integer> bulkSavingsDueTransactions = null;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transactionDate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public PostCollectionSheetRequest() { 
  }

  public PostCollectionSheetRequest actualDisbursementDate(String actualDisbursementDate) {
    
    this.actualDisbursementDate = actualDisbursementDate;
    return this;
  }

   /**
   * Get actualDisbursementDate
   * @return actualDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "04 May 2014", value = "")

  public String getActualDisbursementDate() {
    return actualDisbursementDate;
  }


  public void setActualDisbursementDate(String actualDisbursementDate) {
    this.actualDisbursementDate = actualDisbursementDate;
  }


  public PostCollectionSheetRequest bulkDisbursementTransactions(List<Integer> bulkDisbursementTransactions) {
    
    this.bulkDisbursementTransactions = bulkDisbursementTransactions;
    return this;
  }

  public PostCollectionSheetRequest addBulkDisbursementTransactionsItem(Integer bulkDisbursementTransactionsItem) {
    if (this.bulkDisbursementTransactions == null) {
      this.bulkDisbursementTransactions = new ArrayList<>();
    }
    this.bulkDisbursementTransactions.add(bulkDisbursementTransactionsItem);
    return this;
  }

   /**
   * Get bulkDisbursementTransactions
   * @return bulkDisbursementTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getBulkDisbursementTransactions() {
    return bulkDisbursementTransactions;
  }


  public void setBulkDisbursementTransactions(List<Integer> bulkDisbursementTransactions) {
    this.bulkDisbursementTransactions = bulkDisbursementTransactions;
  }


  public PostCollectionSheetRequest bulkRepaymentTransactions(PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions) {
    
    this.bulkRepaymentTransactions = bulkRepaymentTransactions;
    return this;
  }

   /**
   * Get bulkRepaymentTransactions
   * @return bulkRepaymentTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostCollectionSheetBulkRepaymentTransactions getBulkRepaymentTransactions() {
    return bulkRepaymentTransactions;
  }


  public void setBulkRepaymentTransactions(PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions) {
    this.bulkRepaymentTransactions = bulkRepaymentTransactions;
  }


  public PostCollectionSheetRequest bulkSavingsDueTransactions(List<Integer> bulkSavingsDueTransactions) {
    
    this.bulkSavingsDueTransactions = bulkSavingsDueTransactions;
    return this;
  }

  public PostCollectionSheetRequest addBulkSavingsDueTransactionsItem(Integer bulkSavingsDueTransactionsItem) {
    if (this.bulkSavingsDueTransactions == null) {
      this.bulkSavingsDueTransactions = new ArrayList<>();
    }
    this.bulkSavingsDueTransactions.add(bulkSavingsDueTransactionsItem);
    return this;
  }

   /**
   * Get bulkSavingsDueTransactions
   * @return bulkSavingsDueTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getBulkSavingsDueTransactions() {
    return bulkSavingsDueTransactions;
  }


  public void setBulkSavingsDueTransactions(List<Integer> bulkSavingsDueTransactions) {
    this.bulkSavingsDueTransactions = bulkSavingsDueTransactions;
  }


  public PostCollectionSheetRequest dateFormat(String dateFormat) {
    
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


  public PostCollectionSheetRequest locale(String locale) {
    
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


  public PostCollectionSheetRequest transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "04 May 2014", value = "")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCollectionSheetRequest postCollectionSheetRequest = (PostCollectionSheetRequest) o;
    return Objects.equals(this.actualDisbursementDate, postCollectionSheetRequest.actualDisbursementDate) &&
        Objects.equals(this.bulkDisbursementTransactions, postCollectionSheetRequest.bulkDisbursementTransactions) &&
        Objects.equals(this.bulkRepaymentTransactions, postCollectionSheetRequest.bulkRepaymentTransactions) &&
        Objects.equals(this.bulkSavingsDueTransactions, postCollectionSheetRequest.bulkSavingsDueTransactions) &&
        Objects.equals(this.dateFormat, postCollectionSheetRequest.dateFormat) &&
        Objects.equals(this.locale, postCollectionSheetRequest.locale) &&
        Objects.equals(this.transactionDate, postCollectionSheetRequest.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualDisbursementDate, bulkDisbursementTransactions, bulkRepaymentTransactions, bulkSavingsDueTransactions, dateFormat, locale, transactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCollectionSheetRequest {\n");
    sb.append("    actualDisbursementDate: ").append(toIndentedString(actualDisbursementDate)).append("\n");
    sb.append("    bulkDisbursementTransactions: ").append(toIndentedString(bulkDisbursementTransactions)).append("\n");
    sb.append("    bulkRepaymentTransactions: ").append(toIndentedString(bulkRepaymentTransactions)).append("\n");
    sb.append("    bulkSavingsDueTransactions: ").append(toIndentedString(bulkSavingsDueTransactions)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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
