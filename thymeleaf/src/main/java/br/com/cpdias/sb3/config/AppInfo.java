package br.com.cpdias.sb3.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Component
public class AppInfo {

    private String version;
    private String buildDate;
    private String artifactId;
    private String applicationName;

    public AppInfo(BuildProperties buildProperties) {
        this.version = buildProperties.getVersion();
        LocalDateTime constructionTime = buildProperties.getTime().atZone(ZoneId.systemDefault()).toLocalDateTime();
        this.buildDate = constructionTime.toString();
        this.artifactId = buildProperties.getArtifact();
        this.applicationName  = buildProperties.getName();

    }
    public String getVersion() {
        return version;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.toString());

        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println(localDateTime.toString());
    }
}

/*
https://chatgpt.com/c/67f1d115-e434-800f-853f-cbde811f9637

build.artifact=spring-boot3-thymeleaf-basic-demo
build.description=A basic demo project that shows how to use Thymeleaf with Spring Boot 3
build.group=dev.andbin
build.java.version=17
build.name=Spring Boot 3 - Thymeleaf Basic Demo
build.time=2025-04-06T01\:08\:59.875Z
build.version=0.0.1
 */