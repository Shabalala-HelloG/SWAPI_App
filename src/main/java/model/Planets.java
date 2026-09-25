package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planets implements Model{

    @JsonProperty("name")
    private String name;

    @JsonProperty("rotation_period")
    private String rotation_period;

    @JsonProperty("orbital_period")
    private String orbital_period;

    @JsonProperty("diameter")
    private String diameter;

    @JsonProperty("climate")
    private String climate;

    @JsonProperty("gravity")
    private String gravity;

    @JsonProperty("terrain")
    private String terrain;

    @JsonProperty("surface_water")
    private String surface_water;

    @JsonProperty("population")
    private String population;

    @JsonProperty("residents")
    private List<String> residents;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;
    public Planets() {
    }

    @Override
    public String displayName() {
        return name;
    }

    @Override
    public Map<String, String> displayDetails() {
        Map<String,String> details = new LinkedHashMap<>();

        details.put("Name",name);
        details.put("Population",population);
        details.put("Rotation Period", rotation_period);
        details.put("Orbital Period", orbital_period);
        details.put("Diameter", diameter);
        details.put("Climate", climate);
        details.put("Gravity", gravity);
        details.put("Terrain", terrain);
        details.put("Surface Water", surface_water);

        return  details;
    }
}
