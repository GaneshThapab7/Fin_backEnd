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
import org.apache.fineract.client.models.TemplateMapper;

/**
 * PostTemplatesRequest
 */
@ApiModel(description = "PostTemplatesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostTemplatesRequest {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Long entity;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_MAPPERS = "mappers";
  @SerializedName(SERIALIZED_NAME_MAPPERS)
  private List<TemplateMapper> mappers = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Long type;

  public PostTemplatesRequest() { 
  }

  public PostTemplatesRequest entity(Long entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getEntity() {
    return entity;
  }


  public void setEntity(Long entity) {
    this.entity = entity;
  }


  public PostTemplatesRequest id(Long id) {
    
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


  public PostTemplatesRequest mappers(List<TemplateMapper> mappers) {
    
    this.mappers = mappers;
    return this;
  }

  public PostTemplatesRequest addMappersItem(TemplateMapper mappersItem) {
    if (this.mappers == null) {
      this.mappers = new ArrayList<>();
    }
    this.mappers.add(mappersItem);
    return this;
  }

   /**
   * Get mappers
   * @return mappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TemplateMapper> getMappers() {
    return mappers;
  }


  public void setMappers(List<TemplateMapper> mappers) {
    this.mappers = mappers;
  }


  public PostTemplatesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Text", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostTemplatesRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a loan for {{loan.clientName}}", value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public PostTemplatesRequest type(Long type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getType() {
    return type;
  }


  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTemplatesRequest postTemplatesRequest = (PostTemplatesRequest) o;
    return Objects.equals(this.entity, postTemplatesRequest.entity) &&
        Objects.equals(this.id, postTemplatesRequest.id) &&
        Objects.equals(this.mappers, postTemplatesRequest.mappers) &&
        Objects.equals(this.name, postTemplatesRequest.name) &&
        Objects.equals(this.text, postTemplatesRequest.text) &&
        Objects.equals(this.type, postTemplatesRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, id, mappers, name, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTemplatesRequest {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mappers: ").append(toIndentedString(mappers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

