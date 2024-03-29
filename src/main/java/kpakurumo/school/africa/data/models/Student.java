package kpakurumo.school.africa.data.models;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Student extends EarlyBrightAppUser{
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private  String lastName;
    private  String email;
    private String phoneNumber;
    private String username;
    private String password;
  //  private Permission permission;
    private String address;
    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Course> courses = new ArrayList<>();

}
