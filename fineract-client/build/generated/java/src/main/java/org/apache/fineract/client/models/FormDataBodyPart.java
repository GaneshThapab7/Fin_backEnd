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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.client.models.BodyPartMediaType;
import org.apache.fineract.client.models.ContentDisposition;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.MultiPart;
import org.apache.fineract.client.models.ParameterizedHeader;

/**
 * FormDataBodyPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FormDataBodyPart {
  public static final String SERIALIZED_NAME_CONTENT_DISPOSITION = "contentDisposition";
  @SerializedName(SERIALIZED_NAME_CONTENT_DISPOSITION)
  private ContentDisposition contentDisposition;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Object entity;

  public static final String SERIALIZED_NAME_FORM_DATA_CONTENT_DISPOSITION = "formDataContentDisposition";
  @SerializedName(SERIALIZED_NAME_FORM_DATA_CONTENT_DISPOSITION)
  private FormDataContentDisposition formDataContentDisposition;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, List<String>> headers = null;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private BodyPartMediaType mediaType;

  public static final String SERIALIZED_NAME_MESSAGE_BODY_WORKERS = "messageBodyWorkers";
  @SerializedName(SERIALIZED_NAME_MESSAGE_BODY_WORKERS)
  private Object messageBodyWorkers;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARAMETERIZED_HEADERS = "parameterizedHeaders";
  @SerializedName(SERIALIZED_NAME_PARAMETERIZED_HEADERS)
  private Map<String, List<ParameterizedHeader>> parameterizedHeaders = null;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private MultiPart parent;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private Object providers;

  public static final String SERIALIZED_NAME_SIMPLE = "simple";
  @SerializedName(SERIALIZED_NAME_SIMPLE)
  private Boolean simple;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public FormDataBodyPart() { 
  }

  public FormDataBodyPart contentDisposition(ContentDisposition contentDisposition) {
    
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentDisposition getContentDisposition() {
    return contentDisposition;
  }


  public void setContentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
  }


  public FormDataBodyPart entity(Object entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEntity() {
    return entity;
  }


  public void setEntity(Object entity) {
    this.entity = entity;
  }


  public FormDataBodyPart formDataContentDisposition(FormDataContentDisposition formDataContentDisposition) {
    
    this.formDataContentDisposition = formDataContentDisposition;
    return this;
  }

   /**
   * Get formDataContentDisposition
   * @return formDataContentDisposition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormDataContentDisposition getFormDataContentDisposition() {
    return formDataContentDisposition;
  }


  public void setFormDataContentDisposition(FormDataContentDisposition formDataContentDisposition) {
    this.formDataContentDisposition = formDataContentDisposition;
  }


  public FormDataBodyPart headers(Map<String, List<String>> headers) {
    
    this.headers = headers;
    return this;
  }

  public FormDataBodyPart putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }


  public FormDataBodyPart mediaType(BodyPartMediaType mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BodyPartMediaType getMediaType() {
    return mediaType;
  }


  public void setMediaType(BodyPartMediaType mediaType) {
    this.mediaType = mediaType;
  }


  public FormDataBodyPart messageBodyWorkers(Object messageBodyWorkers) {
    
    this.messageBodyWorkers = messageBodyWorkers;
    return this;
  }

   /**
   * Get messageBodyWorkers
   * @return messageBodyWorkers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMessageBodyWorkers() {
    return messageBodyWorkers;
  }


  public void setMessageBodyWorkers(Object messageBodyWorkers) {
    this.messageBodyWorkers = messageBodyWorkers;
  }


  public FormDataBodyPart name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FormDataBodyPart parameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    
    this.parameterizedHeaders = parameterizedHeaders;
    return this;
  }

  public FormDataBodyPart putParameterizedHeadersItem(String key, List<ParameterizedHeader> parameterizedHeadersItem) {
    if (this.parameterizedHeaders == null) {
      this.parameterizedHeaders = new HashMap<>();
    }
    this.parameterizedHeaders.put(key, parameterizedHeadersItem);
    return this;
  }

   /**
   * Get parameterizedHeaders
   * @return parameterizedHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<ParameterizedHeader>> getParameterizedHeaders() {
    return parameterizedHeaders;
  }


  public void setParameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
  }


  public FormDataBodyPart parent(MultiPart parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiPart getParent() {
    return parent;
  }


  public void setParent(MultiPart parent) {
    this.parent = parent;
  }


  public FormDataBodyPart providers(Object providers) {
    
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getProviders() {
    return providers;
  }


  public void setProviders(Object providers) {
    this.providers = providers;
  }


  public FormDataBodyPart simple(Boolean simple) {
    
    this.simple = simple;
    return this;
  }

   /**
   * Get simple
   * @return simple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSimple() {
    return simple;
  }


  public void setSimple(Boolean simple) {
    this.simple = simple;
  }


  public FormDataBodyPart value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataBodyPart formDataBodyPart = (FormDataBodyPart) o;
    return Objects.equals(this.contentDisposition, formDataBodyPart.contentDisposition) &&
        Objects.equals(this.entity, formDataBodyPart.entity) &&
        Objects.equals(this.formDataContentDisposition, formDataBodyPart.formDataContentDisposition) &&
        Objects.equals(this.headers, formDataBodyPart.headers) &&
        Objects.equals(this.mediaType, formDataBodyPart.mediaType) &&
        Objects.equals(this.messageBodyWorkers, formDataBodyPart.messageBodyWorkers) &&
        Objects.equals(this.name, formDataBodyPart.name) &&
        Objects.equals(this.parameterizedHeaders, formDataBodyPart.parameterizedHeaders) &&
        Objects.equals(this.parent, formDataBodyPart.parent) &&
        Objects.equals(this.providers, formDataBodyPart.providers) &&
        Objects.equals(this.simple, formDataBodyPart.simple) &&
        Objects.equals(this.value, formDataBodyPart.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDisposition, entity, formDataContentDisposition, headers, mediaType, messageBodyWorkers, name, parameterizedHeaders, parent, providers, simple, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataBodyPart {\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    formDataContentDisposition: ").append(toIndentedString(formDataContentDisposition)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    messageBodyWorkers: ").append(toIndentedString(messageBodyWorkers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterizedHeaders: ").append(toIndentedString(parameterizedHeaders)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

