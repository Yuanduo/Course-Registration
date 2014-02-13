package action;

import java.util.List;

import student_impl.admin_impl;
import db.Student;
import db.Teacher;

public class addTeacherAction {
private List teachers = new AutoArrayList(Teacher.class,5);
	
	public String execute() throws Exception{
		Teacher teacher;
		admin_impl a_impl=new admin_impl();
		for (int i=0; i<teachers.size();i++)      
		{   
			
			teacher = (Teacher)teachers.get(i);  
		    a_impl.createTeacher(teacher);
		    
		  
		}      		
	
		return "success";
	}


	public void setTeachers(List users) {
		this.teachers = users;
	}


	public List getTeachers() {
		return teachers;
	}


}

