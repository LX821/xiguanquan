package com.xiguanquan.model;

import java.util.Date;

/**
 * Trend entity. @author MyEclipse Persistence Tools
 */

public class Trend implements java.io.Serializable {

	// Fields

	private String trendid;
	private String usernid;
	private String TWord;
	private String TPicData;
	private Date TReleaseTime;
	private Integer TLikes;
	private String TComments;

	// Constructors

	/** default constructor */
	public Trend() {
	}

	/** minimal constructor */
	public Trend(String trendid) {
		this.trendid = trendid;
	}

	/** full constructor */
	public Trend(String trendid, String usernid, String TWord, String TPicData, Date TReleaseTime, Integer TLikes,
			String TComments) {
		this.trendid = trendid;
		this.usernid = usernid;
		this.TWord = TWord;
		this.TPicData = TPicData;
		this.TReleaseTime = TReleaseTime;
		this.TLikes = TLikes;
		this.TComments = TComments;
	}

	// Property accessors

	public String getTrendid() {
		return this.trendid;
	}

	public void setTrendid(String trendid) {
		this.trendid = trendid;
	}

	public String getUsernid() {
		return this.usernid;
	}

	public void setUsernid(String usernid) {
		this.usernid = usernid;
	}

	public String getTWord() {
		return this.TWord;
	}

	public void setTWord(String TWord) {
		this.TWord = TWord;
	}

	public String getTPicData() {
		return this.TPicData;
	}

	public void setTPicData(String TPicData) {
		this.TPicData = TPicData;
	}

	public Date getTReleaseTime() {
		return this.TReleaseTime;
	}

	public void setTReleaseTime(Date TReleaseTime) {
		this.TReleaseTime = TReleaseTime;
	}

	public Integer getTLikes() {
		return this.TLikes;
	}

	public void setTLikes(Integer TLikes) {
		this.TLikes = TLikes;
	}

	public String getTComments() {
		return this.TComments;
	}

	public void setTComments(String TComments) {
		this.TComments = TComments;
	}

}