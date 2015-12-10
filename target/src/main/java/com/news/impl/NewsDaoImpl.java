package com.news.impl;

import org.springframework.stereotype.Repository;

import com.news.dao.NewsDao;
import com.news.model.News;
import com.news.tools.DaoSupportImpl;

@Repository("newsDao")
public class NewsDaoImpl extends DaoSupportImpl<News> implements NewsDao {

}
