package ConectionApi;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConexionApi {

    String apiKey = "a8d1cc52811c55164daecff8";

    public Divisa convertirDivisa(String monedaInicial,
                           String monedaDeseada,
                           Double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"
        + monedaInicial + "/" + monedaDeseada + "/" + cantidad);
        HttpClient  client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        }catch (Exception e){
            throw new RuntimeException("No encontre esta divisa.");
        }
    }
}
