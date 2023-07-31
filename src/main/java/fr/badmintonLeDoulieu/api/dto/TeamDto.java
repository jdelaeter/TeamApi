package fr.badmintonLeDoulieu.api.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public record TeamDto(@JsonProperty("id") Long id,
                      @JsonProperty("name") String name,
                      @JsonProperty("division") String division) {

    public TeamDto(@JsonProperty("name") String name, @JsonProperty("division") String division) {
        this(null, name, division);
    }
}