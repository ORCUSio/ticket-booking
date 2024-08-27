package com.example.demo.model;



import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class User {
    @Id
    private int uid; // Use private fields
    private String name;
    private int mobile;
    private String email;
    private String nationality;
    private String dob;
    private String registrationDate;
    private Date lastLogin;
    
    
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", nationality="
				+ nationality + ", dob=" + dob + ", registrationDate=" + registrationDate + ", lastLogin=" + lastLogin
				+ "]";
	}
	public User(int uid, String name, int mobile, String email, String nationality, String dob, String registrationDate,
			Date lastLogin) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.nationality = nationality;
		this.dob = dob;
		this.registrationDate = registrationDate;
		this.lastLogin = lastLogin;
		

	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

    


}
