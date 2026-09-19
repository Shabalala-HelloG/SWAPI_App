package models;

import java.util.List;

public class Films {
    public String title;
    public int episode_id;
    public String opening_crawl;
    public String director;
    public String producer;
    public  String release_date;
    public List<String> characters;
    public List<String> planets;
    public List<String> starships;
    public List<String> vehicles;
    public List<String> species;
    public String created;
    public String edited;
    public  String url;


    public Films(String title,
                 int episode_id,
                 String opening_crawl,
                 String producer,
                 String director,
                 String release_date,
                 List<String> characters,
                 List<String> planets,
                 List<String> starships,
                 List<String> vehicles,
                 List<String> species,
                 String created,
                 String edited,
                 String url
    ) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.producer = producer;
        this.director = director;
        this.release_date = release_date;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public List<String> getStarships() {
        return starships;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public List<String> getSpecies() {
        return species;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }
}
