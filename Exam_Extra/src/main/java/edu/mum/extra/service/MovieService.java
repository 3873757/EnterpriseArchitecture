package edu.mum.extra.service;

import java.util.List;

import edu.mum.extra.domain.Movie;

public interface MovieService {

	public void save(Movie movie);

	public abstract List<Movie> getByrating(int rating);

	public abstract List<Movie> getByYear(int year);

	public abstract List<Movie> getByTitle(String title);

	public abstract List<Movie> getByGenre(String genre);

	public abstract List<Movie> findAll();
}
