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
import com.grab.grabfood.client.model.UpdateMenuItem;
import com.grab.grabfood.client.model.UpdateMenuModifier;
import com.grab.grabfood.client.model.UpdatePurchasability;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.grab.grabfood.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class UpdateMenuRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateMenuRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateMenuRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateMenuRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateMenuItem> adapterUpdateMenuItem = gson.getDelegateAdapter(this, TypeToken.get(UpdateMenuItem.class));
            final TypeAdapter<UpdateMenuModifier> adapterUpdateMenuModifier = gson.getDelegateAdapter(this, TypeToken.get(UpdateMenuModifier.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateMenuRequest>() {
                @Override
                public void write(JsonWriter out, UpdateMenuRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateMenuItem`
                    if (value.getActualInstance() instanceof UpdateMenuItem) {
                        JsonElement element = adapterUpdateMenuItem.toJsonTree((UpdateMenuItem)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateMenuModifier`
                    if (value.getActualInstance() instanceof UpdateMenuModifier) {
                        JsonElement element = adapterUpdateMenuModifier.toJsonTree((UpdateMenuModifier)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateMenuItem, UpdateMenuModifier");
                }

                @Override
                public UpdateMenuRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateMenuItem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateMenuItem.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateMenuItem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateMenuItem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateMenuItem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateMenuItem'", e);
                    }
                    // deserialize UpdateMenuModifier
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateMenuModifier.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateMenuModifier;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateMenuModifier'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateMenuModifier failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateMenuModifier'", e);
                    }

                    if (match == 1) {
                        UpdateMenuRequest ret = new UpdateMenuRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateMenuRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateMenuRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateMenuRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateMenuItem", UpdateMenuItem.class);
        schemas.put("UpdateMenuModifier", UpdateMenuModifier.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateMenuRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateMenuItem, UpdateMenuModifier
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateMenuItem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateMenuModifier) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateMenuItem, UpdateMenuModifier");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateMenuItem, UpdateMenuModifier
     *
     * @return The actual instance (UpdateMenuItem, UpdateMenuModifier)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateMenuItem`. If the actual instance is not `UpdateMenuItem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateMenuItem`
     * @throws ClassCastException if the instance is not `UpdateMenuItem`
     */
    public UpdateMenuItem getUpdateMenuItem() throws ClassCastException {
        return (UpdateMenuItem)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateMenuModifier`. If the actual instance is not `UpdateMenuModifier`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateMenuModifier`
     * @throws ClassCastException if the instance is not `UpdateMenuModifier`
     */
    public UpdateMenuModifier getUpdateMenuModifier() throws ClassCastException {
        return (UpdateMenuModifier)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateMenuRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpdateMenuItem
        try {
            UpdateMenuItem.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateMenuItem failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateMenuModifier
        try {
            UpdateMenuModifier.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateMenuModifier failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpdateMenuRequest with oneOf schemas: UpdateMenuItem, UpdateMenuModifier. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpdateMenuRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateMenuRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateMenuRequest
     */
    public static UpdateMenuRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateMenuRequest.class);
    }

    /**
     * Convert an instance of UpdateMenuRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

