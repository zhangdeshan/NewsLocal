package com.news.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.model.Category;
import com.news.tools.BaseAction;
import com.news.tools.PageModel;
import com.opensymphony.xwork2.ModelDriven;

/***
 * @author zhangdeshan
 * ***/
@Scope("prototype")
@Controller("categoryAction")
public class CategoryAction extends BaseAction implements ModelDriven<Category> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 添加类别跳转
	public String addCategoryJump() {

		if (Category_Pids != null && Category_Pids > 0) {

			Category parent = categoryDao.load(Category_Pids);

			category.setCategory_Level(parent.getCategory_Level() + 1);
		}

		return "addCategoryJump";
	}

	// 添加类别

	public String addCategory() {
		if (Category_Pids != null && Category_Pids > 0) {

			category.setParent(categoryDao.load(Category_Pids));
		}
        //category.setCategory_Name(Category_Name);
		categoryDao.saveOrUpdate(category);
		return listCategory();
	}

	// 删除类别

	public String delectCategory() {

		if (category.getCategory_Id() != null) {

			categoryDao.delete(category.getCategory_Id());
		}
		return listCategory();
	}

	// 类别列表
	public String listCategory() {
		Object[] params = null;
		String where;
		if (Category_Pids != null && Category_Pids > 0) {
			where = "where parent.Category_Id =?";
			params = new Integer[] { Category_Pids };
		} else {
			where = "where parent is null";
		}
		pageModel = categoryDao.find(pageNo, pageSize, where, params);

		return "listCategory";
	}

	private Category category = new Category();
	private PageModel<Category> pageModel = new PageModel<Category>();
	private Integer Category_Pids;
	private String Category_Name;

	public String getCategory_Name() {
		return Category_Name;
	}

	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}

	public Integer getCategory_Pids() {
		return Category_Pids;
	}

	public void setCategory_Pids(Integer category_Pids) {
		Category_Pids = category_Pids;
	}

	public PageModel<Category> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<Category> pageModel) {
		this.pageModel = pageModel;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public Category getModel() {
		// TODO Auto-generated method stub
		return category;
	}

}
