package com.example.helloworld.service;

import com.google.cloud.secretmanager.v1.AccessSecretVersionResponse;
import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersionName;

public class SecretManagerService {

    public String accessSecret(String projectId, String secretId, String versionId) {
        try (SecretManagerServiceClient client = SecretManagerServiceClient.create()) {
            SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretId, versionId);

            // Access the secret version
            AccessSecretVersionResponse response = client.accessSecretVersion(secretVersionName);

            // Return the payload as a string
            return response.getPayload().getData().toStringUtf8();
        } catch (Exception e) {
            throw new RuntimeException("Failed to access secret", e);
        }
    }
}
