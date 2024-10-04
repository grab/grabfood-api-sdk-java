// Copyright 2024 Grabtaxi Holdings PTE LTE (GRAB), All rights reserved.
// Use of this source code is governed by an MIT-style license that can be found in the LICENSE file

/*
 * GrabFood
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.grab.grabfood.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.grab.grabfood.client.JSON;

/**
 * This request submits membership registration request to partner. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class NotifyMembershipWebviewRequest {
  public static final String SERIALIZED_NAME_MEMBER_I_D = "memberID";
  @SerializedName(SERIALIZED_NAME_MEMBER_I_D)
  private String memberID;

  public static final String SERIALIZED_NAME_GRAB_I_D = "grabID";
  @SerializedName(SERIALIZED_NAME_GRAB_I_D)
  private String grabID;

  public static final String SERIALIZED_NAME_MERCHANT_I_D = "merchantID";
  @SerializedName(SERIALIZED_NAME_MERCHANT_I_D)
  private String merchantID;

  /**
   * Action completed in partner&#39;s webview.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    LINK("LINK"),
    
    REGISTER("REGISTER"),
    
    UNLINK("UNLINK"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public NotifyMembershipWebviewRequest() {
  }

  public NotifyMembershipWebviewRequest memberID(String memberID) {
    this.memberID = memberID;
    return this;
  }

  /**
   * The unique member ID on the partner&#39;s database.
   * @return memberID
   */
  @javax.annotation.Nullable
  public String getMemberID() {
    return memberID;
  }

  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }


  public NotifyMembershipWebviewRequest grabID(String grabID) {
    this.grabID = grabID;
    return this;
  }

  /**
   * The id used to identify an unique grab user.
   * @return grabID
   */
  @javax.annotation.Nullable
  public String getGrabID() {
    return grabID;
  }

  public void setGrabID(String grabID) {
    this.grabID = grabID;
  }


  public NotifyMembershipWebviewRequest merchantID(String merchantID) {
    this.merchantID = merchantID;
    return this;
  }

  /**
   * The merchant&#39;s ID that is in GrabFood&#39;s database.
   * @return merchantID
   */
  @javax.annotation.Nullable
  public String getMerchantID() {
    return merchantID;
  }

  public void setMerchantID(String merchantID) {
    this.merchantID = merchantID;
  }


  public NotifyMembershipWebviewRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action completed in partner&#39;s webview.
   * @return action
   */
  @javax.annotation.Nullable
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NotifyMembershipWebviewRequest instance itself
   */
  public NotifyMembershipWebviewRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyMembershipWebviewRequest notifyMembershipWebviewRequest = (NotifyMembershipWebviewRequest) o;
    return Objects.equals(this.memberID, notifyMembershipWebviewRequest.memberID) &&
        Objects.equals(this.grabID, notifyMembershipWebviewRequest.grabID) &&
        Objects.equals(this.merchantID, notifyMembershipWebviewRequest.merchantID) &&
        Objects.equals(this.action, notifyMembershipWebviewRequest.action)&&
        Objects.equals(this.additionalProperties, notifyMembershipWebviewRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberID, grabID, merchantID, action, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyMembershipWebviewRequest {\n");
    sb.append("    memberID: ").append(toIndentedString(memberID)).append("\n");
    sb.append("    grabID: ").append(toIndentedString(grabID)).append("\n");
    sb.append("    merchantID: ").append(toIndentedString(merchantID)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("memberID");
    openapiFields.add("grabID");
    openapiFields.add("merchantID");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotifyMembershipWebviewRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotifyMembershipWebviewRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotifyMembershipWebviewRequest is not found in the empty JSON string", NotifyMembershipWebviewRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("memberID") != null && !jsonObj.get("memberID").isJsonNull()) && !jsonObj.get("memberID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memberID").toString()));
      }
      if ((jsonObj.get("grabID") != null && !jsonObj.get("grabID").isJsonNull()) && !jsonObj.get("grabID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grabID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grabID").toString()));
      }
      if ((jsonObj.get("merchantID") != null && !jsonObj.get("merchantID").isJsonNull()) && !jsonObj.get("merchantID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantID").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        ActionEnum.validateJsonElement(jsonObj.get("action"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotifyMembershipWebviewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotifyMembershipWebviewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotifyMembershipWebviewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotifyMembershipWebviewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<NotifyMembershipWebviewRequest>() {
           @Override
           public void write(JsonWriter out, NotifyMembershipWebviewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NotifyMembershipWebviewRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             NotifyMembershipWebviewRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotifyMembershipWebviewRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotifyMembershipWebviewRequest
   * @throws IOException if the JSON string is invalid with respect to NotifyMembershipWebviewRequest
   */
  public static NotifyMembershipWebviewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotifyMembershipWebviewRequest.class);
  }

  /**
   * Convert an instance of NotifyMembershipWebviewRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

