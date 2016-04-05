package exam.extra.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Director implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
