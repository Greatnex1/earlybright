package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.LoginRequest;
import kpakurumo.school.africa.data.dto.respond.LoginResponse;
import kpakurumo.school.africa.data.models.Admin;
import kpakurumo.school.africa.data.models.EarlyBrightAppUser;
import kpakurumo.school.africa.data.models.Student;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
   EarlyBrightAppUser saveUser(EarlyBrightAppUser user);

   Student saveStudent (Student student);

   Admin saveAdmin(Admin admin);
//    List<EarlyBrightAppUser> getUsers();

    //void addStudentToUser(String username, String roleName);
    EarlyBrightAppUser getUserByEmail (String email);
   LoginResponse login(LoginRequest loginRequest);


}
