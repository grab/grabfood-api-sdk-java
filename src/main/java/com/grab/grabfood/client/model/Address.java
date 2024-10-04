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
import com.grab.grabfood.client.model.Coordinates;
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
 * A JSON object containing the receiver’s location information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Address {
  public static final String SERIALIZED_NAME_UNIT_NUMBER = "unitNumber";
  @SerializedName(SERIALIZED_NAME_UNIT_NUMBER)
  private String unitNumber;

  public static final String SERIALIZED_NAME_DELIVERY_INSTRUCTION = "deliveryInstruction";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INSTRUCTION)
  private String deliveryInstruction;

  /**
   * POI source
   */
  @JsonAdapter(PoiSourceEnum.Adapter.class)
  public enum PoiSourceEnum {
    GRAB("GRAB"),
    
    GOOGLE("GOOGLE"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    PoiSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PoiSourceEnum fromValue(String value) {
      for (PoiSourceEnum b : PoiSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<PoiSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PoiSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PoiSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PoiSourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PoiSourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POI_SOURCE = "poiSource";
  @SerializedName(SERIALIZED_NAME_POI_SOURCE)
  private PoiSourceEnum poiSource;

  public static final String SERIALIZED_NAME_POI_I_D = "poiID";
  @SerializedName(SERIALIZED_NAME_POI_I_D)
  private String poiID;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private Coordinates coordinates;

  public Address() {
  }

  public Address unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * The delivery address&#39; unit number.
   * @return unitNumber
   */
  @javax.annotation.Nullable
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }


  public Address deliveryInstruction(String deliveryInstruction) {
    this.deliveryInstruction = deliveryInstruction;
    return this;
  }

  /**
   * Instructions for the delivery.
   * @return deliveryInstruction
   */
  @javax.annotation.Nullable
  public String getDeliveryInstruction() {
    return deliveryInstruction;
  }

  public void setDeliveryInstruction(String deliveryInstruction) {
    this.deliveryInstruction = deliveryInstruction;
  }


  public Address poiSource(PoiSourceEnum poiSource) {
    this.poiSource = poiSource;
    return this;
  }

  /**
   * POI source
   * @return poiSource
   */
  @javax.annotation.Nullable
  public PoiSourceEnum getPoiSource() {
    return poiSource;
  }

  public void setPoiSource(PoiSourceEnum poiSource) {
    this.poiSource = poiSource;
  }


  public Address poiID(String poiID) {
    this.poiID = poiID;
    return this;
  }

  /**
   * POI ID, empty when poiSource is GRAB.
   * @return poiID
   */
  @javax.annotation.Nullable
  public String getPoiID() {
    return poiID;
  }

  public void setPoiID(String poiID) {
    this.poiID = poiID;
  }


  public Address address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The delivery address containing street name, city, postal code, and country. Has value only when poiSource is &#x60;GRAB&#x60;.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * The postcode of the delivery address. Has value only when poiSource is &#x60;GRAB&#x60;.
   * @return postcode
   */
  @javax.annotation.Nullable
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Address coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   */
  @javax.annotation.Nullable
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
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
   * @return the Address instance itself
   */
  public Address putAdditionalProperty(String key, Object value) {
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
    Address address = (Address) o;
    return Objects.equals(this.unitNumber, address.unitNumber) &&
        Objects.equals(this.deliveryInstruction, address.deliveryInstruction) &&
        Objects.equals(this.poiSource, address.poiSource) &&
        Objects.equals(this.poiID, address.poiID) &&
        Objects.equals(this.address, address.address) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.coordinates, address.coordinates)&&
        Objects.equals(this.additionalProperties, address.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitNumber, deliveryInstruction, poiSource, poiID, address, postcode, coordinates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    deliveryInstruction: ").append(toIndentedString(deliveryInstruction)).append("\n");
    sb.append("    poiSource: ").append(toIndentedString(poiSource)).append("\n");
    sb.append("    poiID: ").append(toIndentedString(poiID)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
    openapiFields.add("unitNumber");
    openapiFields.add("deliveryInstruction");
    openapiFields.add("poiSource");
    openapiFields.add("poiID");
    openapiFields.add("address");
    openapiFields.add("postcode");
    openapiFields.add("coordinates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Address
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("unitNumber") != null && !jsonObj.get("unitNumber").isJsonNull()) && !jsonObj.get("unitNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitNumber").toString()));
      }
      if ((jsonObj.get("deliveryInstruction") != null && !jsonObj.get("deliveryInstruction").isJsonNull()) && !jsonObj.get("deliveryInstruction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryInstruction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryInstruction").toString()));
      }
      if ((jsonObj.get("poiSource") != null && !jsonObj.get("poiSource").isJsonNull()) && !jsonObj.get("poiSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poiSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poiSource").toString()));
      }
      // validate the optional field `poiSource`
      if (jsonObj.get("poiSource") != null && !jsonObj.get("poiSource").isJsonNull()) {
        PoiSourceEnum.validateJsonElement(jsonObj.get("poiSource"));
      }
      if ((jsonObj.get("poiID") != null && !jsonObj.get("poiID").isJsonNull()) && !jsonObj.get("poiID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poiID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poiID").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("postcode") != null && !jsonObj.get("postcode").isJsonNull()) && !jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
      // validate the optional field `coordinates`
      if (jsonObj.get("coordinates") != null && !jsonObj.get("coordinates").isJsonNull()) {
        Coordinates.validateJsonElement(jsonObj.get("coordinates"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
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
           public Address read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Address instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Address given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Address
   * @throws IOException if the JSON string is invalid with respect to Address
   */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

  /**
   * Convert an instance of Address to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

