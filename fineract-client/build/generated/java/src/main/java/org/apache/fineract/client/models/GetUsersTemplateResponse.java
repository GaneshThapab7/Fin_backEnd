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
import org.apache.fineract.client.models.OfficeData;
import org.apache.fineract.client.models.RoleData;

/**
 * GetUsersTemplateResponse
 */
@ApiModel(description = "GetUsersTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetUsersTemplateResponse {
  public static final String SERIALIZED_NAME_ALLOWED_OFFICES = "allowedOffices";
  @SerializedName(SERIALIZED_NAME_ALLOWED_OFFICES)
  private List<OfficeData> allowedOffices = null;

  public static final String SERIALIZED_NAME_AVAILABLE_ROLES = "availableRoles";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ROLES)
  private List<RoleData> availableRoles = null;

  public static final String SERIALIZED_NAME_SELF_SERVICE_ROLES = "selfServiceRoles";
  @SerializedName(SERIALIZED_NAME_SELF_SERVICE_ROLES)
  private List<RoleData> selfServiceRoles = null;

  public GetUsersTemplateResponse() { 
  }

  public GetUsersTemplateResponse allowedOffices(List<OfficeData> allowedOffices) {
    
    this.allowedOffices = allowedOffices;
    return this;
  }

  public GetUsersTemplateResponse addAllowedOfficesItem(OfficeData allowedOfficesItem) {
    if (this.allowedOffices == null) {
      this.allowedOffices = new ArrayList<>();
    }
    this.allowedOffices.add(allowedOfficesItem);
    return this;
  }

   /**
   * Get allowedOffices
   * @return allowedOffices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OfficeData> getAllowedOffices() {
    return allowedOffices;
  }


  public void setAllowedOffices(List<OfficeData> allowedOffices) {
    this.allowedOffices = allowedOffices;
  }


  public GetUsersTemplateResponse availableRoles(List<RoleData> availableRoles) {
    
    this.availableRoles = availableRoles;
    return this;
  }

  public GetUsersTemplateResponse addAvailableRolesItem(RoleData availableRolesItem) {
    if (this.availableRoles == null) {
      this.availableRoles = new ArrayList<>();
    }
    this.availableRoles.add(availableRolesItem);
    return this;
  }

   /**
   * Get availableRoles
   * @return availableRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleData> getAvailableRoles() {
    return availableRoles;
  }


  public void setAvailableRoles(List<RoleData> availableRoles) {
    this.availableRoles = availableRoles;
  }


  public GetUsersTemplateResponse selfServiceRoles(List<RoleData> selfServiceRoles) {
    
    this.selfServiceRoles = selfServiceRoles;
    return this;
  }

  public GetUsersTemplateResponse addSelfServiceRolesItem(RoleData selfServiceRolesItem) {
    if (this.selfServiceRoles == null) {
      this.selfServiceRoles = new ArrayList<>();
    }
    this.selfServiceRoles.add(selfServiceRolesItem);
    return this;
  }

   /**
   * Get selfServiceRoles
   * @return selfServiceRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleData> getSelfServiceRoles() {
    return selfServiceRoles;
  }


  public void setSelfServiceRoles(List<RoleData> selfServiceRoles) {
    this.selfServiceRoles = selfServiceRoles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersTemplateResponse getUsersTemplateResponse = (GetUsersTemplateResponse) o;
    return Objects.equals(this.allowedOffices, getUsersTemplateResponse.allowedOffices) &&
        Objects.equals(this.availableRoles, getUsersTemplateResponse.availableRoles) &&
        Objects.equals(this.selfServiceRoles, getUsersTemplateResponse.selfServiceRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOffices, availableRoles, selfServiceRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersTemplateResponse {\n");
    sb.append("    allowedOffices: ").append(toIndentedString(allowedOffices)).append("\n");
    sb.append("    availableRoles: ").append(toIndentedString(availableRoles)).append("\n");
    sb.append("    selfServiceRoles: ").append(toIndentedString(selfServiceRoles)).append("\n");
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
