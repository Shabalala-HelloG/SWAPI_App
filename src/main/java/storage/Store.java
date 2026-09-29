package storage;

import com.fasterxml.jackson.core.type.TypeReference;
import model.ApiResponse;
import model.Model;
import service.SwapiService;

import java.util.List;

public class Store<T extends Model> {
    public List<List<T>> loadResource(String resource, TypeReference<ApiResponse<T>> typeReference, List<List<T>> globeList) {
        //this function takes in an empty list, used Pagination and returns a list with all the resources
        //with this function we create a global List of all the resources so we don't request everytime.
        globeList = new SwapiService<T>().getAll(
                resource, typeReference);
        return globeList;
    }
}