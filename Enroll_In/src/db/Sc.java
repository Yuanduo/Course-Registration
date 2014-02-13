package db;

/**
 * Sc entity. @author MyEclipse Persistence Tools
 */
public class Sc extends AbstractSc implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sc() {
	}

	/** minimal constructor */
	public Sc(ScId id, String time) {
		super(id, time);
	}

	/** full constructor */
	public Sc(ScId id, String time, String state) {
		super(id, time, state);
	}

}
