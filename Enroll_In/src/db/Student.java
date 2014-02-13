package db;

import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sid, String sname, String spw) {
		super(sid, sname, spw);
	}

	/** full constructor */
	public Student(String sid, String sname, String spw, Set scs) {
		super(sid, sname, spw, scs);
	}

}
