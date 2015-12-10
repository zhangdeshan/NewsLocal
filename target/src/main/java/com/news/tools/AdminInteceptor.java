package com.news.tools;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sun.tools.internal.ws.processor.model.Request;

public class AdminInteceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		Map<String, Object> session = context.getSession();

		if (session.get("adminUser") != null) {
			adminUser_Power();

			return invocation.invoke();

		}
		return "adminUserLogin";
	}

	public static void adminUser_Power() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String path = request.getRequestURI();
		System.out.print(path);

	}

}