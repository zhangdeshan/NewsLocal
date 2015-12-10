package com.news.action;


import java.util.Date;
import java.util.HashMap;

import java.util.Map;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.model.Address;
import com.news.model.Category;
import com.news.model.News;
import com.news.tools.BaseAction;
import com.news.tools.PageModel;

/**
 * @author zhangdeshan
 * 
 * **/
@Scope("prototype")
@Controller("newsAction")
public class NewsAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 跳转到添加内容页面
	public String addNewsJump() {
		
		categoryTree();	
		
		creatNewTree();
		
		return "addNewsJump";
	}
	// 添加新闻

	public String addNews() {

		news.setNews_UserId(getUserLogin());
		news.setNews_AddressId(address);
		news.setNews_CategoryId(category);
		news.setNews_Time(new Date());
		newsDao.save(news);
		return "saveNewsSuccess";
	}

	public String newsListJump() {

		pageModel = newsDao.find(pageNo, pageSize);

		return "newsListJump";
	}

	
	public String findNewsById() {
		// 增加浏览量
		news = newsDao.get(news.getNews_Id());
		news.setNews_ClickCount(news.getNews_ClickCount() + 1);
		newsDao.update(news);

		String where = "where News_Id=?";
		Object[] queryParams = { news.getNews_Id() };
		if (news.getNews_Id() != null) {
			pageModel = newsDao.find(pageNo, pageSize, where, queryParams);
			// System.out.print(pageModel.getList(news));

		}

		return "NewsDetails";
	}

	
	



	public String findByCommend() {

		String where = "where News_Commend=?";
		Object[] queryParams = { 1 };
		pageModel = newsDao.find(pageNo, pageSize, where, queryParams);

		return "hotNewsList";
	}
	
	

	// 新闻列表(按照时间查询)
	public String findNewsByTime() {

		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("News_Time", "desc");
		pageModel = newsDao.find(1, 5, orderby);

		return null;
	}

	// 新闻列表(按照用户查询)
	public String findNewsByUserId() {
		if (news.getNews_UserId().getUser_Id() != null) {
			String where = "where user.User_Id=?";
			Object[] queryParams = { news.getNews_UserId().getUser_Id() };
			pageModel = newsDao.find(pageNo, pageSize, where, queryParams);
		}

		return null;
	}

	// 新闻列表(按照类别查询)

	public String findNewsByCategory() {

		return null;
	}

	// 新闻列表(按照浏览次数查询)
	public String findNewsByScan() {

		return null;
	}

	// 新闻列表(根据评论进行查询)
	public String findNewsByComments() {

		return null;
	}

	// 新聞列表(根据用户习惯进行推送)
	public String findNewsByUserLike() {

		return null;
	}

	// 删除新闻
	public String delectNews() {

		return null;
	}

	// 编辑新闻

	private PageModel<News> pageModel = new PageModel<News>();

	private Address address = new Address();

	private Category category = new Category();
	private News news = new News();
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public PageModel<News> getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel<News> pageModel) {
		this.pageModel = pageModel;
	}

	public String editNews() {
		return null;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

}
