<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%@ include file="/WEB-INF/Page/common/header.jsp"%>
    
    <title>新闻列表</title>
   

  </head>
  
  <body>
   <s:iterator value="pageModel.list"> 
   
  	<s:a action="NewsOne_findNewsById" namespace="/NewsOne">   
  	<s:param name="news.News_Id" > <s:property value="News_Id" /></s:param>
            <s:property value="News_Title" escape="false"/>
   </s:a>
   
   </s:iterator>
  </body>
</html>
