package student_interface;

import java.util.ArrayList;

import db.Course;
import db.Student;
import db.Teacher;

public interface teacher_interface {
	public boolean login (String id,String pw) throws Exception;
	public boolean change_PW (Teacher teacher,String new_pw) throws Exception;
	public boolean typeInInfo(Course course,String descripe);
	public ArrayList<Course> courseList(Teacher teacher);
	public ArrayList<Student> studentList(Course course);
}
