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
 * The featureFlag JSON object containing an order&#39;s feature related information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class OrderFeatureFlags {
  /**
   * The acceptance type for the order. Refer to FAQs for more details about [orderAcceptedType](#section/Order/How-do-I-identify-if-a-particular-order-is-auto-or-manual-acceptance). 
   */
  @JsonAdapter(OrderAcceptedTypeEnum.Adapter.class)
  public enum OrderAcceptedTypeEnum {
    AUTO("AUTO"),
    
    MANUAL("MANUAL"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OrderAcceptedTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderAcceptedTypeEnum fromValue(String value) {
      for (OrderAcceptedTypeEnum b : OrderAcceptedTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<OrderAcceptedTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderAcceptedTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderAcceptedTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderAcceptedTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OrderAcceptedTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ORDER_ACCEPTED_TYPE = "orderAcceptedType";
  @SerializedName(SERIALIZED_NAME_ORDER_ACCEPTED_TYPE)
  private OrderAcceptedTypeEnum orderAcceptedType;

  /**
   * The type of order. 
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    TAKE_AWAY("TakeAway"),
    
    DELIVERED_BY_GRAB("DeliveredByGrab"),
    
    DELIVERED_BY_RESTAURANT("DeliveredByRestaurant"),
    
    DINE_IN("DineIn"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OrderTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ORDER_TYPE = "orderType";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrderTypeEnum orderType;

  public static final String SERIALIZED_NAME_IS_MEX_EDIT_ORDER = "isMexEditOrder";
  @SerializedName(SERIALIZED_NAME_IS_MEX_EDIT_ORDER)
  private Boolean isMexEditOrder;

  public OrderFeatureFlags() {
  }

  public OrderFeatureFlags orderAcceptedType(OrderAcceptedTypeEnum orderAcceptedType) {
    this.orderAcceptedType = orderAcceptedType;
    return this;
  }

  /**
   * The acceptance type for the order. Refer to FAQs for more details about [orderAcceptedType](#section/Order/How-do-I-identify-if-a-particular-order-is-auto-or-manual-acceptance). 
   * @return orderAcceptedType
   */
  @javax.annotation.Nonnull
  public OrderAcceptedTypeEnum getOrderAcceptedType() {
    return orderAcceptedType;
  }

  public void setOrderAcceptedType(OrderAcceptedTypeEnum orderAcceptedType) {
    this.orderAcceptedType = orderAcceptedType;
  }


  public OrderFeatureFlags orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * The type of order. 
   * @return orderType
   */
  @javax.annotation.Nonnull
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }


  public OrderFeatureFlags isMexEditOrder(Boolean isMexEditOrder) {
    this.isMexEditOrder = isMexEditOrder;
    return this;
  }

  /**
   * A boolean value that indicates if the order is edited. 
   * @return isMexEditOrder
   */
  @javax.annotation.Nullable
  public Boolean getIsMexEditOrder() {
    return isMexEditOrder;
  }

  public void setIsMexEditOrder(Boolean isMexEditOrder) {
    this.isMexEditOrder = isMexEditOrder;
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
   * @return the OrderFeatureFlags instance itself
   */
  public OrderFeatureFlags putAdditionalProperty(String key, Object value) {
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
    OrderFeatureFlags orderFeatureFlags = (OrderFeatureFlags) o;
    return Objects.equals(this.orderAcceptedType, orderFeatureFlags.orderAcceptedType) &&
        Objects.equals(this.orderType, orderFeatureFlags.orderType) &&
        Objects.equals(this.isMexEditOrder, orderFeatureFlags.isMexEditOrder)&&
        Objects.equals(this.additionalProperties, orderFeatureFlags.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAcceptedType, orderType, isMexEditOrder, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFeatureFlags {\n");
    sb.append("    orderAcceptedType: ").append(toIndentedString(orderAcceptedType)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    isMexEditOrder: ").append(toIndentedString(isMexEditOrder)).append("\n");
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
    openapiFields.add("orderAcceptedType");
    openapiFields.add("orderType");
    openapiFields.add("isMexEditOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orderAcceptedType");
    openapiRequiredFields.add("orderType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderFeatureFlags
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderFeatureFlags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderFeatureFlags is not found in the empty JSON string", OrderFeatureFlags.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderFeatureFlags.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("orderAcceptedType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderAcceptedType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderAcceptedType").toString()));
      }
      // validate the required field `orderAcceptedType`
      OrderAcceptedTypeEnum.validateJsonElement(jsonObj.get("orderAcceptedType"));
      if (!jsonObj.get("orderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderType").toString()));
      }
      // validate the required field `orderType`
      OrderTypeEnum.validateJsonElement(jsonObj.get("orderType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderFeatureFlags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderFeatureFlags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderFeatureFlags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderFeatureFlags.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderFeatureFlags>() {
           @Override
           public void write(JsonWriter out, OrderFeatureFlags value) throws IOException {
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
           public OrderFeatureFlags read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderFeatureFlags instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrderFeatureFlags given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderFeatureFlags
   * @throws IOException if the JSON string is invalid with respect to OrderFeatureFlags
   */
  public static OrderFeatureFlags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderFeatureFlags.class);
  }

  /**
   * Convert an instance of OrderFeatureFlags to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

