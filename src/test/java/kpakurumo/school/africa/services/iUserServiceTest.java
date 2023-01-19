package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.AdminLoginRequest;
import kpakurumo.school.africa.data.dto.request.LoginRequest;
import kpakurumo.school.africa.data.dto.respond.AdminLoginResponse;
import kpakurumo.school.africa.data.dto.respond.StudentLoginResponse;
import kpakurumo.school.africa.data.models.Admin;
import kpakurumo.school.africa.data.models.Student;
import kpakurumo.school.africa.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class iUserServiceTest {
@Autowired
    private UserService userService;

@Autowired

private AdminRepository adminRepository;

private AdminLoginRequest userLogin;

private Admin admin;

private Student student;

    @BeforeEach
    void setUp() {
        admin = new Admin();
        admin.setFirstName("Sade");
        admin.setLastName("Coke");
        admin.setPhoneNumber("0809067890");
        admin.setEmail("sade@email.com");
        admin.setPassword("1573");

      adminRepository.save(admin);

      //  System.out.println(admin.getFirstName());


        userLogin = AdminLoginRequest.builder()
                .email("sade@email.com")
                .password("1573")
              //  .phoneNumber("0809067890")
                .build();
    }

    @Test
    void getUserByEmail() {
        assertThat(admin.getEmail()).isEqualTo("sade@email.com");
      log.info(" Fetching user email by admin -> {}", admin.getEmail());
       // log.info(" Fetching user email  by student -> {}", student.getEmail());

    }


    @Test
    void login() {
      //  adminRepository.save(admin);
        AdminLoginResponse res = userService.adminLogin(userLogin);
        assertThat(res).isNotNull();
        log.info("Welcome Admin {} ", admin.getFirstName());
    }
}