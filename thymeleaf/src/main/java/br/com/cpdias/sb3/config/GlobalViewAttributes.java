package br.com.cpdias.sb3.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalViewAttributes {

    private final AppInfo appInfo;

    public GlobalViewAttributes(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    @ModelAttribute("appVersion")
    public String version() {
        return appInfo.getVersion();
    }

    @ModelAttribute("appBuildDate")
    public String timeStamp() {
        return appInfo.getBuildDate();
    }
    @ModelAttribute("appArtifactId")
    public String artifactId() {
        return appInfo.getArtifactId();
    }
    @ModelAttribute("appApplicationName")
    public String applicationName() {
        return appInfo.getApplicationName();
    }

}
