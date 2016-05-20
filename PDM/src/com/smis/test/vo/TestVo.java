package com.smis.test.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestVo")  
public class TestVo {
	private String name;
	private Integer age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
