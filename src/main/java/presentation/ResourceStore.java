package presentation;

import com.fasterxml.jackson.core.type.TypeReference;
import model.ApiResponse;

import java.util.List;

public class ResourceStore<T> {
    public List<List<T>> loadResource(String resource, TypeReference<ApiResponse<T>> typeReference, List<List<T>> globeList) {
        globeList = new ResourcePagination<T>().getAll(
                resource, typeReference);
        return globeList;
    }
}