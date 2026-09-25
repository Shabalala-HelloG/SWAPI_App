package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicles implements Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("model")
    private String model;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("cost_in_credits")
    private String cost_in_credits;

    @JsonProperty("length")
    private String length;

    @JsonProperty("max_atmosphering_speed")
    private String max_atmosphering_speed;

    @JsonProperty("crew")
    private String crew;

    @JsonProperty("passengers")
    private String passengers;

    @JsonProperty("cargo_capacity")
    private String cargo_capacity;

    @JsonProperty("consumables")
    private String consumables;

    @JsonProperty("vehicle_class")
    private String vehicle_class;

    @JsonProperty("pilots")
    private List<String> pilots;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;

    public Vehicles() {
    }

    @Override
    public String displayName() {
        return name;
    }

    @Override
    public Map<String, String> displayDetails() {
        Map<String, String> details = new LinkedHashMap<>();
        details.put("Name", name);
        details.put("Model", model);
        details.put("Manufacturer", manufacturer);
        details.put("Cost in Credits", cost_in_credits);
        details.put("Length", length);
        details.put("Max Atmospheric Speed", max_atmosphering_speed);
        details.put("Crew", crew);
        details.put("Passengers", passengers);
        details.put("Cargo Capacity", cargo_capacity);
        details.put("Consumables", consumables);
        details.put("Vehicle Class", vehicle_class);

        return  details;
    }
}
