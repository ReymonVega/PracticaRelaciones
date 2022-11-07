package net.jaumebalmes.rvega.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseMaterial {
	
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public String url;
	
	
	public CourseMaterial() {
		
	}

	public CourseMaterial(String url, long id) {
		super();
		this.url = url;
		this.id = id;
		
	}
	
	
	public long getId() {
		return id;
	}
	
	public long setId() {
		return id;
	}
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", url=" + url + "]";
	}

	
	
	
	
}
