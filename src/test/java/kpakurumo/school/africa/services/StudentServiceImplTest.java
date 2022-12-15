package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.StudentRegistrationResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Slf4j
class StudentServiceImplTest {
    @Autowired
    private  StudentService studentService ;

    private StudentRegistrationRequest request;

    private StudentRegistrationResponse registerResponse;
    @BeforeEach
    void setUp() {
        request = StudentRegistrationRequest
                .builder()
                .email("adams@email.com")
                .firstName("Adams")
                .lastName("williams")
                .phoneNumber("6754321")

                .build();
        registerResponse = studentService.register(request);

    }
    @Test
    void register() {
        assertThat(registerResponse).isNotNull();
    }

    @Test
    void  getAllStudent(){
        assertThat(studentService.getAllStudents()).isNotNull()  ;
    log.info(" students in db ::{} ", studentService.getAllStudents());
    }
    @Test
    void deleteStudent(){
        assertThat(request).isNotNull();

        studentService.expelStudent(1L);
        assertThat(studentService.getAllStudents().isEmpty());
        log.info(" student in db ::{} ", studentService.getAllStudents());
    }
}