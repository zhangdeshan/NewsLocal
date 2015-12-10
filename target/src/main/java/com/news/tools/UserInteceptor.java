package com.news.tools;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/**
 * @author zhangdeshan
 * */

public class UserInteceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		ActionContext context = invocation.getInvocationContext();
		Map<String, Object> session = context.getSession();
		
		if(session.get("user")!=null){
			
			return invocation.invoke();
			
		}
		return "userLogin";
	}
	
	
	

}
