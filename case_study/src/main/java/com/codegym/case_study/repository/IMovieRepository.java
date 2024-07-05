package com.codegym.case_study.repository;

import com.codegym.case_study.model.Movie;

import java.util.List;

public interface IMovieRepository {
    List<Movie> getAllMovies();
}
