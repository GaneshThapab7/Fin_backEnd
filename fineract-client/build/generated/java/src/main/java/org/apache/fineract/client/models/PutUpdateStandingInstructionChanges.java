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
 * PutUpdateStandingInstructionChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutUpdateStandingInstructionChanges {
  public static final String SERIALIZED_NAME_RECURRENCE_INTERVAL = "recurrenceInterval";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_INTERVAL)
  private Integer recurrenceInterval;

  public PutUpdateStandingInstructionChanges() { 
  }

  public PutUpdateStandingInstructionChanges recurrenceInterval(Integer recurrenceInterval) {
    
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }


  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutUpdateStandingInstructionChanges putUpdateStandingInstructionChanges = (PutUpdateStandingInstructionChanges) o;
    return Objects.equals(this.recurrenceInterval, putUpdateStandingInstructionChanges.recurrenceInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrenceInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutUpdateStandingInstructionChanges {\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
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

