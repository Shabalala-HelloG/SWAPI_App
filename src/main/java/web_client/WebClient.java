package web_client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WebClient {

    private final OkHttpClient client = new OkHttpClient.Builder().build();

    public Response getResponse(String resource) throws IOException {
        //yet to handle exception

        Request request= new Request.Builder()
                .url(resource+"/?format=json")
                .get()
                .build();
        return client.newCall(request).execute();
    }


}
