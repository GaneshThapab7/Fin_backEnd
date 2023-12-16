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
 * LookupTableEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LookupTableEntry {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private Integer valueFrom;

  public static final String SERIALIZED_NAME_VALUE_TO = "valueTo";
  @SerializedName(SERIALIZED_NAME_VALUE_TO)
  private Integer valueTo;

  public LookupTableEntry() { 
  }

  public LookupTableEntry score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }


  public LookupTableEntry valueFrom(Integer valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }


  public LookupTableEntry valueTo(Integer valueTo) {
    
    this.valueTo = valueTo;
    return this;
  }

   /**
   * Get valueTo
   * @return valueTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValueTo() {
    return valueTo;
  }


  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupTableEntry lookupTableEntry = (LookupTableEntry) o;
    return Objects.equals(this.score, lookupTableEntry.score) &&
        Objects.equals(this.valueFrom, lookupTableEntry.valueFrom) &&
        Objects.equals(this.valueTo, lookupTableEntry.valueTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, valueFrom, valueTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupTableEntry {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
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
