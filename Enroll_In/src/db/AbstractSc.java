package db;

/**
 * AbstractSc entity provides the base persistence definition of the Sc entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSc implements java.io.Serializable {

	// Fields

	private ScId id;
	private String time;
	private String state;

	// Constructors

	/** default constructor */
	public AbstractSc() {
	}

	/** minimal constructor */
	public AbstractSc(ScId id, String time) {
		this.id = id;
		this.time = time;
	}

	/** full constructor */
	public AbstractSc(ScId id, String time, String state) {
		this.id = id;
		this.time = time;
		this.state = state;
	}

	// Property accessors

	public ScId getId() {
		return this.id;
	}

	public void setId(ScId id) {
		this.id = id;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}