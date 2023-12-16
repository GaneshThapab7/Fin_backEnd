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
import org.apache.fineract.client.models.ResponseData;

/**
 * QuestionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuestionData {
  public static final String SERIALIZED_NAME_COMPONENT_KEY = "componentKey";
  @SerializedName(SERIALIZED_NAME_COMPONENT_KEY)
  private String componentKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_RESPONSE_DATAS = "responseDatas";
  @SerializedName(SERIALIZED_NAME_RESPONSE_DATAS)
  private List<ResponseData> responseDatas = null;

  public static final String SERIALIZED_NAME_SEQUENCE_NO = "sequenceNo";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NO)
  private Integer sequenceNo;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public QuestionData() { 
  }

  public QuestionData componentKey(String componentKey) {
    
    this.componentKey = componentKey;
    return this;
  }

   /**
   * Get componentKey
   * @return componentKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponentKey() {
    return componentKey;
  }


  public void setComponentKey(String componentKey) {
    this.componentKey = componentKey;
  }


  public QuestionData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QuestionData id(Long id) {
    
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


  public QuestionData key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public QuestionData responseDatas(List<ResponseData> responseDatas) {
    
    this.responseDatas = responseDatas;
    return this;
  }

  public QuestionData addResponseDatasItem(ResponseData responseDatasItem) {
    if (this.responseDatas == null) {
      this.responseDatas = new ArrayList<>();
    }
    this.responseDatas.add(responseDatasItem);
    return this;
  }

   /**
   * Get responseDatas
   * @return responseDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResponseData> getResponseDatas() {
    return responseDatas;
  }


  public void setResponseDatas(List<ResponseData> responseDatas) {
    this.responseDatas = responseDatas;
  }


  public QuestionData sequenceNo(Integer sequenceNo) {
    
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSequenceNo() {
    return sequenceNo;
  }


  public void setSequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  public QuestionData text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionData questionData = (QuestionData) o;
    return Objects.equals(this.componentKey, questionData.componentKey) &&
        Objects.equals(this.description, questionData.description) &&
        Objects.equals(this.id, questionData.id) &&
        Objects.equals(this.key, questionData.key) &&
        Objects.equals(this.responseDatas, questionData.responseDatas) &&
        Objects.equals(this.sequenceNo, questionData.sequenceNo) &&
        Objects.equals(this.text, questionData.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentKey, description, id, key, responseDatas, sequenceNo, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionData {\n");
    sb.append("    componentKey: ").append(toIndentedString(componentKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    responseDatas: ").append(toIndentedString(responseDatas)).append("\n");
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
