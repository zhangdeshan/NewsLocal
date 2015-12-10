package com.news.model;

import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Category_Id;
	private String Category_Name;
	private Integer Category_Level =1;
	private Category parent;
	private Set<Category> children;

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public Set<Category> getChildren() {
		return children;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

	public Integer getCategory_Id() {
		return Category_Id;
	}

	public void setCategory_Id(Integer category_Id) {
		Category_Id = category_Id;
	}

	public String getCategory_Name() {
		return Category_Name;
	}

	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}

	public Integer getCategory_Level() {
		return Category_Level;
	}

	public void setCategory_Level(Integer category_Level) {
		Category_Level = category_Level;
	}

}
