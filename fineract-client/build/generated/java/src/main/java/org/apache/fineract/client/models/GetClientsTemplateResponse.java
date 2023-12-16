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
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.GetClientsDataTables;
import org.apache.fineract.client.models.GetClientsOfficeOptions;
import org.apache.fineract.client.models.GetClientsSavingProductOptions;
import org.apache.fineract.client.models.GetClientsStaffOptions;

/**
 * GetClientsTemplateResponse
 */
@ApiModel(description = "GetClientsTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsTemplateResponse {
  public static final String SERIALIZED_NAME_ACTIVATION_DATE = "activationDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_DATE)
  private LocalDate activationDate;

  public static final String SERIALIZED_NAME_DATATABLES = "datatables";
  @SerializedName(SERIALIZED_NAME_DATATABLES)
  private Set<GetClientsDataTables> datatables = null;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_OFFICE_OPTIONS = "officeOptions";
  @SerializedName(SERIALIZED_NAME_OFFICE_OPTIONS)
  private Set<GetClientsOfficeOptions> officeOptions = null;

  public static final String SERIALIZED_NAME_SAVING_PRODUCT_OPTIONS = "savingProductOptions";
  @SerializedName(SERIALIZED_NAME_SAVING_PRODUCT_OPTIONS)
  private Set<GetClientsSavingProductOptions> savingProductOptions = null;

  public static final String SERIALIZED_NAME_STAFF_OPTIONS = "staffOptions";
  @SerializedName(SERIALIZED_NAME_STAFF_OPTIONS)
  private Set<GetClientsStaffOptions> staffOptions = null;

  public GetClientsTemplateResponse() { 
  }

  public GetClientsTemplateResponse activationDate(LocalDate activationDate) {
    
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getActivationDate() {
    return activationDate;
  }


  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }


  public GetClientsTemplateResponse datatables(Set<GetClientsDataTables> datatables) {
    
    this.datatables = datatables;
    return this;
  }

  public GetClientsTemplateResponse addDatatablesItem(GetClientsDataTables datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new LinkedHashSet<>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

   /**
   * Get datatables
   * @return datatables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsDataTables> getDatatables() {
    return datatables;
  }


  public void setDatatables(Set<GetClientsDataTables> datatables) {
    this.datatables = datatables;
  }


  public GetClientsTemplateResponse officeId(Integer officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  public GetClientsTemplateResponse officeOptions(Set<GetClientsOfficeOptions> officeOptions) {
    
    this.officeOptions = officeOptions;
    return this;
  }

  public GetClientsTemplateResponse addOfficeOptionsItem(GetClientsOfficeOptions officeOptionsItem) {
    if (this.officeOptions == null) {
      this.officeOptions = new LinkedHashSet<>();
    }
    this.officeOptions.add(officeOptionsItem);
    return this;
  }

   /**
   * Get officeOptions
   * @return officeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }


  public void setOfficeOptions(Set<GetClientsOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }


  public GetClientsTemplateResponse savingProductOptions(Set<GetClientsSavingProductOptions> savingProductOptions) {
    
    this.savingProductOptions = savingProductOptions;
    return this;
  }

  public GetClientsTemplateResponse addSavingProductOptionsItem(GetClientsSavingProductOptions savingProductOptionsItem) {
    if (this.savingProductOptions == null) {
      this.savingProductOptions = new LinkedHashSet<>();
    }
    this.savingProductOptions.add(savingProductOptionsItem);
    return this;
  }

   /**
   * Get savingProductOptions
   * @return savingProductOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsSavingProductOptions> getSavingProductOptions() {
    return savingProductOptions;
  }


  public void setSavingProductOptions(Set<GetClientsSavingProductOptions> savingProductOptions) {
    this.savingProductOptions = savingProductOptions;
  }


  public GetClientsTemplateResponse staffOptions(Set<GetClientsStaffOptions> staffOptions) {
    
    this.staffOptions = staffOptions;
    return this;
  }

  public GetClientsTemplateResponse addStaffOptionsItem(GetClientsStaffOptions staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new LinkedHashSet<>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

   /**
   * Get staffOptions
   * @return staffOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetClientsStaffOptions> getStaffOptions() {
    return staffOptions;
  }


  public void setStaffOptions(Set<GetClientsStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsTemplateResponse getClientsTemplateResponse = (GetClientsTemplateResponse) o;
    return Objects.equals(this.activationDate, getClientsTemplateResponse.activationDate) &&
        Objects.equals(this.datatables, getClientsTemplateResponse.datatables) &&
        Objects.equals(this.officeId, getClientsTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getClientsTemplateResponse.officeOptions) &&
        Objects.equals(this.savingProductOptions, getClientsTemplateResponse.savingProductOptions) &&
        Objects.equals(this.staffOptions, getClientsTemplateResponse.staffOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, datatables, officeId, officeOptions, savingProductOptions, staffOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsTemplateResponse {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
    sb.append("    savingProductOptions: ").append(toIndentedString(savingProductOptions)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
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
