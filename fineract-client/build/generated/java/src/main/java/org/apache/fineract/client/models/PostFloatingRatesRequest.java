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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.PostFloatingRatesRatePeriods;

/**
 * PostFloatingRatesRequest
 */
@ApiModel(description = "PostFloatingRatesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostFloatingRatesRequest {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_BASE_LENDING_RATE = "isBaseLendingRate";
  @SerializedName(SERIALIZED_NAME_IS_BASE_LENDING_RATE)
  private Boolean isBaseLendingRate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE_PERIODS = "ratePeriods";
  @SerializedName(SERIALIZED_NAME_RATE_PERIODS)
  private Set<PostFloatingRatesRatePeriods> ratePeriods = null;

  public PostFloatingRatesRequest() { 
  }

  public PostFloatingRatesRequest isActive(Boolean isActive) {
    
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


  public PostFloatingRatesRequest isBaseLendingRate(Boolean isBaseLendingRate) {
    
    this.isBaseLendingRate = isBaseLendingRate;
    return this;
  }

   /**
   * Get isBaseLendingRate
   * @return isBaseLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsBaseLendingRate() {
    return isBaseLendingRate;
  }


  public void setIsBaseLendingRate(Boolean isBaseLendingRate) {
    this.isBaseLendingRate = isBaseLendingRate;
  }


  public PostFloatingRatesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Floating Rate 1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostFloatingRatesRequest ratePeriods(Set<PostFloatingRatesRatePeriods> ratePeriods) {
    
    this.ratePeriods = ratePeriods;
    return this;
  }

  public PostFloatingRatesRequest addRatePeriodsItem(PostFloatingRatesRatePeriods ratePeriodsItem) {
    if (this.ratePeriods == null) {
      this.ratePeriods = new LinkedHashSet<>();
    }
    this.ratePeriods.add(ratePeriodsItem);
    return this;
  }

   /**
   * Get ratePeriods
   * @return ratePeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<PostFloatingRatesRatePeriods> getRatePeriods() {
    return ratePeriods;
  }


  public void setRatePeriods(Set<PostFloatingRatesRatePeriods> ratePeriods) {
    this.ratePeriods = ratePeriods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFloatingRatesRequest postFloatingRatesRequest = (PostFloatingRatesRequest) o;
    return Objects.equals(this.isActive, postFloatingRatesRequest.isActive) &&
        Objects.equals(this.isBaseLendingRate, postFloatingRatesRequest.isBaseLendingRate) &&
        Objects.equals(this.name, postFloatingRatesRequest.name) &&
        Objects.equals(this.ratePeriods, postFloatingRatesRequest.ratePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, isBaseLendingRate, name, ratePeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFloatingRatesRequest {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isBaseLendingRate: ").append(toIndentedString(isBaseLendingRate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratePeriods: ").append(toIndentedString(ratePeriods)).append("\n");
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

