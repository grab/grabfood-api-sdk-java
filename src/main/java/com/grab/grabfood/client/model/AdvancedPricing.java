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
 * Price configuration (in minor unit) for different service, order type and channel combination. If a service type does not have a specified price, it will utilize the default price of the item. Refer [Service Based Menu](#section/Service-Based-Menu). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class AdvancedPricing {
  public static final String SERIALIZED_NAME_DELIVERY_ON_DEMAND_GRAB_APP = "Delivery_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ON_DEMAND_GRAB_APP)
  private Long deliveryOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DELIVERY_SCHEDULED_GRAB_APP = "Delivery_Scheduled_GrabApp";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SCHEDULED_GRAB_APP)
  private Long deliveryScheduledGrabApp;

  public static final String SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_GRAB_APP = "SelfPickUp_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_GRAB_APP)
  private Long selfPickUpOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DINE_IN_ON_DEMAND_GRAB_APP = "DineIn_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_DINE_IN_ON_DEMAND_GRAB_APP)
  private Long dineInOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DELIVERY_ON_DEMAND_STORE_FRONT = "Delivery_OnDemand_StoreFront";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ON_DEMAND_STORE_FRONT)
  private Long deliveryOnDemandStoreFront;

  public static final String SERIALIZED_NAME_DELIVERY_SCHEDULED_STORE_FRONT = "Delivery_Scheduled_StoreFront";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SCHEDULED_STORE_FRONT)
  private Long deliveryScheduledStoreFront;

  public static final String SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_STORE_FRONT = "SelfPickUp_OnDemand_StoreFront";
  @SerializedName(SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_STORE_FRONT)
  private Long selfPickUpOnDemandStoreFront;

  public AdvancedPricing() {
  }

  public AdvancedPricing deliveryOnDemandGrabApp(Long deliveryOnDemandGrabApp) {
    this.deliveryOnDemandGrabApp = deliveryOnDemandGrabApp;
    return this;
  }

  /**
   * Service type: &#x60;Delivery&#x60;, Order type: &#x60;Instant&#x60;, Channel: &#x60;Grab App&#x60; 
   * @return deliveryOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Long getDeliveryOnDemandGrabApp() {
    return deliveryOnDemandGrabApp;
  }

  public void setDeliveryOnDemandGrabApp(Long deliveryOnDemandGrabApp) {
    this.deliveryOnDemandGrabApp = deliveryOnDemandGrabApp;
  }


  public AdvancedPricing deliveryScheduledGrabApp(Long deliveryScheduledGrabApp) {
    this.deliveryScheduledGrabApp = deliveryScheduledGrabApp;
    return this;
  }

  /**
   * Service type: &#x60;Delivery&#x60;, Order type: &#x60;Scheduled&#x60;, Channel: &#x60;Grab App&#x60; 
   * @return deliveryScheduledGrabApp
   */
  @javax.annotation.Nullable
  public Long getDeliveryScheduledGrabApp() {
    return deliveryScheduledGrabApp;
  }

  public void setDeliveryScheduledGrabApp(Long deliveryScheduledGrabApp) {
    this.deliveryScheduledGrabApp = deliveryScheduledGrabApp;
  }


  public AdvancedPricing selfPickUpOnDemandGrabApp(Long selfPickUpOnDemandGrabApp) {
    this.selfPickUpOnDemandGrabApp = selfPickUpOnDemandGrabApp;
    return this;
  }

  /**
   * Service type: &#x60;Self Pick Up&#x60;, Order type: &#x60;Instant&#x60;, Channel: &#x60;Grab App&#x60; 
   * @return selfPickUpOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Long getSelfPickUpOnDemandGrabApp() {
    return selfPickUpOnDemandGrabApp;
  }

  public void setSelfPickUpOnDemandGrabApp(Long selfPickUpOnDemandGrabApp) {
    this.selfPickUpOnDemandGrabApp = selfPickUpOnDemandGrabApp;
  }


  public AdvancedPricing dineInOnDemandGrabApp(Long dineInOnDemandGrabApp) {
    this.dineInOnDemandGrabApp = dineInOnDemandGrabApp;
    return this;
  }

  /**
   * Service type: &#x60;Dine In&#x60;, Order type: &#x60;Instant&#x60;, Channel: &#x60;Grab App&#x60; 
   * @return dineInOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Long getDineInOnDemandGrabApp() {
    return dineInOnDemandGrabApp;
  }

  public void setDineInOnDemandGrabApp(Long dineInOnDemandGrabApp) {
    this.dineInOnDemandGrabApp = dineInOnDemandGrabApp;
  }


  public AdvancedPricing deliveryOnDemandStoreFront(Long deliveryOnDemandStoreFront) {
    this.deliveryOnDemandStoreFront = deliveryOnDemandStoreFront;
    return this;
  }

  /**
   * Service type: &#x60;Delivery&#x60;, Order type: &#x60;Instant&#x60;, Channel: &#x60;Store Front&#x60; 
   * @return deliveryOnDemandStoreFront
   */
  @javax.annotation.Nullable
  public Long getDeliveryOnDemandStoreFront() {
    return deliveryOnDemandStoreFront;
  }

  public void setDeliveryOnDemandStoreFront(Long deliveryOnDemandStoreFront) {
    this.deliveryOnDemandStoreFront = deliveryOnDemandStoreFront;
  }


  public AdvancedPricing deliveryScheduledStoreFront(Long deliveryScheduledStoreFront) {
    this.deliveryScheduledStoreFront = deliveryScheduledStoreFront;
    return this;
  }

  /**
   * Service type: &#x60;Delivery&#x60;, Order type: &#x60;Scheduled&#x60;, Channel: &#x60;Store Front&#x60; 
   * @return deliveryScheduledStoreFront
   */
  @javax.annotation.Nullable
  public Long getDeliveryScheduledStoreFront() {
    return deliveryScheduledStoreFront;
  }

  public void setDeliveryScheduledStoreFront(Long deliveryScheduledStoreFront) {
    this.deliveryScheduledStoreFront = deliveryScheduledStoreFront;
  }


  public AdvancedPricing selfPickUpOnDemandStoreFront(Long selfPickUpOnDemandStoreFront) {
    this.selfPickUpOnDemandStoreFront = selfPickUpOnDemandStoreFront;
    return this;
  }

  /**
   * Service type: &#x60;Self Pick Up&#x60;, Order type: &#x60;Instant&#x60;, Channel: &#x60;Store Front&#x60; 
   * @return selfPickUpOnDemandStoreFront
   */
  @javax.annotation.Nullable
  public Long getSelfPickUpOnDemandStoreFront() {
    return selfPickUpOnDemandStoreFront;
  }

  public void setSelfPickUpOnDemandStoreFront(Long selfPickUpOnDemandStoreFront) {
    this.selfPickUpOnDemandStoreFront = selfPickUpOnDemandStoreFront;
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
   * @return the AdvancedPricing instance itself
   */
  public AdvancedPricing putAdditionalProperty(String key, Object value) {
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
    AdvancedPricing advancedPricing = (AdvancedPricing) o;
    return Objects.equals(this.deliveryOnDemandGrabApp, advancedPricing.deliveryOnDemandGrabApp) &&
        Objects.equals(this.deliveryScheduledGrabApp, advancedPricing.deliveryScheduledGrabApp) &&
        Objects.equals(this.selfPickUpOnDemandGrabApp, advancedPricing.selfPickUpOnDemandGrabApp) &&
        Objects.equals(this.dineInOnDemandGrabApp, advancedPricing.dineInOnDemandGrabApp) &&
        Objects.equals(this.deliveryOnDemandStoreFront, advancedPricing.deliveryOnDemandStoreFront) &&
        Objects.equals(this.deliveryScheduledStoreFront, advancedPricing.deliveryScheduledStoreFront) &&
        Objects.equals(this.selfPickUpOnDemandStoreFront, advancedPricing.selfPickUpOnDemandStoreFront)&&
        Objects.equals(this.additionalProperties, advancedPricing.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOnDemandGrabApp, deliveryScheduledGrabApp, selfPickUpOnDemandGrabApp, dineInOnDemandGrabApp, deliveryOnDemandStoreFront, deliveryScheduledStoreFront, selfPickUpOnDemandStoreFront, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedPricing {\n");
    sb.append("    deliveryOnDemandGrabApp: ").append(toIndentedString(deliveryOnDemandGrabApp)).append("\n");
    sb.append("    deliveryScheduledGrabApp: ").append(toIndentedString(deliveryScheduledGrabApp)).append("\n");
    sb.append("    selfPickUpOnDemandGrabApp: ").append(toIndentedString(selfPickUpOnDemandGrabApp)).append("\n");
    sb.append("    dineInOnDemandGrabApp: ").append(toIndentedString(dineInOnDemandGrabApp)).append("\n");
    sb.append("    deliveryOnDemandStoreFront: ").append(toIndentedString(deliveryOnDemandStoreFront)).append("\n");
    sb.append("    deliveryScheduledStoreFront: ").append(toIndentedString(deliveryScheduledStoreFront)).append("\n");
    sb.append("    selfPickUpOnDemandStoreFront: ").append(toIndentedString(selfPickUpOnDemandStoreFront)).append("\n");
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
    openapiFields.add("Delivery_OnDemand_GrabApp");
    openapiFields.add("Delivery_Scheduled_GrabApp");
    openapiFields.add("SelfPickUp_OnDemand_GrabApp");
    openapiFields.add("DineIn_OnDemand_GrabApp");
    openapiFields.add("Delivery_OnDemand_StoreFront");
    openapiFields.add("Delivery_Scheduled_StoreFront");
    openapiFields.add("SelfPickUp_OnDemand_StoreFront");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdvancedPricing
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdvancedPricing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvancedPricing is not found in the empty JSON string", AdvancedPricing.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvancedPricing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvancedPricing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvancedPricing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvancedPricing.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvancedPricing>() {
           @Override
           public void write(JsonWriter out, AdvancedPricing value) throws IOException {
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
           public AdvancedPricing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AdvancedPricing instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AdvancedPricing given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdvancedPricing
   * @throws IOException if the JSON string is invalid with respect to AdvancedPricing
   */
  public static AdvancedPricing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvancedPricing.class);
  }

  /**
   * Convert an instance of AdvancedPricing to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

