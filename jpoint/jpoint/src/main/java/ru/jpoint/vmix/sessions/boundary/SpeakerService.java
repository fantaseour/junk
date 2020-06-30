package ru.jpoint.vmix.sessions.boundary;

import javax.inject.Inject;

import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.MetricType;
import org.eclipse.microprofile.metrics.MetricRegistry.Type;
import org.eclipse.microprofile.metrics.annotation.RegistryType;

import ru.jpoint.vmix.sessions.entity.Speaker;

public class SpeakerService {

    @Inject
    @RegistryType(type = Type.APPLICATION)
    MetricRegistry registry;

    public Speaker talk() {
        registry.counter("answered_questions").inc();
        return new Speaker("adam",26);
    }
    
}