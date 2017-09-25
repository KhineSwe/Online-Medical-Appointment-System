package com.ictti.frame.business.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ictti.frame.business.entity.IcttiCourse;
import com.ictti.frame.business.entity.IcttiStudent;
import com.ictti.frame.dao.IcttiCourseDao;
import com.ictti.frame.dao.IcttiStudentDao;
import com.ictti.frame.presentation.form.StudentForm;

public class StudentService {
	private IcttiStudentDao myIcttiStudentDao;
	private IcttiCourseDao myIcttiCourseDao;

	public IcttiCourseDao getMyIcttiCourseDao() {
		return myIcttiCourseDao;
	}

	public void setMyIcttiCourseDao(IcttiCourseDao myIcttiCourseDao) {
		this.myIcttiCourseDao = myIcttiCourseDao;
	}

	public IcttiStudentDao getMyIcttiStudentDao() {
		return myIcttiStudentDao;
	}

	public void setMyIcttiStudentDao(IcttiStudentDao myIcttiStudentDao) {
		this.myIcttiStudentDao = myIcttiStudentDao;
	}

	public IcttiStudent getIcttiStudent(String name, String password) {
		return myIcttiStudentDao.getStudentByLoginNameAndPassword(name,
				password);

	}

	public void checkLoginStudent(StudentForm myForm) {
		IcttiStudent myStudent = myIcttiStudentDao
				.getStudentByLoginNameAndPassword(myForm.getFrmLoginName(),
						myForm.getFrmPassword());
		myForm.setLoginStudent(myStudent);
	}

	public void firstLoadRegistration(StudentForm myForm) {
		List<IcttiCourse> l = myIcttiCourseDao.getAllCourse();
		myForm.setFrmRegCourseList(l);
		myForm.setFrmRegCourseId("0");
		myForm.setFrmRegAccountName("");
		myForm.setFrmRegAddress("");
		myForm.setFrmRegConfPassword("");
		myForm.setFrmRegEmail("");
		myForm.setFrmRegLoginName("");
		myForm.setFrmRegName("");
		myForm.setFrmRegPassword("");

		myForm.setFrmRegPhone("");
		myForm.setFrmRegFormControl(null);
	}

	public void checkAccountName(StudentForm myForm) {
		IcttiStudent myStudent = myIcttiStudentDao
				.getStudentByAccountName(myForm.getFrmRegAccountName());
		if (myStudent != null) {
			myForm.setFrmRegAccountNameError(null);
			myForm.setFrmRegFormControl(null);
		} else {
			IcttiCourse myCourse = myIcttiCourseDao.getCourseById(Integer
					.parseInt(myForm.getFrmRegCourseId()));
			myForm.setFrmRegLoginName(myCourse.getCourseCode()
					+ myForm.getFrmRegAccountName());
			SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
			myForm.setFrmRegDate(myFormat.format(new Date()));
			myForm.setFrmRegCourseName(myCourse.getCourseName());
			myForm.setFrmRegFormControl("data");
		}
	}

	public void saveNewStudent(StudentForm myForm) {
		IcttiStudent myStudent = new IcttiStudent();
		myStudent.setId(null);

		myStudent.setRegisterDate(new Date());
		myStudent.setStudentAccountName(myForm.getFrmRegAccountName());
		myStudent.setStudentAddress(myForm.getFrmRegAddress());
		myStudent.setStudentEmail(myForm.getFrmRegEmail());

		IcttiCourse myCourse = myIcttiCourseDao.getCourseById(Integer
			.parseInt(myForm.getFrmRegCourseId()));
		myStudent.setCourse(myCourse);
		myStudent.setStudentLoginName(myForm.getFrmRegLoginName());
		myStudent.setStudentName(myForm.getFrmRegName());
		myStudent.setStudentPassword(myForm.getFrmRegPassword());
		myStudent.setStudentPhone(myForm.getFrmRegPhone());
		myIcttiStudentDao.saveStudent(myStudent);
	}

	public void fristLoadUpdateProfile(StudentForm myForm) {
		IcttiStudent myLoginStudent = myForm.getLoginStudent();
		myForm.setFrmRegAccountName(myLoginStudent.getStudentAccountName());
		System.out.println("Account Name is "+myLoginStudent.getStudentAccountName());
		myForm.setFrmRegCourseName(myLoginStudent.getCourse().getCourseName());
		myForm.setFrmRegAddress(myLoginStudent.getStudentAddress());
		myForm.setFrmRegConfPassword(myLoginStudent.getStudentPassword(
		));
		myForm.setFrmRegEmail(myLoginStudent.getStudentEmail());
		myForm.setFrmRegLoginName(myLoginStudent.getStudentLoginName());
		myForm.setFrmRegName(myLoginStudent.getStudentName());
		myForm.setFrmRegPassword(myLoginStudent.getStudentPassword());
		myForm.setFrmRegPhone(myLoginStudent.getStudentPhone());
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		myForm.setFrmRegDate(myFormat.format(myLoginStudent.getRegisterDate()));
		myForm.setFrmRegFormControl(null);
		
	}
	
	public void saveUpdateStudent(StudentForm myForm) {
		IcttiStudent myStudent = myForm.getLoginStudent();
		myStudent.setStudentAddress(myForm.getFrmRegAddress());
		myStudent.setStudentEmail(myForm.getFrmRegEmail());
		myStudent.setStudentName(myForm.getFrmRegName());
		myStudent.setStudentPassword(myForm.getFrmRegPassword());
		myStudent.setStudentPhone(myForm.getFrmRegPhone());
		myIcttiStudentDao.saveStudent(myStudent);
		}
}
