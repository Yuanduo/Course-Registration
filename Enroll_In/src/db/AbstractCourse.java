package db;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCourse entity provides the base persistence definition of the Course
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCourse implements java.io.Serializable {

	// Fields

	private Integer cid;
	private Teacher teacher;
	private String cname;
	private String cdescription;
	private Set scs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCourse() {
	}

	/** minimal constructor */
	public AbstractCourse(Integer cid, Teacher teacher, String cname) {
		this.cid = cid;
		this.teacher = teacher;
		this.cname = cname;
	}

	/** full constructor */
	public AbstractCourse(Integer cid, Teacher teacher, String cname,
			String cdescription, Set scs) {
		this.cid = cid;
		this.teacher = teacher;
		this.cname = cname;
		this.cdescription = cdescription;
		this.scs = scs;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdescription() {
		return this.cdescription;
	}

	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}

	public Set getScs() {
		return this.scs;
	}

	public void setScs(Set scs) {
		this.scs = scs;
	}

}