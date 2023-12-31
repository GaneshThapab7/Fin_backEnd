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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.client.models.ExtensionData;

/**
 * InteropTransactionRequestResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteropTransactionRequestResponseData {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Map<String, Object> changes = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Long clientId;

  public static final String SERIALIZED_NAME_CREDIT_REPORT = "creditReport";
  @SerializedName(SERIALIZED_NAME_CREDIT_REPORT)
  private Map<String, Object> creditReport = null;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private String expiration;

  public static final String SERIALIZED_NAME_EXTENSION_LIST = "extensionList";
  @SerializedName(SERIALIZED_NAME_EXTENSION_LIST)
  private List<ExtensionData> extensionList = null;

  public static final String SERIALIZED_NAME_GLIM_ID = "glimId";
  @SerializedName(SERIALIZED_NAME_GLIM_ID)
  private Long glimId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_GSIM_ID = "gsimId";
  @SerializedName(SERIALIZED_NAME_GSIM_ID)
  private Long gsimId;

  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Long loanId;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId;

  public static final String SERIALIZED_NAME_REQUEST_CODE = "requestCode";
  @SerializedName(SERIALIZED_NAME_REQUEST_CODE)
  private String requestCode;

  public static final String SERIALIZED_NAME_ROLLBACK_TRANSACTION = "rollbackTransaction";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TRANSACTION)
  private Boolean rollbackTransaction;

  public static final String SERIALIZED_NAME_SAVINGS_ID = "savingsId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ID)
  private Long savingsId;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_SUB_RESOURCE_ID = "subResourceId";
  @SerializedName(SERIALIZED_NAME_SUB_RESOURCE_ID)
  private Long subResourceId;

  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transactionCode";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private String transactionCode;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public InteropTransactionRequestResponseData() { 
  }

  public InteropTransactionRequestResponseData changes(Map<String, Object> changes) {
    
    this.changes = changes;
    return this;
  }

  public InteropTransactionRequestResponseData putChangesItem(String key, Object changesItem) {
    if (this.changes == null) {
      this.changes = new HashMap<>();
    }
    this.changes.put(key, changesItem);
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getChanges() {
    return changes;
  }


  public void setChanges(Map<String, Object> changes) {
    this.changes = changes;
  }


  public InteropTransactionRequestResponseData clientId(Long clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getClientId() {
    return clientId;
  }


  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }


  public InteropTransactionRequestResponseData creditReport(Map<String, Object> creditReport) {
    
    this.creditReport = creditReport;
    return this;
  }

  public InteropTransactionRequestResponseData putCreditReportItem(String key, Object creditReportItem) {
    if (this.creditReport == null) {
      this.creditReport = new HashMap<>();
    }
    this.creditReport.put(key, creditReportItem);
    return this;
  }

   /**
   * Get creditReport
   * @return creditReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCreditReport() {
    return creditReport;
  }


  public void setCreditReport(Map<String, Object> creditReport) {
    this.creditReport = creditReport;
  }


  public InteropTransactionRequestResponseData expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpiration() {
    return expiration;
  }


  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public InteropTransactionRequestResponseData extensionList(List<ExtensionData> extensionList) {
    
    this.extensionList = extensionList;
    return this;
  }

  public InteropTransactionRequestResponseData addExtensionListItem(ExtensionData extensionListItem) {
    if (this.extensionList == null) {
      this.extensionList = new ArrayList<>();
    }
    this.extensionList.add(extensionListItem);
    return this;
  }

   /**
   * Get extensionList
   * @return extensionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtensionData> getExtensionList() {
    return extensionList;
  }


  public void setExtensionList(List<ExtensionData> extensionList) {
    this.extensionList = extensionList;
  }


  public InteropTransactionRequestResponseData glimId(Long glimId) {
    
    this.glimId = glimId;
    return this;
  }

   /**
   * Get glimId
   * @return glimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlimId() {
    return glimId;
  }


  public void setGlimId(Long glimId) {
    this.glimId = glimId;
  }


  public InteropTransactionRequestResponseData groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public InteropTransactionRequestResponseData gsimId(Long gsimId) {
    
    this.gsimId = gsimId;
    return this;
  }

   /**
   * Get gsimId
   * @return gsimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGsimId() {
    return gsimId;
  }


  public void setGsimId(Long gsimId) {
    this.gsimId = gsimId;
  }


  public InteropTransactionRequestResponseData loanId(Long loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoanId() {
    return loanId;
  }


  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }


  public InteropTransactionRequestResponseData officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public InteropTransactionRequestResponseData productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public InteropTransactionRequestResponseData requestCode(String requestCode) {
    
    this.requestCode = requestCode;
    return this;
  }

   /**
   * Get requestCode
   * @return requestCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRequestCode() {
    return requestCode;
  }


  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }


  public InteropTransactionRequestResponseData rollbackTransaction(Boolean rollbackTransaction) {
    
    this.rollbackTransaction = rollbackTransaction;
    return this;
  }

   /**
   * Get rollbackTransaction
   * @return rollbackTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRollbackTransaction() {
    return rollbackTransaction;
  }


  public void setRollbackTransaction(Boolean rollbackTransaction) {
    this.rollbackTransaction = rollbackTransaction;
  }


  public InteropTransactionRequestResponseData savingsId(Long savingsId) {
    
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSavingsId() {
    return savingsId;
  }


  public void setSavingsId(Long savingsId) {
    this.savingsId = savingsId;
  }


  public InteropTransactionRequestResponseData state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public InteropTransactionRequestResponseData subResourceId(Long subResourceId) {
    
    this.subResourceId = subResourceId;
    return this;
  }

   /**
   * Get subResourceId
   * @return subResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubResourceId() {
    return subResourceId;
  }


  public void setSubResourceId(Long subResourceId) {
    this.subResourceId = subResourceId;
  }


  public InteropTransactionRequestResponseData transactionCode(String transactionCode) {
    
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTransactionCode() {
    return transactionCode;
  }


  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }


  public InteropTransactionRequestResponseData transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropTransactionRequestResponseData interopTransactionRequestResponseData = (InteropTransactionRequestResponseData) o;
    return Objects.equals(this.changes, interopTransactionRequestResponseData.changes) &&
        Objects.equals(this.clientId, interopTransactionRequestResponseData.clientId) &&
        Objects.equals(this.creditReport, interopTransactionRequestResponseData.creditReport) &&
        Objects.equals(this.expiration, interopTransactionRequestResponseData.expiration) &&
        Objects.equals(this.extensionList, interopTransactionRequestResponseData.extensionList) &&
        Objects.equals(this.glimId, interopTransactionRequestResponseData.glimId) &&
        Objects.equals(this.groupId, interopTransactionRequestResponseData.groupId) &&
        Objects.equals(this.gsimId, interopTransactionRequestResponseData.gsimId) &&
        Objects.equals(this.loanId, interopTransactionRequestResponseData.loanId) &&
        Objects.equals(this.officeId, interopTransactionRequestResponseData.officeId) &&
        Objects.equals(this.productId, interopTransactionRequestResponseData.productId) &&
        Objects.equals(this.requestCode, interopTransactionRequestResponseData.requestCode) &&
        Objects.equals(this.rollbackTransaction, interopTransactionRequestResponseData.rollbackTransaction) &&
        Objects.equals(this.savingsId, interopTransactionRequestResponseData.savingsId) &&
        Objects.equals(this.state, interopTransactionRequestResponseData.state) &&
        Objects.equals(this.subResourceId, interopTransactionRequestResponseData.subResourceId) &&
        Objects.equals(this.transactionCode, interopTransactionRequestResponseData.transactionCode) &&
        Objects.equals(this.transactionId, interopTransactionRequestResponseData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, clientId, creditReport, expiration, extensionList, glimId, groupId, gsimId, loanId, officeId, productId, requestCode, rollbackTransaction, savingsId, state, subResourceId, transactionCode, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropTransactionRequestResponseData {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    creditReport: ").append(toIndentedString(creditReport)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("    glimId: ").append(toIndentedString(glimId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    gsimId: ").append(toIndentedString(gsimId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    rollbackTransaction: ").append(toIndentedString(rollbackTransaction)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

