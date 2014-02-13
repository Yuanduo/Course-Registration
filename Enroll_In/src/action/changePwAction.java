package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.Admin;
import db.AdminDAO;
import db.Student;
import db.StudentDAO;
import db.Teacher;
import db.TeacherDAO;
import student_impl.admin_impl;
import student_impl.student_impl;
import student_impl.teacher_impl;
public class changePwAction  extends ActionSupport {
private String oldpassword;
private String newpassword1;
private String newpassword2;
public String getOldpassword() {
	return oldpassword;
}
public void setOldpassword(String oldpassword) {
	this.oldpassword = oldpassword;
}
public String getNewpassword1() {
	return newpassword1;
}
public void setNewpassword1(String newpassword1) {
	this.newpassword1 = newpassword1;
}
public String getNewpassword2() {
	return newpassword2;
}
public void setNewpassword2(String newpassword2) {
	this.newpassword2 = newpassword2;
}

public String execute() throws Exception
{
	Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
	User user =(User)session.get("user");
	if(!user.getPsw().equals(oldpassword))
		return "fail";
	if(!newpassword1.equals(newpassword2))
		return "fail";
	if(user.getIdentity().equals("学生"))
	{
		student_impl s=new student_impl();
	    Student student=new Student();
	    StudentDAO studentdao=new StudentDAO();
		student=studentdao.findById(user.getUsername());
		if(s.change_PW(student, newpassword1))
			return "student";
		else
			return "fail";
	}
	else if(user.getIdentity().equals("教师"))
	{
		teacher_impl t_impl=new teacher_impl();
		Teacher teacher=new Teacher();
		TeacherDAO teacherdao=new TeacherDAO();
		teacher=teacherdao.findById(user.getUsername());
		if(t_impl.change_PW(teacher, newpassword1))
			return "teacher";
		else
			return "fail";
	}
	else 
	{
		admin_impl a_impl=new admin_impl();
		Admin admin=new Admin();
		AdminDAO admindao=new AdminDAO();
		admin=admindao.findById(user.getUsername());
		if(a_impl.change_PW(admin, newpassword1))
			return "admin";
		else
			return
			"fail";
	}
		
		
		
		
}



}
