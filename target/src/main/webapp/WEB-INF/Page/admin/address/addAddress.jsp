<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加地址</title>
</head>
<body>
<%@ include file="/WEB-INF/Page/common/header.jsp"%>
   <h3>添加地址</h3>
	<s:form action="Address_addressSave" namespace="/Address">
		<s:hidden name="Address_Pids"></s:hidden>
		<s:hidden name="Address_Level"></s:hidden>
		<s:textfield name="Address_Name"></s:textfield>
		<s:submit value="提交地址"></s:submit>
	</s:form>
  </body>
</html>
