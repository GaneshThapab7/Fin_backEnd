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
 * PostalAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostalAddress {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "stateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public PostalAddress() { 
  }

  public PostalAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public PostalAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public PostalAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PostalAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PostalAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PostalAddress stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.addressLine1, postalAddress.addressLine1) &&
        Objects.equals(this.addressLine2, postalAddress.addressLine2) &&
        Objects.equals(this.city, postalAddress.city) &&
        Objects.equals(this.country, postalAddress.country) &&
        Objects.equals(this.postalCode, postalAddress.postalCode) &&
        Objects.equals(this.stateProvince, postalAddress.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, country, postalCode, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

