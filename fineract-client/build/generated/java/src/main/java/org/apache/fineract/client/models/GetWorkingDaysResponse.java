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
import org.apache.fineract.client.models.EnumOptionData;

/**
 * GetWorkingDaysResponse
 */
@ApiModel(description = "GetWorkingDaysResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetWorkingDaysResponse {
  public static final String SERIALIZED_NAME_EXTEND_TERM_FOR_DAILY_REPAYMENTS = "extendTermForDailyRepayments";
  @SerializedName(SERIALIZED_NAME_EXTEND_TERM_FOR_DAILY_REPAYMENTS)
  private Boolean extendTermForDailyRepayments;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private String recurrence;

  public static final String SERIALIZED_NAME_REPAYMENT_RESCHEDULE_TYPE = "repaymentRescheduleType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_RESCHEDULE_TYPE)
  private EnumOptionData repaymentRescheduleType;

  public GetWorkingDaysResponse() { 
  }

  public GetWorkingDaysResponse extendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
    return this;
  }

   /**
   * Get extendTermForDailyRepayments
   * @return extendTermForDailyRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getExtendTermForDailyRepayments() {
    return extendTermForDailyRepayments;
  }


  public void setExtendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
  }


  public GetWorkingDaysResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetWorkingDaysResponse recurrence(String recurrence) {
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR", value = "")

  public String getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }


  public GetWorkingDaysResponse repaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    
    this.repaymentRescheduleType = repaymentRescheduleType;
    return this;
  }

   /**
   * Get repaymentRescheduleType
   * @return repaymentRescheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getRepaymentRescheduleType() {
    return repaymentRescheduleType;
  }


  public void setRepaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    this.repaymentRescheduleType = repaymentRescheduleType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWorkingDaysResponse getWorkingDaysResponse = (GetWorkingDaysResponse) o;
    return Objects.equals(this.extendTermForDailyRepayments, getWorkingDaysResponse.extendTermForDailyRepayments) &&
        Objects.equals(this.id, getWorkingDaysResponse.id) &&
        Objects.equals(this.recurrence, getWorkingDaysResponse.recurrence) &&
        Objects.equals(this.repaymentRescheduleType, getWorkingDaysResponse.repaymentRescheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendTermForDailyRepayments, id, recurrence, repaymentRescheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWorkingDaysResponse {\n");
    sb.append("    extendTermForDailyRepayments: ").append(toIndentedString(extendTermForDailyRepayments)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    repaymentRescheduleType: ").append(toIndentedString(repaymentRescheduleType)).append("\n");
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

