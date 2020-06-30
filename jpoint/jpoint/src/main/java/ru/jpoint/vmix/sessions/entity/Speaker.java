package ru.jpoint.vmix.sessions.entity;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class Speaker {

    @Schema(example = "duke")
    public String name;
    
    @Schema(readOnly = true,example="26")
    public int age;

    public Speaker() {
    }
    public Speaker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}