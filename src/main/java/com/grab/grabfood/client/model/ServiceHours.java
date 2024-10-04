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
import com.grab.grabfood.client.model.ServiceHour;
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
 * A JSON object with serviceHours for each day of the week.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ServiceHours {
  public static final String SERIALIZED_NAME_MON = "mon";
  @SerializedName(SERIALIZED_NAME_MON)
  private ServiceHour mon;

  public static final String SERIALIZED_NAME_TUE = "tue";
  @SerializedName(SERIALIZED_NAME_TUE)
  private ServiceHour tue;

  public static final String SERIALIZED_NAME_WED = "wed";
  @SerializedName(SERIALIZED_NAME_WED)
  private ServiceHour wed;

  public static final String SERIALIZED_NAME_THU = "thu";
  @SerializedName(SERIALIZED_NAME_THU)
  private ServiceHour thu;

  public static final String SERIALIZED_NAME_FRI = "fri";
  @SerializedName(SERIALIZED_NAME_FRI)
  private ServiceHour fri;

  public static final String SERIALIZED_NAME_SAT = "sat";
  @SerializedName(SERIALIZED_NAME_SAT)
  private ServiceHour sat;

  public static final String SERIALIZED_NAME_SUN = "sun";
  @SerializedName(SERIALIZED_NAME_SUN)
  private ServiceHour sun;

  public ServiceHours() {
  }

  public ServiceHours mon(ServiceHour mon) {
    this.mon = mon;
    return this;
  }

  /**
   * Get mon
   * @return mon
   */
  @javax.annotation.Nonnull
  public ServiceHour getMon() {
    return mon;
  }

  public void setMon(ServiceHour mon) {
    this.mon = mon;
  }


  public ServiceHours tue(ServiceHour tue) {
    this.tue = tue;
    return this;
  }

  /**
   * Get tue
   * @return tue
   */
  @javax.annotation.Nonnull
  public ServiceHour getTue() {
    return tue;
  }

  public void setTue(ServiceHour tue) {
    this.tue = tue;
  }


  public ServiceHours wed(ServiceHour wed) {
    this.wed = wed;
    return this;
  }

  /**
   * Get wed
   * @return wed
   */
  @javax.annotation.Nonnull
  public ServiceHour getWed() {
    return wed;
  }

  public void setWed(ServiceHour wed) {
    this.wed = wed;
  }


  public ServiceHours thu(ServiceHour thu) {
    this.thu = thu;
    return this;
  }

  /**
   * Get thu
   * @return thu
   */
  @javax.annotation.Nonnull
  public ServiceHour getThu() {
    return thu;
  }

  public void setThu(ServiceHour thu) {
    this.thu = thu;
  }


  public ServiceHours fri(ServiceHour fri) {
    this.fri = fri;
    return this;
  }

  /**
   * Get fri
   * @return fri
   */
  @javax.annotation.Nonnull
  public ServiceHour getFri() {
    return fri;
  }

  public void setFri(ServiceHour fri) {
    this.fri = fri;
  }


  public ServiceHours sat(ServiceHour sat) {
    this.sat = sat;
    return this;
  }

  /**
   * Get sat
   * @return sat
   */
  @javax.annotation.Nonnull
  public ServiceHour getSat() {
    return sat;
  }

  public void setSat(ServiceHour sat) {
    this.sat = sat;
  }


  public ServiceHours sun(ServiceHour sun) {
    this.sun = sun;
    return this;
  }

  /**
   * Get sun
   * @return sun
   */
  @javax.annotation.Nonnull
  public ServiceHour getSun() {
    return sun;
  }

  public void setSun(ServiceHour sun) {
    this.sun = sun;
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
   * @return the ServiceHours instance itself
   */
  public ServiceHours putAdditionalProperty(String key, Object value) {
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
    ServiceHours serviceHours = (ServiceHours) o;
    return Objects.equals(this.mon, serviceHours.mon) &&
        Objects.equals(this.tue, serviceHours.tue) &&
        Objects.equals(this.wed, serviceHours.wed) &&
        Objects.equals(this.thu, serviceHours.thu) &&
        Objects.equals(this.fri, serviceHours.fri) &&
        Objects.equals(this.sat, serviceHours.sat) &&
        Objects.equals(this.sun, serviceHours.sun)&&
        Objects.equals(this.additionalProperties, serviceHours.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mon, tue, wed, thu, fri, sat, sun, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHours {\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
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
    openapiFields.add("mon");
    openapiFields.add("tue");
    openapiFields.add("wed");
    openapiFields.add("thu");
    openapiFields.add("fri");
    openapiFields.add("sat");
    openapiFields.add("sun");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mon");
    openapiRequiredFields.add("tue");
    openapiRequiredFields.add("wed");
    openapiRequiredFields.add("thu");
    openapiRequiredFields.add("fri");
    openapiRequiredFields.add("sat");
    openapiRequiredFields.add("sun");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ServiceHours
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ServiceHours.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceHours is not found in the empty JSON string", ServiceHours.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceHours.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `mon`
      ServiceHour.validateJsonElement(jsonObj.get("mon"));
      // validate the required field `tue`
      ServiceHour.validateJsonElement(jsonObj.get("tue"));
      // validate the required field `wed`
      ServiceHour.validateJsonElement(jsonObj.get("wed"));
      // validate the required field `thu`
      ServiceHour.validateJsonElement(jsonObj.get("thu"));
      // validate the required field `fri`
      ServiceHour.validateJsonElement(jsonObj.get("fri"));
      // validate the required field `sat`
      ServiceHour.validateJsonElement(jsonObj.get("sat"));
      // validate the required field `sun`
      ServiceHour.validateJsonElement(jsonObj.get("sun"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceHours.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceHours' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceHours> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceHours.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceHours>() {
           @Override
           public void write(JsonWriter out, ServiceHours value) throws IOException {
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
           public ServiceHours read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ServiceHours instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ServiceHours given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ServiceHours
   * @throws IOException if the JSON string is invalid with respect to ServiceHours
   */
  public static ServiceHours fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceHours.class);
  }

  /**
   * Convert an instance of ServiceHours to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

