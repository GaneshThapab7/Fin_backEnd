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
import org.apache.fineract.client.models.Grouping;
import org.apache.fineract.client.models.HookTemplateData;

/**
 * GetHookTemplateResponse
 */
@ApiModel(description = "GetHookTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetHookTemplateResponse {
  public static final String SERIALIZED_NAME_GROUPINGS = "groupings";
  @SerializedName(SERIALIZED_NAME_GROUPINGS)
  private List<Grouping> groupings = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<HookTemplateData> templates = null;

  public GetHookTemplateResponse() { 
  }

  public GetHookTemplateResponse groupings(List<Grouping> groupings) {
    
    this.groupings = groupings;
    return this;
  }

  public GetHookTemplateResponse addGroupingsItem(Grouping groupingsItem) {
    if (this.groupings == null) {
      this.groupings = new ArrayList<>();
    }
    this.groupings.add(groupingsItem);
    return this;
  }

   /**
   * Get groupings
   * @return groupings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Grouping> getGroupings() {
    return groupings;
  }


  public void setGroupings(List<Grouping> groupings) {
    this.groupings = groupings;
  }


  public GetHookTemplateResponse templates(List<HookTemplateData> templates) {
    
    this.templates = templates;
    return this;
  }

  public GetHookTemplateResponse addTemplatesItem(HookTemplateData templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HookTemplateData> getTemplates() {
    return templates;
  }


  public void setTemplates(List<HookTemplateData> templates) {
    this.templates = templates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHookTemplateResponse getHookTemplateResponse = (GetHookTemplateResponse) o;
    return Objects.equals(this.groupings, getHookTemplateResponse.groupings) &&
        Objects.equals(this.templates, getHookTemplateResponse.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupings, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHookTemplateResponse {\n");
    sb.append("    groupings: ").append(toIndentedString(groupings)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
