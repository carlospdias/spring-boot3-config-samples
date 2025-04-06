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

}
