package br.com.cpdias.sb3.sre;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-monitor")
public class HealthMonitorRest {

    private final HealthMonitor healthMonitor;

    public HealthMonitorRest(HealthMonitor healthMonitor) {
        this.healthMonitor = healthMonitor;
    }

    @GetMapping
    public AppHealth getHealthMonitor() {
        AppHealth appHealth = this.healthMonitor.getHealthMonitor();

        return appHealth;

    }

}
