package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class Cintroller {
    private NewsService newsService;

    public Cintroller(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public String getNews(Model model) throws IOException, InterruptedException {
        newsService.NewsData();
        List<Datum> datas= newsService.getNewslist().getData();
            model.addAttribute("datas", datas);

            return "newsp";


    }


}
