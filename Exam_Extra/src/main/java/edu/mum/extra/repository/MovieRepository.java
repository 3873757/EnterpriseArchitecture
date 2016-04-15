package edu.mum.extra.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.extra.domain.Movie;

	@Repository
	public interface MovieRepository extends  CrudRepository<Movie, Long> 
	{
//		@Query("select m from movie m where m.title = :title")
//	   		Movie locateMovie(@Param("title") String title);
		
		public List<Movie> getBytitle(String title);

		public List<Movie> getByYear(int year);

		public abstract List<Movie> getByGenre(String genre);

		public abstract List<Movie> getByrating(int rating);
  	}

