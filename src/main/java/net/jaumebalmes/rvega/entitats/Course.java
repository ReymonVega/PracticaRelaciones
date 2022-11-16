package net.jaumebalmes.rvega.entitats;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*
import javax.persistence.OneToOne;
*/

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	/*
	@OneToOne(mappedBy= "course")	
	*/
	@OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE)
	
	@JsonIgnore
	private List<CourseMaterial> courseMaterial;

	public Course() {
		super();
	}

	
	public Course(long id, String title, List<CourseMaterial> courseMaterial) {
		super();
		this.id = id;
		this.title = title;
		this.courseMaterial = courseMaterial;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<CourseMaterial> getCourseMaterial() {
		return courseMaterial;
	}


	public void setCourseMaterial(List<CourseMaterial> courseMaterial) {
		this.courseMaterial = courseMaterial;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", courseMaterial=" + courseMaterial + "]";
	}


	
	
	
	
	

}
