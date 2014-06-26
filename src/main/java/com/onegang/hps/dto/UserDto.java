package com.onegang.hps.dto;

public class UserDto extends AbstractDto {

	private String userid;
	private String fbid;
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getFbid() {
		return fbid;
	}
	
	public void setFbid(String fbid) {
		this.fbid = fbid;
	}
	
}
