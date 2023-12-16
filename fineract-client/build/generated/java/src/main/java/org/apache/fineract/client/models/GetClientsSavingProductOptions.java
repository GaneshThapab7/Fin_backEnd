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
 * GetClientsSavingProductOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetClientsSavingProductOptions {
  public static final String SERIALIZED_NAME_ALLOW_OVERDRAFT = "allowOverdraft";
  @SerializedName(SERIALIZED_NAME_ALLOW_OVERDRAFT)
  private Boolean allowOverdraft;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WITHDRAWAL_FEE_FOR_TRANSFERS = "withdrawalFeeForTransfers";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_FEE_FOR_TRANSFERS)
  private Boolean withdrawalFeeForTransfers;

  public GetClientsSavingProductOptions() { 
  }

  public GetClientsSavingProductOptions allowOverdraft(Boolean allowOverdraft) {
    
    this.allowOverdraft = allowOverdraft;
    return this;
  }

   /**
   * Get allowOverdraft
   * @return allowOverdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getAllowOverdraft() {
    return allowOverdraft;
  }


  public void setAllowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
  }


  public GetClientsSavingProductOptions id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetClientsSavingProductOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "account overdraft", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetClientsSavingProductOptions withdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
    return this;
  }

   /**
   * Get withdrawalFeeForTransfers
   * @return withdrawalFeeForTransfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWithdrawalFeeForTransfers() {
    return withdrawalFeeForTransfers;
  }


  public void setWithdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsSavingProductOptions getClientsSavingProductOptions = (GetClientsSavingProductOptions) o;
    return Objects.equals(this.allowOverdraft, getClientsSavingProductOptions.allowOverdraft) &&
        Objects.equals(this.id, getClientsSavingProductOptions.id) &&
        Objects.equals(this.name, getClientsSavingProductOptions.name) &&
        Objects.equals(this.withdrawalFeeForTransfers, getClientsSavingProductOptions.withdrawalFeeForTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOverdraft, id, name, withdrawalFeeForTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsSavingProductOptions {\n");
    sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    withdrawalFeeForTransfers: ").append(toIndentedString(withdrawalFeeForTransfers)).append("\n");
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
