package com.example.demo_2.Controller;
import com.example.demo_2.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-verification-code")
    public void sendVerificationCode(@RequestBody String email) {
        emailService.sendVerificationCode(email);
    }
}
