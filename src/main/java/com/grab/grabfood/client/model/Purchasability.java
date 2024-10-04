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
 * Purchasability is set to true by default for all service type, unless it is explicitly set to false. Modifier will reuse it’s item’s purchasability. Refer [Service Based Menu](#section/Service-Based-Menu). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Purchasability {
  public static final String SERIALIZED_NAME_DELIVERY_ON_DEMAND_GRAB_APP = "Delivery_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ON_DEMAND_GRAB_APP)
  private Boolean deliveryOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DELIVERY_SCHEDULED_GRAB_APP = "Delivery_Scheduled_GrabApp";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SCHEDULED_GRAB_APP)
  private Boolean deliveryScheduledGrabApp;

  public static final String SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_GRAB_APP = "SelfPickUp_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_GRAB_APP)
  private Boolean selfPickUpOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DINE_IN_ON_DEMAND_GRAB_APP = "DineIn_OnDemand_GrabApp";
  @SerializedName(SERIALIZED_NAME_DINE_IN_ON_DEMAND_GRAB_APP)
  private Boolean dineInOnDemandGrabApp;

  public static final String SERIALIZED_NAME_DELIVERY_ON_DEMAND_STORE_FRONT = "Delivery_OnDemand_StoreFront";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ON_DEMAND_STORE_FRONT)
  private Boolean deliveryOnDemandStoreFront;

  public static final String SERIALIZED_NAME_DELIVERY_SCHEDULED_STORE_FRONT = "Delivery_Scheduled_StoreFront";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SCHEDULED_STORE_FRONT)
  private Boolean deliveryScheduledStoreFront;

  public static final String SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_STORE_FRONT = "SelfPickUp_OnDemand_StoreFront";
  @SerializedName(SERIALIZED_NAME_SELF_PICK_UP_ON_DEMAND_STORE_FRONT)
  private Boolean selfPickUpOnDemandStoreFront;

  public Purchasability() {
  }

  public Purchasability deliveryOnDemandGrabApp(Boolean deliveryOnDemandGrabApp) {
    this.deliveryOnDemandGrabApp = deliveryOnDemandGrabApp;
    return this;
  }

  /**
   * Get deliveryOnDemandGrabApp
   * @return deliveryOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Boolean getDeliveryOnDemandGrabApp() {
    return deliveryOnDemandGrabApp;
  }

  public void setDeliveryOnDemandGrabApp(Boolean deliveryOnDemandGrabApp) {
    this.deliveryOnDemandGrabApp = deliveryOnDemandGrabApp;
  }


  public Purchasability deliveryScheduledGrabApp(Boolean deliveryScheduledGrabApp) {
    this.deliveryScheduledGrabApp = deliveryScheduledGrabApp;
    return this;
  }

  /**
   * Get deliveryScheduledGrabApp
   * @return deliveryScheduledGrabApp
   */
  @javax.annotation.Nullable
  public Boolean getDeliveryScheduledGrabApp() {
    return deliveryScheduledGrabApp;
  }

  public void setDeliveryScheduledGrabApp(Boolean deliveryScheduledGrabApp) {
    this.deliveryScheduledGrabApp = deliveryScheduledGrabApp;
  }


  public Purchasability selfPickUpOnDemandGrabApp(Boolean selfPickUpOnDemandGrabApp) {
    this.selfPickUpOnDemandGrabApp = selfPickUpOnDemandGrabApp;
    return this;
  }

  /**
   * Get selfPickUpOnDemandGrabApp
   * @return selfPickUpOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Boolean getSelfPickUpOnDemandGrabApp() {
    return selfPickUpOnDemandGrabApp;
  }

  public void setSelfPickUpOnDemandGrabApp(Boolean selfPickUpOnDemandGrabApp) {
    this.selfPickUpOnDemandGrabApp = selfPickUpOnDemandGrabApp;
  }


  public Purchasability dineInOnDemandGrabApp(Boolean dineInOnDemandGrabApp) {
    this.dineInOnDemandGrabApp = dineInOnDemandGrabApp;
    return this;
  }

  /**
   * Get dineInOnDemandGrabApp
   * @return dineInOnDemandGrabApp
   */
  @javax.annotation.Nullable
  public Boolean getDineInOnDemandGrabApp() {
    return dineInOnDemandGrabApp;
  }

  public void setDineInOnDemandGrabApp(Boolean dineInOnDemandGrabApp) {
    this.dineInOnDemandGrabApp = dineInOnDemandGrabApp;
  }


  public Purchasability deliveryOnDemandStoreFront(Boolean deliveryOnDemandStoreFront) {
    this.deliveryOnDemandStoreFront = deliveryOnDemandStoreFront;
    return this;
  }

  /**
   * Get deliveryOnDemandStoreFront
   * @return deliveryOnDemandStoreFront
   */
  @javax.annotation.Nullable
  public Boolean getDeliveryOnDemandStoreFront() {
    return deliveryOnDemandStoreFront;
  }

  public void setDeliveryOnDemandStoreFront(Boolean deliveryOnDemandStoreFront) {
    this.deliveryOnDemandStoreFront = deliveryOnDemandStoreFront;
  }


  public Purchasability deliveryScheduledStoreFront(Boolean deliveryScheduledStoreFront) {
    this.deliveryScheduledStoreFront = deliveryScheduledStoreFront;
    return this;
  }

  /**
   * Get deliveryScheduledStoreFront
   * @return deliveryScheduledStoreFront
   */
  @javax.annotation.Nullable
  public Boolean getDeliveryScheduledStoreFront() {
    return deliveryScheduledStoreFront;
  }

  public void setDeliveryScheduledStoreFront(Boolean deliveryScheduledStoreFront) {
    this.deliveryScheduledStoreFront = deliveryScheduledStoreFront;
  }


  public Purchasability selfPickUpOnDemandStoreFront(Boolean selfPickUpOnDemandStoreFront) {
    this.selfPickUpOnDemandStoreFront = selfPickUpOnDemandStoreFront;
    return this;
  }

  /**
   * Get selfPickUpOnDemandStoreFront
   * @return selfPickUpOnDemandStoreFront
   */
  @javax.annotation.Nullable
  public Boolean getSelfPickUpOnDemandStoreFront() {
    return selfPickUpOnDemandStoreFront;
  }

  public void setSelfPickUpOnDemandStoreFront(Boolean selfPickUpOnDemandStoreFront) {
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
   * @return the Purchasability instance itself
   */
  public Purchasability putAdditionalProperty(String key, Object value) {
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
    Purchasability purchasability = (Purchasability) o;
    return Objects.equals(this.deliveryOnDemandGrabApp, purchasability.deliveryOnDemandGrabApp) &&
        Objects.equals(this.deliveryScheduledGrabApp, purchasability.deliveryScheduledGrabApp) &&
        Objects.equals(this.selfPickUpOnDemandGrabApp, purchasability.selfPickUpOnDemandGrabApp) &&
        Objects.equals(this.dineInOnDemandGrabApp, purchasability.dineInOnDemandGrabApp) &&
        Objects.equals(this.deliveryOnDemandStoreFront, purchasability.deliveryOnDemandStoreFront) &&
        Objects.equals(this.deliveryScheduledStoreFront, purchasability.deliveryScheduledStoreFront) &&
        Objects.equals(this.selfPickUpOnDemandStoreFront, purchasability.selfPickUpOnDemandStoreFront)&&
        Objects.equals(this.additionalProperties, purchasability.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOnDemandGrabApp, deliveryScheduledGrabApp, selfPickUpOnDemandGrabApp, dineInOnDemandGrabApp, deliveryOnDemandStoreFront, deliveryScheduledStoreFront, selfPickUpOnDemandStoreFront, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Purchasability {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Purchasability
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Purchasability.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Purchasability is not found in the empty JSON string", Purchasability.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Purchasability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Purchasability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Purchasability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Purchasability.class));

       return (TypeAdapter<T>) new TypeAdapter<Purchasability>() {
           @Override
           public void write(JsonWriter out, Purchasability value) throws IOException {
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
           public Purchasability read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Purchasability instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Purchasability given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Purchasability
   * @throws IOException if the JSON string is invalid with respect to Purchasability
   */
  public static Purchasability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Purchasability.class);
  }

  /**
   * Convert an instance of Purchasability to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

