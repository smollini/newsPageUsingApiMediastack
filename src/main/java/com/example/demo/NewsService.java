package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Map;
import com.example.demo.News;
@Service

public class NewsService {
private News newslist = new News();

    public News getNewslist() {
        return newslist;
    }

    private static String Url = "http://api.mediastack.com/v1/news?access_key=7b3e0f32243d699194962009ff0e0fd1";

    public void NewsData() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Url))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());


    String jsons = httpResponse.body();
    News neww = new ObjectMapper().readValue(jsons, News.class);
    System.out.println(neww.getTitleById(1));
    String Title = neww.getTitleById(1);
    newslist = neww;

    }


}
