package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.CourseRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.CourseRegistrationResponse;
import kpakurumo.school.africa.data.dto.respond.UpdateCourseResponse;
import kpakurumo.school.africa.data.models.Course;
import org.springframework.data.domain.Page;

public interface CourseService {
    CourseRegistrationResponse create (CourseRegistrationRequest courseRequest);

    UpdateCourseResponse updateCourse (Long id);

    Course getCourseById(Long id);

 //   Page <Course> getAllCourses ();

    String deleteCourse (Long id);
}
