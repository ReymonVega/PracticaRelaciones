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
	private CourseMaterial courseMaterial;
	
	@JsonIgnore
	public Course() {
		
	}

	public Course(String title, long id) {
		super();
		this.title = title;
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public long setId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}

	
	
	

}
