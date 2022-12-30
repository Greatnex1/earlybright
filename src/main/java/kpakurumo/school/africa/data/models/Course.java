package kpakurumo.school.africa.data.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
//@ToString
public class Course {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private String courseName;
//@ElementCollection
//@ManyToMany(fetch = FetchType.EAGER )
//private List<Student> students = new ArrayList<>();

}
