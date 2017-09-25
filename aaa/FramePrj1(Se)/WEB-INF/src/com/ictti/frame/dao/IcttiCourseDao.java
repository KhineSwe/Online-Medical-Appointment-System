package com.ictti.frame.dao;

import java.util.List;

import com.ictti.frame.business.entity.IcttiCourse;

public interface IcttiCourseDao {
	public List<IcttiCourse> getAllCourse();
	
	public IcttiCourse getCourseById(Integer id);

}
