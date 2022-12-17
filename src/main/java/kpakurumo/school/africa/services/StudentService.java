package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.StudentRegistrationResponse;
import kpakurumo.school.africa.data.models.Student;
import kpakurumo.school.africa.exception.StudentAlreadyExistException;

import java.util.List;
import java.util.Optional;

//@Service
public interface StudentService {
    StudentRegistrationResponse register (StudentRegistrationRequest registerRequest) throws StudentAlreadyExistException;

  List <Student> getAllStudents();

  void expelStudent (Long studentId);

 Optional <Student> updateStudent  (Long studentId, Student student);

}
