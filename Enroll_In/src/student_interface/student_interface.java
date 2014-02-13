package student_interface;

import java.util.ArrayList;

import db.Course;
import db.Student;

public interface student_interface {
	
	public boolean login (String username,String password) throws Exception;
	public ArrayList<Course> myCourseInfo (Student student) throws Exception;
	public boolean change_PW (Student student,String new_pw) throws Exception;
	public boolean select_course (Student student, Course course) throws Exception;
	public boolean cancel_course(Student student, Course course) throws Exception;

}
