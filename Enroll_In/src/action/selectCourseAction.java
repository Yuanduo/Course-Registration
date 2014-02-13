package action;

import java.util.ArrayList;
import java.util.Map;

import student_impl.student_impl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.Course;
import db.CourseDAO;
import db.Student;
import db.StudentDAO;

public class selectCourseAction extends ActionSupport{
private String student;
private String course;

public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}

public String execute()throws Exception
{   
	Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);   
	CourseDAO coursedao=new CourseDAO();
	student_impl stu=new student_impl();
	Student s=new Student();
	StudentDAO studentdao=new StudentDAO();
	s=studentdao.findById(student);
	Course c=new Course();
	c=coursedao.findById(Integer.valueOf(course));
	if(stu.select_course(s, c)){
		ArrayList<Course> stuNo =  (ArrayList<Course>) session.get("chosenCourse");
		stuNo.add(c);
		session.put("chosenCourse", stuNo);
		return "true";
	}else
		return "false";
	}
}
