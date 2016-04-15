package edu.mum.extra.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Director {
	private String directorQuality;
	private String name;
	
	public Director(){
		super();
	}
	
	public Director(String name,String directorQuality){
		this.name =name;
		this.directorQuality = directorQuality;
	}
	public String getDirectorQuality() {
		return directorQuality;
	}
	public void setDirectorQuality(String directorQuality) {
		this.directorQuality = directorQuality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public String toString(){
	return "["+getName()+" ,Director quality: " +getDirectorQuality() + ",Character: " +"]" ;
}

}
