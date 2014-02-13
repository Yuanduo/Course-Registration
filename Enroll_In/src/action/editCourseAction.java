package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.Course;
import db.CourseDAO;

public class editCourseAction extends ActionSupport {
private String cid;

public String getCid() {
	return cid;
}

public void setCid(String cid) {
	this.cid = cid;
}
public String execute() throws Exception
{   
	Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
	Course course = new Course();
	CourseDAO coursedao = new CourseDAO();
	course = coursedao.findById(Integer.parseInt(cid));
	
	session.remove("editCourse");
	session.put("editCourse",course);

	return "success";
	
}
}