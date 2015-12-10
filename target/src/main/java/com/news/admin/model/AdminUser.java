package com.news.admin.model;

import java.util.Date;

public class AdminUser {

	private Integer Admin_Id;
	private String Admin_Name;
	private String Admin_Password;
	private Date Admin_Time;

	public Integer getAdmin_Id() {
		return Admin_Id;
	}

	public void setAdmin_Id(Integer admin_Id) {
		Admin_Id = admin_Id;
	}

	public String getAdmin_Name() {
		return Admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}

	public String getAdmin_Password() {
		return Admin_Password;
	}

	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}

	public Date getAdmin_Time() {
		return Admin_Time;
	}

	public void setAdmin_Time(Date admin_Time) {
		Admin_Time = admin_Time;
	}

}
