package exam.extra.application;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import org.apache.log4j.Logger;
import exam.extra.domain.Artist;
import exam.extra.domain.Director;
import exam.extra.domain.Movie;
public class AppMovie 
{
private static Logger logger = Logger.getLogger(AppMovie.class);
		private static EntityManagerFactory emf;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("Excredit");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) {
		EntityManager em =null;
		EntityTransaction tx = null;
		persistDataBase();

	try{
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		logger.trace("List all the movies by name:");
		List<Movie> movieName = em.createQuery("from MOVIE m where m.title ='SetItOff' ").getResultList();
		List<Movie> movieGenre  = em.createQuery("from MOVIE m where m.genre = 'crime' ").getResultList();
		List<Movie> movieRating  = em.createQuery("from MOVIE m where m.rating = 7 ").getResultList();
		List<Movie> movieYear  = em.createQuery("from MOVIE m where m.year= 1990 ").getResultList();	
		List<Movie> movieArtist  = em.createQuery("from MOVIE m where m.artists.name= 'AAAA' ").getResultList();
		List<Movie> movieDirector  = em.createQuery("from MOVIE m where m.directors.name= 'James Cameron' ").getResultList();
		
		printMovie(movieName);
		printMovie(movieGenre);
		printMovie(movieRating);
		printMovie(movieYear);
		printMovie(movieArtist);
		printMovie(movieDirector);
		
		tx.commit();
	} catch (PersistenceException e) {
		if (tx != null) {
			logger.error("Rolling back:", e);
			tx.rollback();
		}
	} finally {
		if (em != null) {
			em.close();
		}
	}

}
	public static void persistDataBase() {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {

			Director director1 = new Director("Oliver Queen","Arrow");
			Director director2= new Director("Sandra block","VeryGood");
			
			Artist artist1 = new Artist ("Speedy", "blackcanrry","Dirctors of the year");
			Artist artist2 = new Artist ("falcity", "Degly","Best Actoress of the year");
			
			String comment1= "best Action movie of the year";
			String comment2="Beyond the mind ";
			Movie movie = new Movie("Concassion",95 );
			movie.addArtists(artist1);
			movie.addArtists(artist2);
			movie.addDirector(director1);
			movie.addDirector(director2);
			movie.addComment(comment1);
			movie.addComment(comment2);
			movie.setGenre("Action Comedy");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			em.persist(artist1);
			em.persist(artist2);
			em.persist(movie);
			tx.commit();
			
		} catch (PersistenceException e) {
			if (tx != null) {
				logger.error("Rolling back", e);
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
	public static void printMovie(List<Movie> movies){
		logger.trace(String.format("%-9s%-31s%-31s", "Title:", "Genre:",
				"Comment:"));
		for (Movie movie : movies) {
			logger.trace(String.format(
					"%-7s  %-12s %7s %8s  %-12s",
					movie.getTitle(), movie.getGenre(),movie.getYear(),
					movie.getYear(), movie.getRating()));
		}
	}


}
