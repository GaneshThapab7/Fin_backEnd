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

/**
 * Address requests
 */
@ApiModel(description = "Address requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostClientsAddressRequest {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "addressLine3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE_ID = "addressTypeId";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE_ID)
  private Long addressTypeId;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private Integer countryId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private Long postalCode;

  public static final String SERIALIZED_NAME_STATE_PROVINCE_ID = "stateProvinceId";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE_ID)
  private Integer stateProvinceId;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public PostClientsAddressRequest() { 
  }

  public PostClientsAddressRequest addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kandivali", value = "")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public PostClientsAddressRequest addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "plot47", value = "")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public PostClientsAddressRequest addressLine3(String addressLine3) {
    
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Get addressLine3
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "charkop", value = "")

  public String getAddressLine3() {
    return addressLine3;
  }


  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public PostClientsAddressRequest addressTypeId(Long addressTypeId) {
    
    this.addressTypeId = addressTypeId;
    return this;
  }

   /**
   * Get addressTypeId
   * @return addressTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getAddressTypeId() {
    return addressTypeId;
  }


  public void setAddressTypeId(Long addressTypeId) {
    this.addressTypeId = addressTypeId;
  }


  public PostClientsAddressRequest city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mumbai", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PostClientsAddressRequest countryId(Integer countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "802", value = "")

  public Integer getCountryId() {
    return countryId;
  }


  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }


  public PostClientsAddressRequest isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PostClientsAddressRequest postalCode(Long postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400064", value = "")

  public Long getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(Long postalCode) {
    this.postalCode = postalCode;
  }


  public PostClientsAddressRequest stateProvinceId(Integer stateProvinceId) {
    
    this.stateProvinceId = stateProvinceId;
    return this;
  }

   /**
   * Get stateProvinceId
   * @return stateProvinceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "800", value = "")

  public Integer getStateProvinceId() {
    return stateProvinceId;
  }


  public void setStateProvinceId(Integer stateProvinceId) {
    this.stateProvinceId = stateProvinceId;
  }


  public PostClientsAddressRequest street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ipca", value = "")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostClientsAddressRequest postClientsAddressRequest = (PostClientsAddressRequest) o;
    return Objects.equals(this.addressLine1, postClientsAddressRequest.addressLine1) &&
        Objects.equals(this.addressLine2, postClientsAddressRequest.addressLine2) &&
        Objects.equals(this.addressLine3, postClientsAddressRequest.addressLine3) &&
        Objects.equals(this.addressTypeId, postClientsAddressRequest.addressTypeId) &&
        Objects.equals(this.city, postClientsAddressRequest.city) &&
        Objects.equals(this.countryId, postClientsAddressRequest.countryId) &&
        Objects.equals(this.isActive, postClientsAddressRequest.isActive) &&
        Objects.equals(this.postalCode, postClientsAddressRequest.postalCode) &&
        Objects.equals(this.stateProvinceId, postClientsAddressRequest.stateProvinceId) &&
        Objects.equals(this.street, postClientsAddressRequest.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressLine3, addressTypeId, city, countryId, isActive, postalCode, stateProvinceId, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostClientsAddressRequest {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressTypeId: ").append(toIndentedString(addressTypeId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProvinceId: ").append(toIndentedString(stateProvinceId)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

