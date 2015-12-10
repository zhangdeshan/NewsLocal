package com.news.tools;

import java.io.Serializable;
import java.util.Map;



/**
 * @author zhangdeshan
 *  
 * 
 * 
 * */

public interface DaoSupport<T> {

	public void save(Object obj);

	public void saveOrUpdate(Object obj);

	public void update(Object obj);

	public void delete(Serializable... ids);

	public T get(Serializable entityId);

	public T load(Serializable entityId);

	public Object uniqueResult(String hql, Object[] queryParams);

	public long getCount();

	public PageModel<T> find(int pageNo, int maxResult);

	public PageModel<T> find(int pageNo, int maxResult, String where,
			Object[] queryParams);

	public PageModel<T> find(int pageNo, int maxResult,
			Map<String, String> orderby);

	public PageModel<T> find(String where, Object[] queryParams,
			Map<String, String> orderby, int pageNo, int maxResult);

}
