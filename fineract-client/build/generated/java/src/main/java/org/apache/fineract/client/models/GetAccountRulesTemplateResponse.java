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
import org.apache.fineract.client.models.GLAccountData;
import org.apache.fineract.client.models.OfficeData;

/**
 * GetAccountRulesTemplateResponse
 */
@ApiModel(description = "GetAccountRulesTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountRulesTemplateResponse {
  public static final String SERIALIZED_NAME_ALLOWED_ACCOUNTS = "allowedAccounts";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACCOUNTS)
  private List<GLAccountData> allowedAccounts = null;

  public static final String SERIALIZED_NAME_ALLOWED_OFFICES = "allowedOffices";
  @SerializedName(SERIALIZED_NAME_ALLOWED_OFFICES)
  private List<OfficeData> allowedOffices = null;

  public static final String SERIALIZED_NAME_SYSTEM_DEFINED = "systemDefined";
  @SerializedName(SERIALIZED_NAME_SYSTEM_DEFINED)
  private Boolean systemDefined;

  public GetAccountRulesTemplateResponse() { 
  }

  public GetAccountRulesTemplateResponse allowedAccounts(List<GLAccountData> allowedAccounts) {
    
    this.allowedAccounts = allowedAccounts;
    return this;
  }

  public GetAccountRulesTemplateResponse addAllowedAccountsItem(GLAccountData allowedAccountsItem) {
    if (this.allowedAccounts == null) {
      this.allowedAccounts = new ArrayList<>();
    }
    this.allowedAccounts.add(allowedAccountsItem);
    return this;
  }

   /**
   * Get allowedAccounts
   * @return allowedAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GLAccountData> getAllowedAccounts() {
    return allowedAccounts;
  }


  public void setAllowedAccounts(List<GLAccountData> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
  }


  public GetAccountRulesTemplateResponse allowedOffices(List<OfficeData> allowedOffices) {
    
    this.allowedOffices = allowedOffices;
    return this;
  }

  public GetAccountRulesTemplateResponse addAllowedOfficesItem(OfficeData allowedOfficesItem) {
    if (this.allowedOffices == null) {
      this.allowedOffices = new ArrayList<>();
    }
    this.allowedOffices.add(allowedOfficesItem);
    return this;
  }

   /**
   * Get allowedOffices
   * @return allowedOffices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OfficeData> getAllowedOffices() {
    return allowedOffices;
  }


  public void setAllowedOffices(List<OfficeData> allowedOffices) {
    this.allowedOffices = allowedOffices;
  }


  public GetAccountRulesTemplateResponse systemDefined(Boolean systemDefined) {
    
    this.systemDefined = systemDefined;
    return this;
  }

   /**
   * Get systemDefined
   * @return systemDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSystemDefined() {
    return systemDefined;
  }


  public void setSystemDefined(Boolean systemDefined) {
    this.systemDefined = systemDefined;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountRulesTemplateResponse getAccountRulesTemplateResponse = (GetAccountRulesTemplateResponse) o;
    return Objects.equals(this.allowedAccounts, getAccountRulesTemplateResponse.allowedAccounts) &&
        Objects.equals(this.allowedOffices, getAccountRulesTemplateResponse.allowedOffices) &&
        Objects.equals(this.systemDefined, getAccountRulesTemplateResponse.systemDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAccounts, allowedOffices, systemDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountRulesTemplateResponse {\n");
    sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
    sb.append("    allowedOffices: ").append(toIndentedString(allowedOffices)).append("\n");
    sb.append("    systemDefined: ").append(toIndentedString(systemDefined)).append("\n");
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

