package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class People implements Model{

    @JsonProperty("name")
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private  List<String> starships;
    private String created;
    private String edited;
    private  String url;

    //for me to use Jackson I should create a no argument constructor
    //    Constructors
    public People() {
    }

    @Override
    public String displayName() {
        return "Name: "+name;
    }
}
