package com.news.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.news.dao.UserDao;
import com.news.model.User;
import com.news.tools.DaoSupportImpl;

@Transactional
@Repository("userDao")
public class UserDaoImpl extends DaoSupportImpl<User> implements UserDao {

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public User userLogin(String User_Name, String User_Password) {

		if (User_Name != null && User_Password != null) {
			String where = "where User_Name=? and User_Password=?";
			Object[] queryParams = { User_Name, User_Password };
			List<User> list = find(-1, -1, where, queryParams).getList();
			if (list != null && list.size() > 0) {
				
				return list.get(0);
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public boolean isUnique(String User_Email) {
		
		if (User_Email != null) {
			String where = "where User_Email=?";
			Object[] queryParams = { User_Email };
			List<User> list = find(-1, -1, where, queryParams).getList();
			
			if (list != null &&list.size()>0) {
				return false;
				
			}
		}
		return true;
	}

}
