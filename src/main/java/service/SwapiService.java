package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ApiResponse;
import okhttp3.Response;
import client.SwapiClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SwapiService<T > {
    private final ObjectMapper mapper = new ObjectMapper();

    private <R> R get(String resource, TypeReference<R> type) {

        try (Response response = new SwapiClient().getResponse(resource)) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("API returned: " + response.code());
            }

            if (response.body() == null) {
                throw new RuntimeException("There is no content in the response");
            }

            return mapper.readValue(response.body().string(), type);

        } catch (IOException e) {
            throw new RuntimeException("Unable to connect to the API", e);
        }

    }

    public List<List<T>> getAll(String resource, TypeReference<ApiResponse<T>> typeReference){
        List<List<T>> responseList= new ArrayList<>();

        //this makes the first response
        ApiResponse<T> response= get(resource+"?format=json", typeReference);

        //we store what is in the first page
        responseList.add(response.getResults());
        String next =response.getNext();

        while(next != null){

            //this is the loopResponse
            ApiResponse<T> loopResponse= get(next +"&format=json", typeReference);
            responseList.add(loopResponse.getResults());
            next =loopResponse.getNext();
        }
        return  responseList;

    }
    //keeping it for Reference or incase I need it later
    public T getAResource(String resource,TypeReference<T> typeReference){
        return get(resource +"?format=json", typeReference);
    }


}
