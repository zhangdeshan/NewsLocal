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
   <table width="693" height="29" border="0">
	<s:iterator value="pageModel.list">
		<tr>
			<td><s:property value="Category_Id" /></td>
			<td><s:a action="Category_addCategory" namespace="/Category">
					<s:param name="Category_Pids" value="Category_Id"></s:param>
					<s:property value="Category_Name" />
				</s:a>
			</td>
			<td><s:if test="children == null || children.isEmpty">
				没有子类别
			</s:if> <s:else>
					<s:a action="Category_listCategory" namespace="/Category">
						<s:param name="Category_Pids" value="Category_Id"></s:param>
					有<s:property value="children.size" />个子类别
				</s:a>
				</s:else>
			</td>
			<td><s:a action="Category_addCategoryJump" namespace="/Category">
					<s:param name="Category_Pids" value="Category_Id" />添加
			</s:a>
			</td>
			<td><s:if test="parent.name != null">
					<s:property value="parent.Category_Name" />
				</s:if> <s:else>
			无
			</s:else>
			</td>
			
			<td><s:a action="Category_delectCategory" namespace="/Category">
					<s:param name="Category_Id" value="Category_Id"></s:param>
				删除
			</s:a>
			</td>
		</tr>
	</s:iterator>
</table>
<s:url action="Category_listCategory" namespace="/Category" var="first">
	<s:param name="pageNo" value="1"></s:param>
	<s:param name="Category_Pids" value="Category_Pids"></s:param>
</s:url>
<s:url action="Category_listCategory" namespace="/Category" var="previous">
	<s:param name="pageNo" value="pageModel.pageNo-1"></s:param>
	<s:param name="Category_Pids" value="Category_Pids"></s:param>
</s:url>
<s:url action="Category_listCategory" namespace="/Category" var="last">
	<s:param name="pageNo" value="pageModel.bottomPageNo"></s:param>
	<s:param name="Category_Pids" value="Category_Pids"></s:param>
</s:url>
<s:url action="Category_listCategory" namespace="/Category" var="next">
	<s:param name="pageNo" value="pageModel.pageNo+1"></s:param>
	<s:param name="Category_Pids" value="Category_Pids"></s:param>
</s:url>
<s:include value="/WEB-INF/Page/common/page.jsp"></s:include>

  </body>
</html>
