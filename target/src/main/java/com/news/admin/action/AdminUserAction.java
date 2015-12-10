package com.news.admin.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.admin.model.AdminUser;
import com.news.tools.BaseAction;

@Scope("prototype")
@Controller("adminUserAction")
public class AdminUserAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 后台登陆跳转
	public String adminLoginJump() {

		return "adminLoginJump";
	}

	// 进入后台

	public String adminIndex() {

		return "adminIndex";
	}

	// 后台登陆方法
	public String adminLogin() {

		AdminUser adminLoginUser = adminUserDao.adminLogin(
				adminUser.getAdmin_Name(), adminUser.getAdmin_Password());

		if (adminLoginUser != null) {

			session.put("adminUser", adminLoginUser);
			return "AdminLoginSuccess";
		}

		return "AdminLoginFied";
	}

	public AdminUser getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(AdminUser adminUser) {
		this.adminUser = adminUser;
	}

	private AdminUser adminUser = new AdminUser();

}
