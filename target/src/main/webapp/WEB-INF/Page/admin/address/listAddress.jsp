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
   <table width="693" height="29" border="0">
	<s:iterator value="pageModel.list">
		<tr>
			<td><s:property value="Address_Id" /></td>
			<td><s:a action="Address_addressAdd" namespace="/Address">
					<s:param name="Address_Pids" value="Address_Id"></s:param>
					<s:property value="Address_Name" />
				</s:a>
			</td>
			<td><s:if test="children == null || children.isEmpty">
				没有子类别
			</s:if> <s:else>
					<s:a action="Address_addressList" namespace="/Address">
						<s:param name="Address_Pids" value="Address_Id"></s:param>
					有<s:property value="children.size" />个子类别
				</s:a>
				</s:else>
			</td>
			<td><s:a action="Address_addressAdd" namespace="/Address">
					<s:param name="Address_Pids" value="Address_Id" />添加
			</s:a>
			</td>
			<td><s:if test="parent.name != null">
					<s:property value="parent.Address_Name" />
				</s:if> <s:else>
			无
			</s:else>
			</td>
			<td><s:a action="Address_addressEdit" namespace="/Address">
					<s:param name="Address_Id" value="Address_Id"></s:param>	
				编辑			
			</s:a>
			</td>
			<td><s:a action="Address_addressDelect" namespace="/Address">
					<s:param name="Address_Id" value="Address_Id"></s:param>
				删除
			</s:a>
			</td>
		</tr>
	</s:iterator>
</table>
<s:url action="Address_addressList" namespace="/Address" var="first">
	<s:param name="pageNo" value="1"></s:param>
	<s:param name="Address_Pids" value="Address_Pids"></s:param>
</s:url>
<s:url action="Address_addressList" namespace="/Address" var="previous">
	<s:param name="pageNo" value="pageModel.pageNo-1"></s:param>
	<s:param name="Address_Pids" value="Address_Pids"></s:param>
</s:url>
<s:url action="Address_addressList" namespace="/Address" var="last">
	<s:param name="pageNo" value="pageModel.bottomPageNo"></s:param>
	<s:param name="Address_Pids" value="Address_Pids"></s:param>
</s:url>
<s:url action="Address_addressList" namespace="/Address" var="next">
	<s:param name="pageNo" value="pageModel.pageNo+1"></s:param>
	<s:param name="Address_Pids" value="Address_Pids"></s:param>
</s:url>
<s:include value="/WEB-INF/Page/common/page.jsp"></s:include>

  </body>
</html>
