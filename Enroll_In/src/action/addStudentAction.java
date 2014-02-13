package action;

import java.util.List;

import student_impl.admin_impl;

import db.Student;

public class addStudentAction {
	private List students = new AutoArrayList(Student.class,5);
	
	public String execute() throws Exception{
		Student student;
		admin_impl a_impl=new admin_impl();
		for (int i=0; i<students.size();i++)      
		{   
			
			student = (Student)students.get(i);  
			System.out.println(student.getSid());
			System.out.println(student.getSpw());
			System.out.println(student.getSname());
		    a_impl.createStudent(student);
		    
		    
		  
		}      		
	
		return "success";
	}


	public void setStudents(List users) {
		this.students = users;
	}


	public List getStudents() {
		return students;
	}


}
