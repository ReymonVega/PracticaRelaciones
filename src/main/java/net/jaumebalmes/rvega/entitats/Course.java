package net.jaumebalmes.rvega.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	
	@OneToOne(mappedBy= "course")	
	@JsonIgnore
	private CourseMaterial courseMaterial;

	public Course() {
		super();
	}

	public Course(long id, String title, CourseMaterial courseMaterial) {
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

	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", courseMaterial=" + courseMaterial + "]";
	}
	
	
	
	
	

}
