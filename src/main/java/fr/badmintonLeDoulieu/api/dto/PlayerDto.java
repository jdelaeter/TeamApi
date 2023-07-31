package fr.badmintonLeDoulieu.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PlayerDto(@JsonProperty("id") Long id,
                      @JsonProperty("name") String name){

    public PlayerDto(@JsonProperty("name") String name) {
        this(null, name);
    }
}