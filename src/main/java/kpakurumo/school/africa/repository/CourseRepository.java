package kpakurumo.school.africa.repository;

import kpakurumo.school.africa.data.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {
    Optional <Course> findCourseByCourseName(String courseName);

}
