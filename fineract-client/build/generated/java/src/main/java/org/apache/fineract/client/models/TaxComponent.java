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
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.GLAccount;
import org.apache.fineract.client.models.TaxComponentHistory;
import org.apache.fineract.client.models.TaxGroupMappings;

/**
 * TaxComponent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaxComponent {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Long createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE = "creditAccountType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE)
  private Integer creditAccountType;

  public static final String SERIALIZED_NAME_CREDIT_ACOUNT = "creditAcount";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACOUNT)
  private GLAccount creditAcount;

  public static final String SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE = "debitAccountType";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE)
  private Integer debitAccountType;

  public static final String SERIALIZED_NAME_DEBIT_ACOUNT = "debitAcount";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACOUNT)
  private GLAccount debitAcount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private Long lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_TAX_COMPONENT_HISTORIES = "taxComponentHistories";
  @SerializedName(SERIALIZED_NAME_TAX_COMPONENT_HISTORIES)
  private Set<TaxComponentHistory> taxComponentHistories = null;

  public static final String SERIALIZED_NAME_TAX_GROUP_MAPPINGS = "taxGroupMappings";
  @SerializedName(SERIALIZED_NAME_TAX_GROUP_MAPPINGS)
  private Set<TaxGroupMappings> taxGroupMappings = null;

  public TaxComponent() { 
  }

  public TaxComponent createdBy(Long createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public TaxComponent createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TaxComponent creditAccountType(Integer creditAccountType) {
    
    this.creditAccountType = creditAccountType;
    return this;
  }

   /**
   * Get creditAccountType
   * @return creditAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreditAccountType() {
    return creditAccountType;
  }


  public void setCreditAccountType(Integer creditAccountType) {
    this.creditAccountType = creditAccountType;
  }


  public TaxComponent creditAcount(GLAccount creditAcount) {
    
    this.creditAcount = creditAcount;
    return this;
  }

   /**
   * Get creditAcount
   * @return creditAcount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GLAccount getCreditAcount() {
    return creditAcount;
  }


  public void setCreditAcount(GLAccount creditAcount) {
    this.creditAcount = creditAcount;
  }


  public TaxComponent debitAccountType(Integer debitAccountType) {
    
    this.debitAccountType = debitAccountType;
    return this;
  }

   /**
   * Get debitAccountType
   * @return debitAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDebitAccountType() {
    return debitAccountType;
  }


  public void setDebitAccountType(Integer debitAccountType) {
    this.debitAccountType = debitAccountType;
  }


  public TaxComponent debitAcount(GLAccount debitAcount) {
    
    this.debitAcount = debitAcount;
    return this;
  }

   /**
   * Get debitAcount
   * @return debitAcount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GLAccount getDebitAcount() {
    return debitAcount;
  }


  public void setDebitAcount(GLAccount debitAcount) {
    this.debitAcount = debitAcount;
  }


  public TaxComponent id(Long id) {
    
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


  public TaxComponent lastModifiedBy(Long lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public TaxComponent lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public TaxComponent _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  public TaxComponent percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public TaxComponent taxComponentHistories(Set<TaxComponentHistory> taxComponentHistories) {
    
    this.taxComponentHistories = taxComponentHistories;
    return this;
  }

  public TaxComponent addTaxComponentHistoriesItem(TaxComponentHistory taxComponentHistoriesItem) {
    if (this.taxComponentHistories == null) {
      this.taxComponentHistories = new LinkedHashSet<>();
    }
    this.taxComponentHistories.add(taxComponentHistoriesItem);
    return this;
  }

   /**
   * Get taxComponentHistories
   * @return taxComponentHistories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<TaxComponentHistory> getTaxComponentHistories() {
    return taxComponentHistories;
  }


  public void setTaxComponentHistories(Set<TaxComponentHistory> taxComponentHistories) {
    this.taxComponentHistories = taxComponentHistories;
  }


  public TaxComponent taxGroupMappings(Set<TaxGroupMappings> taxGroupMappings) {
    
    this.taxGroupMappings = taxGroupMappings;
    return this;
  }

  public TaxComponent addTaxGroupMappingsItem(TaxGroupMappings taxGroupMappingsItem) {
    if (this.taxGroupMappings == null) {
      this.taxGroupMappings = new LinkedHashSet<>();
    }
    this.taxGroupMappings.add(taxGroupMappingsItem);
    return this;
  }

   /**
   * Get taxGroupMappings
   * @return taxGroupMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<TaxGroupMappings> getTaxGroupMappings() {
    return taxGroupMappings;
  }


  public void setTaxGroupMappings(Set<TaxGroupMappings> taxGroupMappings) {
    this.taxGroupMappings = taxGroupMappings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxComponent taxComponent = (TaxComponent) o;
    return Objects.equals(this.createdBy, taxComponent.createdBy) &&
        Objects.equals(this.createdDate, taxComponent.createdDate) &&
        Objects.equals(this.creditAccountType, taxComponent.creditAccountType) &&
        Objects.equals(this.creditAcount, taxComponent.creditAcount) &&
        Objects.equals(this.debitAccountType, taxComponent.debitAccountType) &&
        Objects.equals(this.debitAcount, taxComponent.debitAcount) &&
        Objects.equals(this.id, taxComponent.id) &&
        Objects.equals(this.lastModifiedBy, taxComponent.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, taxComponent.lastModifiedDate) &&
        Objects.equals(this._new, taxComponent._new) &&
        Objects.equals(this.percentage, taxComponent.percentage) &&
        Objects.equals(this.taxComponentHistories, taxComponent.taxComponentHistories) &&
        Objects.equals(this.taxGroupMappings, taxComponent.taxGroupMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, creditAccountType, creditAcount, debitAccountType, debitAcount, id, lastModifiedBy, lastModifiedDate, _new, percentage, taxComponentHistories, taxGroupMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxComponent {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    creditAccountType: ").append(toIndentedString(creditAccountType)).append("\n");
    sb.append("    creditAcount: ").append(toIndentedString(creditAcount)).append("\n");
    sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
    sb.append("    debitAcount: ").append(toIndentedString(debitAcount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    taxComponentHistories: ").append(toIndentedString(taxComponentHistories)).append("\n");
    sb.append("    taxGroupMappings: ").append(toIndentedString(taxGroupMappings)).append("\n");
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
