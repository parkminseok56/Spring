package com.ezen.member.dto;

public class Student {

	private String SNum;
	private String SId;
	private String SPw;
	private String SName;
	private String SAge;
	private String SGender;
	private String SMajor;
	
	
	
	
	
	
	public Student(String sNum, String sId, String sPw, String sName, String sAge, String sGender, String sMajor) {
		super();
		this.SNum = sNum;
		this.SId = sId;
		this.SPw = sPw;
		this.SName = sName;
		this.SAge = sAge;
		this.SGender = sGender;
		this.SMajor = sMajor;
	}
	public String getSNum() {
		return SNum;
	}
	public void setSNum(String sNum) {
		SNum = sNum;
	}
	public String getSId() {
		return SId;
	}
	public void setSId(String sId) {
		SId = sId;
	}
	public String getSPw() {
		return SPw;
	}
	public void setSPw(String sPw) {
		SPw = sPw;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSAge() {
		return SAge;
	}
	public void setSAge(String sAge) {
		SAge = sAge;
	}
	public String getSGender() {
		return SGender;
	}
	public void setSGender(String sGender) {
		SGender = sGender;
	}
	public String getSMajor() {
		return SMajor;
	}
	public void setSMajor(String sMajor) {
		SMajor = sMajor;
	}
	
	
	
}
