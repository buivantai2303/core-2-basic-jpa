package com.example.demo_2.Services;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Properties;
import java.util.Random;

@Service
public class EmailService {

    @Value("${spring.mail.username}")
    private String senderEmail; // Configure this in your application.properties or application.yml

    public void sendVerificationCode(String toEmail) {
        String verificationCode = generateVerificationCode();

        // Configure the properties for the email session
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP host
        properties.setProperty("mail.smtp.port", "587"); // Replace with your SMTP port
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        // Create a session with an Authenticator
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, "Luhanhthu53");
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(senderEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            // Set the subject and text content
            message.setSubject("Verification Code");
            message.setText("Your verification code is: " + verificationCode);

            // Send the message
            Transport.send(message);

            System.out.println("Verification code sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending verification code.");
        }
    }

    private String generateVerificationCode() {
        // Generate a random verification code (e.g., 6 digits)
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }
}
