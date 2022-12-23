package kpakurumo.school.africa.services;

import kpakurumo.school.africa.data.dto.request.AdminRegistrationRequest;
import kpakurumo.school.africa.data.dto.respond.AdminRegistrationResponse;
import kpakurumo.school.africa.data.models.Admin;

import java.util.List;

public interface AdminService {
    AdminRegistrationResponse register (AdminRegistrationRequest adminRequest);

    List <Admin> getAllAdmin();

    void updateProfile(Long adminId, String email, String password);

    void deleteAdmin(Long id);

}
