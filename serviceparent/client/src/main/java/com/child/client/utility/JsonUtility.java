package com.child.client.utility;

import com.google.gson.Gson;

public class JsonUtility {

    public static String convertObjectToJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    // New method to convert a JSON string to a custom class object
    public static <T> T convertJsonToObject(String jsonString, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, clazz);
    }
}
