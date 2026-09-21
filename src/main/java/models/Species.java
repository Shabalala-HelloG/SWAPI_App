package models;

import java.util.List;

public class Species {

    private String name;
    private String classification;
    private String designation;
    private String skin_color;
    private String hair_color;
    private String eye_color;
    private String average_lifespan;
    private String homeworld;
    private String language;
    private List<String> people;
    private List<String> films;
    private String created;
    private String edited;
    private  String url;

    public Species() {
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

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", designation='" + designation + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", average_lifespan='" + average_lifespan + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
