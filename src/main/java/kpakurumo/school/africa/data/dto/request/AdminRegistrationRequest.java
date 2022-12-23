package kpakurumo.school.africa.data.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Builder
@Setter
@Getter
public class AdminRegistrationRequest {
    private String firstName;
    private String lastName;
//    @Email(message = "invalid email")
    private String email;
    private String phoneNumber;
    private String password;

}
