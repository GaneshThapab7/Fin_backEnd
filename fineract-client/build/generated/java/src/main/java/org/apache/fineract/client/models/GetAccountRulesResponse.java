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
import org.apache.fineract.client.models.AccountingTagRuleData;

/**
 * GetAccountRulesResponse
 */
@ApiModel(description = "GetAccountRulesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountRulesResponse {
  public static final String SERIALIZED_NAME_ALLOW_MULTIPLE_CREDIT_ENTRIES = "allowMultipleCreditEntries";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTIPLE_CREDIT_ENTRIES)
  private Boolean allowMultipleCreditEntries;

  public static final String SERIALIZED_NAME_ALLOW_MULTIPLE_DEBIT_ENTRIES = "allowMultipleDebitEntries";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTIPLE_DEBIT_ENTRIES)
  private Boolean allowMultipleDebitEntries;

  public static final String SERIALIZED_NAME_CREDIT_TAGS = "creditTags";
  @SerializedName(SERIALIZED_NAME_CREDIT_TAGS)
  private List<AccountingTagRuleData> creditTags = null;

  public static final String SERIALIZED_NAME_DEBIT_TAGS = "debitTags";
  @SerializedName(SERIALIZED_NAME_DEBIT_TAGS)
  private List<AccountingTagRuleData> debitTags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_SYSTEM_DEFINED = "systemDefined";
  @SerializedName(SERIALIZED_NAME_SYSTEM_DEFINED)
  private Boolean systemDefined;

  public GetAccountRulesResponse() { 
  }

  public GetAccountRulesResponse allowMultipleCreditEntries(Boolean allowMultipleCreditEntries) {
    
    this.allowMultipleCreditEntries = allowMultipleCreditEntries;
    return this;
  }

   /**
   * Get allowMultipleCreditEntries
   * @return allowMultipleCreditEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowMultipleCreditEntries() {
    return allowMultipleCreditEntries;
  }


  public void setAllowMultipleCreditEntries(Boolean allowMultipleCreditEntries) {
    this.allowMultipleCreditEntries = allowMultipleCreditEntries;
  }


  public GetAccountRulesResponse allowMultipleDebitEntries(Boolean allowMultipleDebitEntries) {
    
    this.allowMultipleDebitEntries = allowMultipleDebitEntries;
    return this;
  }

   /**
   * Get allowMultipleDebitEntries
   * @return allowMultipleDebitEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowMultipleDebitEntries() {
    return allowMultipleDebitEntries;
  }


  public void setAllowMultipleDebitEntries(Boolean allowMultipleDebitEntries) {
    this.allowMultipleDebitEntries = allowMultipleDebitEntries;
  }


  public GetAccountRulesResponse creditTags(List<AccountingTagRuleData> creditTags) {
    
    this.creditTags = creditTags;
    return this;
  }

  public GetAccountRulesResponse addCreditTagsItem(AccountingTagRuleData creditTagsItem) {
    if (this.creditTags == null) {
      this.creditTags = new ArrayList<>();
    }
    this.creditTags.add(creditTagsItem);
    return this;
  }

   /**
   * Get creditTags
   * @return creditTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountingTagRuleData> getCreditTags() {
    return creditTags;
  }


  public void setCreditTags(List<AccountingTagRuleData> creditTags) {
    this.creditTags = creditTags;
  }


  public GetAccountRulesResponse debitTags(List<AccountingTagRuleData> debitTags) {
    
    this.debitTags = debitTags;
    return this;
  }

  public GetAccountRulesResponse addDebitTagsItem(AccountingTagRuleData debitTagsItem) {
    if (this.debitTags == null) {
      this.debitTags = new ArrayList<>();
    }
    this.debitTags.add(debitTagsItem);
    return this;
  }

   /**
   * Get debitTags
   * @return debitTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountingTagRuleData> getDebitTags() {
    return debitTags;
  }


  public void setDebitTags(List<AccountingTagRuleData> debitTags) {
    this.debitTags = debitTags;
  }


  public GetAccountRulesResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetAccountRulesResponse id(Long id) {
    
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


  public GetAccountRulesResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetAccountRulesResponse officeId(Long officeId) {
    
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


  public GetAccountRulesResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetAccountRulesResponse systemDefined(Boolean systemDefined) {
    
    this.systemDefined = systemDefined;
    return this;
  }

   /**
   * Get systemDefined
   * @return systemDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    GetAccountRulesResponse getAccountRulesResponse = (GetAccountRulesResponse) o;
    return Objects.equals(this.allowMultipleCreditEntries, getAccountRulesResponse.allowMultipleCreditEntries) &&
        Objects.equals(this.allowMultipleDebitEntries, getAccountRulesResponse.allowMultipleDebitEntries) &&
        Objects.equals(this.creditTags, getAccountRulesResponse.creditTags) &&
        Objects.equals(this.debitTags, getAccountRulesResponse.debitTags) &&
        Objects.equals(this.description, getAccountRulesResponse.description) &&
        Objects.equals(this.id, getAccountRulesResponse.id) &&
        Objects.equals(this.name, getAccountRulesResponse.name) &&
        Objects.equals(this.officeId, getAccountRulesResponse.officeId) &&
        Objects.equals(this.officeName, getAccountRulesResponse.officeName) &&
        Objects.equals(this.systemDefined, getAccountRulesResponse.systemDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMultipleCreditEntries, allowMultipleDebitEntries, creditTags, debitTags, description, id, name, officeId, officeName, systemDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountRulesResponse {\n");
    sb.append("    allowMultipleCreditEntries: ").append(toIndentedString(allowMultipleCreditEntries)).append("\n");
    sb.append("    allowMultipleDebitEntries: ").append(toIndentedString(allowMultipleDebitEntries)).append("\n");
    sb.append("    creditTags: ").append(toIndentedString(creditTags)).append("\n");
    sb.append("    debitTags: ").append(toIndentedString(debitTags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
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

