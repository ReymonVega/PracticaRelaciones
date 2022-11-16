package net.jaumebalmes.rvega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.rvega.entitats.Course;
import net.jaumebalmes.rvega.repos.CourseRepository;

@RestController
@RequestMapping("api")
public class DeleteCourseController {
	
	@Autowired
	CourseRepository courseRepo;
	

	@DeleteMapping("course/{id}")
    public ResponseEntity<Course> setCourse(@PathVariable Long id) {
		courseRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
