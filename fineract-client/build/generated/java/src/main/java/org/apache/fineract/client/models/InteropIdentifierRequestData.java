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
 * InteropIdentifierRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteropIdentifierRequestData {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * Gets or Sets idType
   */
  @JsonAdapter(IdTypeEnum.Adapter.class)
  public enum IdTypeEnum {
    MSISDN("MSISDN"),
    
    EMAIL("EMAIL"),
    
    PERSONAL_ID("PERSONAL_ID"),
    
    BUSINESS("BUSINESS"),
    
    DEVICE("DEVICE"),
    
    ACCOUNT_ID("ACCOUNT_ID"),
    
    IBAN("IBAN"),
    
    ALIAS("ALIAS");

    private String value;

    IdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdTypeEnum fromValue(String value) {
      for (IdTypeEnum b : IdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private IdTypeEnum idType;

  public static final String SERIALIZED_NAME_ID_VALUE = "idValue";
  @SerializedName(SERIALIZED_NAME_ID_VALUE)
  private String idValue;

  public static final String SERIALIZED_NAME_SUB_ID_OR_TYPE = "subIdOrType";
  @SerializedName(SERIALIZED_NAME_SUB_ID_OR_TYPE)
  private String subIdOrType;

  public InteropIdentifierRequestData() { 
  }

  public InteropIdentifierRequestData accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InteropIdentifierRequestData idType(IdTypeEnum idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IdTypeEnum getIdType() {
    return idType;
  }


  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  public InteropIdentifierRequestData idValue(String idValue) {
    
    this.idValue = idValue;
    return this;
  }

   /**
   * Get idValue
   * @return idValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIdValue() {
    return idValue;
  }


  public void setIdValue(String idValue) {
    this.idValue = idValue;
  }


  public InteropIdentifierRequestData subIdOrType(String subIdOrType) {
    
    this.subIdOrType = subIdOrType;
    return this;
  }

   /**
   * Get subIdOrType
   * @return subIdOrType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubIdOrType() {
    return subIdOrType;
  }


  public void setSubIdOrType(String subIdOrType) {
    this.subIdOrType = subIdOrType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropIdentifierRequestData interopIdentifierRequestData = (InteropIdentifierRequestData) o;
    return Objects.equals(this.accountId, interopIdentifierRequestData.accountId) &&
        Objects.equals(this.idType, interopIdentifierRequestData.idType) &&
        Objects.equals(this.idValue, interopIdentifierRequestData.idValue) &&
        Objects.equals(this.subIdOrType, interopIdentifierRequestData.subIdOrType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, idType, idValue, subIdOrType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropIdentifierRequestData {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
    sb.append("    subIdOrType: ").append(toIndentedString(subIdOrType)).append("\n");
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

