package com.webproject.foodDelivery.dto;

import java.util.Date;

public class LoginVO {
	private int id;   /* 아이디 */
	private String name; /* 이름 */
	private String email; /* 이메일 */
	private String password; /* 비밀번호 */
	private String fail_password; /* 비밀번호 실패*/
	private String age; /* 나이 */
	private String gender; /* 성별 */
	private Date creDate; /* 생성날짜 */
	private Date lastDate; /* 생성날짜 */
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFail_password() {
		return fail_password;
	}
	public void setFail_password(String fail_password) {
		this.fail_password = fail_password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getCreDate() {
		return creDate;
	}
	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	
		
}
