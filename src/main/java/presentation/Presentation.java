package presentation;

import com.fasterxml.jackson.core.type.TypeReference;
import models.api.Response;
import services.Services;

import java.util.List;

public class Presentation<T> {

    public List<T> getAllResource(String resource, TypeReference<Response<T>> typeReference) {

        Response<T> getAll = new Services<Response<T>>().getServices(resource, typeReference);

        return getAll.getResults();
    }

//    public T getAResource(String resource, int id,TypeReference<Response<T>> typeReference){
//        return new Services<T>().getServices(resource + id, typeReference);
//    }
}
