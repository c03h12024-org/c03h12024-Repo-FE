package com.codegym.case_study.controler;

import com.codegym.case_study.model.Movie;
import com.codegym.case_study.service.IMovieService;
import com.codegym.case_study.service.impl.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MovieControler", value = "/movie")
public class MovieControler extends HttpServlet {

    private static IMovieService movieService = new MovieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String action = req.getParameter("action");
//        if (action == null) {
//            action = "";
//        }
//        switch (action) {
//            case "":
//
//                break;
//            default:
//                List<Movie> movies = movieService.getAllMovies();
//                req.setAttribute("movies", movies);
//                req.getRequestDispatcher("index.jsp").forward(req, resp);
//                break;
//        }
//    }
                List<Movie> movies = movieService.getAllMovies();
                req.setAttribute("movies", movies);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}



