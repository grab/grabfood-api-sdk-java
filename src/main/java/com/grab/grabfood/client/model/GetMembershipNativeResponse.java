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
import com.grab.grabfood.client.model.GetMembershipNativeResponsePointInfo;
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
 * This response returns membership detail. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class GetMembershipNativeResponse {
  /**
   * Status of the memberID.
   */
  @JsonAdapter(MembershipStatusEnum.Adapter.class)
  public enum MembershipStatusEnum {
    VALID("VALID"),
    
    INVALID("INVALID"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    MembershipStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MembershipStatusEnum fromValue(String value) {
      for (MembershipStatusEnum b : MembershipStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<MembershipStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MembershipStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MembershipStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MembershipStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MembershipStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MEMBERSHIP_STATUS = "membershipStatus";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_STATUS)
  private MembershipStatusEnum membershipStatus;

  public static final String SERIALIZED_NAME_POINT_INFO = "pointInfo";
  @SerializedName(SERIALIZED_NAME_POINT_INFO)
  private GetMembershipNativeResponsePointInfo pointInfo;

  public static final String SERIALIZED_NAME_POINTS_EXPIRE_DATE = "pointsExpireDate";
  @SerializedName(SERIALIZED_NAME_POINTS_EXPIRE_DATE)
  private String pointsExpireDate;

  public GetMembershipNativeResponse() {
  }

  public GetMembershipNativeResponse membershipStatus(MembershipStatusEnum membershipStatus) {
    this.membershipStatus = membershipStatus;
    return this;
  }

  /**
   * Status of the memberID.
   * @return membershipStatus
   */
  @javax.annotation.Nullable
  public MembershipStatusEnum getMembershipStatus() {
    return membershipStatus;
  }

  public void setMembershipStatus(MembershipStatusEnum membershipStatus) {
    this.membershipStatus = membershipStatus;
  }


  public GetMembershipNativeResponse pointInfo(GetMembershipNativeResponsePointInfo pointInfo) {
    this.pointInfo = pointInfo;
    return this;
  }

  /**
   * Get pointInfo
   * @return pointInfo
   */
  @javax.annotation.Nullable
  public GetMembershipNativeResponsePointInfo getPointInfo() {
    return pointInfo;
  }

  public void setPointInfo(GetMembershipNativeResponsePointInfo pointInfo) {
    this.pointInfo = pointInfo;
  }


  public GetMembershipNativeResponse pointsExpireDate(String pointsExpireDate) {
    this.pointsExpireDate = pointsExpireDate;
    return this;
  }

  /**
   * Earliest points expiry date. In &#x60;yyyy-mm-dd&#x60; format
   * @return pointsExpireDate
   */
  @javax.annotation.Nullable
  public String getPointsExpireDate() {
    return pointsExpireDate;
  }

  public void setPointsExpireDate(String pointsExpireDate) {
    this.pointsExpireDate = pointsExpireDate;
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
   * @return the GetMembershipNativeResponse instance itself
   */
  public GetMembershipNativeResponse putAdditionalProperty(String key, Object value) {
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
    GetMembershipNativeResponse getMembershipNativeResponse = (GetMembershipNativeResponse) o;
    return Objects.equals(this.membershipStatus, getMembershipNativeResponse.membershipStatus) &&
        Objects.equals(this.pointInfo, getMembershipNativeResponse.pointInfo) &&
        Objects.equals(this.pointsExpireDate, getMembershipNativeResponse.pointsExpireDate)&&
        Objects.equals(this.additionalProperties, getMembershipNativeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membershipStatus, pointInfo, pointsExpireDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMembershipNativeResponse {\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    pointInfo: ").append(toIndentedString(pointInfo)).append("\n");
    sb.append("    pointsExpireDate: ").append(toIndentedString(pointsExpireDate)).append("\n");
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
    openapiFields.add("membershipStatus");
    openapiFields.add("pointInfo");
    openapiFields.add("pointsExpireDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMembershipNativeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMembershipNativeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMembershipNativeResponse is not found in the empty JSON string", GetMembershipNativeResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("membershipStatus") != null && !jsonObj.get("membershipStatus").isJsonNull()) && !jsonObj.get("membershipStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `membershipStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("membershipStatus").toString()));
      }
      // validate the optional field `membershipStatus`
      if (jsonObj.get("membershipStatus") != null && !jsonObj.get("membershipStatus").isJsonNull()) {
        MembershipStatusEnum.validateJsonElement(jsonObj.get("membershipStatus"));
      }
      // validate the optional field `pointInfo`
      if (jsonObj.get("pointInfo") != null && !jsonObj.get("pointInfo").isJsonNull()) {
        GetMembershipNativeResponsePointInfo.validateJsonElement(jsonObj.get("pointInfo"));
      }
      if ((jsonObj.get("pointsExpireDate") != null && !jsonObj.get("pointsExpireDate").isJsonNull()) && !jsonObj.get("pointsExpireDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pointsExpireDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pointsExpireDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMembershipNativeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMembershipNativeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMembershipNativeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMembershipNativeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMembershipNativeResponse>() {
           @Override
           public void write(JsonWriter out, GetMembershipNativeResponse value) throws IOException {
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
           public GetMembershipNativeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetMembershipNativeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of GetMembershipNativeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMembershipNativeResponse
   * @throws IOException if the JSON string is invalid with respect to GetMembershipNativeResponse
   */
  public static GetMembershipNativeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMembershipNativeResponse.class);
  }

  /**
   * Convert an instance of GetMembershipNativeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

