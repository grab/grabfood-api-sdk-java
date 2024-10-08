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
import com.grab.grabfood.client.model.UpdateAdvancedPricing;
import com.grab.grabfood.client.model.UpdatePurchasability;
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
 * MenuEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class MenuEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  /**
   * The record&#39;s availableStatus.  Note: In order to set an item as \&quot;UNAVAILABLE\&quot;, it is required to update both the &#x60;availableStatus&#x60; and &#x60;maxStock&#x60; fields, whereby the &#x60;maxStock&#x60; value should be set to 0. 
   */
  @JsonAdapter(AvailableStatusEnum.Adapter.class)
  public enum AvailableStatusEnum {
    AVAILABLE("AVAILABLE"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    UNAVAILABLETODAY("UNAVAILABLETODAY"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AvailableStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailableStatusEnum fromValue(String value) {
      for (AvailableStatusEnum b : AvailableStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<AvailableStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailableStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailableStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailableStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AvailableStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AVAILABLE_STATUS = "availableStatus";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_STATUS)
  private AvailableStatusEnum availableStatus;

  public static final String SERIALIZED_NAME_MAX_STOCK = "maxStock";
  @SerializedName(SERIALIZED_NAME_MAX_STOCK)
  private Long maxStock;

  public static final String SERIALIZED_NAME_ADVANCED_PRICINGS = "advancedPricings";
  @SerializedName(SERIALIZED_NAME_ADVANCED_PRICINGS)
  private List<UpdateAdvancedPricing> advancedPricings = new ArrayList<>();

  public static final String SERIALIZED_NAME_PURCHASABILITIES = "purchasabilities";
  @SerializedName(SERIALIZED_NAME_PURCHASABILITIES)
  private List<UpdatePurchasability> purchasabilities = new ArrayList<>();

  public MenuEntity() {
  }

  public MenuEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The record&#39;s ID on the partner system. For example, the item id in case type is ITEM, modifier id is MODIFIER.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public MenuEntity price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * The record&#39;s price in minor unit format.
   * @return price
   */
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }


  public MenuEntity availableStatus(AvailableStatusEnum availableStatus) {
    this.availableStatus = availableStatus;
    return this;
  }

  /**
   * The record&#39;s availableStatus.  Note: In order to set an item as \&quot;UNAVAILABLE\&quot;, it is required to update both the &#x60;availableStatus&#x60; and &#x60;maxStock&#x60; fields, whereby the &#x60;maxStock&#x60; value should be set to 0. 
   * @return availableStatus
   */
  @javax.annotation.Nullable
  public AvailableStatusEnum getAvailableStatus() {
    return availableStatus;
  }

  public void setAvailableStatus(AvailableStatusEnum availableStatus) {
    this.availableStatus = availableStatus;
  }


  public MenuEntity maxStock(Long maxStock) {
    this.maxStock = maxStock;
    return this;
  }

  /**
   * Available stocks under inventory for this item. Auto reduce when there is order placed for this item.  Note: It is necessary to set &#x60;maxStock&#x60; to 0 if the &#x60;availableStatus&#x60; of the item is \&quot;UNAVAILABLE\&quot;. Item will be set to \&quot;AVAILABLE\&quot; if &#x60;maxStock&#x60; &gt; 0. 
   * @return maxStock
   */
  @javax.annotation.Nullable
  public Long getMaxStock() {
    return maxStock;
  }

  public void setMaxStock(Long maxStock) {
    this.maxStock = maxStock;
  }


  public MenuEntity advancedPricings(List<UpdateAdvancedPricing> advancedPricings) {
    this.advancedPricings = advancedPricings;
    return this;
  }

  public MenuEntity addAdvancedPricingsItem(UpdateAdvancedPricing advancedPricingsItem) {
    if (this.advancedPricings == null) {
      this.advancedPricings = new ArrayList<>();
    }
    this.advancedPricings.add(advancedPricingsItem);
    return this;
  }

  /**
   * Price configuration (in minor unit) for different service, order type and channel combination. If a service type does not have a specified price, it will utilize the default price of the item. 
   * @return advancedPricings
   */
  @javax.annotation.Nullable
  public List<UpdateAdvancedPricing> getAdvancedPricings() {
    return advancedPricings;
  }

  public void setAdvancedPricings(List<UpdateAdvancedPricing> advancedPricings) {
    this.advancedPricings = advancedPricings;
  }


  public MenuEntity purchasabilities(List<UpdatePurchasability> purchasabilities) {
    this.purchasabilities = purchasabilities;
    return this;
  }

  public MenuEntity addPurchasabilitiesItem(UpdatePurchasability purchasabilitiesItem) {
    if (this.purchasabilities == null) {
      this.purchasabilities = new ArrayList<>();
    }
    this.purchasabilities.add(purchasabilitiesItem);
    return this;
  }

  /**
   * Purchasability is set to true by default for all service type, unless it is explicitly set to false. Modifier will reuse it’s item’s purchasability. 
   * @return purchasabilities
   */
  @javax.annotation.Nullable
  public List<UpdatePurchasability> getPurchasabilities() {
    return purchasabilities;
  }

  public void setPurchasabilities(List<UpdatePurchasability> purchasabilities) {
    this.purchasabilities = purchasabilities;
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
   * @return the MenuEntity instance itself
   */
  public MenuEntity putAdditionalProperty(String key, Object value) {
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
    MenuEntity menuEntity = (MenuEntity) o;
    return Objects.equals(this.id, menuEntity.id) &&
        Objects.equals(this.price, menuEntity.price) &&
        Objects.equals(this.availableStatus, menuEntity.availableStatus) &&
        Objects.equals(this.maxStock, menuEntity.maxStock) &&
        Objects.equals(this.advancedPricings, menuEntity.advancedPricings) &&
        Objects.equals(this.purchasabilities, menuEntity.purchasabilities)&&
        Objects.equals(this.additionalProperties, menuEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, availableStatus, maxStock, advancedPricings, purchasabilities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    availableStatus: ").append(toIndentedString(availableStatus)).append("\n");
    sb.append("    maxStock: ").append(toIndentedString(maxStock)).append("\n");
    sb.append("    advancedPricings: ").append(toIndentedString(advancedPricings)).append("\n");
    sb.append("    purchasabilities: ").append(toIndentedString(purchasabilities)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("price");
    openapiFields.add("availableStatus");
    openapiFields.add("maxStock");
    openapiFields.add("advancedPricings");
    openapiFields.add("purchasabilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MenuEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MenuEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MenuEntity is not found in the empty JSON string", MenuEntity.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("availableStatus") != null && !jsonObj.get("availableStatus").isJsonNull()) && !jsonObj.get("availableStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableStatus").toString()));
      }
      // validate the optional field `availableStatus`
      if (jsonObj.get("availableStatus") != null && !jsonObj.get("availableStatus").isJsonNull()) {
        AvailableStatusEnum.validateJsonElement(jsonObj.get("availableStatus"));
      }
      if (jsonObj.get("advancedPricings") != null && !jsonObj.get("advancedPricings").isJsonNull()) {
        JsonArray jsonArrayadvancedPricings = jsonObj.getAsJsonArray("advancedPricings");
        if (jsonArrayadvancedPricings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("advancedPricings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `advancedPricings` to be an array in the JSON string but got `%s`", jsonObj.get("advancedPricings").toString()));
          }

          // validate the optional field `advancedPricings` (array)
          for (int i = 0; i < jsonArrayadvancedPricings.size(); i++) {
            UpdateAdvancedPricing.validateJsonElement(jsonArrayadvancedPricings.get(i));
          };
        }
      }
      if (jsonObj.get("purchasabilities") != null && !jsonObj.get("purchasabilities").isJsonNull()) {
        JsonArray jsonArraypurchasabilities = jsonObj.getAsJsonArray("purchasabilities");
        if (jsonArraypurchasabilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("purchasabilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `purchasabilities` to be an array in the JSON string but got `%s`", jsonObj.get("purchasabilities").toString()));
          }

          // validate the optional field `purchasabilities` (array)
          for (int i = 0; i < jsonArraypurchasabilities.size(); i++) {
            UpdatePurchasability.validateJsonElement(jsonArraypurchasabilities.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MenuEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MenuEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MenuEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MenuEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<MenuEntity>() {
           @Override
           public void write(JsonWriter out, MenuEntity value) throws IOException {
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
           public MenuEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MenuEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MenuEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MenuEntity
   * @throws IOException if the JSON string is invalid with respect to MenuEntity
   */
  public static MenuEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MenuEntity.class);
  }

  /**
   * Convert an instance of MenuEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

