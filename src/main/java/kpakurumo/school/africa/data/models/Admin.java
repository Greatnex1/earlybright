package kpakurumo.school.africa.data.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends EarlyBrightAppUser {
    @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Long id;
    private String firstName;
    private  String lastName;
    private  String email;
    private String phoneNumber;
    private String username;
    private String password;
    //private Staffs schoolStaff;

}
