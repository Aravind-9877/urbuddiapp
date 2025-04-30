package utilities;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;

public class EmailUtility {

    public static void sendEmail(String subject, String body, String reportPath) {
        final String from = "aravind.neelams@optimworks.com";
        final String password = "vwtvldotaoywbaxj";  // Use app password if using Gmail
        final String to = "aravind.neelams@optimworks.com";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(body);

            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(reportPath));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("✅ Email sent successfully with the report.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
