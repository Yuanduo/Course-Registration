package action;

import java.util.List;

import student_impl.admin_impl;

import db.Course;
import action.AutoArrayList;
import action.User;

public class addCourseAction  {
	
	private List courses = new AutoArrayList(Course.class,5);
	
	public String execute() throws Exception{
		Course course;
		admin_impl a_impl=new admin_impl();
		
		for (int i=0; i<courses.size();i++)      
		{      
			course = (Course)courses.get(i);  
			System.out.println(course.getCid());
			System.out.println(course.getCname());
			System.out.println(course.getTeacher().getTid());
		   a_impl.createCourse(course);
		    	
		   
	}
		return "success";}


	public void setCourses(List users) {
		this.courses = users;
	}


	public List getCourses() {
		return courses;
	}


}
