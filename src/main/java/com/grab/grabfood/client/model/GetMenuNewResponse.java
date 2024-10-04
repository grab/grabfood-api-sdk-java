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
import com.grab.grabfood.client.model.Currency;
import com.grab.grabfood.client.model.MenuCategory;
import com.grab.grabfood.client.model.SellingTime;
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
public class GetMenuNewResponse {
  public static final String SERIALIZED_NAME_MERCHANT_I_D = "merchantID";
  @SerializedName(SERIALIZED_NAME_MERCHANT_I_D)
  private String merchantID;

  public static final String SERIALIZED_NAME_PARTNER_MERCHANT_I_D = "partnerMerchantID";
  @SerializedName(SERIALIZED_NAME_PARTNER_MERCHANT_I_D)
  private String partnerMerchantID;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_SELLING_TIMES = "sellingTimes";
  @SerializedName(SERIALIZED_NAME_SELLING_TIMES)
  private List<SellingTime> sellingTimes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<MenuCategory> categories = new ArrayList<>();

  public GetMenuNewResponse() {
  }

  public GetMenuNewResponse merchantID(String merchantID) {
    this.merchantID = merchantID;
    return this;
  }

  /**
   * The merchant&#39;s ID that is in GrabFood&#39;s database.
   * @return merchantID
   */
  @javax.annotation.Nullable
  public String getMerchantID() {
    return merchantID;
  }

  public void setMerchantID(String merchantID) {
    this.merchantID = merchantID;
  }


  public GetMenuNewResponse partnerMerchantID(String partnerMerchantID) {
    this.partnerMerchantID = partnerMerchantID;
    return this;
  }

  /**
   * The merchant&#39;s ID that is on the partner&#39;s database.
   * @return partnerMerchantID
   */
  @javax.annotation.Nullable
  public String getPartnerMerchantID() {
    return partnerMerchantID;
  }

  public void setPartnerMerchantID(String partnerMerchantID) {
    this.partnerMerchantID = partnerMerchantID;
  }


  public GetMenuNewResponse currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public GetMenuNewResponse sellingTimes(List<SellingTime> sellingTimes) {
    this.sellingTimes = sellingTimes;
    return this;
  }

  public GetMenuNewResponse addSellingTimesItem(SellingTime sellingTimesItem) {
    if (this.sellingTimes == null) {
      this.sellingTimes = new ArrayList<>();
    }
    this.sellingTimes.add(sellingTimesItem);
    return this;
  }

  /**
   * An array of sellingTimes JSON objects. Max 20 allowed. Refer to [Selling Times](#selling-times) for more information.
   * @return sellingTimes
   */
  @javax.annotation.Nonnull
  public List<SellingTime> getSellingTimes() {
    return sellingTimes;
  }

  public void setSellingTimes(List<SellingTime> sellingTimes) {
    this.sellingTimes = sellingTimes;
  }


  public GetMenuNewResponse categories(List<MenuCategory> categories) {
    this.categories = categories;
    return this;
  }

  public GetMenuNewResponse addCategoriesItem(MenuCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * An array of category JSON objects. Max 100 allowed per section. Refer to [Categories](#categories) for more information.
   * @return categories
   */
  @javax.annotation.Nonnull
  public List<MenuCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<MenuCategory> categories) {
    this.categories = categories;
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
   * @return the GetMenuNewResponse instance itself
   */
  public GetMenuNewResponse putAdditionalProperty(String key, Object value) {
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
    GetMenuNewResponse getMenuNewResponse = (GetMenuNewResponse) o;
    return Objects.equals(this.merchantID, getMenuNewResponse.merchantID) &&
        Objects.equals(this.partnerMerchantID, getMenuNewResponse.partnerMerchantID) &&
        Objects.equals(this.currency, getMenuNewResponse.currency) &&
        Objects.equals(this.sellingTimes, getMenuNewResponse.sellingTimes) &&
        Objects.equals(this.categories, getMenuNewResponse.categories)&&
        Objects.equals(this.additionalProperties, getMenuNewResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantID, partnerMerchantID, currency, sellingTimes, categories, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMenuNewResponse {\n");
    sb.append("    merchantID: ").append(toIndentedString(merchantID)).append("\n");
    sb.append("    partnerMerchantID: ").append(toIndentedString(partnerMerchantID)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sellingTimes: ").append(toIndentedString(sellingTimes)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("merchantID");
    openapiFields.add("partnerMerchantID");
    openapiFields.add("currency");
    openapiFields.add("sellingTimes");
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("sellingTimes");
    openapiRequiredFields.add("categories");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMenuNewResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMenuNewResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMenuNewResponse is not found in the empty JSON string", GetMenuNewResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMenuNewResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchantID") != null && !jsonObj.get("merchantID").isJsonNull()) && !jsonObj.get("merchantID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantID").toString()));
      }
      if ((jsonObj.get("partnerMerchantID") != null && !jsonObj.get("partnerMerchantID").isJsonNull()) && !jsonObj.get("partnerMerchantID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerMerchantID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerMerchantID").toString()));
      }
      // validate the required field `currency`
      Currency.validateJsonElement(jsonObj.get("currency"));
      // ensure the json data is an array
      if (!jsonObj.get("sellingTimes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellingTimes` to be an array in the JSON string but got `%s`", jsonObj.get("sellingTimes").toString()));
      }

      JsonArray jsonArraysellingTimes = jsonObj.getAsJsonArray("sellingTimes");
      // validate the required field `sellingTimes` (array)
      for (int i = 0; i < jsonArraysellingTimes.size(); i++) {
        SellingTime.validateJsonElement(jsonArraysellingTimes.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
      // validate the required field `categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        MenuCategory.validateJsonElement(jsonArraycategories.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMenuNewResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMenuNewResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMenuNewResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMenuNewResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMenuNewResponse>() {
           @Override
           public void write(JsonWriter out, GetMenuNewResponse value) throws IOException {
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
           public GetMenuNewResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetMenuNewResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of GetMenuNewResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMenuNewResponse
   * @throws IOException if the JSON string is invalid with respect to GetMenuNewResponse
   */
  public static GetMenuNewResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMenuNewResponse.class);
  }

  /**
   * Convert an instance of GetMenuNewResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

