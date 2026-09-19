package models;

import java.util.List;

public class Planets {
    public String name;
    public String rotation_period;
    public String orbital_period;
    public String diameter;
    public String climate;
    public String gravity;
    public String terrain;
    public String surface_water;
    public String population;
    public List<String> residents;
    public  List<String> films;
    public String created;
    public String edited;
    public  String url;

    public Planets(String name,
                   String rotation_period,
                   String orbital_period,
                   String diameter,
                   String climate,
                   String gravity,
                   String terrain,
                   String surface_water,
                   String population,
                   List<String> residents,
                   List<String> films,
                   String created,
                   String edited,
                   String url
    ) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.population = population;
        this.residents = residents;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public List<String> getResidents() {
        return residents;
    }

    public String getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getFilms() {
        return films;
    }

    public String getCreated() {
        return created;
    }

    public String getName() {
        return name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public String getPopulation() {
        return population;
    }
}
