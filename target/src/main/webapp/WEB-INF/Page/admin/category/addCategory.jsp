<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>添加类别</title>   
  </head>
  <body>
  <%@ include file="/WEB-INF/Page/common/header.jsp"%>
   <h3>添加类别</h3>
	<s:form action="Category_addCategory" namespace="/Category" method="post">
		<s:hidden name="Category_Pids"></s:hidden>
		<s:hidden name="Category_Level"></s:hidden>
		<s:textfield name="Category_Name"></s:textfield>
		<s:submit value="提交类别"></s:submit>
	</s:form>
<h3>查看所有地址</h3>

  </body>
</html>
