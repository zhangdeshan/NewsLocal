package com.news.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer User_Id;
	private String User_Name;
	private String User_Password;
	private String User_Email;
	private String User_Phone;
	private Date User_Time;
	private Address User_Address;

	public Date getUser_Time() {
		return User_Time;
	}

	public void setUser_Time(Date user_Time) {
		User_Time = user_Time;
	}

	public Address getUser_Address() {
		return User_Address;
	}

	public void setUser_Address(Address user_Address) {
		User_Address = user_Address;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public String getUser_Phone() {
		return User_Phone;
	}

	public void setUser_Phone(String user_Phone) {
		User_Phone = user_Phone;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public Integer getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(Integer user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

}
