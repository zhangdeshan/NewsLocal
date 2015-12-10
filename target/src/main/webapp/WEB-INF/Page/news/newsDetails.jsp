<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%@ include file="/WEB-INF/Page/common/header.jsp"%>
    
    <title>详细</title>

  </head>
  
  <body>
   <s:iterator value="pageModel.list">   
   <s:property value="News_Title"/>
    <s:property value="News_Content" escape="false"/>
   </s:iterator>
  </body>
</html>
