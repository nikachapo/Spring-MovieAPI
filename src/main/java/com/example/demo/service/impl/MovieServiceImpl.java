package com.example.demo.service.impl;

import com.example.demo.dto.*;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.MoviesRepository;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MoviesRepository moviesRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movieRepository.save(movie);
        AddMovieOutput addCategoryOutput = new AddMovieOutput();
        addCategoryOutput.setMsg("ფილმი წარმატებით შეინახა");
        return addCategoryOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        movieRepository.delete(deleteMovieInput.getMovie());
        DeleteMovieOutput out = new DeleteMovieOutput();
        out.setMsg("ფილმი წაიშალა");
        return out;
    }

    @Override
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput) {
        GetMoviesOutput out = new GetMoviesOutput();
        out.setMovies(moviesRepository.getById(null));
        return out;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        return null;
    }

}
