package edu.mum.extra.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.extra.domain.Movie;
import edu.mum.extra.repository.MovieRepository;
import edu.mum.extra.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService
{  
	@Autowired  
	MovieRepository movierepository; 
	@Override
	public void save(Movie movie) {
		movierepository.save(movie);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Movie> getByrating(int rating) {
		// TODO Auto-generated method stub
		return movierepository.getByrating(rating);
	}

	@Override
	public List<Movie> getByYear(int year) {
		// TODO Auto-generated method stub
		return movierepository.getByYear(year);
	}

	@Override
	public List<Movie> getByTitle(String title) {
		// TODO Auto-generated method stub
		return movierepository.getBytitle(title);
	}

	@Override
	public List<Movie> getByGenre(String genre) {
		// TODO Auto-generated method stub
		return movierepository.getByGenre(genre);
	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return (List<Movie>)movierepository.findAll();
	}

	
	

}
