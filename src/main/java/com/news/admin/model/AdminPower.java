package com.news.admin.model;

public class AdminPower {

	private Integer Power_Id;
	private AdminUser Admin_Id;
	private AdminPowerGroup PowerGroup_Id;

	public Integer getPower_Id() {
		return Power_Id;
	}

	public void setPower_Id(Integer power_Id) {
		Power_Id = power_Id;
	}

	public AdminUser getAdmin_Id() {
		return Admin_Id;
	}

	public void setAdmin_Id(AdminUser admin_Id) {
		Admin_Id = admin_Id;
	}

	public AdminPowerGroup getPowerGroup_Id() {
		return PowerGroup_Id;
	}

	public void setPowerGroup_Id(AdminPowerGroup powerGroup_Id) {
		PowerGroup_Id = powerGroup_Id;
	}

}
