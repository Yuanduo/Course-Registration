package action;

import java.util.ArrayList;
import java.util.Map;

import student_impl.teacher_impl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.Course;
import db.CourseDAO;
import db.Student;

public class t_reg_courseAction extends ActionSupport{

private String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
public String execute() throws Exception
{
	try
	{CourseDAO coursedao=new CourseDAO();
	Course course=new Course();
	course=coursedao.findById(Integer.valueOf(id));
	teacher_impl t_impl=new teacher_impl();
	ArrayList<Student> result=new ArrayList<Student>();
	result=t_impl.studentList(course);
	Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);   
    session.remove("coursename");
    session.remove("student_Course");
	session.put("coursename",course.getCname());
	session.put("student_Courses",result);
	}catch(Exception e)
	{return "fail";}
	
	
	return "success";
	
}
}
