package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class People implements Model{

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("hair_color")
    private String hair_color;

    @JsonProperty("skin_color")
    private String skin_color;

    @JsonProperty("eye_color")
    private String eye_color;

    @JsonProperty("birth_year")
    private String birth_year;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;

    //for me to use Jackson I should create a no argument constructor
    //    Constructors
    public People() {
    }

    @Override
    public String displayName() {
        return name;
    }

    @Override
    public Map<String, Object> displayDetails() {
        Map<String,Object> details = new LinkedHashMap<>();


        details.put("Name",name);
        details.put("Height",height);
        details.put("Mass",mass);
        details.put("Hair Color",hair_color);
        details.put("Skin Color",skin_color);
        details.put("Eye Color",eye_color);
        details.put("Birth Year",birth_year);
        details.put("Gender",gender);
        details.put(
                "Homeworld",
                homeworld != null
                        ? new Reference<Planets>(
                        homeworld,
                        Planets.class,
                        new TypeReference<Planets>() {}
                )
                        : "unknown"
        );

        details.put(
                "Films",
                !films.isEmpty()
                        ? new Reference<Films>(
                        films,
                        Films.class,
                        new TypeReference<Films>() {}
                )
                        : "unknown"
        );

        details.put(
                "Species",
                !species.isEmpty()
                        ? new Reference<Species>(
                        species,
                        Species.class,
                        new TypeReference<Species>() {}
                )
                        : "unknown"
        );

        details.put(
                "Vehicles",
                !vehicles.isEmpty()
                        ? new Reference<Vehicles>(
                        vehicles,
                        Vehicles.class,
                        new TypeReference<Vehicles>() {}
                )
                        : "unknown"
        );

        details.put(
                "Starship",
                !starships.isEmpty()
                        ? new Reference<Starships>(
                        starships,
                        Starships.class,
                        new TypeReference<Starships>() {}
                )
                        : "unknown"
        );

        return  details;
    }

}
