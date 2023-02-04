package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.AdminRegistrationRequest;
import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.AdminRegistrationResponse;
import kpakurumo.school.africa.data.dto.respond.StudentRegistrationResponse;
import kpakurumo.school.africa.data.models.Admin;
import kpakurumo.school.africa.data.models.Student;
import kpakurumo.school.africa.repository.AdminRepository;
import kpakurumo.school.africa.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class iAdminServiceTest {
    @Autowired
    private AdminService adminService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private  AdminRepository adminRepository;

    private StudentRegistrationRequest studentRequest;

    private StudentRegistrationResponse studentResponse;

    private AdminRegistrationRequest adminRequest;

    private AdminRegistrationResponse adminResponse;

    @BeforeEach
    void up(){
        studentRequest= StudentRegistrationRequest.builder()

                .firstName("Amos")
                .lastName("Sky")
                .email("amosky@email.com")
                .username("amosworld")
                .phoneNumber("0908999786")
                .password("4457")
                .build();
        studentResponse = adminService.registerStudent(studentRequest);
    }

    @Test
    void registerAdmin() {
        adminRequest= AdminRegistrationRequest.builder()
                .firstName("Joy")
                .lastName("Dilly")
                .email("dilly@email.com")
                .username("dilly")
                .phoneNumber("0908999786")
                .password("4888")
                .build();
        adminResponse = adminService.registerAsAdmin(adminRequest);



        assertThat(adminResponse).isNotNull();
        log.info("registered admin email->{}",adminRequest.getEmail());
    }

    @Test
    void registerStudent() {
//        studentRequest= StudentRegistrationRequest.builder()
//                .firstName("Amos")
//                .lastName("Sky")
//                .email("amosky@email.com")
//                .username("amosworld")
//                .phoneNumber("0908999786")
//                .password("4457")
//                .build();
//        studentResponse = adminService.registerStudent(studentRequest);

        assertThat(studentResponse).isNotNull();
        log.info("registered Student email->{}",studentRequest.getEmail());

    }

    @Test
    void createCourse() {
    }

    @Test
    void getAllStudents() {
        assertThat(studentRequest).isNotNull();

    }

    @Test
    void getAllCourses() {
    }

    @Test
    void expelStudent() {
      //  adminService.registerStudent(studentRequest);
        assertThat(studentRequest).isNotNull();
log.info(" student in db before expel ->{}",studentRequest.getEmail());

adminService.expelStudent(2L);
      assertThat(adminService.getAllStudents().isEmpty());
        log.info(" student in db ::{} ", studentService.getAllStudents());
    }

    @Test
    void updateAdminProfile() {
    }

    @Test
    void updateStudentProfile() {
        log.info("previous password -> {}", studentRequest.getPassword());
        studentRequest.setPassword("4444");
        assertThat(studentRequest.getPassword()).isEqualTo("4444");
        log.info("password changed -> {}",studentRequest.getPassword());
    }

    @Test
    void deleteAdmin() {

        adminRequest= AdminRegistrationRequest.builder()
                .firstName("Joy")
                .lastName("Dilly")
                .email("dilly@email.com")
                .username("dilly")
                .phoneNumber("0908999786")
                .password("4888")
                .build();
        adminResponse = adminService.registerAsAdmin(adminRequest);

        assertThat(adminResponse).isNotNull();
        log.info("saved admin email -> {}", adminRequest.getEmail());

        adminService.deleteAdmin(2L);
        assertThat(adminService.getAllAdmin()).isEmpty();
      //  log.info("admin in db-> {}", adminService.getAllAdmin());
    }
}