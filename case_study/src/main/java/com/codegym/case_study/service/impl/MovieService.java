package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.Movie;
import com.codegym.case_study.repository.IMovieRepository;
import com.codegym.case_study.repository.impl.MovieRepository;
import com.codegym.case_study.service.IMovieService;

import java.util.List;

public class MovieService implements IMovieService {

    private static IMovieRepository movieRepository = new MovieRepository();
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }


}
