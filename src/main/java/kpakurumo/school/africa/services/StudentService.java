package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.StudentRegistrationResponse;
import kpakurumo.school.africa.data.models.Course;
import kpakurumo.school.africa.data.models.Student;
import kpakurumo.school.africa.exception.StudentAlreadyExistException;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentRegistrationResponse register (StudentRegistrationRequest registerRequest) throws StudentAlreadyExistException;

//    Course registerForCourse(Course course);
  List <Student> getAllStudents();


 Optional <Student> updateStudent  (Long studentId, Student student);

}
