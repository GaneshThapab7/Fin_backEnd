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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.SingleDebitOrCreditEntryCommand;

/**
 * JournalEntryCommand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JournalEntryCommand {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE_ID = "accountingRuleId";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE_ID)
  private Long accountingRuleId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_BANK_NUMBER = "bankNumber";
  @SerializedName(SERIALIZED_NAME_BANK_NUMBER)
  private String bankNumber;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private List<SingleDebitOrCreditEntryCommand> credits = null;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DEBITS = "debits";
  @SerializedName(SERIALIZED_NAME_DEBITS)
  private List<SingleDebitOrCreditEntryCommand> debits = null;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE_ID = "paymentTypeId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE_ID)
  private Long paymentTypeId;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private String receiptNumber;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_ROUTING_CODE = "routingCode";
  @SerializedName(SERIALIZED_NAME_ROUTING_CODE)
  private String routingCode;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transactionDate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private LocalDate transactionDate;

  public JournalEntryCommand() { 
  }

  public JournalEntryCommand accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public JournalEntryCommand accountingRuleId(Long accountingRuleId) {
    
    this.accountingRuleId = accountingRuleId;
    return this;
  }

   /**
   * Get accountingRuleId
   * @return accountingRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAccountingRuleId() {
    return accountingRuleId;
  }


  public void setAccountingRuleId(Long accountingRuleId) {
    this.accountingRuleId = accountingRuleId;
  }


  public JournalEntryCommand amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public JournalEntryCommand bankNumber(String bankNumber) {
    
    this.bankNumber = bankNumber;
    return this;
  }

   /**
   * Get bankNumber
   * @return bankNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankNumber() {
    return bankNumber;
  }


  public void setBankNumber(String bankNumber) {
    this.bankNumber = bankNumber;
  }


  public JournalEntryCommand checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public JournalEntryCommand comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public JournalEntryCommand credits(List<SingleDebitOrCreditEntryCommand> credits) {
    
    this.credits = credits;
    return this;
  }

  public JournalEntryCommand addCreditsItem(SingleDebitOrCreditEntryCommand creditsItem) {
    if (this.credits == null) {
      this.credits = new ArrayList<>();
    }
    this.credits.add(creditsItem);
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SingleDebitOrCreditEntryCommand> getCredits() {
    return credits;
  }


  public void setCredits(List<SingleDebitOrCreditEntryCommand> credits) {
    this.credits = credits;
  }


  public JournalEntryCommand currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public JournalEntryCommand debits(List<SingleDebitOrCreditEntryCommand> debits) {
    
    this.debits = debits;
    return this;
  }

  public JournalEntryCommand addDebitsItem(SingleDebitOrCreditEntryCommand debitsItem) {
    if (this.debits == null) {
      this.debits = new ArrayList<>();
    }
    this.debits.add(debitsItem);
    return this;
  }

   /**
   * Get debits
   * @return debits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SingleDebitOrCreditEntryCommand> getDebits() {
    return debits;
  }


  public void setDebits(List<SingleDebitOrCreditEntryCommand> debits) {
    this.debits = debits;
  }


  public JournalEntryCommand officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public JournalEntryCommand paymentTypeId(Long paymentTypeId) {
    
    this.paymentTypeId = paymentTypeId;
    return this;
  }

   /**
   * Get paymentTypeId
   * @return paymentTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPaymentTypeId() {
    return paymentTypeId;
  }


  public void setPaymentTypeId(Long paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
  }


  public JournalEntryCommand receiptNumber(String receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public JournalEntryCommand referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public JournalEntryCommand routingCode(String routingCode) {
    
    this.routingCode = routingCode;
    return this;
  }

   /**
   * Get routingCode
   * @return routingCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoutingCode() {
    return routingCode;
  }


  public void setRoutingCode(String routingCode) {
    this.routingCode = routingCode;
  }


  public JournalEntryCommand transactionDate(LocalDate transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(LocalDate transactionDate) {
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
    JournalEntryCommand journalEntryCommand = (JournalEntryCommand) o;
    return Objects.equals(this.accountNumber, journalEntryCommand.accountNumber) &&
        Objects.equals(this.accountingRuleId, journalEntryCommand.accountingRuleId) &&
        Objects.equals(this.amount, journalEntryCommand.amount) &&
        Objects.equals(this.bankNumber, journalEntryCommand.bankNumber) &&
        Objects.equals(this.checkNumber, journalEntryCommand.checkNumber) &&
        Objects.equals(this.comments, journalEntryCommand.comments) &&
        Objects.equals(this.credits, journalEntryCommand.credits) &&
        Objects.equals(this.currencyCode, journalEntryCommand.currencyCode) &&
        Objects.equals(this.debits, journalEntryCommand.debits) &&
        Objects.equals(this.officeId, journalEntryCommand.officeId) &&
        Objects.equals(this.paymentTypeId, journalEntryCommand.paymentTypeId) &&
        Objects.equals(this.receiptNumber, journalEntryCommand.receiptNumber) &&
        Objects.equals(this.referenceNumber, journalEntryCommand.referenceNumber) &&
        Objects.equals(this.routingCode, journalEntryCommand.routingCode) &&
        Objects.equals(this.transactionDate, journalEntryCommand.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountingRuleId, amount, bankNumber, checkNumber, comments, credits, currencyCode, debits, officeId, paymentTypeId, receiptNumber, referenceNumber, routingCode, transactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalEntryCommand {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountingRuleId: ").append(toIndentedString(accountingRuleId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankNumber: ").append(toIndentedString(bankNumber)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    debits: ").append(toIndentedString(debits)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    paymentTypeId: ").append(toIndentedString(paymentTypeId)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    routingCode: ").append(toIndentedString(routingCode)).append("\n");
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

