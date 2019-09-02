package com.codecool.dombi.cheapflight.Controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SearchController {
    String url = "https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsequotes/v1.0/FR/HUF/en-US/LOND-sky/PARI-sky/2019-09-09";
    String[] host ={"x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com"} ; // TODO: omg pls why do you do this to me??? :O
    String[] key ={"x-rapidapi-key", "329dd100b5msh8d6f005986d19e8p1bc3efjsn4dea62c073fa"} ;

    @GetMapping("/example")
    public ResponseEntity<String> exampleQuotes2(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(host[0],host[1]);
        headers.set(key[0],key[1]);

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                url, HttpMethod.GET, entity, String.class);
        return response;


    }









}
