package org.okky.share;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(level = PRIVATE, makeFinal = true)
public class JsonUtil {
    static Gson GSON = new Gson();
    static Gson GSON_PRETTY = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(Object source) {
        return GSON.toJson(source);
    }

    public static String toPrettyJson(Object source) {
        return GSON_PRETTY.toJson(source);
    }
}
