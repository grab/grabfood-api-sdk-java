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
import com.grab.grabfood.client.model.CancelOrderLimitType;
import com.grab.grabfood.client.model.CancelReason;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CheckOrderCancelableResponse {
  public static final String SERIALIZED_NAME_CANCEL_ABLE = "cancelAble";
  @SerializedName(SERIALIZED_NAME_CANCEL_ABLE)
  private Boolean cancelAble;

  /**
   * The reason for the order to be non-cancelable.
   */
  @JsonAdapter(NonCancellationReasonEnum.Adapter.class)
  public enum NonCancellationReasonEnum {
    GKMM_GRAB_KITCHEN_MIX_MATCH_ORDERS_CANNOT_BE_CANCELLED("GKMM (Grab Kitchen Mix & Match) orders cannot be cancelled"),
    
    SELF_PICK_UP_ORDERS_CANNOT_BE_CANCELLED("Self pick-up orders cannot be cancelled"),
    
    SCHEDULED_ORDERS_CANNOT_BE_CANCELLED("Scheduled orders cannot be cancelled"),
    
    DAILY_CANCELLATION_LIMIT_REACHED("Daily cancellation limit reached"),
    
    WEEKLY_CANCELLATION_LIMIT_REACHED("Weekly cancellation limit reached"),
    
    MONTHLY_CANCELLATION_LIMIT_REACHED("Monthly cancellation limit reached"),
    
    DRIVER_HAS_BEEN_ALLOCATED_FOR_TOO_LONG("Driver has been allocated for too long"),
    
    DRIVER_APP_VERSION_IS_OUTDATED_PREVENTING_CANCELLATION("Driver App version is outdated preventing cancellation"),
    
    ORDER_HAS_NOT_YET_BEEN_ALLOCATED_PREVENTING_CANCELLATION("Order has not yet been allocated preventing cancellation"),
    
    THE_CURRENT_STATUS_OF_THE_ORDER_DOES_NOT_ALLOW_CANCELLATION("The current status of the order does not allow cancellation"),
    
    DEFAULT_ERROR("Default Error"),
    
    EMPTY(""),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    NonCancellationReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NonCancellationReasonEnum fromValue(String value) {
      for (NonCancellationReasonEnum b : NonCancellationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<NonCancellationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NonCancellationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NonCancellationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NonCancellationReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NonCancellationReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NON_CANCELLATION_REASON = "nonCancellationReason";
  @SerializedName(SERIALIZED_NAME_NON_CANCELLATION_REASON)
  private NonCancellationReasonEnum nonCancellationReason;

  public static final String SERIALIZED_NAME_LIMIT_TYPE = "limitType";
  @SerializedName(SERIALIZED_NAME_LIMIT_TYPE)
  private CancelOrderLimitType limitType;

  public static final String SERIALIZED_NAME_LIMIT_TIMES = "limitTimes";
  @SerializedName(SERIALIZED_NAME_LIMIT_TIMES)
  private Long limitTimes;

  public static final String SERIALIZED_NAME_CANCEL_REASONS = "cancelReasons";
  @SerializedName(SERIALIZED_NAME_CANCEL_REASONS)
  private List<CancelReason> cancelReasons = new ArrayList<>();

  public CheckOrderCancelableResponse() {
  }

  public CheckOrderCancelableResponse cancelAble(Boolean cancelAble) {
    this.cancelAble = cancelAble;
    return this;
  }

  /**
   * The boolean value to indicate whether an order can be cancelled.
   * @return cancelAble
   */
  @javax.annotation.Nullable
  public Boolean getCancelAble() {
    return cancelAble;
  }

  public void setCancelAble(Boolean cancelAble) {
    this.cancelAble = cancelAble;
  }


  public CheckOrderCancelableResponse nonCancellationReason(NonCancellationReasonEnum nonCancellationReason) {
    this.nonCancellationReason = nonCancellationReason;
    return this;
  }

  /**
   * The reason for the order to be non-cancelable.
   * @return nonCancellationReason
   */
  @javax.annotation.Nullable
  public NonCancellationReasonEnum getNonCancellationReason() {
    return nonCancellationReason;
  }

  public void setNonCancellationReason(NonCancellationReasonEnum nonCancellationReason) {
    this.nonCancellationReason = nonCancellationReason;
  }


  public CheckOrderCancelableResponse limitType(CancelOrderLimitType limitType) {
    this.limitType = limitType;
    return this;
  }

  /**
   * Get limitType
   * @return limitType
   */
  @javax.annotation.Nullable
  public CancelOrderLimitType getLimitType() {
    return limitType;
  }

  public void setLimitType(CancelOrderLimitType limitType) {
    this.limitType = limitType;
  }


  public CheckOrderCancelableResponse limitTimes(Long limitTimes) {
    this.limitTimes = limitTimes;
    return this;
  }

  /**
   * The remaining cancellation quota for the merchant. A value is only returned when the nearest remaining cancellation limit is approaching, else it returns 0.
   * @return limitTimes
   */
  @javax.annotation.Nullable
  public Long getLimitTimes() {
    return limitTimes;
  }

  public void setLimitTimes(Long limitTimes) {
    this.limitTimes = limitTimes;
  }


  public CheckOrderCancelableResponse cancelReasons(List<CancelReason> cancelReasons) {
    this.cancelReasons = cancelReasons;
    return this;
  }

  public CheckOrderCancelableResponse addCancelReasonsItem(CancelReason cancelReasonsItem) {
    if (this.cancelReasons == null) {
      this.cancelReasons = new ArrayList<>();
    }
    this.cancelReasons.add(cancelReasonsItem);
    return this;
  }

  /**
   * An array of cancel order reasons JSON objects.
   * @return cancelReasons
   */
  @javax.annotation.Nullable
  public List<CancelReason> getCancelReasons() {
    return cancelReasons;
  }

  public void setCancelReasons(List<CancelReason> cancelReasons) {
    this.cancelReasons = cancelReasons;
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
   * @return the CheckOrderCancelableResponse instance itself
   */
  public CheckOrderCancelableResponse putAdditionalProperty(String key, Object value) {
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
    CheckOrderCancelableResponse checkOrderCancelableResponse = (CheckOrderCancelableResponse) o;
    return Objects.equals(this.cancelAble, checkOrderCancelableResponse.cancelAble) &&
        Objects.equals(this.nonCancellationReason, checkOrderCancelableResponse.nonCancellationReason) &&
        Objects.equals(this.limitType, checkOrderCancelableResponse.limitType) &&
        Objects.equals(this.limitTimes, checkOrderCancelableResponse.limitTimes) &&
        Objects.equals(this.cancelReasons, checkOrderCancelableResponse.cancelReasons)&&
        Objects.equals(this.additionalProperties, checkOrderCancelableResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelAble, nonCancellationReason, limitType, limitTimes, cancelReasons, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOrderCancelableResponse {\n");
    sb.append("    cancelAble: ").append(toIndentedString(cancelAble)).append("\n");
    sb.append("    nonCancellationReason: ").append(toIndentedString(nonCancellationReason)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    limitTimes: ").append(toIndentedString(limitTimes)).append("\n");
    sb.append("    cancelReasons: ").append(toIndentedString(cancelReasons)).append("\n");
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
    openapiFields.add("cancelAble");
    openapiFields.add("nonCancellationReason");
    openapiFields.add("limitType");
    openapiFields.add("limitTimes");
    openapiFields.add("cancelReasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CheckOrderCancelableResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckOrderCancelableResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckOrderCancelableResponse is not found in the empty JSON string", CheckOrderCancelableResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nonCancellationReason") != null && !jsonObj.get("nonCancellationReason").isJsonNull()) && !jsonObj.get("nonCancellationReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonCancellationReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonCancellationReason").toString()));
      }
      // validate the optional field `nonCancellationReason`
      if (jsonObj.get("nonCancellationReason") != null && !jsonObj.get("nonCancellationReason").isJsonNull()) {
        NonCancellationReasonEnum.validateJsonElement(jsonObj.get("nonCancellationReason"));
      }
      // validate the optional field `limitType`
      if (jsonObj.get("limitType") != null && !jsonObj.get("limitType").isJsonNull()) {
        CancelOrderLimitType.validateJsonElement(jsonObj.get("limitType"));
      }
      if (jsonObj.get("cancelReasons") != null && !jsonObj.get("cancelReasons").isJsonNull()) {
        JsonArray jsonArraycancelReasons = jsonObj.getAsJsonArray("cancelReasons");
        if (jsonArraycancelReasons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cancelReasons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cancelReasons` to be an array in the JSON string but got `%s`", jsonObj.get("cancelReasons").toString()));
          }

          // validate the optional field `cancelReasons` (array)
          for (int i = 0; i < jsonArraycancelReasons.size(); i++) {
            CancelReason.validateJsonElement(jsonArraycancelReasons.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckOrderCancelableResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckOrderCancelableResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckOrderCancelableResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckOrderCancelableResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckOrderCancelableResponse>() {
           @Override
           public void write(JsonWriter out, CheckOrderCancelableResponse value) throws IOException {
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
           public CheckOrderCancelableResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CheckOrderCancelableResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CheckOrderCancelableResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckOrderCancelableResponse
   * @throws IOException if the JSON string is invalid with respect to CheckOrderCancelableResponse
   */
  public static CheckOrderCancelableResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckOrderCancelableResponse.class);
  }

  /**
   * Convert an instance of CheckOrderCancelableResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

