package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GSMConfig {

    @Value("${gcp.project-id}")
    private String projectId;

    @Value("${gcp.secret-id}")
    private String secretId;

    @Value("${gcp.secret-version:latest}") // Default to 'latest'
    private String secretVersion;

    public String getProjectId() {
        return projectId;
    }

    public String getSecretId() {
        return secretId;
    }

    public String getSecretVersion() {
        return secretVersion;
    }
}
