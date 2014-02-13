package db;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTeacher entity provides the base persistence definition of the
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTeacher implements java.io.Serializable {

	// Fields

	private String tid;
	private String tname;
	private String tpsw;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTeacher() {
	}

	/** minimal constructor */
	public AbstractTeacher(String tid, String tname, String tpsw) {
		this.tid = tid;
		this.tname = tname;
		this.tpsw = tpsw;
	}

	/** full constructor */
	public AbstractTeacher(String tid, String tname, String tpsw, Set courses) {
		this.tid = tid;
		this.tname = tname;
		this.tpsw = tpsw;
		this.courses = courses;
	}

	// Property accessors

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTpsw() {
		return this.tpsw;
	}

	public void setTpsw(String tpsw) {
		this.tpsw = tpsw;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}