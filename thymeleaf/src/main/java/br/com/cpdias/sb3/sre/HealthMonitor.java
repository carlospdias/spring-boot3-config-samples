package br.com.cpdias.sb3.sre;

import org.springframework.stereotype.Service;

@Service
public class HealthMonitor {

    public AppHealth getHealthMonitor() {
        return new AppHealth(true, false );

    }

}
