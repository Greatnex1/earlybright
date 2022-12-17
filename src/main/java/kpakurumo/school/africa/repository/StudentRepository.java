package kpakurumo.school.africa.repository;

import kpakurumo.school.africa.data.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
   Optional <Student> findStudentByEmail(String email);
}
