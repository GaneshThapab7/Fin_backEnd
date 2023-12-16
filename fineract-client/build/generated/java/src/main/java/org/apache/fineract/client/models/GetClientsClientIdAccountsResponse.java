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
import org.apache.fineract.client.models.GetClientsLoanAccounts;
import org.apache.fineract.client.models.GetClientsSavingsAccounts;

/**
 * GetClientsClientIdAccountsResponse
 */
@ApiModel(description = "GetClientsClientIdAccountsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsClientIdAccountsResponse {
  public static final String SERIALIZED_NAME_LOAN_ACCOUNTS = "loanAccounts";
  @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNTS)
  private Set<GetClientsLoanAccounts> loanAccounts = null;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNTS = "savingsAccounts";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNTS)
  private Set<GetClientsSavingsAccounts> savingsAccounts = null;

  public GetClientsClientIdAccountsResponse() { 
  }

  public GetClientsClientIdAccountsResponse loanAccounts(Set<GetClientsLoanAccounts> loanAccounts) {
    
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addLoanAccountsItem(GetClientsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new LinkedHashSet<>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }


  public void setLoanAccounts(Set<GetClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }


  public GetClientsClientIdAccountsResponse savingsAccounts(Set<GetClientsSavingsAccounts> savingsAccounts) {
    
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addSavingsAccountsItem(GetClientsSavingsAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new LinkedHashSet<>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

   /**
   * Get savingsAccounts
   * @return savingsAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsSavingsAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }


  public void setSavingsAccounts(Set<GetClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdAccountsResponse getClientsClientIdAccountsResponse = (GetClientsClientIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getClientsClientIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getClientsClientIdAccountsResponse.savingsAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdAccountsResponse {\n");
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
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

