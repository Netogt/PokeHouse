package com.sdev.pokehome.utilities;

public record Response<T>(String status, String error, T content) {
    public static <T> Response<T> success(T content) {
        return new Response<>("success", null, content);
    }

    public static <T> Response<T> error(String errorMessage) {
        return new Response<>("error", errorMessage, null);
    }
}