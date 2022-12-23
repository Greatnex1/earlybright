package kpakurumo.school.africa.data.dto.respond;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AdminRegistrationResponse {
    private int code;
    private String message;
}

