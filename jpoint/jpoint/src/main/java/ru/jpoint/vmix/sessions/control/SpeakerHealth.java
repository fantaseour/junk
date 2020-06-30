package ru.jpoint.vmix.sessions.control;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class SpeakerHealth implements HealthCheck{

	@Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("speaker is alive");
    }
    
}