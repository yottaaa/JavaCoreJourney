package com.euodoo.httpjava;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    private static String url = "https://jsonplaceholder.typicode.com";

    private static String getUsers(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request req = new Request.Builder()
                .url(url)
                .build();

        try (Response res = client.newCall(req).execute()) {
            return res.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO print 'hello http'
        System.out.println("hello http");

        // TODO make a GET request
        System.out.println(getUsers(url + "/users"));


    }
}
