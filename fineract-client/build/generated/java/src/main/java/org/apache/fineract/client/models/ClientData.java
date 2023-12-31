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

/**
 * ClientData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClientData {
  public static final String SERIALIZED_NAME_ACTIVATION_DATE = "activationDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_DATE)
  private LocalDate activationDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private Long imageId;

  public static final String SERIALIZED_NAME_IMAGE_PRESENT = "imagePresent";
  @SerializedName(SERIALIZED_NAME_IMAGE_PRESENT)
  private Boolean imagePresent;

  public static final String SERIALIZED_NAME_IS_ADDRESS_ENABLED = "isAddressEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ADDRESS_ENABLED)
  private Boolean isAddressEnabled;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_ROW_INDEX = "rowIndex";
  @SerializedName(SERIALIZED_NAME_ROW_INDEX)
  private Integer rowIndex;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNT_ID = "savingsAccountId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNT_ID)
  private Long savingsAccountId;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private Object timeline;

  public ClientData() { 
  }

  public ClientData activationDate(LocalDate activationDate) {
    
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


  public ClientData externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public ClientData firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public ClientData id(Long id) {
    
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


  public ClientData imageId(Long imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getImageId() {
    return imageId;
  }


  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }


  public ClientData imagePresent(Boolean imagePresent) {
    
    this.imagePresent = imagePresent;
    return this;
  }

   /**
   * Get imagePresent
   * @return imagePresent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getImagePresent() {
    return imagePresent;
  }


  public void setImagePresent(Boolean imagePresent) {
    this.imagePresent = imagePresent;
  }


  public ClientData isAddressEnabled(Boolean isAddressEnabled) {
    
    this.isAddressEnabled = isAddressEnabled;
    return this;
  }

   /**
   * Get isAddressEnabled
   * @return isAddressEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAddressEnabled() {
    return isAddressEnabled;
  }


  public void setIsAddressEnabled(Boolean isAddressEnabled) {
    this.isAddressEnabled = isAddressEnabled;
  }


  public ClientData lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public ClientData officeName(String officeName) {
    
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


  public ClientData rowIndex(Integer rowIndex) {
    
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Get rowIndex
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRowIndex() {
    return rowIndex;
  }


  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  public ClientData savingsAccountId(Long savingsAccountId) {
    
    this.savingsAccountId = savingsAccountId;
    return this;
  }

   /**
   * Get savingsAccountId
   * @return savingsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSavingsAccountId() {
    return savingsAccountId;
  }


  public void setSavingsAccountId(Long savingsAccountId) {
    this.savingsAccountId = savingsAccountId;
  }


  public ClientData timeline(Object timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTimeline() {
    return timeline;
  }


  public void setTimeline(Object timeline) {
    this.timeline = timeline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientData clientData = (ClientData) o;
    return Objects.equals(this.activationDate, clientData.activationDate) &&
        Objects.equals(this.externalId, clientData.externalId) &&
        Objects.equals(this.firstname, clientData.firstname) &&
        Objects.equals(this.id, clientData.id) &&
        Objects.equals(this.imageId, clientData.imageId) &&
        Objects.equals(this.imagePresent, clientData.imagePresent) &&
        Objects.equals(this.isAddressEnabled, clientData.isAddressEnabled) &&
        Objects.equals(this.lastname, clientData.lastname) &&
        Objects.equals(this.officeName, clientData.officeName) &&
        Objects.equals(this.rowIndex, clientData.rowIndex) &&
        Objects.equals(this.savingsAccountId, clientData.savingsAccountId) &&
        Objects.equals(this.timeline, clientData.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, externalId, firstname, id, imageId, imagePresent, isAddressEnabled, lastname, officeName, rowIndex, savingsAccountId, timeline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientData {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imagePresent: ").append(toIndentedString(imagePresent)).append("\n");
    sb.append("    isAddressEnabled: ").append(toIndentedString(isAddressEnabled)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    savingsAccountId: ").append(toIndentedString(savingsAccountId)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

