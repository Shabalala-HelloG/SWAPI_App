package models;

import java.util.List;

public class Starships {

    private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String hyperdrive_rating;
    private String MGLT;
    private String starship_class;
    private List<String> pilots;
    private List<String> films;
    private String created;
    private String edited;
    private  String url;

    public Starships() {
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public List<String> getPilots() {
        return pilots;
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
        return "Starships{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost_in_credits='" + cost_in_credits + '\'' +
                ", length='" + length + '\'' +
                ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", cargo_capacity='" + cargo_capacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", hyperdrive_rating='" + hyperdrive_rating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                '}';
    }
}
