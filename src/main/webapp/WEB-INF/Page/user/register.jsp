<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <body>
  <%@ include file="/WEB-INF/Page/common/header.jsp"%>
  <h3>用户注册</h3>
	<table>
		<s:form action="User_register" namespace="/User" method="get">
			<tr>
				<td>邮箱:</td>
				<td><s:textfield name="user.User_Email"></s:textfield></td>
				<td><s:fielderror>
						<s:param>User_Email</s:param>
					</s:fielderror></td>
			</tr>
			<tr>
				<td>用户名:</td>
				<td><s:textfield name="user.User_Name"></s:textfield></td>
				<td><s:fielderror>
						<s:param>User_Name</s:param>
					</s:fielderror></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><s:textfield name="user.User_Password"></s:textfield></td>
				<td><s:fielderror>
						<s:param>User_Password</s:param>
					</s:fielderror></td>
			</tr>
			
			<tr>
			<td>地址</td>
			<td>			
			<s:doubleselect  theme="simple"  list="allAddress"  name="Address_Id"  listKey="Address_Id"  listValue="Address_Name"  doubleList="maping.get(top)"  doubleName="address.Address_Id"   doubleListKey="Address_Id"  doubleListValue="Address_Name"/>
			</td>
			<td>
			  <s:fielderror>
			   <s:param></s:param>
			  </s:fielderror>
			</td>
			</tr>
			
			<tr>
				<s:submit value="提交" />
			</tr>
		</s:form>

	</table>
	
<style type="text/css">
.doubleselect br{
 display:none; 
}

</style>	
  </body>
</html>
