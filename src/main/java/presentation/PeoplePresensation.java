package presentation;

import com.fasterxml.jackson.core.type.TypeReference;
import models.api.Response;
import models.People;
import services.Services;

import java.util.List;

public class PeoplePresensation {
    public final String resource ="https://swapi.dev/api/people";

    public void allPeople(){
        Response<People> allPeople = new Services<Response<People>>().getServices(resource, new TypeReference<Response<People>>() {});

        List<People> people = allPeople.getResults();

        for (People p : people) {
            System.out.println(p);
            System.out.println("||---||---||---||---||---||---||---||          ||---||---||---||---||---||---||---||");
        }

    }//allPeople

    public void aPerson(){
        int id= 1;
        People person = new Services<People>().getServices(resource+"/" +id, new TypeReference<People>() {});
        System.out.println(person);
    }//aPerson
}

