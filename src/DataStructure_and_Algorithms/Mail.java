package A2_DataStructure_and_Algorithms;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class EmailVerification {

    public static void main(String[] args) {
        // Nhập địa chỉ email từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email của bạn: ");
        String userEmail = scanner.nextLine();

        // Tạo mã xác nhận ngẫu nhiên
        String verificationCode = generateVerificationCode();

        // Gửi mã xác nhận đến địa chỉ email
        sendVerificationCode(userEmail, verificationCode);

        System.out.println("Mã xác nhận đã được gửi đến địa chỉ email của bạn.");
    }

    private static String generateVerificationCode() {
        // Tạo mã xác nhận ngẫu nhiên (ví dụ đơn giản, bạn có thể cải tiến theo nhu cầu của mình)
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }

    private static void sendVerificationCode(String toEmail, String verificationCode) {
        // Cấu hình thông tin email của bạn (địa chỉ email và mật khẩu của tài khoản gửi email)
        final String fromEmail = "your-email@gmail.com";
        final String password = "your-email-password";

        // Thiết lập cấu hình máy chủ SMTP của Gmail
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Tạo đối tượng Session để xác thực và tạo phiên gửi email
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Tạo đối tượng MimeMessage
            Message message = new MimeMessage(session);

            // Đặt thông tin người gửi, người nhận và chủ đề
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Mã xác nhận");

            // Nội dung email
            String emailContent = "Mã xác nhận của bạn là: " + verificationCode;
            message.setText(emailContent);

            // Gửi email
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
