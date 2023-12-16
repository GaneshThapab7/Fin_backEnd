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
import org.apache.fineract.client.models.GetSavingsProductsLiabilityTagId;
import org.apache.fineract.client.models.GetSavingsProductsLiabilityType;
import org.apache.fineract.client.models.GetSavingsProductsLiabilityUsage;

/**
 * GetSavingsProductsLiabilityAccountOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSavingsProductsLiabilityAccountOptions {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_GL_CODE = "glCode";
  @SerializedName(SERIALIZED_NAME_GL_CODE)
  private Integer glCode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MANUAL_ENTRIES_ALLOWED = "manualEntriesAllowed";
  @SerializedName(SERIALIZED_NAME_MANUAL_ENTRIES_ALLOWED)
  private Boolean manualEntriesAllowed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_DECORATED = "nameDecorated";
  @SerializedName(SERIALIZED_NAME_NAME_DECORATED)
  private String nameDecorated;

  public static final String SERIALIZED_NAME_TAG_ID = "tagId";
  @SerializedName(SERIALIZED_NAME_TAG_ID)
  private GetSavingsProductsLiabilityTagId tagId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GetSavingsProductsLiabilityType type;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private GetSavingsProductsLiabilityUsage usage;

  public GetSavingsProductsLiabilityAccountOptions() { 
  }

  public GetSavingsProductsLiabilityAccountOptions disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public GetSavingsProductsLiabilityAccountOptions glCode(Integer glCode) {
    
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50001", value = "")

  public Integer getGlCode() {
    return glCode;
  }


  public void setGlCode(Integer glCode) {
    this.glCode = glCode;
  }


  public GetSavingsProductsLiabilityAccountOptions id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetSavingsProductsLiabilityAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
    
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

   /**
   * Get manualEntriesAllowed
   * @return manualEntriesAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getManualEntriesAllowed() {
    return manualEntriesAllowed;
  }


  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }


  public GetSavingsProductsLiabilityAccountOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Savings Control", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetSavingsProductsLiabilityAccountOptions nameDecorated(String nameDecorated) {
    
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Savings Control", value = "")

  public String getNameDecorated() {
    return nameDecorated;
  }


  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }


  public GetSavingsProductsLiabilityAccountOptions tagId(GetSavingsProductsLiabilityTagId tagId) {
    
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsProductsLiabilityTagId getTagId() {
    return tagId;
  }


  public void setTagId(GetSavingsProductsLiabilityTagId tagId) {
    this.tagId = tagId;
  }


  public GetSavingsProductsLiabilityAccountOptions type(GetSavingsProductsLiabilityType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsProductsLiabilityType getType() {
    return type;
  }


  public void setType(GetSavingsProductsLiabilityType type) {
    this.type = type;
  }


  public GetSavingsProductsLiabilityAccountOptions usage(GetSavingsProductsLiabilityUsage usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsProductsLiabilityUsage getUsage() {
    return usage;
  }


  public void setUsage(GetSavingsProductsLiabilityUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsLiabilityAccountOptions getSavingsProductsLiabilityAccountOptions = (GetSavingsProductsLiabilityAccountOptions) o;
    return Objects.equals(this.disabled, getSavingsProductsLiabilityAccountOptions.disabled) &&
        Objects.equals(this.glCode, getSavingsProductsLiabilityAccountOptions.glCode) &&
        Objects.equals(this.id, getSavingsProductsLiabilityAccountOptions.id) &&
        Objects.equals(this.manualEntriesAllowed, getSavingsProductsLiabilityAccountOptions.manualEntriesAllowed) &&
        Objects.equals(this.name, getSavingsProductsLiabilityAccountOptions.name) &&
        Objects.equals(this.nameDecorated, getSavingsProductsLiabilityAccountOptions.nameDecorated) &&
        Objects.equals(this.tagId, getSavingsProductsLiabilityAccountOptions.tagId) &&
        Objects.equals(this.type, getSavingsProductsLiabilityAccountOptions.type) &&
        Objects.equals(this.usage, getSavingsProductsLiabilityAccountOptions.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, glCode, id, manualEntriesAllowed, name, nameDecorated, tagId, type, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsLiabilityAccountOptions {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

