package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Films implements Model {

    @JsonProperty("title")
    private String title;

    @JsonProperty("episode_id")
    private int episode_id;

    @JsonProperty("opening_crawl")
    private String opening_crawl;

    @JsonProperty("director")
    private String director;

    @JsonProperty("producer")
    private String producer;

    @JsonProperty("release_date")
    private String release_date;

    @JsonProperty("characters")
    private List<String> characters;

    @JsonProperty("planets")
    private List<String> planets;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;

    public Films() {
    }

    @Override
    public String displayName() {
        return title;
    }

    @Override
    public Map<String, String> displayDetails() {
        Map<String,String> details = new LinkedHashMap<>();

        details.put("Title",title);
        details.put("Director",director);
        details.put("Producer",producer);
        details.put("ReleaseDate",release_date);
        details.put("OpeningCrawl",opening_crawl);
        return details;
    }
}
