package com.news.action;



import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.news.model.Address;
import com.news.model.User;
import com.news.tools.BaseAction;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author zhangdeshan
 * 
 * ***/

@Scope("prototype")
@Controller("userAction")
public class UserAction extends BaseAction implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	// 登录跳转
	public String loginJump() {

		return "LoginJump";
	}

	// 登录方法
	public String login() {

		User loginUser = userDao.userLogin(user.getUser_Name(),
				user.getUser_Password());

		if (loginUser != null) {
			session.put("user", loginUser);
		} else {
			addFieldError("login", "登录失败，请检查用户名和密码");

			return "LoginFail";
		}
		return "LoginSuccess";
	}

	// 退出登录

	public String loginOut() {
		if (session != null && session.size() > 0) {

			session.clear();
		}

		return "LoginOutSuccess";
	}

	// 注冊跳轉
	public String registerJump() {

		// createAddressTree();
		creatNewTree();
		return "RegisterJump";
	}

	// 注册方法
	public String register() {

		// 判断邮箱是不是已经被用过了
		boolean unique = userDao.isUnique(user.getUser_Email());
		

		if (unique ==true) {

			java.util.Date currentTime = new java.util.Date();// 得到当前系统时间
			
			user.setUser_Time(currentTime);
			
			user.setUser_Address(address);
			
			userDao.saveOrUpdate(user);
		} else {
			return "RegisterFail";

		}
		return "RegisterSuccess";
	}

	
	

	private User user = new User();
	private Address address = new Address();
	private Map<Integer, String> map;
	private List<String> list;
	
	

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
