package kpakurumo.school.africa.data.dto.request;

import kpakurumo.school.africa.data.models.Course;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Collection;

@Builder
@Setter
@Getter
@Validated
public class StudentRegistrationRequest{
 private String firstName;
 private String lastName;
 @Email(message = "invalid email")
 private String email;
 private String phoneNumber;
 private String username;
 private String password;
 private String address;
 //@OneToMany(fetch = FetchType.EAGER)
// private Collection<Course> courses ;


}
