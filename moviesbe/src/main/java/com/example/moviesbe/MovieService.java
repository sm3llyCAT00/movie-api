package com.example.moviesbe;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRespository repository;
    public List<Movie> findAllMovies() {
//        System.out.println(repository.findAll().toString());
        return repository.findAll();
    }

    public Optional<Movie> singelMovie(String imdbId) {
        return  repository.findMovieByImdbId(imdbId);
    }
}
