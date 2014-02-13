package student_impl;

import db.Admin;
import db.AdminDAO;
import db.Course;
import db.CourseDAO;
import db.ScDAO;
import db.Student;
import db.StudentDAO;
import db.Teacher;
import db.TeacherDAO;
import student_interface.admin_interface;

public class admin_impl implements admin_interface {
    private CourseDAO coursedao;
	private TeacherDAO teacherdao;
	private StudentDAO studentdao;
	private ScDAO scdao;
	private AdminDAO admindao;
	
	
	public admin_impl()
	{
		coursedao=new CourseDAO();
		teacherdao=new TeacherDAO();
		studentdao=new StudentDAO();
		scdao=new ScDAO();
		admindao=new AdminDAO();
	}
	public boolean createCourse(Course course) {
		try{
			coursedao.save(course);
		   }catch(Exception e){
		return false;}
		   return true;
	}

	public boolean createStudent(Student student) {
		try{
			studentdao.save(student);
		   }catch(Exception e){
		return false;}
		   return true;
	}

	public boolean createTeacher(Teacher teacher) {
		try{
			teacherdao.save(teacher);
		   }catch(Exception e){
		return false;}
		   return true;
	}
   
	
	
	public boolean login(String id,String pw) throws Exception
	{
		Admin admin=new Admin();
		admin.setAid("null");
		admin=admindao.findById(id);
		if(admin.getAid().equals("null")||!admin.getPsw().equals(pw))
		  return false;
		else 
		  return true;
	}
	
	
	public boolean change_PW(Admin admin, String newPw) throws Exception {
		try{
		
		admin=admindao.findById(admin.getAid());
		admin.setPsw(newPw);
		admindao.save(admin);
		
		}catch(RuntimeException re){
		return false;}
		return true;
		
	}


}
