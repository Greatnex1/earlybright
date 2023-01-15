package kpakurumo.school.africa.controller;

import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.StudentRegistrationResponse;
import kpakurumo.school.africa.data.models.Student;
import kpakurumo.school.africa.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v1/student")
@Slf4j
@Validated
@RequiredArgsConstructor
public class StudentResource{
    private final StudentService studentService;
//
//   @Autowired
//   public StudentResource(StudentService studentService) {
//      this.studentService = studentService;
//  }

    @GetMapping("/all_student")
 //   @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudents());

    }

    @PostMapping("/register")
 //   @PreAuthorize("hasAnyRole('ROLE_STUDENT')")
    public ResponseEntity<?> registerStudent(@Valid @RequestBody StudentRegistrationRequest studentRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.register(studentRequest));
    }
  @PutMapping("{studentId}")
    public void updateStudentProfile(@PathVariable Long studentId,
                                                   @RequestParam(required = false) Student student
                                                ) {
        studentService.updateStudent(studentId, student);
        log.info("updated student profile -> {}", student);
    }
    @DeleteMapping("{studentId}")
    public ResponseEntity<?> removeStudent(@PathVariable Long studentId){
    return ResponseEntity.ok("Student record deleted successfully");
      //  log.info("student data -> {}",st);
     //or
       //return ResponseEntity.noContent().build();
   }
}

