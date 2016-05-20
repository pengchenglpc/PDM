package com.smis.test.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestVo")  
public class TestVo {
	private String userName;
	private String nickName;
	private String photo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
