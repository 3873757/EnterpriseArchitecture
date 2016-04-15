package edu.mum.extra.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;



@Entity(name="artist") 
public class Artist {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long artistId;
	private String name;
	private String palceOfBirth;
	private String biography;
	@Lob
    private byte[] picture;
	@ManyToMany
	private List<Movie>movies = new ArrayList<Movie>();	
		public Artist(){
		super();
	}
		public Artist(String name,String palceOfBirth,String biography){
		this.name =name;
		this.palceOfBirth = palceOfBirth;
		this.biography=biography;
	}
	public String getPalceOfBirth() {
		return palceOfBirth;
	}
	public void setCharacter(String palceOfBirth) {
		this.palceOfBirth = palceOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public void setPalceOfBirth(String palceOfBirth) {
		this.palceOfBirth = palceOfBirth;
	}
	public String toString(){
		return "["+getName()+" ,Place of birth: " +getPalceOfBirth() + ",Biography: " +getBiography()+"]" ;
	}

}
