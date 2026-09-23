package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Films implements Model {

    @JsonProperty("title")
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private  String release_date;
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;
    private String created;
    private String edited;
    private  String url;

    public Films() {
    }
    //No need for getter functions will use displayName for my printing

    @Override
    public String displayName() {
        return "title: "+title;
    }
}
