package kpakurumo.school.africa.Utils;

import kpakurumo.school.africa.data.dto.request.StudentRegistrationRequest;
import kpakurumo.school.africa.data.models.Student;

public class Mappa {

    public static void map(StudentRegistrationRequest registerRequest, Student student) {
        student.setFirstName(registerRequest.getFirstName());
        student.setLastName(registerRequest.getLastName());
        student.setEmail(registerRequest.getEmail());
        student.setPhoneNumber(registerRequest.getPhoneNumber());
        student.setUsername(registerRequest.getUsername());
        student.setPassword(registerRequest.getPassword());
        student.setAddress(registerRequest.getAddress());
        student.setPermissionSet(student.getPermissionSet());
       // student.setCourses(registerRequest.getCourses());

    }
}
