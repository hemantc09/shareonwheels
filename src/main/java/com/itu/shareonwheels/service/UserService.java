package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

/**
 * Created by ramya on 9/28/15.
 */
@Service
public class UserService implements GenericService<User, Long> {

    @Autowired
    private UserDao userDao;


    public Long create(User user) {

//        String userEmail = user.getEmailAddress();
//        String token = user.getStatus();
//        try {
//            generateAndSendEmail(userEmail,token);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }

        return userDao.create(user);
    }


    public void update(User user) {
         userDao.update(user);
    }


    public User get(Long aLong) {
        return null;
    }


    public List<User> getAll() {
        return null;
    }
//remove by id

    public void removeById(Long aLong) {

    }
    public void statusUpdate(long userId,String token)
    {
        userDao.statusUpdate(userId,token);
    }


    public static void generateAndSendEmail(String userEmail, String token) throws AddressException, MessagingException {

       Properties mailServerProperties;
         Session getMailSession;
         MimeMessage generateMailMessage;
        // Step1

        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");

        // Step2

        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));

        generateMailMessage.setSubject("Confirmation mail");
        String emailBody = "To confirm the account click below link /n http//54.186.236.106:3306/shareonwheels/v1/user/verify/{userId}?token: "+token;
        generateMailMessage.setContent(emailBody, "text/html");

        // Step3

        Transport transport = getMailSession.getTransport("smtp");

        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        transport.connect("smtp.gmail.com", "nikita.sonthalia88@gmail.com", "");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
    }
}
