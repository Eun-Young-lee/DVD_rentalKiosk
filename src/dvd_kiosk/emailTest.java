package dvd_kiosk;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class emailTest {
    
    public static void main(String[] args) throws IOException {
        //authentication info
       final String username = "poply2@gmail.com";
       final String password = "Lg108829";
       String fromEmail = "poply2@gmail.com";
       String toEmail = "poply2@gmail.com";
			
Properties properties = new Properties();
properties.put("mail.smtp.auth", "true");
properties.put("mail.smtp.starttls.enable", "true");
properties.put("mail.smtp.host", "smtp.gmail.com");
properties.put("mail.smtp.port", "587");
			
Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username,password);
}
});

//Start our mail message
MimeMessage msg = new MimeMessage(session);
try {
msg.setFrom(new InternetAddress(fromEmail));
msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
msg.setSubject("Subject Line");
				
Multipart emailContent = new MimeMultipart();

//Text body part
MimeBodyPart textBodyPart = new MimeBodyPart();				
//Attach body parts
//MimeBodyPart attachment = new MimeBodyPart();
//attachment.attachFile("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\orderData.txt");

emailContent.addBodyPart(textBodyPart);
//emailContent.addBodyPart(attachment);s
				
//Attach multipart to message
msg.setContent(emailContent);				
Transport.send(msg);
System.out.println("Sent message");
                                
} catch (MessagingException e) {
e.printStackTrace();
}
}
}


