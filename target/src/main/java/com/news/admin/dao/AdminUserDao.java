package com.news.admin.dao;

import com.news.admin.model.AdminUser;
import com.news.tools.DaoSupport;

public interface AdminUserDao extends DaoSupport<AdminUser> {

	public AdminUser adminLogin(String Admin_Name, String Admin_Password);

	public boolean isAdminUnique(String Admin_name);

}
