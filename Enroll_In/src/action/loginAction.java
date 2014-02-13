/*package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import student_impl.student_impl;
import student_interface.student_interface;
import db.CourseDAO;
import db.Student;

public class loginAction extends ActionSupport {
private String user;
private String password;
public void setUser(String user)
{
	this.user=user;}
public String getUser()
{
	return user;}
public void setPassword(String password)
{
	this.password=password;}
public String getPassword()
{return password;
}


public String execute()throws Exception
{   
	Student student=new Student();
    student.setSid(user);
    student.setSpw(password);
    CourseDAO coursedao=new CourseDAO();
    
	student_interface stu=new student_impl();
	if(stu.login(student))
	{   Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);   
        session.put("studentname", user); 
        session.put("chosenCourse",stu.myCourseInfo(student));
    
        session.put("allCourse",coursedao.findAll());
       
		return "success";}
	else {
		return "fail";}
	}
}*/


package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import student_impl.admin_impl;
import student_impl.student_impl;
import student_impl.teacher_impl;
import student_interface.admin_interface;
import student_interface.student_interface;
import student_interface.teacher_interface;
import db.CourseDAO;
import db.Student;
import db.StudentDAO;
import db.Teacher;
import db.TeacherDAO;

public class loginAction extends ActionSupport {
private String username;
private String password;
private String identity;


public void setUsername(String username){
	this.username=username;
	}
public String getUsername(){
	return username;
}

public void setPassword(String password){
	this.password=password;
	}
public String getPassword(){
	return password;
}


public String execute()throws Exception
{  
	User user = new User();
	user.setUsername(username);
	user.setPsw(password);
	user.setIdentity(identity);
	Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
	session.put("user", user);
	if(user.getIdentity().equals("学生")){
		student_interface stu=new student_impl();
		if(stu.login(username,password))   
		{  
			session.put("user", user);
		    Student student=new Student();
		    StudentDAO studentdao=new StudentDAO();
		    student=studentdao.findById(username);
		    session.put("chosenCourse",stu.myCourseInfo(student));
		    
	        CourseDAO coursedao=new CourseDAO();
			session.put("allCourse",coursedao.findAll());
		    return "student";
		}
		else {
			System.out.println("fail");
			return "fail";
		}
	}
	else if(user.getIdentity().equals("教师")){
		teacher_interface tea = new teacher_impl();
		if(tea.login(username,password))
		{	
			session.put("user", user);
		    Teacher teacher=new Teacher();
		    TeacherDAO teacherdao=new TeacherDAO();
		    teacher=teacherdao.findById(username);
		    teacher_impl t_impl =new teacher_impl();
		   
		    session.put("teachCourse", t_impl.courseList(teacher));
			return "teacher";
		}
		else return "fail";
    }
	else if(user.getIdentity().equals("管理员")){
		admin_interface stu=new admin_impl();
    	if(stu.login(username,password))
    		return "admin";
    	else return "fail";
    	}
    else {
    	System.out.println("fail");
    	return "fail";}
}


public String getIdentity() {
	return identity;
}
public void setIdentity(String identity) {
	this.identity = identity;
}
}









