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
import org.apache.fineract.client.models.StaffData;

/**
 * GetTellersTellerIdCashiersTemplateResponse
 */
@ApiModel(description = "GetTellersTellerIdCashiersTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTellersTellerIdCashiersTemplateResponse {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_STAFF_OPTIONS = "staffOptions";
  @SerializedName(SERIALIZED_NAME_STAFF_OPTIONS)
  private List<StaffData> staffOptions = null;

  public static final String SERIALIZED_NAME_TELLER_ID = "tellerId";
  @SerializedName(SERIALIZED_NAME_TELLER_ID)
  private Long tellerId;

  public static final String SERIALIZED_NAME_TELLER_NAME = "tellerName";
  @SerializedName(SERIALIZED_NAME_TELLER_NAME)
  private String tellerName;

  public GetTellersTellerIdCashiersTemplateResponse() { 
  }

  public GetTellersTellerIdCashiersTemplateResponse officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public GetTellersTellerIdCashiersTemplateResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetTellersTellerIdCashiersTemplateResponse staffOptions(List<StaffData> staffOptions) {
    
    this.staffOptions = staffOptions;
    return this;
  }

  public GetTellersTellerIdCashiersTemplateResponse addStaffOptionsItem(StaffData staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<>();
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

  public List<StaffData> getStaffOptions() {
    return staffOptions;
  }


  public void setStaffOptions(List<StaffData> staffOptions) {
    this.staffOptions = staffOptions;
  }


  public GetTellersTellerIdCashiersTemplateResponse tellerId(Long tellerId) {
    
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getTellerId() {
    return tellerId;
  }


  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }


  public GetTellersTellerIdCashiersTemplateResponse tellerName(String tellerName) {
    
    this.tellerName = tellerName;
    return this;
  }

   /**
   * Get tellerName
   * @return tellerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Teller1", value = "")

  public String getTellerName() {
    return tellerName;
  }


  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersTemplateResponse getTellersTellerIdCashiersTemplateResponse = (GetTellersTellerIdCashiersTemplateResponse) o;
    return Objects.equals(this.officeId, getTellersTellerIdCashiersTemplateResponse.officeId) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersTemplateResponse.officeName) &&
        Objects.equals(this.staffOptions, getTellersTellerIdCashiersTemplateResponse.staffOptions) &&
        Objects.equals(this.tellerId, getTellersTellerIdCashiersTemplateResponse.tellerId) &&
        Objects.equals(this.tellerName, getTellersTellerIdCashiersTemplateResponse.tellerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, officeName, staffOptions, tellerId, tellerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersTemplateResponse {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
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

