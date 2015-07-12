package com.arcologydesigns.emailService;

import com.arcologydesigns.Views.EmailForm;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * com.arcologydesigns.emailServicedesigns.Mail created by Borislav S. on 7/1/2015 @ 10:00 PM.
 */
public class Mail {

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    public static void generateAndSendEmail(String _toField, String _ccField, String _subject, String _message)
            throws MessagingException {
        // STEP_1: specify ports and connection info / server properties
        System.out.println("\n 1st ===> setup com.arcologydesigns.emailServicedesigns.Mail Server Properties..");
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        System.out.println("com.arcologydesigns.emailServicedesigns.Mail Server Properties setup successfully...");

        // STEP_2: get a mail session and fill an email message with necessary info (subject, to, cc, from)
        System.out.println("\n\n 2nd ===> get com.arcologydesigns.Mailns.emailService.Mail Session..");
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(_toField));

        generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(_ccField));
        generateMailMessage.setSubject(_subject);

        generateMailMessage.setContent(_message, "text/html");
        System.out.println("com.arcologydesigns.Mailns.emailService.Mail Session created successfully...");

        // STEP_3: transport the message
        System.out.println("\n\n 3rd ===> Get Session and Send mail");
        Transport transport = getMailSession.getTransport("smtp");

        // Enter a correct Gmail UserID and Password
        // using 2FA (2 factor authentication), thus the password is App Specific and not a string literal
        transport.connect("smtp.gmail.com", "defaultbusinessacct01@gmail.com", "loaphdmteeaeasak");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();

    }  //end generateAndSendEmail
}  //end class com.arcologydesigns.emailServicedesigns.Mail