<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:iterator value="pageModel.list">

<s:a action="NewsOne_findNewsById" namespace="/NewsOne">   
  	<s:param name="news.News_Id" > <s:property value="News_Id" /></s:param>
	<s:property value="News_Title" />
</s:a>


</s:iterator>
