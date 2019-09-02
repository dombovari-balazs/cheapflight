package com.codecool.dombi.cheapflight.Controller;

import com.squareup.okhttp.OkHttpClient;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SearchController {
    private OkHttpClient client = new OkHttpClient();

    @GetMapping("/example")
    public Response listAllPlaces() throws IOException {
        Request request = new Request.Builder()
                .url("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/UK/GBP/en-GB/?query=Stockholm")
                .get()
                .addHeader("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "329dd100b5msh8d6f005986d19e8p1bc3efjsn4dea62c073fa")
                .build();

        Response response = client.newCall(request).execute();
        return response;
    }




}
