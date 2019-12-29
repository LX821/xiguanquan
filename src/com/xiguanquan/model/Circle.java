package com.xiguanquan.model;

import java.util.Date;

/**
 * Circle entity. @author MyEclipse Persistence Tools
 */

public class Circle implements java.io.Serializable {

	// Fields

	private String circleid;
	private String usernid;
	private String CWord;
	private String CPicData;
	private Date CReleaseTime;
	private Integer CLikes;
	private String CComments;

	// Constructors

	/** default constructor */
	public Circle() {
	}

	/** minimal constructor */
	public Circle(String circleid) {
		this.circleid = circleid;
	}

	/** full constructor */
	public Circle(String circleid, String usernid, String CWord, String CPicData, Date CReleaseTime, Integer CLikes,
			String CComments) {
		this.circleid = circleid;
		this.usernid = usernid;
		this.CWord = CWord;
		this.CPicData = CPicData;
		this.CReleaseTime = CReleaseTime;
		this.CLikes = CLikes;
		this.CComments = CComments;
	}

	// Property accessors

	public String getCircleid() {
		return this.circleid;
	}

	public void setCircleid(String circleid) {
		this.circleid = circleid;
	}

	public String getUsernid() {
		return this.usernid;
	}

	public void setUsernid(String usernid) {
		this.usernid = usernid;
	}

	public String getCWord() {
		return this.CWord;
	}

	public void setCWord(String CWord) {
		this.CWord = CWord;
	}

	public String getCPicData() {
		return this.CPicData;
	}

	public void setCPicData(String CPicData) {
		this.CPicData = CPicData;
	}

	public Date getCReleaseTime() {
		return this.CReleaseTime;
	}

	public void setCReleaseTime(Date CReleaseTime) {
		this.CReleaseTime = CReleaseTime;
	}

	public Integer getCLikes() {
		return this.CLikes;
	}

	public void setCLikes(Integer CLikes) {
		this.CLikes = CLikes;
	}

	public String getCComments() {
		return this.CComments;
	}

	public void setCComments(String CComments) {
		this.CComments = CComments;
	}

}