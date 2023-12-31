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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.Group;
import org.apache.fineract.client.models.Image;
import org.apache.fineract.client.models.Office;
import org.apache.fineract.client.models.Staff;

/**
 * Client
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Client {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_REQUIRES_AUTO_GENERATION = "accountNumberRequiresAutoGeneration";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_REQUIRES_AUTO_GENERATION)
  private Boolean accountNumberRequiresAutoGeneration;

  public static final String SERIALIZED_NAME_ACTIVATION_LOCAL_DATE = "activationLocalDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_LOCAL_DATE)
  private LocalDate activationLocalDate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_CLOSURE_DATE = "closureDate";
  @SerializedName(SERIALIZED_NAME_CLOSURE_DATE)
  private LocalDate closureDate;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Long createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<Group> groups = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private Image image;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private Long lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_LEGAL_FORM = "legalForm";
  @SerializedName(SERIALIZED_NAME_LEGAL_FORM)
  private Integer legalForm;

  public static final String SERIALIZED_NAME_MIDDLENAME = "middlename";
  @SerializedName(SERIALIZED_NAME_MIDDLENAME)
  private String middlename;

  public static final String SERIALIZED_NAME_MOBILE_NO = "mobileNo";
  @SerializedName(SERIALIZED_NAME_MOBILE_NO)
  private String mobileNo;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public static final String SERIALIZED_NAME_NOT_ACTIVE = "notActive";
  @SerializedName(SERIALIZED_NAME_NOT_ACTIVE)
  private Boolean notActive;

  public static final String SERIALIZED_NAME_NOT_PENDING = "notPending";
  @SerializedName(SERIALIZED_NAME_NOT_PENDING)
  private Boolean notPending;

  public static final String SERIALIZED_NAME_NOT_STAFF = "notStaff";
  @SerializedName(SERIALIZED_NAME_NOT_STAFF)
  private Boolean notStaff;

  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private Office office;

  public static final String SERIALIZED_NAME_OFFICE_JOINING_LOCAL_DATE = "officeJoiningLocalDate";
  @SerializedName(SERIALIZED_NAME_OFFICE_JOINING_LOCAL_DATE)
  private LocalDate officeJoiningLocalDate;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;

  public static final String SERIALIZED_NAME_PROPOSED_TRANSFER_DATE = "proposedTransferDate";
  @SerializedName(SERIALIZED_NAME_PROPOSED_TRANSFER_DATE)
  private LocalDate proposedTransferDate;

  public static final String SERIALIZED_NAME_REJECTED = "rejected";
  @SerializedName(SERIALIZED_NAME_REJECTED)
  private Boolean rejected;

  public static final String SERIALIZED_NAME_REJECTED_DATE = "rejectedDate";
  @SerializedName(SERIALIZED_NAME_REJECTED_DATE)
  private LocalDate rejectedDate;

  public static final String SERIALIZED_NAME_REOPENED_DATE = "reopenedDate";
  @SerializedName(SERIALIZED_NAME_REOPENED_DATE)
  private LocalDate reopenedDate;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Staff staff;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private LocalDate submittedOnDate;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS = "transferInProgress";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS)
  private Boolean transferInProgress;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS_OR_ON_HOLD = "transferInProgressOrOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS_OR_ON_HOLD)
  private Boolean transferInProgressOrOnHold;

  public static final String SERIALIZED_NAME_TRANSFER_ON_HOLD = "transferOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ON_HOLD)
  private Boolean transferOnHold;

  public static final String SERIALIZED_NAME_TRANSFER_TO_OFFICE = "transferToOffice";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TO_OFFICE)
  private Office transferToOffice;

  public static final String SERIALIZED_NAME_WITHDRAWAL_DATE = "withdrawalDate";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_DATE)
  private LocalDate withdrawalDate;

  public static final String SERIALIZED_NAME_WITHDRAWN = "withdrawn";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN)
  private Boolean withdrawn;

  public Client() { 
  }

  public Client accountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
    return this;
  }

   /**
   * Get accountNumberRequiresAutoGeneration
   * @return accountNumberRequiresAutoGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAccountNumberRequiresAutoGeneration() {
    return accountNumberRequiresAutoGeneration;
  }


  public void setAccountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
  }


  public Client activationLocalDate(LocalDate activationLocalDate) {
    
    this.activationLocalDate = activationLocalDate;
    return this;
  }

   /**
   * Get activationLocalDate
   * @return activationLocalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getActivationLocalDate() {
    return activationLocalDate;
  }


  public void setActivationLocalDate(LocalDate activationLocalDate) {
    this.activationLocalDate = activationLocalDate;
  }


  public Client active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Client closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public Client closureDate(LocalDate closureDate) {
    
    this.closureDate = closureDate;
    return this;
  }

   /**
   * Get closureDate
   * @return closureDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getClosureDate() {
    return closureDate;
  }


  public void setClosureDate(LocalDate closureDate) {
    this.closureDate = closureDate;
  }


  public Client createdBy(Long createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public Client createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public Client displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Client emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Client externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Client firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public Client groups(Set<Group> groups) {
    
    this.groups = groups;
    return this;
  }

  public Client addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Group> getGroups() {
    return groups;
  }


  public void setGroups(Set<Group> groups) {
    this.groups = groups;
  }


  public Client id(Long id) {
    
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


  public Client image(Image image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Image getImage() {
    return image;
  }


  public void setImage(Image image) {
    this.image = image;
  }


  public Client lastModifiedBy(Long lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public Client lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public Client lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public Client legalForm(Integer legalForm) {
    
    this.legalForm = legalForm;
    return this;
  }

   /**
   * Get legalForm
   * @return legalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLegalForm() {
    return legalForm;
  }


  public void setLegalForm(Integer legalForm) {
    this.legalForm = legalForm;
  }


  public Client middlename(String middlename) {
    
    this.middlename = middlename;
    return this;
  }

   /**
   * Get middlename
   * @return middlename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddlename() {
    return middlename;
  }


  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }


  public Client mobileNo(String mobileNo) {
    
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * Get mobileNo
   * @return mobileNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobileNo() {
    return mobileNo;
  }


  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public Client _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  public Client notActive(Boolean notActive) {
    
    this.notActive = notActive;
    return this;
  }

   /**
   * Get notActive
   * @return notActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotActive() {
    return notActive;
  }


  public void setNotActive(Boolean notActive) {
    this.notActive = notActive;
  }


  public Client notPending(Boolean notPending) {
    
    this.notPending = notPending;
    return this;
  }

   /**
   * Get notPending
   * @return notPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotPending() {
    return notPending;
  }


  public void setNotPending(Boolean notPending) {
    this.notPending = notPending;
  }


  public Client notStaff(Boolean notStaff) {
    
    this.notStaff = notStaff;
    return this;
  }

   /**
   * Get notStaff
   * @return notStaff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotStaff() {
    return notStaff;
  }


  public void setNotStaff(Boolean notStaff) {
    this.notStaff = notStaff;
  }


  public Client office(Office office) {
    
    this.office = office;
    return this;
  }

   /**
   * Get office
   * @return office
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Office getOffice() {
    return office;
  }


  public void setOffice(Office office) {
    this.office = office;
  }


  public Client officeJoiningLocalDate(LocalDate officeJoiningLocalDate) {
    
    this.officeJoiningLocalDate = officeJoiningLocalDate;
    return this;
  }

   /**
   * Get officeJoiningLocalDate
   * @return officeJoiningLocalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getOfficeJoiningLocalDate() {
    return officeJoiningLocalDate;
  }


  public void setOfficeJoiningLocalDate(LocalDate officeJoiningLocalDate) {
    this.officeJoiningLocalDate = officeJoiningLocalDate;
  }


  public Client pending(Boolean pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPending() {
    return pending;
  }


  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public Client proposedTransferDate(LocalDate proposedTransferDate) {
    
    this.proposedTransferDate = proposedTransferDate;
    return this;
  }

   /**
   * Get proposedTransferDate
   * @return proposedTransferDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getProposedTransferDate() {
    return proposedTransferDate;
  }


  public void setProposedTransferDate(LocalDate proposedTransferDate) {
    this.proposedTransferDate = proposedTransferDate;
  }


  public Client rejected(Boolean rejected) {
    
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRejected() {
    return rejected;
  }


  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }


  public Client rejectedDate(LocalDate rejectedDate) {
    
    this.rejectedDate = rejectedDate;
    return this;
  }

   /**
   * Get rejectedDate
   * @return rejectedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getRejectedDate() {
    return rejectedDate;
  }


  public void setRejectedDate(LocalDate rejectedDate) {
    this.rejectedDate = rejectedDate;
  }


  public Client reopenedDate(LocalDate reopenedDate) {
    
    this.reopenedDate = reopenedDate;
    return this;
  }

   /**
   * Get reopenedDate
   * @return reopenedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getReopenedDate() {
    return reopenedDate;
  }


  public void setReopenedDate(LocalDate reopenedDate) {
    this.reopenedDate = reopenedDate;
  }


  public Client staff(Staff staff) {
    
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Staff getStaff() {
    return staff;
  }


  public void setStaff(Staff staff) {
    this.staff = staff;
  }


  public Client status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public Client submittedOnDate(LocalDate submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public Client transferInProgress(Boolean transferInProgress) {
    
    this.transferInProgress = transferInProgress;
    return this;
  }

   /**
   * Get transferInProgress
   * @return transferInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferInProgress() {
    return transferInProgress;
  }


  public void setTransferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
  }


  public Client transferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
    return this;
  }

   /**
   * Get transferInProgressOrOnHold
   * @return transferInProgressOrOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferInProgressOrOnHold() {
    return transferInProgressOrOnHold;
  }


  public void setTransferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
  }


  public Client transferOnHold(Boolean transferOnHold) {
    
    this.transferOnHold = transferOnHold;
    return this;
  }

   /**
   * Get transferOnHold
   * @return transferOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferOnHold() {
    return transferOnHold;
  }


  public void setTransferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
  }


  public Client transferToOffice(Office transferToOffice) {
    
    this.transferToOffice = transferToOffice;
    return this;
  }

   /**
   * Get transferToOffice
   * @return transferToOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Office getTransferToOffice() {
    return transferToOffice;
  }


  public void setTransferToOffice(Office transferToOffice) {
    this.transferToOffice = transferToOffice;
  }


  public Client withdrawalDate(LocalDate withdrawalDate) {
    
    this.withdrawalDate = withdrawalDate;
    return this;
  }

   /**
   * Get withdrawalDate
   * @return withdrawalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getWithdrawalDate() {
    return withdrawalDate;
  }


  public void setWithdrawalDate(LocalDate withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
  }


  public Client withdrawn(Boolean withdrawn) {
    
    this.withdrawn = withdrawn;
    return this;
  }

   /**
   * Get withdrawn
   * @return withdrawn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithdrawn() {
    return withdrawn;
  }


  public void setWithdrawn(Boolean withdrawn) {
    this.withdrawn = withdrawn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.accountNumberRequiresAutoGeneration, client.accountNumberRequiresAutoGeneration) &&
        Objects.equals(this.activationLocalDate, client.activationLocalDate) &&
        Objects.equals(this.active, client.active) &&
        Objects.equals(this.closed, client.closed) &&
        Objects.equals(this.closureDate, client.closureDate) &&
        Objects.equals(this.createdBy, client.createdBy) &&
        Objects.equals(this.createdDate, client.createdDate) &&
        Objects.equals(this.displayName, client.displayName) &&
        Objects.equals(this.emailAddress, client.emailAddress) &&
        Objects.equals(this.externalId, client.externalId) &&
        Objects.equals(this.firstname, client.firstname) &&
        Objects.equals(this.groups, client.groups) &&
        Objects.equals(this.id, client.id) &&
        Objects.equals(this.image, client.image) &&
        Objects.equals(this.lastModifiedBy, client.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, client.lastModifiedDate) &&
        Objects.equals(this.lastname, client.lastname) &&
        Objects.equals(this.legalForm, client.legalForm) &&
        Objects.equals(this.middlename, client.middlename) &&
        Objects.equals(this.mobileNo, client.mobileNo) &&
        Objects.equals(this._new, client._new) &&
        Objects.equals(this.notActive, client.notActive) &&
        Objects.equals(this.notPending, client.notPending) &&
        Objects.equals(this.notStaff, client.notStaff) &&
        Objects.equals(this.office, client.office) &&
        Objects.equals(this.officeJoiningLocalDate, client.officeJoiningLocalDate) &&
        Objects.equals(this.pending, client.pending) &&
        Objects.equals(this.proposedTransferDate, client.proposedTransferDate) &&
        Objects.equals(this.rejected, client.rejected) &&
        Objects.equals(this.rejectedDate, client.rejectedDate) &&
        Objects.equals(this.reopenedDate, client.reopenedDate) &&
        Objects.equals(this.staff, client.staff) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.submittedOnDate, client.submittedOnDate) &&
        Objects.equals(this.transferInProgress, client.transferInProgress) &&
        Objects.equals(this.transferInProgressOrOnHold, client.transferInProgressOrOnHold) &&
        Objects.equals(this.transferOnHold, client.transferOnHold) &&
        Objects.equals(this.transferToOffice, client.transferToOffice) &&
        Objects.equals(this.withdrawalDate, client.withdrawalDate) &&
        Objects.equals(this.withdrawn, client.withdrawn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumberRequiresAutoGeneration, activationLocalDate, active, closed, closureDate, createdBy, createdDate, displayName, emailAddress, externalId, firstname, groups, id, image, lastModifiedBy, lastModifiedDate, lastname, legalForm, middlename, mobileNo, _new, notActive, notPending, notStaff, office, officeJoiningLocalDate, pending, proposedTransferDate, rejected, rejectedDate, reopenedDate, staff, status, submittedOnDate, transferInProgress, transferInProgressOrOnHold, transferOnHold, transferToOffice, withdrawalDate, withdrawn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    accountNumberRequiresAutoGeneration: ").append(toIndentedString(accountNumberRequiresAutoGeneration)).append("\n");
    sb.append("    activationLocalDate: ").append(toIndentedString(activationLocalDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    closureDate: ").append(toIndentedString(closureDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    notActive: ").append(toIndentedString(notActive)).append("\n");
    sb.append("    notPending: ").append(toIndentedString(notPending)).append("\n");
    sb.append("    notStaff: ").append(toIndentedString(notStaff)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    officeJoiningLocalDate: ").append(toIndentedString(officeJoiningLocalDate)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    proposedTransferDate: ").append(toIndentedString(proposedTransferDate)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    reopenedDate: ").append(toIndentedString(reopenedDate)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
    sb.append("    transferInProgressOrOnHold: ").append(toIndentedString(transferInProgressOrOnHold)).append("\n");
    sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
    sb.append("    transferToOffice: ").append(toIndentedString(transferToOffice)).append("\n");
    sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
    sb.append("    withdrawn: ").append(toIndentedString(withdrawn)).append("\n");
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

