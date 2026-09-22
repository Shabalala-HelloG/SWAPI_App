
import com.fasterxml.jackson.core.type.TypeReference;
import models.*;
import models.api.Response;
import presentation.*;

import java.util.List;
import java.util.Scanner;

public class Main {


    static void main() {
        String peopleResource ="https://swapi.dev/api/people/";
        String filmsResource = "https://swapi.dev/api/films/";
        String vehicleResource = "https://swapi.dev/api/vehicles/";
        String speciesResource = "https://swapi.dev/api/species/";
        String starshipResource = "https://swapi.dev/api/starships/";
        String planetResource= "https://swapi.dev/api/planets/";


        while(true) {
            SwapiConsole console = new SwapiConsole();

            int choice = console.showMenu();

            System.out.println("You selected: " + choice);


            switch (choice) {
                case 1:
                    TypeReference<Response<People>> peopleType = new TypeReference<Response<People>>() {
                    };
                    System.out.println("The People Resource");
                    Presentation<People> peopleP = new Presentation<People>();

                    List<People> peopleList = peopleP.getAllResource(peopleResource, peopleType);

                    for (People element : peopleList) {
                        System.out.println(element.getName());

                    }

                    break;
                case 2:
                    TypeReference<Response<Films>> filmsType = new TypeReference<Response<Films>>() {
                    };

                    System.out.println("The films Resource");
                    Presentation<Films> filmsP = new Presentation<Films>();

                    for (Films element : filmsP.getAllResource(filmsResource, filmsType)) {
                        System.out.println(element.getTitle());
                    }
                    break;
                case 3:
                    TypeReference<Response<Vehicles>> vehicleType = new TypeReference<Response<Vehicles>>() {
                    };

                    System.out.println("The Vehicles Resource");
                    Presentation<Vehicles> vehiclesP = new Presentation<Vehicles>();

                    for (Vehicles element : vehiclesP.getAllResource(vehicleResource, vehicleType)) {
                        System.out.println(element.getName());
                    }
                    break;
                case 4:
                    TypeReference<Response<Species>> speciesType = new TypeReference<Response<Species>>() {
                    };
                    System.out.println("The Species Resource");
                    Presentation<Species> speciesP = new Presentation<Species>();

                    for (Species element : speciesP.getAllResource(speciesResource, speciesType)) {
                        System.out.println(element.getName());
                    }

                    break;
                case 5:
                    TypeReference<Response<Planets>> planetType = new TypeReference<Response<Planets>>() {
                    };
                    System.out.println("The Planets Resource");
                    Presentation<Planets> planetP = new Presentation<Planets>();
                    for (Planets element : planetP.getAllResource(planetResource, planetType)) {
                        System.out.println(element.getName());
                    }
                    break;
                case 6:
                    TypeReference<Response<Starships>> starShipType = new TypeReference<Response<Starships>>() {
                    };
                    System.out.println("The Starships Resource");
                    Presentation<Starships> starshipsP = new Presentation<Starships>();
                    for (Starships element : starshipsP.getAllResource(starshipResource, starShipType)) {
                        System.out.println(element.getName());
                    }
                    break;
                case 7:
                    System.exit(0);

                default:
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
            System.out.println("7. Quit");

            System.out.print("\nSelect a resource: ");

            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }

}
