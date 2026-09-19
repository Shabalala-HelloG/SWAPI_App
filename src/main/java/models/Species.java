package models;

import java.util.List;

public class Species {
    public String name;
    public String classification;
    public String designation;
    public String skin_color;
    public String hair_color;
    public String eye_color;
    public String average_lifespan;
    public String homeworld;
    public String language;
    public List<String> people;
    public List<String> films;
    public String created;
    public String edited;
    public  String url;

    public Species(String name,
                   String classification,
                   String designation,
                   String skin_color,
                   String hair_color,
                   String eye_color,
                   String average_lifespan,
                   String homeworld,
                   String language,
                   List<String> people,
                   List<String> films,
                   String created,
                   String edited,
                   String url
    ) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.skin_color = skin_color;
        this.hair_color = hair_color;
        this.eye_color = eye_color;
        this.average_lifespan = average_lifespan;
        this.homeworld = homeworld;
        this.language = language;
        this.people = people;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public String getDesignation() {
        return designation;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public List<String> getPeople() {
        return people;
    }

    public List<String> getFilms() {
        return films;
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
