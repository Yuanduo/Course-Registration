package action;

import java.util.Map;

import student_impl.teacher_impl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.Course;
import db.CourseDAO;
import db.Teacher;
import db.TeacherDAO;

public class describAction extends ActionSupport {
private String discription;


public String getDiscription() {
	return discription;
}

public void setDiscription(String discription) {
	this.discription = discription;
}
public String execute()throws Exception
	{   
		Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
		Course c = (Course)session.get("editCourse");
	    String cid=c.getCid().toString();
		teacher_impl t_impl=new teacher_impl();
		Course course=new Course();
		CourseDAO coursedao=new CourseDAO();
		course=coursedao.findById(Integer.valueOf(cid));
		if(t_impl.typeInInfo(course, discription)){			
			return "success";
		}else
			return "fail";
	}
}
