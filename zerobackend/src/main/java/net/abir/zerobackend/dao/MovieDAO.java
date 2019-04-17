package net.abir.zerobackend.dao;

import java.util.Date;
import java.util.List;

import net.abir.zerobackend.dto.Movie;

public interface MovieDAO {
	
	//CREATE
	boolean add(Movie movie);
	
	//READ
	Movie getById(int movieId);
	List<Movie> list();
	List<Movie> listActiveMovie();
	List<Movie> listMovieByCategory(int categoryId);
	List<Movie> listLatestMovie(Date date);
	
	//UPDATE
	boolean update(Movie movie);
	
	//DELETE
	boolean delete(Movie movie);
	

}
