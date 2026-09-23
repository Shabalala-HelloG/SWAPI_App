package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planets implements Model{

    @JsonProperty("name")
    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private List<String> residents;
    private  List<String> films;
    private String created;
    private String edited;
    private  String url;

    public Planets() {
    }

    @Override
    public String displayName() {

        return "Name: "+name;
    }
}
