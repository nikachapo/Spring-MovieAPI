package com.example.demo.service;

import com.example.demo.dto.*;

public interface MovieService {
    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetMoviesOutput getMovies(GetMoviesInput getMoviesInput);

    GetMovieOutput getMovie(GetMovieInput getMovieInput);
}
