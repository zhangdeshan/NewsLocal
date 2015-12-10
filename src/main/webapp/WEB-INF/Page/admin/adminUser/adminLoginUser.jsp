<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head> 
    <title>登录页面</title>   
  </head>
  
  <body>
  <%@ include file="/WEB-INF/Page/common/header.jsp"%>
   <h3>用户登录功能</h3>

	<s:form action="AdminUserLogin_adminLogin" namespace="/adminIndexOne"  method="post">
		<table>

			<tr>
				<td>会员名：</td>
				<td><s:textfield name="adminUser.Admin_Name" size="18"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>密 码</td>
				<td><s:password name="adminUser.Admin_Password" size="18"></s:password>
				</td>
			</tr>
			<tr>
				<td><s:submit value="登　录"></s:submit></td>
			</tr>

			<tr>
				<td><s:fielderror>
						<s:param>login</s:param>
					</s:fielderror></td>
			</tr>

		</table>
	</s:form>

  </body>
</html>
