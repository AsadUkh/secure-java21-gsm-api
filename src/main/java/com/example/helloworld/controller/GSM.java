package com.example.helloworld.controller;

import com.example.helloworld.service.SecretManagerService;
import org.springframework.stereotype.Component;

@Component
public class GSM {

    private final SecretManagerService secretManagerService;

    public GSM() {
        this.secretManagerService = new SecretManagerService();
    }

    public String getSecret(String projectId, String secretId, String versionId) {
        return secretManagerService.accessSecret(projectId, secretId, versionId);
    }
}
