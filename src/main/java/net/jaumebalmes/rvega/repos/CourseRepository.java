package net.jaumebalmes.rvega.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.rvega.entitats.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

	public List<Course> findAll();
}
