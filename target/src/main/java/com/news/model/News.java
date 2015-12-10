package com.news.model;

import java.util.Date;

public class News {

	private Integer News_Id;
	private User News_UserId;
	private Category News_CategoryId;
	private String News_Title;
	private String News_Content;
	private Integer News_ClickCount;
	private Date News_Time;
	private Date News_Before_Time;
	private Address News_AddressId;
	private String News_Persion;
	
	
	
	
	
	

	public Integer getNews_ClickCount() {
		return News_ClickCount;
	}

	public void setNews_ClickCount(Integer news_ClickCount) {
		News_ClickCount = news_ClickCount;
	}

	public Date getNews_Before_Time() {
		return News_Before_Time;
	}

	public void setNews_Before_Time(Date news_Before_Time) {
		News_Before_Time = news_Before_Time;
	}

	public Address getNews_AddressId() {
		return News_AddressId;
	}

	public void setNews_AddressId(Address news_AddressId) {
		News_AddressId = news_AddressId;
	}

	public String getNews_Persion() {
		return News_Persion;
	}

	public void setNews_Persion(String news_Persion) {
		News_Persion = news_Persion;
	}

	public Category getNews_CategoryId() {
		return News_CategoryId;
	}

	public void setNews_CategoryId(Category news_CategoryId) {
		News_CategoryId = news_CategoryId;
	}

	public Integer getNews_Id() {
		return News_Id;
	}

	public void setNews_Id(Integer news_Id) {
		News_Id = news_Id;
	}

	public User getNews_UserId() {
		return News_UserId;
	}

	public void setNews_UserId(User news_UserId) {
		News_UserId = news_UserId;
	}

	public String getNews_Title() {
		return News_Title;
	}

	public void setNews_Title(String news_Title) {
		News_Title = news_Title;
	}

	public String getNews_Content() {
		return News_Content;
	}

	public void setNews_Content(String news_Content) {
		News_Content = news_Content;
	}

	public Date getNews_Time() {
		return News_Time;
	}

	public void setNews_Time(Date news_Time) {
		News_Time = news_Time;
	}

}
