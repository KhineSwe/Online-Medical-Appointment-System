package com.ictti.frame.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MailSend {
	private static Log log = LogFactory.getLog(MailSend.class);

	public static void main(String[] args) throws Exception {
		boolean debug = false;
		
		// Please load SMTP host name from your project web.xml file
		final String SMTP_HOST_NAME = "192.168.48.13";
		
		// Please read followings from your project database
		final String emailMsgTxt = "Hello..my sis.. How are you?";
		final String emailSubjectTxt = "ICTTI Framework Lecture";
		final String emailFromAddress = "omas@ictti.site";
		final String[] emailToAddresses = { "ps18-eimon@ictti.site",
				"ps18-thidarkhine@ictti.site","ps18-soesoe@ictti.site" };
		// 1. Prepare Properties
		Properties props = new Properties();
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		Session session = Session.getDefaultInstance(props, null);
		session.setDebug(debug);
		
		// 2. Create a MimeMessage
		Message msg = new MimeMessage(session);
		
		// 3. Prepare sending the message
		InternetAddress addressFrom = new InternetAddress(emailFromAddress);
		msg.setFrom(addressFrom);
		InternetAddress[] addressTo = new InternetAddress[emailToAddresses.length];
		for (int i = 0; i < emailToAddresses.length; i++) {
			addressTo[i] = new InternetAddress(emailToAddresses[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);
		msg.setSubject(emailSubjectTxt);
		msg.setContent(emailMsgTxt, "text/plain");
		
		
		// 4. Send the message out
		Transport.send(msg);
		if (log.isInfoEnabled()) {
			log.info("Message sent successfully.");
		}
	}
}