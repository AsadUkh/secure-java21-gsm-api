package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final GSM gsm;

    public HelloWorldController(GSM gsm) {
        this.gsm = gsm;
    }

    @GetMapping("/secret")
    public String getSecret() {

        String projectId = "gcp-hackathon-macys";
        String secretId = "my-first-secret";
        String versionId = "latest";

        return gsm.getSecret(projectId, secretId, versionId);
    }

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
}
