package com.news.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.news.dao.CategoryDao;
import com.news.model.Category;
import com.news.tools.DaoSupportImpl;

@Transactional
@Repository("categoryDao")
public class CategoryDaoImpl extends DaoSupportImpl<Category> implements CategoryDao{

}
