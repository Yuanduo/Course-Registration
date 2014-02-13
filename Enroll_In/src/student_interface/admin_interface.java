package student_interface;

import db.Admin;
import db.Course;
import db.Student;
import db.Teacher;

public interface admin_interface {
public boolean createCourse(Course course);
public boolean createStudent(Student student);
public boolean createTeacher(Teacher teacher);
public boolean change_PW(Admin admin, String newPw) throws Exception;
public boolean login(String id,String pw) throws Exception;
}
