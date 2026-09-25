package resource;

import com.fasterxml.jackson.core.type.TypeReference;
import model.ApiResponse;
import service.SwapiService;
import java.util.ArrayList;
import java.util.List;

public class ResourceFetcher<T> {

    //this function is used to traverse the ApiResponse- it returns a List of all the resources in all pages.

    public List<List<T>> getAll(String resource, TypeReference<ApiResponse<T>> typeReference){
        List<List<T>> allPeopleL= new ArrayList<>();

        //this makes the first response
        ApiResponse<T> response= new SwapiService<ApiResponse<T>>().getServices(
                resource+"?format=json", typeReference);

        //we store what is in the first page
        allPeopleL.add(response.getResults());
        String next =response.getNext();

        while(next != null){

            //this is the loopResponse
            ApiResponse<T> loopResponse= new SwapiService<ApiResponse<T>>().getServices(
                    next +"&format=json", typeReference
            );
            allPeopleL.add(loopResponse.getResults());
            next =loopResponse.getNext();
        }
        return  allPeopleL;

    }
    //keeping it for Reference or incase I need it later
    public T getAResource(String resource,TypeReference<T> typeReference){
        return new SwapiService<T>().getServices(resource +"?format=json", typeReference);
    }
}
