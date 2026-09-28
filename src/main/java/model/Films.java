package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import presentation.ResourcePrinter;

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

        details.put("Characters",!characters.isEmpty()?
                new ResourcePrinter().<People>getFromList(characters,
                        new TypeReference<People>() {
                        }):"unknown"
                );
        details.put("Planets",!planets.isEmpty()?
                new ResourcePrinter().<Planets>getFromList(planets,
                        new TypeReference<Planets>() {
                        }): "unknown"
                );
        details.put("Starships",!starships.isEmpty()?
                new ResourcePrinter().<Starships>getFromList(starships,
                        new  TypeReference<Starships>() {
                        }): "unknown"
                );
        details.put("Vehicles",!vehicles.isEmpty()?
                new ResourcePrinter().<Vehicles>getFromList(vehicles,
                        new  TypeReference<Vehicles>() {
                        }):"unknown"
                );
        details.put("Species",!species.isEmpty()?
                new ResourcePrinter().<Species>getFromList(species,
                        new  TypeReference<Species>() {
                        }):"unknown"
                );

        return details;
    }
}
