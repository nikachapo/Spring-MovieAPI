package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.repository.MoviesRepository;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/MovieController")
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    MoviesRepository moviesRepository;

    @PostMapping("addMovie")
    public AddMovieOutput addMovie(@RequestBody AddMovieInput addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("deleteMovie")
    public DeleteMovieOutput deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @PostMapping("getMovies")
    public GetMoviesOutput getMovie(@RequestBody GetMovieInput getMovieInput) {
        GetMoviesOutput out = new GetMoviesOutput();
        out.setMovies(moviesRepository.getById(null));
        return out;
    }

    @PostMapping("getMovie")
    public GetMovieOutput getMovies(@RequestBody GetMoviesInput getMoviesInput) {
        GetMovieOutput out = new GetMovieOutput();
        out.setMovie(movieService.getMovie(getMoviesInput.getId()));
        return out;
    }
}

