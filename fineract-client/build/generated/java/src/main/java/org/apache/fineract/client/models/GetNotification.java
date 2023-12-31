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

/**
 * GetNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetNotification {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ACTOR_ID = "actorId";
  @SerializedName(SERIALIZED_NAME_ACTOR_ID)
  private Long actorId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_READ = "isRead";
  @SerializedName(SERIALIZED_NAME_IS_READ)
  private Boolean isRead;

  public static final String SERIALIZED_NAME_IS_SYSTEM_GENERATED = "isSystemGenerated";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_GENERATED)
  private Boolean isSystemGenerated;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_TENANT_IDENTIFIER = "tenantIdentifier";
  @SerializedName(SERIALIZED_NAME_TENANT_IDENTIFIER)
  private String tenantIdentifier;

  public static final String SERIALIZED_NAME_USER_IDS = "userIds";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Long> userIds = null;

  public GetNotification() { 
  }

  public GetNotification action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a", value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public GetNotification actorId(Long actorId) {
    
    this.actorId = actorId;
    return this;
  }

   /**
   * Get actorId
   * @return actorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getActorId() {
    return actorId;
  }


  public void setActorId(Long actorId) {
    this.actorId = actorId;
  }


  public GetNotification content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a", value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public GetNotification createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public GetNotification id(Long id) {
    
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


  public GetNotification isRead(Boolean isRead) {
    
    this.isRead = isRead;
    return this;
  }

   /**
   * Get isRead
   * @return isRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsRead() {
    return isRead;
  }


  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }


  public GetNotification isSystemGenerated(Boolean isSystemGenerated) {
    
    this.isSystemGenerated = isSystemGenerated;
    return this;
  }

   /**
   * Get isSystemGenerated
   * @return isSystemGenerated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsSystemGenerated() {
    return isSystemGenerated;
  }


  public void setIsSystemGenerated(Boolean isSystemGenerated) {
    this.isSystemGenerated = isSystemGenerated;
  }


  public GetNotification objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }


  public GetNotification objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a", value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public GetNotification officeId(Long officeId) {
    
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


  public GetNotification tenantIdentifier(String tenantIdentifier) {
    
    this.tenantIdentifier = tenantIdentifier;
    return this;
  }

   /**
   * Get tenantIdentifier
   * @return tenantIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a", value = "")

  public String getTenantIdentifier() {
    return tenantIdentifier;
  }


  public void setTenantIdentifier(String tenantIdentifier) {
    this.tenantIdentifier = tenantIdentifier;
  }


  public GetNotification userIds(List<Long> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public GetNotification addUserIdsItem(Long userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Long> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Long> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNotification getNotification = (GetNotification) o;
    return Objects.equals(this.action, getNotification.action) &&
        Objects.equals(this.actorId, getNotification.actorId) &&
        Objects.equals(this.content, getNotification.content) &&
        Objects.equals(this.createdAt, getNotification.createdAt) &&
        Objects.equals(this.id, getNotification.id) &&
        Objects.equals(this.isRead, getNotification.isRead) &&
        Objects.equals(this.isSystemGenerated, getNotification.isSystemGenerated) &&
        Objects.equals(this.objectId, getNotification.objectId) &&
        Objects.equals(this.objectType, getNotification.objectType) &&
        Objects.equals(this.officeId, getNotification.officeId) &&
        Objects.equals(this.tenantIdentifier, getNotification.tenantIdentifier) &&
        Objects.equals(this.userIds, getNotification.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actorId, content, createdAt, id, isRead, isSystemGenerated, objectId, objectType, officeId, tenantIdentifier, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotification {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    isSystemGenerated: ").append(toIndentedString(isSystemGenerated)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    tenantIdentifier: ").append(toIndentedString(tenantIdentifier)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

