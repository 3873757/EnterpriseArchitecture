package exam.extra.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
@Entity(name="MOVIE")
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	    @Id 
	    @GeneratedValue
		private long id;
	    private String summary;
	    private String title;
	    private int year;
		@ElementCollection
		private  List<Director> directors = new ArrayList<Director>();
		@ManyToMany(mappedBy="movies")
		private List<Artist> artists= new ArrayList<Artist>();
	    @ElementCollection
		private List<String> comments = new ArrayList<String>();
		@Lob
	    private byte[] cover;
		private int rating;
		private String genre;
		
		public Movie(){
			super();
		}
		
		public Movie(String title ,int rating ){
			this.title =title;
			this.rating =rating;
		}
		
		public void addDirector(Director dirctor)
		{
			directors.add(dirctor);
			
		}
		public void addComment(String comment){
			comments.add(comment);
		}

		public void addArtists(Artist artist){
			artists.add(artist);
		}
		
		public List<String> getComments() {
			return comments;
		}
		public void setComments(List<String> comments) {
			this.comments = comments;
		}
		
		public List<Artist> getArtists() {
			return artists;
		}
		public void setArtists(List<Artist> artist) {
			this.artists = artist;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public long getId() {
			return id;
		}
		public byte[] getCover() {
			return cover;
		}
		public void setCover(byte[] cover) {
			this.cover = cover;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public List<Director> getDirectors() {
			return directors;
		}

		public void setDirectors(List<Director> directors) {
			this.directors = directors;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String toString(){
			return "Movie Title : "+getTitle()+ ",Rating: "+getRating()+" Artists " + getArtists().toString() ;  
			
		}

}
