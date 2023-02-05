package com.example.movie_info_server.model;

public class Movie {
    private String movieid;
    private String name;

    public Movie(String movieid, String name) {
        this.movieid = movieid;
        this.name = name;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
