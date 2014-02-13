package db;

import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
public class Teacher extends AbstractTeacher implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String tid, String tname, String tpsw) {
		super(tid, tname, tpsw);
	}

	/** full constructor */
	public Teacher(String tid, String tname, String tpsw, Set courses) {
		super(tid, tname, tpsw, courses);
	}

}
