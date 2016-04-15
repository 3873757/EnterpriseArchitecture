package edu.mum.extra.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="movie")
public class Movie 
{
 	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
 	private int id;
	
	@Column(name="Title")
	//@NotNull @Min(4) @Max(25)   //validation 
	private String title;
	
	@Column(name="Summary")
	//@NotNull @Min(4) @Max(25)
	private String summary;
 
	@Column(name="Year")
	//@Size(min=1,max=15,message="movie.Size.age")
	private int year;
	
	@Column(name="Genre")
	//@NotEmpty (message = "Size.title")
	private String genre;
 
	@Column(name="Rating")
	//@Size(min=2,max=26,message="movie.Size.employeeNumber")
	private int rating;

	@ElementCollection
	private  List<Director> directors = new ArrayList<Director>();
	@ManyToMany(mappedBy="movies")
	private List<Artist> artists= new ArrayList<Artist>();
    @ElementCollection
	private List<String> comments = new ArrayList<String>();
	
 	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Director> getDirectors() {
		return directors;
	}
	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
}