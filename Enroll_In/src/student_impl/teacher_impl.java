package student_impl;

import java.util.ArrayList;

import db.Course;
import db.CourseDAO;
import db.Sc;
import db.ScDAO;
import db.ScId;
import db.Student;
import db.StudentDAO;
import db.Teacher;
import db.TeacherDAO;
import student_interface.teacher_interface;

public class teacher_impl implements teacher_interface {
	private StudentDAO studentdao;
	private CourseDAO coursedao;
	private ScDAO scdao;
	private TeacherDAO teacherdao;
	public teacher_impl()
	{
		studentdao=new StudentDAO();
		coursedao=new CourseDAO();
		scdao=new ScDAO();
		teacherdao=new TeacherDAO();
		
		
	}

	public boolean change_PW(Teacher teacher, String newPw) throws Exception {
		try{
		
		teacher=teacherdao.findById(teacher.getTid());
		teacher.setTpsw(newPw);
		teacherdao.save(teacher);
		
		}catch(RuntimeException re){
		return false;}
		return true;
		
	}

	public ArrayList<Course> courseList(Teacher teacher) {
		teacher=teacherdao.findById(teacher.getTid());
		ArrayList<Course> result=new ArrayList<Course>();
		ArrayList<Course> re=new ArrayList<Course>();
		
		re=(ArrayList<Course>)coursedao.findAll();
		for(int i=0;i<re.size();i++)
			if(re.get(i).getTeacher().getTid().equals(teacher.getTid()))
				result.add(re.get(i));
	
		return result;
	}

	public boolean login(String id,String pw) throws Exception
	{
		Teacher teacher=new Teacher();
		teacher.setTid("null");
		teacher=teacherdao.findById(id);
		if(teacher.getTid().equals("null")||!teacher.getTpsw().equals(pw))
		{ 
		  return false;}
		else 
		  return true;
		
		
	}

	public ArrayList<Student> studentList(Course course) {
		course=coursedao.findById(course.getCid());
		ArrayList<Student> result=new ArrayList<Student>();
	
		ArrayList<Sc>re=(ArrayList<Sc>)scdao.findAll();
		for(int i=0;i<re.size();i++)
			if(re.get(i).getId().getCourse().getCid().equals(course.getCid()))
			  result.add(re.get(i).getId().getStudent());
		return result;
				
	    
	}

	public boolean typeInInfo(Course course,String descripe)
	{
		 try{
			 course=coursedao.findById(course.getCid());
		
		 course.setCdescription(descripe);
		 coursedao.save(course);
		 }catch(Exception e){
			 return false;
		 }
		 return true;
	}



}
