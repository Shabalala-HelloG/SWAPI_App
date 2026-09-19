package models;

import java.util.List;

public class Vehicles {
    /*
    {
  "name": "Sand Crawler",
  "model": "Digger Crawler",
  "manufacturer": "Corellia Mining Corporation",
  "cost_in_credits": "150000",
  "length": "36.8 ",
  "max_atmosphering_speed": "30",
  "crew": "46",
  "passengers": "30",
  "cargo_capacity": "50000",
  "consumables": "2 months",
  "vehicle_class": "wheeled",
  "pilots": [],
  "films": [
    "https://swapi.dev/api/films/1/",
    "https://swapi.dev/api/films/5/"
  ],
  "created": "2014-12-10T15:36:25.724000Z",
  "edited": "2014-12-20T21:30:21.661000Z",
  "url": "https://swapi.dev/api/vehicles/4/"
}
     */

    public String name;
    public String model;
    public String manufacturer;
    public String cost_in_credits;
    public String length;
    public String max_atmosphering_speed;
    public String crew;
    public String passengers;
    public String cargo_capacity;
    public String consumables;
    public String vehicles_class;
    public List<String> pilots;
    public List<String> films;
    public String created;
    public String edited;
    public  String url;

    public Vehicles(String name,
                    String model,
                    String manufacturer,
                    String cost_in_credits,
                    String length,
                    String max_atmosphering_speed,
                    String crew,
                    String passengers,
                    String cargo_capacity,
                    String consumables,
                    String vehicles_class,
                    List<String> pilots,
                    List<String> films,
                    String created,
                    String edited,
                    String url
    ) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost_in_credits = cost_in_credits;
        this.length = length;
        this.max_atmosphering_speed = max_atmosphering_speed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargo_capacity = cargo_capacity;
        this.consumables = consumables;
        this.vehicles_class = vehicles_class;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
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

    public String getVehicles_class() {
        return vehicles_class;
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
}
