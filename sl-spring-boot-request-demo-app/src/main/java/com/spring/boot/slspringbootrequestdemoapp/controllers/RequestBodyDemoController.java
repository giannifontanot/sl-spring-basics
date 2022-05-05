package com.spring.boot.slspringbootrequestdemoapp.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path="/requestBodyDemo", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public class RequestBodyDemoController {
    @PostMapping("/showRequestBody")
    public Map<String, String> showRequestBody(@RequestBody Map<String, String> requestBody) { // Deserializing the RequestBody to a Map
        requestBody.put("message", "Showing the contents of RequestBody");
        return requestBody;
    }

}
