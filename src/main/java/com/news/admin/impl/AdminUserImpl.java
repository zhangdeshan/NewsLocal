package com.news.admin.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.news.admin.dao.AdminUserDao;
import com.news.admin.model.AdminUser;

import com.news.tools.DaoSupportImpl;

@Repository("adminUserDao")
public class AdminUserImpl extends DaoSupportImpl<AdminUser> implements
		AdminUserDao {

	@Override
	public AdminUser adminLogin(String Admin_Name, String Admin_Password) {
		// TODO Auto-generated method stub

		if (Admin_Name != null && Admin_Password != null) {
			String where = "where Admin_Name=? and Admin_Password=?";
			Object[] queryParams = { Admin_Name, Admin_Password };
			List<AdminUser> list = find(-1, -1, where, queryParams).getList();
			if (list != null && list.size() > 0) {

				return list.get(0);
			}
		}
		return null;

	}

	@Override
	public boolean isAdminUnique(String Admin_name) {
		// TODO Auto-generated method stub
		return false;
	}
}
