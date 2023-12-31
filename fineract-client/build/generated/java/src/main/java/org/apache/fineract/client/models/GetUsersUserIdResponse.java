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
import org.apache.fineract.client.models.RoleData;
import org.apache.fineract.client.models.StaffData;

/**
 * GetUsersUserIdResponse
 */
@ApiModel(description = "GetUsersUserIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetUsersUserIdResponse {
  public static final String SERIALIZED_NAME_AVAILABLE_ROLES = "availableRoles";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ROLES)
  private List<RoleData> availableRoles = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_PASSWORD_NEVER_EXPIRES = "passwordNeverExpires";
  @SerializedName(SERIALIZED_NAME_PASSWORD_NEVER_EXPIRES)
  private Boolean passwordNeverExpires;

  public static final String SERIALIZED_NAME_SELECTED_ROLES = "selectedRoles";
  @SerializedName(SERIALIZED_NAME_SELECTED_ROLES)
  private List<RoleData> selectedRoles = null;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private StaffData staff;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public GetUsersUserIdResponse() { 
  }

  public GetUsersUserIdResponse availableRoles(List<RoleData> availableRoles) {
    
    this.availableRoles = availableRoles;
    return this;
  }

  public GetUsersUserIdResponse addAvailableRolesItem(RoleData availableRolesItem) {
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


  public GetUsersUserIdResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "demomfi@mifos.org", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GetUsersUserIdResponse firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public GetUsersUserIdResponse id(Long id) {
    
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


  public GetUsersUserIdResponse lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public GetUsersUserIdResponse officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public GetUsersUserIdResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetUsersUserIdResponse passwordNeverExpires(Boolean passwordNeverExpires) {
    
    this.passwordNeverExpires = passwordNeverExpires;
    return this;
  }

   /**
   * Get passwordNeverExpires
   * @return passwordNeverExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPasswordNeverExpires() {
    return passwordNeverExpires;
  }


  public void setPasswordNeverExpires(Boolean passwordNeverExpires) {
    this.passwordNeverExpires = passwordNeverExpires;
  }


  public GetUsersUserIdResponse selectedRoles(List<RoleData> selectedRoles) {
    
    this.selectedRoles = selectedRoles;
    return this;
  }

  public GetUsersUserIdResponse addSelectedRolesItem(RoleData selectedRolesItem) {
    if (this.selectedRoles == null) {
      this.selectedRoles = new ArrayList<>();
    }
    this.selectedRoles.add(selectedRolesItem);
    return this;
  }

   /**
   * Get selectedRoles
   * @return selectedRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleData> getSelectedRoles() {
    return selectedRoles;
  }


  public void setSelectedRoles(List<RoleData> selectedRoles) {
    this.selectedRoles = selectedRoles;
  }


  public GetUsersUserIdResponse staff(StaffData staff) {
    
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StaffData getStaff() {
    return staff;
  }


  public void setStaff(StaffData staff) {
    this.staff = staff;
  }


  public GetUsersUserIdResponse username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersUserIdResponse getUsersUserIdResponse = (GetUsersUserIdResponse) o;
    return Objects.equals(this.availableRoles, getUsersUserIdResponse.availableRoles) &&
        Objects.equals(this.email, getUsersUserIdResponse.email) &&
        Objects.equals(this.firstname, getUsersUserIdResponse.firstname) &&
        Objects.equals(this.id, getUsersUserIdResponse.id) &&
        Objects.equals(this.lastname, getUsersUserIdResponse.lastname) &&
        Objects.equals(this.officeId, getUsersUserIdResponse.officeId) &&
        Objects.equals(this.officeName, getUsersUserIdResponse.officeName) &&
        Objects.equals(this.passwordNeverExpires, getUsersUserIdResponse.passwordNeverExpires) &&
        Objects.equals(this.selectedRoles, getUsersUserIdResponse.selectedRoles) &&
        Objects.equals(this.staff, getUsersUserIdResponse.staff) &&
        Objects.equals(this.username, getUsersUserIdResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableRoles, email, firstname, id, lastname, officeId, officeName, passwordNeverExpires, selectedRoles, staff, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersUserIdResponse {\n");
    sb.append("    availableRoles: ").append(toIndentedString(availableRoles)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    passwordNeverExpires: ").append(toIndentedString(passwordNeverExpires)).append("\n");
    sb.append("    selectedRoles: ").append(toIndentedString(selectedRoles)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

