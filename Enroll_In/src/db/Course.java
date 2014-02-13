package db;

import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
public class Course extends AbstractCourse implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(Integer cid, Teacher teacher, String cname) {
		super(cid, teacher, cname);
	}

	/** full constructor */
	public Course(Integer cid, Teacher teacher, String cname,
			String cdescription, Set scs) {
		super(cid, teacher, cname, cdescription, scs);
	}

}
