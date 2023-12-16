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

/**
 * ProvisioningCriteriaDefinitionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProvisioningCriteriaDefinitionData {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Long categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "categoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_EXPENSE_ACCOUNT = "expenseAccount";
  @SerializedName(SERIALIZED_NAME_EXPENSE_ACCOUNT)
  private Long expenseAccount;

  public static final String SERIALIZED_NAME_EXPENSE_CODE = "expenseCode";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CODE)
  private String expenseCode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LIABILITY_ACCOUNT = "liabilityAccount";
  @SerializedName(SERIALIZED_NAME_LIABILITY_ACCOUNT)
  private Long liabilityAccount;

  public static final String SERIALIZED_NAME_LIABILITY_CODE = "liabilityCode";
  @SerializedName(SERIALIZED_NAME_LIABILITY_CODE)
  private String liabilityCode;

  public static final String SERIALIZED_NAME_MAX_AGE = "maxAge";
  @SerializedName(SERIALIZED_NAME_MAX_AGE)
  private Long maxAge;

  public static final String SERIALIZED_NAME_MIN_AGE = "minAge";
  @SerializedName(SERIALIZED_NAME_MIN_AGE)
  private Long minAge;

  public static final String SERIALIZED_NAME_PROVISIONING_PERCENTAGE = "provisioningPercentage";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_PERCENTAGE)
  private BigDecimal provisioningPercentage;

  public ProvisioningCriteriaDefinitionData() { 
  }

  public ProvisioningCriteriaDefinitionData categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public ProvisioningCriteriaDefinitionData categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ProvisioningCriteriaDefinitionData expenseAccount(Long expenseAccount) {
    
    this.expenseAccount = expenseAccount;
    return this;
  }

   /**
   * Get expenseAccount
   * @return expenseAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExpenseAccount() {
    return expenseAccount;
  }


  public void setExpenseAccount(Long expenseAccount) {
    this.expenseAccount = expenseAccount;
  }


  public ProvisioningCriteriaDefinitionData expenseCode(String expenseCode) {
    
    this.expenseCode = expenseCode;
    return this;
  }

   /**
   * Get expenseCode
   * @return expenseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpenseCode() {
    return expenseCode;
  }


  public void setExpenseCode(String expenseCode) {
    this.expenseCode = expenseCode;
  }


  public ProvisioningCriteriaDefinitionData id(Long id) {
    
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


  public ProvisioningCriteriaDefinitionData liabilityAccount(Long liabilityAccount) {
    
    this.liabilityAccount = liabilityAccount;
    return this;
  }

   /**
   * Get liabilityAccount
   * @return liabilityAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLiabilityAccount() {
    return liabilityAccount;
  }


  public void setLiabilityAccount(Long liabilityAccount) {
    this.liabilityAccount = liabilityAccount;
  }


  public ProvisioningCriteriaDefinitionData liabilityCode(String liabilityCode) {
    
    this.liabilityCode = liabilityCode;
    return this;
  }

   /**
   * Get liabilityCode
   * @return liabilityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLiabilityCode() {
    return liabilityCode;
  }


  public void setLiabilityCode(String liabilityCode) {
    this.liabilityCode = liabilityCode;
  }


  public ProvisioningCriteriaDefinitionData maxAge(Long maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Get maxAge
   * @return maxAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxAge() {
    return maxAge;
  }


  public void setMaxAge(Long maxAge) {
    this.maxAge = maxAge;
  }


  public ProvisioningCriteriaDefinitionData minAge(Long minAge) {
    
    this.minAge = minAge;
    return this;
  }

   /**
   * Get minAge
   * @return minAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMinAge() {
    return minAge;
  }


  public void setMinAge(Long minAge) {
    this.minAge = minAge;
  }


  public ProvisioningCriteriaDefinitionData provisioningPercentage(BigDecimal provisioningPercentage) {
    
    this.provisioningPercentage = provisioningPercentage;
    return this;
  }

   /**
   * Get provisioningPercentage
   * @return provisioningPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getProvisioningPercentage() {
    return provisioningPercentage;
  }


  public void setProvisioningPercentage(BigDecimal provisioningPercentage) {
    this.provisioningPercentage = provisioningPercentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningCriteriaDefinitionData provisioningCriteriaDefinitionData = (ProvisioningCriteriaDefinitionData) o;
    return Objects.equals(this.categoryId, provisioningCriteriaDefinitionData.categoryId) &&
        Objects.equals(this.categoryName, provisioningCriteriaDefinitionData.categoryName) &&
        Objects.equals(this.expenseAccount, provisioningCriteriaDefinitionData.expenseAccount) &&
        Objects.equals(this.expenseCode, provisioningCriteriaDefinitionData.expenseCode) &&
        Objects.equals(this.id, provisioningCriteriaDefinitionData.id) &&
        Objects.equals(this.liabilityAccount, provisioningCriteriaDefinitionData.liabilityAccount) &&
        Objects.equals(this.liabilityCode, provisioningCriteriaDefinitionData.liabilityCode) &&
        Objects.equals(this.maxAge, provisioningCriteriaDefinitionData.maxAge) &&
        Objects.equals(this.minAge, provisioningCriteriaDefinitionData.minAge) &&
        Objects.equals(this.provisioningPercentage, provisioningCriteriaDefinitionData.provisioningPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, expenseAccount, expenseCode, id, liabilityAccount, liabilityCode, maxAge, minAge, provisioningPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningCriteriaDefinitionData {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    expenseAccount: ").append(toIndentedString(expenseAccount)).append("\n");
    sb.append("    expenseCode: ").append(toIndentedString(expenseCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    liabilityAccount: ").append(toIndentedString(liabilityAccount)).append("\n");
    sb.append("    liabilityCode: ").append(toIndentedString(liabilityCode)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    provisioningPercentage: ").append(toIndentedString(provisioningPercentage)).append("\n");
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

