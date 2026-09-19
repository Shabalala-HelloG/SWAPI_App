package models;

public class Root {

    public String films;
    public String people;
    public String planets;
    public String species;
    public String starships;
    public String vehicles;

//    Constructors
    public Root(String films,
                String people,
                String planets,
                String species,
                String starships,
                String vehicles
    ){
        this.films = films;
        this.people = people;
        this.planets = planets;
        this.species = species;
        this.starships = starships;
        this.vehicles = vehicles;
    }
// Getters
    public String getFilms() {
        return films;
    }

    public String getPeople() {
        return people;
    }

    public String getPlanets() {
        return planets;
    }

    public String getSpecies() {
        return species;
    }

    public String getStarships() {
        return starships;
    }

    public String getVehicles() {
        return vehicles;
    }
}
