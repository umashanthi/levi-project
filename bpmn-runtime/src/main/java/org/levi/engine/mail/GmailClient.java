package org.levi.engine.mail;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: 7/9/11
 * Time: 10:43 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GmailClient {

public static void main(String[] args)
	{
		/***** CHANGE THESE FOUR VARIABLE VALUES TO REFLECT YOUR ENVIRONMENT ******/
		String user = "marketing";	// Newly created user on JAMES
		String password = "marketing"; // user password

		String fromAddress = "marketing@levi.org"; // newlycreateduser@localhost
		String toAddress = "keheliya.gallaba@gmail.com";

		// Create a mail session
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "localhost");
		properties.put("mail.smtp.port", "25");
		properties.put("mail.smtp.username", user);
		properties.put("mail.smtp.password", password);
		Session session = Session.getDefaultInstance(properties, null);

		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromAddress));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));

			message.setSubject("Email from Levi JAMES Server");
			message.setText("Hello, Your leave request has been approved!!");
			Transport.send(message);

			System.out.println("Email sent successfully");
		}
		catch (MessagingException e)
		{
			e.printStackTrace();
		}
	}

}
