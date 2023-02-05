package com.example.movie_info_server.resource;

import com.example.movie_info_server.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @GetMapping("{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie(movieId,"Harry Potter");

    }
    @GetMapping
    public String test(){
        return "Malithi";
    }

}
