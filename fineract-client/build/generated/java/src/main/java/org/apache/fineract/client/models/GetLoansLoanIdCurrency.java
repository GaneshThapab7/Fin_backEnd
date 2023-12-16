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
 * GetLoansLoanIdCurrency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetLoansLoanIdCurrency {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  private String displayLabel;

  public static final String SERIALIZED_NAME_DISPLAY_SYMBOL = "displaySymbol";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SYMBOL)
  private String displaySymbol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_CODE = "nameCode";
  @SerializedName(SERIALIZED_NAME_NAME_CODE)
  private String nameCode;

  public GetLoansLoanIdCurrency() { 
  }

  public GetLoansLoanIdCurrency code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UGX", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetLoansLoanIdCurrency decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * Get decimalPlaces
   * @return decimalPlaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public GetLoansLoanIdCurrency displayLabel(String displayLabel) {
    
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * Get displayLabel
   * @return displayLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Uganda Shilling (USh)", value = "")

  public String getDisplayLabel() {
    return displayLabel;
  }


  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  public GetLoansLoanIdCurrency displaySymbol(String displaySymbol) {
    
    this.displaySymbol = displaySymbol;
    return this;
  }

   /**
   * Get displaySymbol
   * @return displaySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USh", value = "")

  public String getDisplaySymbol() {
    return displaySymbol;
  }


  public void setDisplaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
  }


  public GetLoansLoanIdCurrency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Uganda Shilling", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetLoansLoanIdCurrency nameCode(String nameCode) {
    
    this.nameCode = nameCode;
    return this;
  }

   /**
   * Get nameCode
   * @return nameCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "currency.UGX", value = "")

  public String getNameCode() {
    return nameCode;
  }


  public void setNameCode(String nameCode) {
    this.nameCode = nameCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdCurrency getLoansLoanIdCurrency = (GetLoansLoanIdCurrency) o;
    return Objects.equals(this.code, getLoansLoanIdCurrency.code) &&
        Objects.equals(this.decimalPlaces, getLoansLoanIdCurrency.decimalPlaces) &&
        Objects.equals(this.displayLabel, getLoansLoanIdCurrency.displayLabel) &&
        Objects.equals(this.displaySymbol, getLoansLoanIdCurrency.displaySymbol) &&
        Objects.equals(this.name, getLoansLoanIdCurrency.name) &&
        Objects.equals(this.nameCode, getLoansLoanIdCurrency.nameCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, decimalPlaces, displayLabel, displaySymbol, name, nameCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdCurrency {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameCode: ").append(toIndentedString(nameCode)).append("\n");
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

