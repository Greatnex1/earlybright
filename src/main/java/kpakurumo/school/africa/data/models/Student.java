package kpakurumo.school.africa.data.models;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Student extends  EarlyBrightAppUser{
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private  String lastName;
    private  String email;
    private String phoneNumber;
    private String username;
    private String password;
  //  private String address;
    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Course> courses = new ArrayList<>();

}
