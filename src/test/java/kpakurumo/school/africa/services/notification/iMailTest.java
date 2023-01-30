package kpakurumo.school.africa.services.notification;

import kpakurumo.school.africa.data.dto.request.MailNotificationRequest;
import kpakurumo.school.africa.data.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class iMailTest {

    @Autowired
    private  MailNotificationService mailNotification;

    private Student student;

    @Test
    void sendEmail() {
        MailNotificationRequest mailRequest = new MailNotificationRequest();
        Student student =new Student();
        student.setFirstName("Ayo");
        mailRequest.setSubjectHeader("EarlyBright ");
mailRequest.setUserEmail("noahgreatakoni@gmail.com");
mailRequest.setMailContext("Hey "+student.getFirstName()+" Welcome to Early Bright "+
        " your registration as a student of this prestigious school is completed ");
   String res = mailNotification.sendEmail(mailRequest);
        assertThat(res.contains("successful")).isTrue();
        log.info("mail sent to ->{} successfully", mailRequest.getUserEmail());
    }

}