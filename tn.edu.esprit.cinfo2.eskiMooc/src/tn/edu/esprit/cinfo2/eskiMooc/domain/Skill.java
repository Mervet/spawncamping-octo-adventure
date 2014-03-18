package tn.edu.esprit.cinfo2.eskiMooc.domain;

import java.io.Serializable;

public class Skill implements Serializable {

	private int id;
	private String label;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Skill() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
