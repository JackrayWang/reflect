package com.tt.reflect;

public class TestBean {
	
	private String status = "Ëø¶¨";
	
	private String name;
	
	private String age;
	
	
	public TestBean() {
	}
	
	public TestBean(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "TestBean [name=" + name + ", age=" + age + "]";
	}
	
	

}
