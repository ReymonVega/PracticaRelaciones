package net.jaumebalmes.rvega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import net.jaumebalmes.m12.entitats.Alumne;
import net.jaumebalmes.rvega.entitats.Course;
import net.jaumebalmes.rvega.repos.CourseRepository;

@RestController
@RequestMapping("api")
public class CourseController {
	

	@Autowired

	CourseRepository courseRepo;
	
	@GetMapping ("course/{id}")
	public Course getCourse(@PathVariable long id) {
		
		return courseRepo.findById(id).get();
	}
	

	
	@GetMapping("course")
	public Iterable<Course> getCourses() {
		
		return courseRepo.findAll();
	}
	


	
}
