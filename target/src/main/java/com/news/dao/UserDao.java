package com.news.dao;

import com.news.model.User;
import com.news.tools.DaoSupport;

public interface UserDao extends DaoSupport<User> {
	public User userLogin(String User_Name, String User_Password);

	public boolean isUnique(String User_Email);

}
