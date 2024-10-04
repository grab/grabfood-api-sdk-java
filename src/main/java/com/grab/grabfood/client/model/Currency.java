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
 * A JSON object containing code, symbol, and exponent for a given currency. Refer to [Country and Currency](#section/Getting-started/Country-and-currency).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Currency {
  /**
   * The three-letter ISO currency code. This is the currency that is associated with the payment amount. 
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    IDR("IDR"),
    
    MYR("MYR"),
    
    PHP("PHP"),
    
    SGD("SGD"),
    
    THB("THB"),
    
    VND("VND"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  /**
   * The currency symbol. 
   */
  @JsonAdapter(SymbolEnum.Adapter.class)
  public enum SymbolEnum {
    RP("Rp"),
    
    RM("RM"),
    
    u("₱"),
    
    S_("S$"),
    
    u2("฿"),
    
    u3("₫"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    SymbolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SymbolEnum fromValue(String value) {
      for (SymbolEnum b : SymbolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<SymbolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SymbolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SymbolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SymbolEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SymbolEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private SymbolEnum symbol;

  public static final String SERIALIZED_NAME_EXPONENT = "exponent";
  @SerializedName(SERIALIZED_NAME_EXPONENT)
  private Integer exponent;

  public Currency() {
  }

  public Currency code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * The three-letter ISO currency code. This is the currency that is associated with the payment amount. 
   * @return code
   */
  @javax.annotation.Nonnull
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public Currency symbol(SymbolEnum symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The currency symbol. 
   * @return symbol
   */
  @javax.annotation.Nonnull
  public SymbolEnum getSymbol() {
    return symbol;
  }

  public void setSymbol(SymbolEnum symbol) {
    this.symbol = symbol;
  }


  public Currency exponent(Integer exponent) {
    this.exponent = exponent;
    return this;
  }

  /**
   * The log base 10 of the number of times we have to multiply the major unit to get the minor unit. Should be 0 for VN and 2 for other countries (SG/MY/ID/TH/PH/KH). 
   * @return exponent
   */
  @javax.annotation.Nonnull
  public Integer getExponent() {
    return exponent;
  }

  public void setExponent(Integer exponent) {
    this.exponent = exponent;
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
   * @return the Currency instance itself
   */
  public Currency putAdditionalProperty(String key, Object value) {
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
    Currency currency = (Currency) o;
    return Objects.equals(this.code, currency.code) &&
        Objects.equals(this.symbol, currency.symbol) &&
        Objects.equals(this.exponent, currency.exponent)&&
        Objects.equals(this.additionalProperties, currency.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, symbol, exponent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("symbol");
    openapiFields.add("exponent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("exponent");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Currency
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Currency.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Currency is not found in the empty JSON string", Currency.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Currency.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the required field `code`
      CodeEnum.validateJsonElement(jsonObj.get("code"));
      if (!jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      // validate the required field `symbol`
      SymbolEnum.validateJsonElement(jsonObj.get("symbol"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Currency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Currency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Currency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Currency.class));

       return (TypeAdapter<T>) new TypeAdapter<Currency>() {
           @Override
           public void write(JsonWriter out, Currency value) throws IOException {
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
           public Currency read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Currency instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Currency given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Currency
   * @throws IOException if the JSON string is invalid with respect to Currency
   */
  public static Currency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Currency.class);
  }

  /**
   * Convert an instance of Currency to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

