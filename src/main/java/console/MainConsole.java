package console;
import com.fasterxml.jackson.core.type.TypeReference;
import model.*;
import model.ApiResponse;
import presentation.ResourceStore;
import presentation.ResourcePrinter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConsole {

    public static void console() {

        //EndPoints
        String peopleResource ="https://swapi.dev/api/people/";
        String filmsResource = "https://swapi.dev/api/films/";
        String vehicleResource = "https://swapi.dev/api/vehicles/";
        String speciesResource = "https://swapi.dev/api/species/";
        String starshipResource = "https://swapi.dev/api/starships/";
        String planetResource= "https://swapi.dev/api/planets/";

        //TypeReference
        TypeReference<ApiResponse<People>> peopleType =
                new TypeReference<ApiResponse<People>>() {};

        TypeReference<ApiResponse<Films>> filmType =
                new TypeReference<ApiResponse<Films>>() {};

        TypeReference<ApiResponse<Starships>> starshipsType =
                new TypeReference<ApiResponse<Starships>>() {};

        TypeReference<ApiResponse<Vehicles>> vehiclesType =
                new TypeReference<ApiResponse<Vehicles>>() {};

        TypeReference<ApiResponse<Species>> speciesType =
                new TypeReference<ApiResponse<Species>>() {};

        TypeReference<ApiResponse<Planets>> planetsType =
                new TypeReference<ApiResponse<Planets>>() {};

        //These lists will contain the data so we don't have to make new requests everytime
        List<List<People>> peopleList = new ArrayList<>();
        List<List<Films>> filmsList = new ArrayList<>();
        List<List<Starships>> starshipsList = new ArrayList<>();
        List<List<Vehicles>> vehiclesList = new ArrayList<>();
        List<List<Species>> speciesList = new ArrayList<>();
        List<List<Planets>> planetsList = new ArrayList<>();
        SwapiConsole console = new SwapiConsole();
        ResourcePrinter p =new ResourcePrinter();


        while(true) {

            int choice = console.showMenu();
            System.out.println("You selected: " + choice);

            switch (choice) {
                case 1:
                    System.out.println("\n==========People==========");
                    if (peopleList.isEmpty()) {
                        peopleList = new ResourceStore<People>().loadResource(peopleResource, peopleType, peopleList);

                    }
                    p.<People>printResources(peopleList);

                    break;
                case 2:
                    System.out.println("\n==========Films==========");

                    if (filmsList.isEmpty()) {
                        filmsList = new ResourceStore<Films>().loadResource(filmsResource, filmType, filmsList);
                    }
                    p.<Films>printResources(filmsList);

                    break;
                case 3:
                    System.out.println("\n==========Starships==========");

                    if (starshipsList.isEmpty()) {
                        starshipsList = new ResourceStore<Starships>().loadResource(starshipResource, starshipsType, starshipsList);
                    }
                    p.<Starships>printResources(starshipsList);

                    break;
                case 4:
                    System.out.println("\n==========Vehicles==========");

                    if (vehiclesList.isEmpty()) {
                        vehiclesList = new ResourceStore<Vehicles>().loadResource(vehicleResource, vehiclesType, vehiclesList);
                    }
                    p.<Vehicles>printResources(vehiclesList);

                    break;
                case 5:
                    System.out.println("\n==========Species==========");
                    if (speciesList.isEmpty()) {
                        speciesList = new ResourceStore<Species>().loadResource(speciesResource, speciesType, speciesList);
                    }
                    p.<Species>printResources(speciesList);

                    break;
                case 6:
                    System.out.println("\n==========Planets==========");
                    if (planetsList.isEmpty()) {
                        planetsList = new ResourceStore<Planets>().loadResource(planetResource, planetsType, planetsList);
                    }
                    p.<Planets>printResources(planetsList);

                    break;
                case 7:
                    System.out.println("\n==========System Status==========");
                    System.out.println("People: " + p.getResourceState(peopleList));
                    System.out.println("Films: " + p.getResourceState(filmsList));
                    System.out.println("Starships: " + p.getResourceState(starshipsList));
                    System.out.println("Vehicles: " + p.getResourceState(vehiclesList));
                    System.out.println("Species: " + p.getResourceState(speciesList));
                    System.out.println("Planets: " + p.getResourceState(planetsList));
                    break;
                case 8:
                    System.out.println("\n==========QUIT==========");
                    System.exit(0);
                default:
                    System.out.println("\n==========INVALID INPUT==========");
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }

    }
    public static class SwapiConsole {

        public int showMenu() {

            System.out.println("\n===== SWAPI Resources =====");
            System.out.println("1. People");
            System.out.println("2. Films");
            System.out.println("3. Starships");
            System.out.println("4. Vehicles");
            System.out.println("5. Species");
            System.out.println("6. Planets");
            System.out.println("7. System Status");
            System.out.println("8. Quit");

            System.out.print("\nSelect a resource: ");

            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }



}
