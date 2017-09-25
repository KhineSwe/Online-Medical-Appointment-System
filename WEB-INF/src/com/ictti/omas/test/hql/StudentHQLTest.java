package com.ictti.omas.test.hql;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.ictti.omas.business.entity.Patient;
import com.ictti.omas.business.service.PatientService;


public class StudentHQLTest extends BaseHQL {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = getFactory();
		PatientService myService =
			 (PatientService)beanFactory.getBean("idPatientService");
		
		Patient myPatient=myService.getPatient("mgmg@gmail.com", "23145");
		if(myPatient==null)
			System.out.println("Patient does not exist at table");
		else
			System.out.println("Patient name:"+myPatient.getPemail());
	}
}
