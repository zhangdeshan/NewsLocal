package com.news.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.news.admin.dao.AdminUserDao;
import com.news.dao.AddressDao;
import com.news.dao.CategoryDao;
import com.news.dao.NewsDao;
import com.news.dao.UserDao;
import com.news.model.Address;
import com.news.model.Category;
import com.news.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author zhangdeshan
 * **/
public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {
	private static final long serialVersionUID = 1L;

	protected int pageNo = 1;
	protected int pageSize = 10;

	// 从Dao注入
	@Autowired
	protected UserDao userDao;
	@Autowired
	protected AddressDao addressDao;
	@Autowired
	protected NewsDao newsDao;
	@Autowired
	protected CategoryDao categoryDao;
	@Autowired
	protected AdminUserDao adminUserDao;

	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;

	public User getUserLogin() {
		if (session.get("user") != null) {

			return (User) session.get("user");
		}

		return null;
	}

	public String index() {

		return "index";
	}

	// 类别树形图

	public void categoryTree() {

		String where = "where Category_Level=1";
		PageModel<Category> pageModel = categoryDao.find(-1, -1, where, null);
		allCategory = pageModel.getList();
		map = new HashMap();
		for (Category category : allCategory) {

			List zi = new ArrayList();
			Set<Category> children = category.getChildren();
			if (children != null && children.size() > 0) {
				for (Category child : children) {

					zi.add(child);
				}

			}

			map.put(category, zi);
		}

	}
	
	// 地址的树形

		public void creatNewTree() {

			String where = "where Address_Level=1";

			PageModel<Address> pageModel = addressDao.find(-1, -1, where, null);

			allAddress = pageModel.getList();
			maping = new HashMap();

			for (Address address : allAddress) {
				// setNodeMap(map, address, false);
				List li = new ArrayList();

				Set<Address> children = address.getChildren();

				if (children != null && children.size() > 0) {
					for (Address child : children) {

						li.add(child);
					}
				}
				maping.put(address, li);
			}

		}

	
	
   
	private Map<Category, List> map;

	private List<Category> allCategory;
    
	private Map<Address, List> maping;
	
	private List<Address> allAddress;
	
	public Map<Address, List> getMaping() {
		return maping;
	}

	public void setMaping(Map<Address, List> maping) {
		this.maping = maping;
	}

	public List<Address> getAllAddress() {
		return allAddress;
	}

	public void setAllAddress(List<Address> allAddress) {
		this.allAddress = allAddress;
	}





	
	public Map<Category, List> getMap() {
		return map;
	}

	public void setMap(Map<Category, List> map) {
		this.map = map;
	}

	public List<Category> getAllCategory() {
		return allCategory;
	}

	public void setAllCategory(List<Category> allCategory) {
		this.allCategory = allCategory;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getApplication() {
		return application;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
