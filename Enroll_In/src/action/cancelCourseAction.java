package action;

import java.util.ArrayList;
import java.util.Map;

import student_impl.student_impl;

import com.opensymphony.xwork2.ActionContext;

import db.Course;
import db.CourseDAO;
import db.Student;
import db.StudentDAO;

public class cancelCourseAction {

	private String student;
	private String course;
	
	public String execute()throws Exception
	{   
		Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);   
		CourseDAO coursedao=new CourseDAO();
		student_impl stu=new student_impl();
		Student s=new Student();
		StudentDAO studentdao=new StudentDAO();
		s=studentdao.findById(student);
		Course c=new Course();
		c=coursedao.findById(Integer.parseInt(course));
		System.out.println(c.getTeacher().getTname());
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		if(stu.cancel_course(s, c)){
			ArrayList<Course> stuNo =  (ArrayList<Course>) session.get("chosenCourse");
			stuNo.remove(c);
			session.remove("chosenCourse");
			session.put("chosenCourse", stuNo);
			return "success";
		}else
			return "fail";
		}
	
	public void setStudent(String student) {
		this.student = student;
	}
	public String getStudent() {
		return student;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
}
