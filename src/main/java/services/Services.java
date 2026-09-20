package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;
import web_client.WebClient;

import java.io.IOException;

public class Services<T> {
    private final ObjectMapper mapper = new ObjectMapper();

    public T getServices(String resource,Class<T> type) {
        try {
            Response response= new WebClient().getResponse(resource);
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

}
