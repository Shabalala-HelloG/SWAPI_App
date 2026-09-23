package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;
import client.SwapiClient;

import java.io.IOException;

public class SwapiService<T> {
    private final ObjectMapper mapper = new ObjectMapper();

    public T getServices(String resource, TypeReference<T> type) {
        try {
            Response response= new SwapiClient().getResponse(resource);

            try (response) {
                if (!response.isSuccessful()) {
                    throw new RuntimeException("API returned: " + response.code());
                }
                if (response.body() == null) {
                    throw new RuntimeException("There is no content in the response");
                }
                return mapper.readValue(response.body().string(), type);
            }finally {
                response.close();
            }

        } catch (IOException e) {
            throw new RuntimeException("Unable to connect to the API", e);
        }

    }

}
