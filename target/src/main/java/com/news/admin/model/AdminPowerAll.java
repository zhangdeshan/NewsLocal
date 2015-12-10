package com.news.admin.model;

public class AdminPowerAll {

	private Integer PowerAll_Id;
	private String PowerAll_Name;
	private String PowerAll_Url;
	private AdminPowerGroup PowerGroup_Id;

	public Integer getPowerAll_Id() {
		return PowerAll_Id;
	}

	public void setPowerAll_Id(Integer powerAll_Id) {
		PowerAll_Id = powerAll_Id;
	}

	public String getPowerAll_Name() {
		return PowerAll_Name;
	}

	public void setPowerAll_Name(String powerAll_Name) {
		PowerAll_Name = powerAll_Name;
	}

	public String getPowerAll_Url() {
		return PowerAll_Url;
	}

	public void setPowerAll_Url(String powerAll_Url) {
		PowerAll_Url = powerAll_Url;
	}

	public AdminPowerGroup getPowerGroup_Id() {
		return PowerGroup_Id;
	}

	public void setPowerGroup_Id(AdminPowerGroup powerGroup_Id) {
		PowerGroup_Id = powerGroup_Id;
	}

}
