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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.fineract.client.models.PostGroupsGroupIdClients;

/**
 * PostGroupsGroupIdRequest
 */
@ApiModel(description = "PostGroupsGroupIdRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostGroupsGroupIdRequest {
  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private Set<PostGroupsGroupIdClients> clients = null;

  public static final String SERIALIZED_NAME_DESTINATION_GROUP_ID = "destinationGroupId";
  @SerializedName(SERIALIZED_NAME_DESTINATION_GROUP_ID)
  private Integer destinationGroupId;

  public PostGroupsGroupIdRequest() { 
  }

  public PostGroupsGroupIdRequest clients(Set<PostGroupsGroupIdClients> clients) {
    
    this.clients = clients;
    return this;
  }

  public PostGroupsGroupIdRequest addClientsItem(PostGroupsGroupIdClients clientsItem) {
    if (this.clients == null) {
      this.clients = new LinkedHashSet<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<PostGroupsGroupIdClients> getClients() {
    return clients;
  }


  public void setClients(Set<PostGroupsGroupIdClients> clients) {
    this.clients = clients;
  }


  public PostGroupsGroupIdRequest destinationGroupId(Integer destinationGroupId) {
    
    this.destinationGroupId = destinationGroupId;
    return this;
  }

   /**
   * Get destinationGroupId
   * @return destinationGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDestinationGroupId() {
    return destinationGroupId;
  }


  public void setDestinationGroupId(Integer destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGroupsGroupIdRequest postGroupsGroupIdRequest = (PostGroupsGroupIdRequest) o;
    return Objects.equals(this.clients, postGroupsGroupIdRequest.clients) &&
        Objects.equals(this.destinationGroupId, postGroupsGroupIdRequest.destinationGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, destinationGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupsGroupIdRequest {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    destinationGroupId: ").append(toIndentedString(destinationGroupId)).append("\n");
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
