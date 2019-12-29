package com.xiguanquan.model;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String usernid;
	private String userName;
	private String nickname;
	private String occupation;
	private String careUserid;
	private String careCircleid;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String usernid) {
		this.usernid = usernid;
	}

	/** full constructor */
	public Users(String usernid, String userName, String nickname, String occupation, String careUserid,
			String careCircleid) {
		this.usernid = usernid;
		this.userName = userName;
		this.nickname = nickname;
		this.occupation = occupation;
		this.careUserid = careUserid;
		this.careCircleid = careCircleid;
	}

	// Property accessors

	public String getUsernid() {
		return this.usernid;
	}

	public void setUsernid(String usernid) {
		this.usernid = usernid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCareUserid() {
		return this.careUserid;
	}

	public void setCareUserid(String careUserid) {
		this.careUserid = careUserid;
	}

	public String getCareCircleid() {
		return this.careCircleid;
	}

	public void setCareCircleid(String careCircleid) {
		this.careCircleid = careCircleid;
	}

}