package com.xiguanquan.model;

/**
 * Habit entity. @author MyEclipse Persistence Tools
 */

public class Habit implements java.io.Serializable {

	// Fields

	private String habitid;
	private String usernid;
	private String HName;
	private Integer HClockinnum;

	// Constructors

	/** default constructor */
	public Habit() {
	}

	/** minimal constructor */
	public Habit(String habitid) {
		this.habitid = habitid;
	}

	/** full constructor */
	public Habit(String habitid, String usernid, String HName, Integer HClockinnum) {
		this.habitid = habitid;
		this.usernid = usernid;
		this.HName = HName;
		this.HClockinnum = HClockinnum;
	}

	// Property accessors

	public String getHabitid() {
		return this.habitid;
	}

	public void setHabitid(String habitid) {
		this.habitid = habitid;
	}

	public String getUsernid() {
		return this.usernid;
	}

	public void setUsernid(String usernid) {
		this.usernid = usernid;
	}

	public String getHName() {
		return this.HName;
	}

	public void setHName(String HName) {
		this.HName = HName;
	}

	public Integer getHClockinnum() {
		return this.HClockinnum;
	}

	public void setHClockinnum(Integer HClockinnum) {
		this.HClockinnum = HClockinnum;
	}

}