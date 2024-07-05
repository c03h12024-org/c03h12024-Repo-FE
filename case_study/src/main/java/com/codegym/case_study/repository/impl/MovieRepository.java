package com.codegym.case_study.repository.impl;

import com.codegym.case_study.model.Movie;
import com.codegym.case_study.repository.IMovieRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements IMovieRepository {

    private List<Movie> movies;

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from cinema.movies");
            ResultSet resultSet = preparedStatement.executeQuery();
            int id;
            String title;
            String description;
            float star;
            int duration;
            String image;
            String trailer;
            String age_limit;
            String quality;
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                title = resultSet.getString("title");
                description = resultSet.getString("description");
                star = resultSet.getFloat("star");
                duration = resultSet.getInt("duration");
                image = resultSet.getString("image");
                trailer = resultSet.getString("trailer");
                age_limit = resultSet.getString("age_limit");
                quality = resultSet.getString("quality");
                movies.add(new Movie(id, title,description, star, duration, image, trailer, age_limit, quality));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }

}
