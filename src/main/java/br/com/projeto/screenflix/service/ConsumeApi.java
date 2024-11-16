package br.com.projeto.screenflix.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumeApi {
    Scanner enter = new Scanner(System.in);

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private String name;
    private final String KEY = "&apikey=3d9b35cf";
    private  String season; ;

    public String obterDados() {


            System.out.println("Digite uma série: ");
            name = enter.nextLine();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(ENDERECO + name.replace(" ", "+") + KEY))
                    .build();
            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            String json = response.body();

        return json;

    }
}
