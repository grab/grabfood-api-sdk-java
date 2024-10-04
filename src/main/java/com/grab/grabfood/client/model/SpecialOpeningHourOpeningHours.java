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
import com.grab.grabfood.client.model.OpenPeriod;
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
 * Store special opening hour period.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class SpecialOpeningHourOpeningHours {
  /**
   * The period type for when the outlet is open.
   */
  @JsonAdapter(OpenPeriodTypeEnum.Adapter.class)
  public enum OpenPeriodTypeEnum {
    PERIOD("Period"),
    
    OPEN_ALL_DAY("OpenAllDay"),
    
    CLOSED_ALL_DAY("ClosedAllDay"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OpenPeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpenPeriodTypeEnum fromValue(String value) {
      for (OpenPeriodTypeEnum b : OpenPeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<OpenPeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpenPeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpenPeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OpenPeriodTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OpenPeriodTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPEN_PERIOD_TYPE = "openPeriodType";
  @SerializedName(SERIALIZED_NAME_OPEN_PERIOD_TYPE)
  private OpenPeriodTypeEnum openPeriodType;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<OpenPeriod> periods = new ArrayList<>();

  public SpecialOpeningHourOpeningHours() {
  }

  public SpecialOpeningHourOpeningHours openPeriodType(OpenPeriodTypeEnum openPeriodType) {
    this.openPeriodType = openPeriodType;
    return this;
  }

  /**
   * The period type for when the outlet is open.
   * @return openPeriodType
   */
  @javax.annotation.Nullable
  public OpenPeriodTypeEnum getOpenPeriodType() {
    return openPeriodType;
  }

  public void setOpenPeriodType(OpenPeriodTypeEnum openPeriodType) {
    this.openPeriodType = openPeriodType;
  }


  public SpecialOpeningHourOpeningHours periods(List<OpenPeriod> periods) {
    this.periods = periods;
    return this;
  }

  public SpecialOpeningHourOpeningHours addPeriodsItem(OpenPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * An array of open periods. Maximum of 3 periods.
   * @return periods
   */
  @javax.annotation.Nullable
  public List<OpenPeriod> getPeriods() {
    return periods;
  }

  public void setPeriods(List<OpenPeriod> periods) {
    this.periods = periods;
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
   * @return the SpecialOpeningHourOpeningHours instance itself
   */
  public SpecialOpeningHourOpeningHours putAdditionalProperty(String key, Object value) {
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
    SpecialOpeningHourOpeningHours specialOpeningHourOpeningHours = (SpecialOpeningHourOpeningHours) o;
    return Objects.equals(this.openPeriodType, specialOpeningHourOpeningHours.openPeriodType) &&
        Objects.equals(this.periods, specialOpeningHourOpeningHours.periods)&&
        Objects.equals(this.additionalProperties, specialOpeningHourOpeningHours.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openPeriodType, periods, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialOpeningHourOpeningHours {\n");
    sb.append("    openPeriodType: ").append(toIndentedString(openPeriodType)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
    openapiFields.add("openPeriodType");
    openapiFields.add("periods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SpecialOpeningHourOpeningHours
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpecialOpeningHourOpeningHours.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecialOpeningHourOpeningHours is not found in the empty JSON string", SpecialOpeningHourOpeningHours.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("openPeriodType") != null && !jsonObj.get("openPeriodType").isJsonNull()) && !jsonObj.get("openPeriodType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `openPeriodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("openPeriodType").toString()));
      }
      // validate the optional field `openPeriodType`
      if (jsonObj.get("openPeriodType") != null && !jsonObj.get("openPeriodType").isJsonNull()) {
        OpenPeriodTypeEnum.validateJsonElement(jsonObj.get("openPeriodType"));
      }
      if (jsonObj.get("periods") != null && !jsonObj.get("periods").isJsonNull()) {
        JsonArray jsonArrayperiods = jsonObj.getAsJsonArray("periods");
        if (jsonArrayperiods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("periods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `periods` to be an array in the JSON string but got `%s`", jsonObj.get("periods").toString()));
          }

          // validate the optional field `periods` (array)
          for (int i = 0; i < jsonArrayperiods.size(); i++) {
            OpenPeriod.validateJsonElement(jsonArrayperiods.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecialOpeningHourOpeningHours.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialOpeningHourOpeningHours' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialOpeningHourOpeningHours> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialOpeningHourOpeningHours.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialOpeningHourOpeningHours>() {
           @Override
           public void write(JsonWriter out, SpecialOpeningHourOpeningHours value) throws IOException {
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
           public SpecialOpeningHourOpeningHours read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SpecialOpeningHourOpeningHours instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SpecialOpeningHourOpeningHours given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SpecialOpeningHourOpeningHours
   * @throws IOException if the JSON string is invalid with respect to SpecialOpeningHourOpeningHours
   */
  public static SpecialOpeningHourOpeningHours fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialOpeningHourOpeningHours.class);
  }

  /**
   * Convert an instance of SpecialOpeningHourOpeningHours to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

