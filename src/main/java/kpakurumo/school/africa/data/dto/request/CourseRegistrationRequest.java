package kpakurumo.school.africa.data.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CourseRegistrationRequest {
    private String courseId;
    private String courseName;
}
