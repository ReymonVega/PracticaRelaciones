package net.jaumebalmes.rvega.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String lastName;
	private String firstName;
	LocalDate birthDate;
	private boolean wantsNewsletter;
		
	
	
	//Constructor Clean
	public Student() {
		
	}
	
	//Constructor
	public Student(String lastName, String firstName, LocalDate birthDate, boolean wantsNewsletter, long id) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
	}
	
	//Getters and Setters
	
	public long getId() {
		return id;
	}
	
	public long setId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}
	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}

	
	//To String...
	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate
				+ ", wantsNewsletter=" + wantsNewsletter + "]";
	}
	
	
	
	

}
