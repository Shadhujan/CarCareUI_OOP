/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author niffz
 */
public class SendNotificationToEmployee {
    public static void sendMail(String customerMail, int orderID, int date) {

        // Recipient's email ID needs to be mentioned.
        String to = customerMail;

        // Sender's email ID needs to be mentioned
        String from = "oopoopprojectoop@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(from, "vfdpbyjgfgdqcovz");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Car Care update !");

            message.setContent("<h2>Your have a new job</h2>"
                            + String.format("<ul><li>Order ID : %d </li>", orderID)
                            + String.format("<li>Order Date : %d </li></ul>", date)
                            + "<h3>Please contact Car Care to get more details..</h3>",
                    "text/html");

            // Send message
            Transport.send(message);
//            JOptionPane.showMessageDialog(this, "Message Sent Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

    public void SendNotificationToEmployee() {
        String customerMail = "niffzy@gmail.com";
        int orderID = 3024;
        int date = 2034478638;
        sendMail(customerMail, orderID, date);
    }
}