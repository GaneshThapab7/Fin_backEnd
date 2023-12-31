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
import org.apache.fineract.client.models.GetCentersOfficeOptions;
import org.apache.fineract.client.models.GetCentersStaffOptions;

/**
 * GetCentersTemplateResponse
 */
@ApiModel(description = "GetCentersTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetCentersTemplateResponse {
  public static final String SERIALIZED_NAME_ACTIVATION_DATE = "activationDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_DATE)
  private LocalDate activationDate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_OFFICE_OPTIONS = "officeOptions";
  @SerializedName(SERIALIZED_NAME_OFFICE_OPTIONS)
  private Set<GetCentersOfficeOptions> officeOptions = null;

  public static final String SERIALIZED_NAME_STAFF_OPTIONS = "staffOptions";
  @SerializedName(SERIALIZED_NAME_STAFF_OPTIONS)
  private Set<GetCentersStaffOptions> staffOptions = null;

  public GetCentersTemplateResponse() { 
  }

  public GetCentersTemplateResponse activationDate(LocalDate activationDate) {
    
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


  public GetCentersTemplateResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetCentersTemplateResponse officeId(Integer officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  public GetCentersTemplateResponse officeOptions(Set<GetCentersOfficeOptions> officeOptions) {
    
    this.officeOptions = officeOptions;
    return this;
  }

  public GetCentersTemplateResponse addOfficeOptionsItem(GetCentersOfficeOptions officeOptionsItem) {
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

  public Set<GetCentersOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }


  public void setOfficeOptions(Set<GetCentersOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }


  public GetCentersTemplateResponse staffOptions(Set<GetCentersStaffOptions> staffOptions) {
    
    this.staffOptions = staffOptions;
    return this;
  }

  public GetCentersTemplateResponse addStaffOptionsItem(GetCentersStaffOptions staffOptionsItem) {
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

  public Set<GetCentersStaffOptions> getStaffOptions() {
    return staffOptions;
  }


  public void setStaffOptions(Set<GetCentersStaffOptions> staffOptions) {
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
    GetCentersTemplateResponse getCentersTemplateResponse = (GetCentersTemplateResponse) o;
    return Objects.equals(this.activationDate, getCentersTemplateResponse.activationDate) &&
        Objects.equals(this.active, getCentersTemplateResponse.active) &&
        Objects.equals(this.officeId, getCentersTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getCentersTemplateResponse.officeOptions) &&
        Objects.equals(this.staffOptions, getCentersTemplateResponse.staffOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, active, officeId, officeOptions, staffOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCentersTemplateResponse {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
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

