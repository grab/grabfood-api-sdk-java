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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of the order cancellation limit.
 */
@JsonAdapter(CancelOrderLimitType.Adapter.class)
public enum CancelOrderLimitType {
  
  NOT_APPROACHING_LIMIT("not approaching limit"),
  
  APPROACHING_THE_DAILY_LIMIT("approaching the daily limit"),
  
  APPROACHING_THE_WEEKLY_LIMIT("approaching the weekly limit"),
  
  APPROACHING_THE_MONTHLY_LIMIT("approaching the monthly limit"),
  
  EMPTY(""),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  CancelOrderLimitType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CancelOrderLimitType fromValue(String value) {
    for (CancelOrderLimitType b : CancelOrderLimitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  public static class Adapter extends TypeAdapter<CancelOrderLimitType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CancelOrderLimitType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CancelOrderLimitType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CancelOrderLimitType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CancelOrderLimitType.fromValue(value);
  }
}

