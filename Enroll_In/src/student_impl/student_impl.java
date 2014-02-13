package student_impl;

import java.util.ArrayList;
import java.util.Map;

import javax.jms.Session;
import javax.transaction.Transaction;

import com.opensymphony.xwork2.ActionContext;

import db.Course;
import db.CourseDAO;
import db.HibernateSessionFactory;
import db.Sc;
import db.ScDAO;
import db.ScId;
import db.Student;
import db.StudentDAO;
import student_interface.student_interface;

public class student_impl implements student_interface {
	private StudentDAO studentdao;
	private CourseDAO coursedao;
	private ScDAO selectdao;
	
	public student_impl()
	{
		studentdao=new StudentDAO();
		coursedao=new CourseDAO();
		selectdao=new ScDAO();
		
		
	}
	public boolean change_PW(Student student, String newPw) throws Exception {
		try{StudentDAO studentdao=new StudentDAO();
		student=studentdao.findById(student.getSid());
		student.setSpw(newPw);
		studentdao.save(student);
		
		}catch(RuntimeException re){
		return false;}
		return true;
	}

	public boolean login(String username,String password) throws Exception {
		Student student=new Student();
		student.setSid(username);
		student.setSpw(password);
		System.out.println(student.getSid());
		System.out.println(student.getSpw());
		Student student_inlist = new Student();
    	ArrayList list=new ArrayList();
    	org.hibernate.Session session= HibernateSessionFactory.getSession();
    	org.hibernate.Transaction tx=session.beginTransaction();
    	String Queryname = "select s.* from student s where s.sid like '"+student.getSid()+"'";
        list = (ArrayList) session.createSQLQuery(Queryname).addEntity("s",Student.class).list();
        if(list.size()==1){
        	student_inlist = (Student) list.get(0);
        	if(student_inlist.getSpw().equals(student.getSpw())){
				return true;        		
        	}
        }
    	tx.commit();
    	session.close();
		return false;

	}

	public ArrayList<Course> myCourseInfo(Student student) throws Exception {
		ArrayList<Course> result=new ArrayList<Course>();
		try{
		student=studentdao.findById(student.getSid());
		ArrayList<Sc> re=new ArrayList<Sc>();
		ScId r=new ScId();
		r.setStudent(student);
		Sc t=new Sc();
		t.setId(r);
		re=(ArrayList<Sc>) selectdao.findByExample(t);

		for(int i=0;i<re.size();i++)
		{	System.out.println(re.get(i).getId().getCourse().getCname());
			result.add(re.get(i).getId().getCourse());
		}	
	}catch(RuntimeException re){
		return null;}
	return result;
	}
	
	
	public boolean select_course(Student student, Course course)
			throws Exception {
        Sc select=new Sc();
        ScId selectId=new ScId();
        try{
        	student=studentdao.findById(student.getSid());
        	course=coursedao.findById(course.getCid());
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	selectId.setCourse(course);
        	selectId.setStudent(student);
        	select.setId(selectId);
        	select.setTime("2012");
        	selectdao.save(select);}catch(RuntimeException re){
            System.out.println("Ñ¡¿ÎÊ§°Ü");
        	return false;
        	}
	  return true;
	}
	public boolean cancel_course(Student student, Course course)
			throws Exception {
		Sc sc= new Sc();
        ScId scId=new ScId();
		
        try{
        	student=studentdao.findById(student.getSid());
        	course=coursedao.findById(course.getCid());
        	scId.setCourse(course);
        	scId.setStudent(student);

        	ScDAO scdao=new ScDAO();
        	sc=scdao.findById(scId);
        	System.out.println(sc.getId().getStudent().getSname());
        	System.out.println(sc.getId().getCourse().getCid());
        	selectdao.delete(sc);
        	}catch(RuntimeException re){
        		return false;
        	}
		return true;
	}
	

}
