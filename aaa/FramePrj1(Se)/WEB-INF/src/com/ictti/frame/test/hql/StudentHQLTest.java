package com.ictti.frame.test.hql;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.ictti.frame.business.entity.IcttiStudent;
import com.ictti.frame.business.service.StudentService;




public class StudentHQLTest extends BaseHQL {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = getFactory();
		StudentService myService =
			 (StudentService)beanFactory.getBean("idStuService");
		
		IcttiStudent myStudent=myService.getIcttiStudent("ps9-hlahla", "hlahla");
		if(myStudent==null)
			System.out.println("Student does not exist at table");
		else
			System.out.println("Student name:"+myStudent.getStudentName());
	}
}
