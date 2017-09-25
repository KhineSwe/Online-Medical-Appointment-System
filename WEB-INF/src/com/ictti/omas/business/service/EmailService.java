package com.ictti.omas.business.service;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.ictti.omas.presentation.form.MailForm;
import com.ictti.omas.util.MailConfig;


public class EmailService {


	

	public void prepareForMail(MailForm myForm) {
		/*String strFrom = myForm.getFrmMailAdd();*/
		String strFrom="ps18-thidarkhine@ictti.site";
		String strSubject = " Mail to OMAS Admin ";
		String strContent = new String();
		try {
			VelocityEngine engine = new VelocityEngine();
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.RESOURCE_LOADER, "classpath");
			properties.setProperty("classpath."
					+ VelocityEngine.RESOURCE_LOADER + ".class",
					ClasspathResourceLoader.class.getName());
			engine.init(properties);

			// get template under the WEB-INF/src
			Template tm = engine.getTemplate("mailTemplate1.vm");
			VelocityContext vc = new VelocityContext();

			// Put job list
			vc.put("name", myForm.getFrmMailName());
			vc.put("msg", myForm.getFrmMailMsg());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);
			
			
			StringWriter sw = new StringWriter();
			tm.merge(vc, sw);
			strContent = sw.toString();
			if (strContent != null) {

				// Create an email object
				MailConfig smtpMailSender = new MailConfig();
				smtpMailSender.sendToOne(myForm.getFrmMailAdd(), strSubject,
						strContent, strFrom);
				myForm.setFrmMailNotiMessage("Mail can send successfully");
			} else {
				myForm.setFrmMailNotiMessage("Mail cannot send because the message is null.");
			}
		} catch (Exception e) {
			myForm.setFrmMailNotiMessage("Mail cannot send.");
		}
	}
	
	/*public void prepareForManyMail(ManyMailForm myForm) {
		String strFrom = "admin@ictti.site";
		String strSubject = "Many Mail Testing";
		String strContent = new String();
		try {
			VelocityEngine engine = new VelocityEngine();
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.RESOURCE_LOADER, "classpath");
			properties.setProperty("classpath."
					+ VelocityEngine.RESOURCE_LOADER + ".class",
					ClasspathResourceLoader.class.getName());
			engine.init(properties);

			// get template under the WEB-INF/src
			Template tm = engine.getTemplate("mailTemplate.vm");
			VelocityContext vc = new VelocityContext();

			// Put job list
			vc.put("name", myForm.getFrmMailName1());
			vc.put("name", myForm.getFrmMailName2());
			// Put today's date
			String today = new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date()).toString();
			vc.put("today", today);
			List<IcttiCourse> listCourse = myIcttiCourseDao.getAllCourse();
			vc.put("cList", listCourse);
			StringWriter sw = new StringWriter();
			tm.merge(vc, sw);
			strContent = sw.toString();
			String emailToaddress[]={myForm.getFrmMailAdd1(),myForm.getFrmMailAdd2()};
			if (strContent != null) {

				// Create an email object
				MailConfig smtpMailSender = new MailConfig();
				smtpMailSender.sendToMany(emailToaddress, strSubject,
						strContent, strFrom);
				myForm.setFrmMailMessage("Mail can send successfully");
			} else {
				myForm.setFrmMailMessage("Mail cannot send because the message is null.");
			}
		} catch (Exception e) {
			myForm.setFrmMailMessage("Mail cannot send.");
		}
	}*/
	
	

}
