<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>首页</title>
</head>
<body>



	<%@ include file="/WEB-INF/Page/common/header.jsp"%>


	<s:action name="NewsOne_findByCommend" namespace="/NewsOne"
		executeResult="true"></s:action>


   


	<%@ include file="/WEB-INF/Page/common/footer.jsp"%>




</body>
</html>