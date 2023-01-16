package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.AdminLoginRequest;
import kpakurumo.school.africa.data.dto.request.LoginRequest;
import kpakurumo.school.africa.data.dto.respond.AdminLoginResponse;
import kpakurumo.school.africa.data.dto.respond.StudentLoginResponse;
import kpakurumo.school.africa.data.models.Admin;
import kpakurumo.school.africa.data.models.EarlyBrightAppUser;
import kpakurumo.school.africa.data.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
   EarlyBrightAppUser saveUser(EarlyBrightAppUser user);

   Student saveStudent (Student student);

   Admin saveAdmin(Admin admin);
   List<EarlyBrightAppUser> getUsers();

    void addRoleToUser(String username, String roleName);
    EarlyBrightAppUser getUserByUsername (String username);
   StudentLoginResponse login(LoginRequest loginRequest);

    AdminLoginResponse adminLogin(AdminLoginRequest loginRequest);

}
