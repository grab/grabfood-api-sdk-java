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
 * An JSON object that indicates the instructions to be taken by the merchant when the item is out of stock.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class OutOfStockInstruction {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * Type of out-of-stock instruction chosen by customer. &#x60;CONTACT&#x60; is disabled by default, kindly reach out to your integration manager if you wish to receive this instruction.
   */
  @JsonAdapter(InstructionTypeEnum.Adapter.class)
  public enum InstructionTypeEnum {
    REMOVE("REMOVE"),
    
    CANCEL("CANCEL"),
    
    SPECIFIC_ITEM("SPECIFIC_ITEM"),
    
    CONTACT("CONTACT"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    InstructionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstructionTypeEnum fromValue(String value) {
      for (InstructionTypeEnum b : InstructionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<InstructionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstructionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstructionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstructionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      InstructionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INSTRUCTION_TYPE = "instructionType";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_TYPE)
  private InstructionTypeEnum instructionType;

  public static final String SERIALIZED_NAME_REPLACEMENT_ITEM_I_D = "replacementItemID";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_ITEM_I_D)
  private String replacementItemID;

  public static final String SERIALIZED_NAME_REPLACEMENT_GRAB_ITEM_I_D = "replacementGrabItemID";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_GRAB_ITEM_I_D)
  private String replacementGrabItemID;

  public OutOfStockInstruction() {
  }

  public OutOfStockInstruction title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The short instruction message.
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public OutOfStockInstruction instructionType(InstructionTypeEnum instructionType) {
    this.instructionType = instructionType;
    return this;
  }

  /**
   * Type of out-of-stock instruction chosen by customer. &#x60;CONTACT&#x60; is disabled by default, kindly reach out to your integration manager if you wish to receive this instruction.
   * @return instructionType
   */
  @javax.annotation.Nullable
  public InstructionTypeEnum getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(InstructionTypeEnum instructionType) {
    this.instructionType = instructionType;
  }


  public OutOfStockInstruction replacementItemID(String replacementItemID) {
    this.replacementItemID = replacementItemID;
    return this;
  }

  /**
   * The preferred item&#39;s ID in the partner system. Only applicable when the instructionType is &#x60;SPECIFIC_ITEM&#x60;.
   * @return replacementItemID
   */
  @javax.annotation.Nullable
  public String getReplacementItemID() {
    return replacementItemID;
  }

  public void setReplacementItemID(String replacementItemID) {
    this.replacementItemID = replacementItemID;
  }


  public OutOfStockInstruction replacementGrabItemID(String replacementGrabItemID) {
    this.replacementGrabItemID = replacementGrabItemID;
    return this;
  }

  /**
   * The preferred item&#39;s ID in the Grab system. Only applicable when the instructionType is &#x60;SPECIFIC_ITEM&#x60;.
   * @return replacementGrabItemID
   */
  @javax.annotation.Nullable
  public String getReplacementGrabItemID() {
    return replacementGrabItemID;
  }

  public void setReplacementGrabItemID(String replacementGrabItemID) {
    this.replacementGrabItemID = replacementGrabItemID;
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
   * @return the OutOfStockInstruction instance itself
   */
  public OutOfStockInstruction putAdditionalProperty(String key, Object value) {
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
    OutOfStockInstruction outOfStockInstruction = (OutOfStockInstruction) o;
    return Objects.equals(this.title, outOfStockInstruction.title) &&
        Objects.equals(this.instructionType, outOfStockInstruction.instructionType) &&
        Objects.equals(this.replacementItemID, outOfStockInstruction.replacementItemID) &&
        Objects.equals(this.replacementGrabItemID, outOfStockInstruction.replacementGrabItemID)&&
        Objects.equals(this.additionalProperties, outOfStockInstruction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, instructionType, replacementItemID, replacementGrabItemID, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutOfStockInstruction {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    replacementItemID: ").append(toIndentedString(replacementItemID)).append("\n");
    sb.append("    replacementGrabItemID: ").append(toIndentedString(replacementGrabItemID)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("instructionType");
    openapiFields.add("replacementItemID");
    openapiFields.add("replacementGrabItemID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OutOfStockInstruction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutOfStockInstruction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutOfStockInstruction is not found in the empty JSON string", OutOfStockInstruction.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("instructionType") != null && !jsonObj.get("instructionType").isJsonNull()) && !jsonObj.get("instructionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructionType").toString()));
      }
      // validate the optional field `instructionType`
      if (jsonObj.get("instructionType") != null && !jsonObj.get("instructionType").isJsonNull()) {
        InstructionTypeEnum.validateJsonElement(jsonObj.get("instructionType"));
      }
      if ((jsonObj.get("replacementItemID") != null && !jsonObj.get("replacementItemID").isJsonNull()) && !jsonObj.get("replacementItemID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacementItemID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacementItemID").toString()));
      }
      if ((jsonObj.get("replacementGrabItemID") != null && !jsonObj.get("replacementGrabItemID").isJsonNull()) && !jsonObj.get("replacementGrabItemID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacementGrabItemID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacementGrabItemID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutOfStockInstruction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutOfStockInstruction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutOfStockInstruction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutOfStockInstruction.class));

       return (TypeAdapter<T>) new TypeAdapter<OutOfStockInstruction>() {
           @Override
           public void write(JsonWriter out, OutOfStockInstruction value) throws IOException {
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
           public OutOfStockInstruction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OutOfStockInstruction instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OutOfStockInstruction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OutOfStockInstruction
   * @throws IOException if the JSON string is invalid with respect to OutOfStockInstruction
   */
  public static OutOfStockInstruction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutOfStockInstruction.class);
  }

  /**
   * Convert an instance of OutOfStockInstruction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

