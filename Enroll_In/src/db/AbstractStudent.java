package db;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private String sid;
	private String sname;
	private String spw;
	private Set scs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** minimal constructor */
	public AbstractStudent(String sid, String sname, String spw) {
		this.sid = sid;
		this.sname = sname;
		this.spw = spw;
	}

	/** full constructor */
	public AbstractStudent(String sid, String sname, String spw, Set scs) {
		this.sid = sid;
		this.sname = sname;
		this.spw = spw;
		this.scs = scs;
	}

	// Property accessors

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpw() {
		return this.spw;
	}

	public void setSpw(String spw) {
		this.spw = spw;
	}

	public Set getScs() {
		return this.scs;
	}

	public void setScs(Set scs) {
		this.scs = scs;
	}

}