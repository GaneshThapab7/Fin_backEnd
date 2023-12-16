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
import java.time.OffsetDateTime;

/**
 * PostSurveySurveyNameApptableIdRequest
 */
@ApiModel(description = "PostSurveySurveyNameApptableIdRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostSurveySurveyNameApptableIdRequest {
  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private OffsetDateTime dateFormat;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PPI_BUSINESSOCCUPATION_CD_Q3_BUSINESSOCCUPATION = "ppi_businessoccupation_cd_q3_businessoccupation";
  @SerializedName(SERIALIZED_NAME_PPI_BUSINESSOCCUPATION_CD_Q3_BUSINESSOCCUPATION)
  private Long ppiBusinessoccupationCdQ3Businessoccupation;

  public static final String SERIALIZED_NAME_PPI_FLOORTYPE_CD_Q5_FLOORTYPE = "ppi_floortype_cd_q5_floortype";
  @SerializedName(SERIALIZED_NAME_PPI_FLOORTYPE_CD_Q5_FLOORTYPE)
  private Long ppiFloortypeCdQ5Floortype;

  public static final String SERIALIZED_NAME_PPI_FRYINGPANS_CD_Q10_FRYINGPANS = "ppi_fryingpans_cd_q10_fryingpans";
  @SerializedName(SERIALIZED_NAME_PPI_FRYINGPANS_CD_Q10_FRYINGPANS)
  private Long ppiFryingpansCdQ10Fryingpans;

  public static final String SERIALIZED_NAME_PPI_HABITABLEROOMS_CD_Q4_HABITABLEROOMS = "ppi_habitablerooms_cd_q4_habitablerooms";
  @SerializedName(SERIALIZED_NAME_PPI_HABITABLEROOMS_CD_Q4_HABITABLEROOMS)
  private Long ppiHabitableroomsCdQ4Habitablerooms;

  public static final String SERIALIZED_NAME_PPI_HIGHESTSCHOOL_CD_Q2_HIGHESTSCHOOL = "ppi_highestschool_cd_q2_highestschool";
  @SerializedName(SERIALIZED_NAME_PPI_HIGHESTSCHOOL_CD_Q2_HIGHESTSCHOOL)
  private Long ppiHighestschoolCdQ2Highestschool;

  public static final String SERIALIZED_NAME_PPI_HOUSEHOLD_MEMBERS_CD_Q1_HOUSEHOLDMEMBERS = "ppi_household_members_cd_q1_householdmembers";
  @SerializedName(SERIALIZED_NAME_PPI_HOUSEHOLD_MEMBERS_CD_Q1_HOUSEHOLDMEMBERS)
  private Long ppiHouseholdMembersCdQ1Householdmembers;

  public static final String SERIALIZED_NAME_PPI_IRONS_CD_Q7_IRONS = "ppi_irons_cd_q7_irons";
  @SerializedName(SERIALIZED_NAME_PPI_IRONS_CD_Q7_IRONS)
  private Long ppiIronsCdQ7Irons;

  public static final String SERIALIZED_NAME_PPI_LIGHTINGSOURCE_CD_Q6_LIGHTINGSOURCE = "ppi_lightingsource_cd_q6_lightingsource";
  @SerializedName(SERIALIZED_NAME_PPI_LIGHTINGSOURCE_CD_Q6_LIGHTINGSOURCE)
  private Long ppiLightingsourceCdQ6Lightingsource;

  public static final String SERIALIZED_NAME_PPI_MOSQUITONETS_CD_Q8_MOSQUITONETS = "ppi_mosquitonets_cd_q8_mosquitonets";
  @SerializedName(SERIALIZED_NAME_PPI_MOSQUITONETS_CD_Q8_MOSQUITONETS)
  private Long ppiMosquitonetsCdQ8Mosquitonets;

  public static final String SERIALIZED_NAME_PPI_TOWELS_CD_Q9_TOWELS = "ppi_towels_cd_q9_towels";
  @SerializedName(SERIALIZED_NAME_PPI_TOWELS_CD_Q9_TOWELS)
  private Long ppiTowelsCdQ9Towels;

  public PostSurveySurveyNameApptableIdRequest() { 
  }

  public PostSurveySurveyNameApptableIdRequest date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public PostSurveySurveyNameApptableIdRequest dateFormat(OffsetDateTime dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(OffsetDateTime dateFormat) {
    this.dateFormat = dateFormat;
  }


  public PostSurveySurveyNameApptableIdRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en_GB", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostSurveySurveyNameApptableIdRequest ppiBusinessoccupationCdQ3Businessoccupation(Long ppiBusinessoccupationCdQ3Businessoccupation) {
    
    this.ppiBusinessoccupationCdQ3Businessoccupation = ppiBusinessoccupationCdQ3Businessoccupation;
    return this;
  }

   /**
   * Get ppiBusinessoccupationCdQ3Businessoccupation
   * @return ppiBusinessoccupationCdQ3Businessoccupation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "180", value = "")

  public Long getPpiBusinessoccupationCdQ3Businessoccupation() {
    return ppiBusinessoccupationCdQ3Businessoccupation;
  }


  public void setPpiBusinessoccupationCdQ3Businessoccupation(Long ppiBusinessoccupationCdQ3Businessoccupation) {
    this.ppiBusinessoccupationCdQ3Businessoccupation = ppiBusinessoccupationCdQ3Businessoccupation;
  }


  public PostSurveySurveyNameApptableIdRequest ppiFloortypeCdQ5Floortype(Long ppiFloortypeCdQ5Floortype) {
    
    this.ppiFloortypeCdQ5Floortype = ppiFloortypeCdQ5Floortype;
    return this;
  }

   /**
   * Get ppiFloortypeCdQ5Floortype
   * @return ppiFloortypeCdQ5Floortype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "188", value = "")

  public Long getPpiFloortypeCdQ5Floortype() {
    return ppiFloortypeCdQ5Floortype;
  }


  public void setPpiFloortypeCdQ5Floortype(Long ppiFloortypeCdQ5Floortype) {
    this.ppiFloortypeCdQ5Floortype = ppiFloortypeCdQ5Floortype;
  }


  public PostSurveySurveyNameApptableIdRequest ppiFryingpansCdQ10Fryingpans(Long ppiFryingpansCdQ10Fryingpans) {
    
    this.ppiFryingpansCdQ10Fryingpans = ppiFryingpansCdQ10Fryingpans;
    return this;
  }

   /**
   * Get ppiFryingpansCdQ10Fryingpans
   * @return ppiFryingpansCdQ10Fryingpans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201", value = "")

  public Long getPpiFryingpansCdQ10Fryingpans() {
    return ppiFryingpansCdQ10Fryingpans;
  }


  public void setPpiFryingpansCdQ10Fryingpans(Long ppiFryingpansCdQ10Fryingpans) {
    this.ppiFryingpansCdQ10Fryingpans = ppiFryingpansCdQ10Fryingpans;
  }


  public PostSurveySurveyNameApptableIdRequest ppiHabitableroomsCdQ4Habitablerooms(Long ppiHabitableroomsCdQ4Habitablerooms) {
    
    this.ppiHabitableroomsCdQ4Habitablerooms = ppiHabitableroomsCdQ4Habitablerooms;
    return this;
  }

   /**
   * Get ppiHabitableroomsCdQ4Habitablerooms
   * @return ppiHabitableroomsCdQ4Habitablerooms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "184", value = "")

  public Long getPpiHabitableroomsCdQ4Habitablerooms() {
    return ppiHabitableroomsCdQ4Habitablerooms;
  }


  public void setPpiHabitableroomsCdQ4Habitablerooms(Long ppiHabitableroomsCdQ4Habitablerooms) {
    this.ppiHabitableroomsCdQ4Habitablerooms = ppiHabitableroomsCdQ4Habitablerooms;
  }


  public PostSurveySurveyNameApptableIdRequest ppiHighestschoolCdQ2Highestschool(Long ppiHighestschoolCdQ2Highestschool) {
    
    this.ppiHighestschoolCdQ2Highestschool = ppiHighestschoolCdQ2Highestschool;
    return this;
  }

   /**
   * Get ppiHighestschoolCdQ2Highestschool
   * @return ppiHighestschoolCdQ2Highestschool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "174", value = "")

  public Long getPpiHighestschoolCdQ2Highestschool() {
    return ppiHighestschoolCdQ2Highestschool;
  }


  public void setPpiHighestschoolCdQ2Highestschool(Long ppiHighestschoolCdQ2Highestschool) {
    this.ppiHighestschoolCdQ2Highestschool = ppiHighestschoolCdQ2Highestschool;
  }


  public PostSurveySurveyNameApptableIdRequest ppiHouseholdMembersCdQ1Householdmembers(Long ppiHouseholdMembersCdQ1Householdmembers) {
    
    this.ppiHouseholdMembersCdQ1Householdmembers = ppiHouseholdMembersCdQ1Householdmembers;
    return this;
  }

   /**
   * Get ppiHouseholdMembersCdQ1Householdmembers
   * @return ppiHouseholdMembersCdQ1Householdmembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "167", value = "")

  public Long getPpiHouseholdMembersCdQ1Householdmembers() {
    return ppiHouseholdMembersCdQ1Householdmembers;
  }


  public void setPpiHouseholdMembersCdQ1Householdmembers(Long ppiHouseholdMembersCdQ1Householdmembers) {
    this.ppiHouseholdMembersCdQ1Householdmembers = ppiHouseholdMembersCdQ1Householdmembers;
  }


  public PostSurveySurveyNameApptableIdRequest ppiIronsCdQ7Irons(Long ppiIronsCdQ7Irons) {
    
    this.ppiIronsCdQ7Irons = ppiIronsCdQ7Irons;
    return this;
  }

   /**
   * Get ppiIronsCdQ7Irons
   * @return ppiIronsCdQ7Irons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "193", value = "")

  public Long getPpiIronsCdQ7Irons() {
    return ppiIronsCdQ7Irons;
  }


  public void setPpiIronsCdQ7Irons(Long ppiIronsCdQ7Irons) {
    this.ppiIronsCdQ7Irons = ppiIronsCdQ7Irons;
  }


  public PostSurveySurveyNameApptableIdRequest ppiLightingsourceCdQ6Lightingsource(Long ppiLightingsourceCdQ6Lightingsource) {
    
    this.ppiLightingsourceCdQ6Lightingsource = ppiLightingsourceCdQ6Lightingsource;
    return this;
  }

   /**
   * Get ppiLightingsourceCdQ6Lightingsource
   * @return ppiLightingsourceCdQ6Lightingsource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "190", value = "")

  public Long getPpiLightingsourceCdQ6Lightingsource() {
    return ppiLightingsourceCdQ6Lightingsource;
  }


  public void setPpiLightingsourceCdQ6Lightingsource(Long ppiLightingsourceCdQ6Lightingsource) {
    this.ppiLightingsourceCdQ6Lightingsource = ppiLightingsourceCdQ6Lightingsource;
  }


  public PostSurveySurveyNameApptableIdRequest ppiMosquitonetsCdQ8Mosquitonets(Long ppiMosquitonetsCdQ8Mosquitonets) {
    
    this.ppiMosquitonetsCdQ8Mosquitonets = ppiMosquitonetsCdQ8Mosquitonets;
    return this;
  }

   /**
   * Get ppiMosquitonetsCdQ8Mosquitonets
   * @return ppiMosquitonetsCdQ8Mosquitonets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "195", value = "")

  public Long getPpiMosquitonetsCdQ8Mosquitonets() {
    return ppiMosquitonetsCdQ8Mosquitonets;
  }


  public void setPpiMosquitonetsCdQ8Mosquitonets(Long ppiMosquitonetsCdQ8Mosquitonets) {
    this.ppiMosquitonetsCdQ8Mosquitonets = ppiMosquitonetsCdQ8Mosquitonets;
  }


  public PostSurveySurveyNameApptableIdRequest ppiTowelsCdQ9Towels(Long ppiTowelsCdQ9Towels) {
    
    this.ppiTowelsCdQ9Towels = ppiTowelsCdQ9Towels;
    return this;
  }

   /**
   * Get ppiTowelsCdQ9Towels
   * @return ppiTowelsCdQ9Towels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "198", value = "")

  public Long getPpiTowelsCdQ9Towels() {
    return ppiTowelsCdQ9Towels;
  }


  public void setPpiTowelsCdQ9Towels(Long ppiTowelsCdQ9Towels) {
    this.ppiTowelsCdQ9Towels = ppiTowelsCdQ9Towels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSurveySurveyNameApptableIdRequest postSurveySurveyNameApptableIdRequest = (PostSurveySurveyNameApptableIdRequest) o;
    return Objects.equals(this.date, postSurveySurveyNameApptableIdRequest.date) &&
        Objects.equals(this.dateFormat, postSurveySurveyNameApptableIdRequest.dateFormat) &&
        Objects.equals(this.locale, postSurveySurveyNameApptableIdRequest.locale) &&
        Objects.equals(this.ppiBusinessoccupationCdQ3Businessoccupation, postSurveySurveyNameApptableIdRequest.ppiBusinessoccupationCdQ3Businessoccupation) &&
        Objects.equals(this.ppiFloortypeCdQ5Floortype, postSurveySurveyNameApptableIdRequest.ppiFloortypeCdQ5Floortype) &&
        Objects.equals(this.ppiFryingpansCdQ10Fryingpans, postSurveySurveyNameApptableIdRequest.ppiFryingpansCdQ10Fryingpans) &&
        Objects.equals(this.ppiHabitableroomsCdQ4Habitablerooms, postSurveySurveyNameApptableIdRequest.ppiHabitableroomsCdQ4Habitablerooms) &&
        Objects.equals(this.ppiHighestschoolCdQ2Highestschool, postSurveySurveyNameApptableIdRequest.ppiHighestschoolCdQ2Highestschool) &&
        Objects.equals(this.ppiHouseholdMembersCdQ1Householdmembers, postSurveySurveyNameApptableIdRequest.ppiHouseholdMembersCdQ1Householdmembers) &&
        Objects.equals(this.ppiIronsCdQ7Irons, postSurveySurveyNameApptableIdRequest.ppiIronsCdQ7Irons) &&
        Objects.equals(this.ppiLightingsourceCdQ6Lightingsource, postSurveySurveyNameApptableIdRequest.ppiLightingsourceCdQ6Lightingsource) &&
        Objects.equals(this.ppiMosquitonetsCdQ8Mosquitonets, postSurveySurveyNameApptableIdRequest.ppiMosquitonetsCdQ8Mosquitonets) &&
        Objects.equals(this.ppiTowelsCdQ9Towels, postSurveySurveyNameApptableIdRequest.ppiTowelsCdQ9Towels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateFormat, locale, ppiBusinessoccupationCdQ3Businessoccupation, ppiFloortypeCdQ5Floortype, ppiFryingpansCdQ10Fryingpans, ppiHabitableroomsCdQ4Habitablerooms, ppiHighestschoolCdQ2Highestschool, ppiHouseholdMembersCdQ1Householdmembers, ppiIronsCdQ7Irons, ppiLightingsourceCdQ6Lightingsource, ppiMosquitonetsCdQ8Mosquitonets, ppiTowelsCdQ9Towels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSurveySurveyNameApptableIdRequest {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    ppiBusinessoccupationCdQ3Businessoccupation: ").append(toIndentedString(ppiBusinessoccupationCdQ3Businessoccupation)).append("\n");
    sb.append("    ppiFloortypeCdQ5Floortype: ").append(toIndentedString(ppiFloortypeCdQ5Floortype)).append("\n");
    sb.append("    ppiFryingpansCdQ10Fryingpans: ").append(toIndentedString(ppiFryingpansCdQ10Fryingpans)).append("\n");
    sb.append("    ppiHabitableroomsCdQ4Habitablerooms: ").append(toIndentedString(ppiHabitableroomsCdQ4Habitablerooms)).append("\n");
    sb.append("    ppiHighestschoolCdQ2Highestschool: ").append(toIndentedString(ppiHighestschoolCdQ2Highestschool)).append("\n");
    sb.append("    ppiHouseholdMembersCdQ1Householdmembers: ").append(toIndentedString(ppiHouseholdMembersCdQ1Householdmembers)).append("\n");
    sb.append("    ppiIronsCdQ7Irons: ").append(toIndentedString(ppiIronsCdQ7Irons)).append("\n");
    sb.append("    ppiLightingsourceCdQ6Lightingsource: ").append(toIndentedString(ppiLightingsourceCdQ6Lightingsource)).append("\n");
    sb.append("    ppiMosquitonetsCdQ8Mosquitonets: ").append(toIndentedString(ppiMosquitonetsCdQ8Mosquitonets)).append("\n");
    sb.append("    ppiTowelsCdQ9Towels: ").append(toIndentedString(ppiTowelsCdQ9Towels)).append("\n");
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

