package web_client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WebClient {

    private final OkHttpClient client = new OkHttpClient.Builder().build();

    public Response getResponse(String resource) throws IOException {
        //yet to handle exception

        String baseUrl = "https://swapi.dev/api/";
        Request request= new Request.Builder()
                .url(baseUrl+resource+"/?format=json")
                .get()
                .build();
        return client.newCall(request).execute();
    }


}
