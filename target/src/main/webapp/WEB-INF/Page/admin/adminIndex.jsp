<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<title>后台管理</title>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../themes/icon.css" />
<link rel="stylesheet" type="text/css" href="../demo/demo.css" />
<script type="text/javascript" src="../js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function() {
		// addTab("首页","home.html");
	});
	function addTab(title, url) {
		//判断如果标题title是否已经存在
		if (!($('#tt').tabs('exists', title))) {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'
					+ url + '" style="width:100%;height:99%;"></iframe>';
			$('#tt').tabs('add', {
				title : title,
				content : content,
				iconCls : 'icon-save',
				closable : true
			});
		} else {
			$('#tt').tabs('close', title);
			var content = '<iframe scrolling="auto" frameborder="0"  src="'
					+ url + '" style="width:100%;height:99%;"></iframe>';
			$('#tt').tabs('add', {
				title : title,
				content : content,
				iconCls : 'icon-save',
				closable : true
			});
		}
	}
	var height = "";
	$(document).ready(function() {
		$("#box-top").css("height", "60");
		$("#box-middle").css("height", $(document).height() - 100);
		$("#box-left").css("height", $(document).height() - 100);
		$("#box-content").css("height", $(document).height() - 100);
		$("#box-content").css("width", $(document).width() - 180);
		$("#box-bottom").css("height", "23");
		//                        alert("窗口可视区域高度"+$(window).height()); //浏览器时下窗口可视区域高度
		//                        alert("窗口文档的高度"+$(document).height()); //浏览器时下窗口文档的高度
		//                        alert("窗口文档body的高度"+$(document.body).height()); //浏览器时下窗口文档body的高度
		//                        alert("窗口文档body的总高度包括border padding margin" + $(document.body).outerHeight(true)); //浏览器时下窗口文档body的总高度包括border padding margin
		//                        alert("窗口可视区域宽度" + $(window).width()); //浏览器时下窗口可视区域宽度
		//                        alert("窗口文档对于象宽度" + $(document).width()); //浏览器时下窗口文档对于象宽度
		//                        alert("窗口文档body的高度" + $(document.body).width()); //浏览器时下窗口文档body的高度
		//                        alert("窗口文档body的总宽度包括border padding margin" + $(document.body).outerWidth(true)); //浏览器时下窗口文档body的总宽度包括border padding margin
	});
</script>

<s:url action="Address_addressList" namespace="/Address"
	var="AddressManager"></s:url>

<s:url action="News_newsListJump" namespace="/News" var="NewsManager"></s:url>

<s:url action="Category_listCategory" namespace="/Category"
	var="CategoryManager"></s:url>






</head>
<body style="margin: auto;">

	<div id="box">
		<div id="box-top" style="height: 100px;">
			<div region="north" title="" split="false" border="false"
				style="height: 68px;">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					style="table-layout: fixed;">
					<tr>
						<td height="9"
							style="line-height: 9px; background-image: url(../images/main_04.gif)">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="97" height="9" background="../images/main_01.gif">&nbsp;

									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="47" background="../images/main_09.gif">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="38" height="47" background="../images/main_06.gif">&nbsp;

									</td>
									<td width="59">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td height="29" background="../images/main_07.gif">&nbsp;

												</td>
											</tr>
											<tr>
												<td height="18" background="../images/main_14.gif">
													<table width="100%" border="0" cellspacing="0"
														cellpadding="0" style="table-layout: fixed;">
														<tr>
															<td style="width: 1px;">&nbsp;</td>
															<td><span class="STYLE1">Admin</span>
															</td>
														</tr>
													</table>
												</td>
											</tr>
										</table>
									</td>
									<td width="210" background="../images/main_08.gif">&nbsp;

									</td>
									<td>
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td height="23" valign="bottom"><img
													src="../images/main_12.gif" width="367" height="23"
													border="0" usemap="#Map" />
												</td>
											</tr>
										</table>
									</td>
									<td width="200" background="../images/main_11.gif">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td width="11%" height="23">&nbsp;</td>
												<td width="89%" valign="bottom"><span class="STYLE1">日期：2008年7月22日
														星期二</span>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="5"
							style="line-height: 5px; background-image: url(../images/main_18.gif)">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="180" background="../images/main_16.gif"
										style="line-height: 5px;">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<div id="box-middle" style="overflow: hidden; margin: 5px 0 0 5px;">
			<div id="box-left" class="easyui-accordion"
				style="width: 150px; border: 1px solid green;
                    margin-top: 5px; vertical-align: middle; text-align: center; float: left;">
				<div title="地址模块" data-options="iconCls:'icon-search'"
					style="padding: 10px;">
					<div style="padding-left: 30px;">
						<img src="../images/form.png" /><a class="easyui-linkbutton"
							style="border: 0px; margin-top: -5px;" href="javascript:void(0)"
							plain="true" onclick="addTab('用户管理','${AddressManager}')">
							地址管理</a>
					</div>
				</div>
				<div title="类别模块" data-options="iconCls:'icon-search'"
					style="padding: 10px;">
					<div style="padding-left: 30px;">
						<img src="../images/form.png" /><a class="easyui-linkbutton"
							style="border: 0px; margin-top: -5px;" href="javascript:void(0)"
							plain="true" onclick="addTab('类别管理','${CategoryManager}')">
							类别管理</a>
					</div>
				</div>
				<div title="新闻模块" data-options="iconCls:'icon-search'"
					style="padding: 10px;">
					<div style="padding-left: 30px;">
						<img src="../images/form.png" /><a class="easyui-linkbutton"
							style="border: 0px; margin-top: -5px;" href="javascript:void(0)"
							plain="true" onclick="addTab('新闻管理','${NewsManager}')">
							新闻管理</a>
					</div>
				</div>
			</div>
			<div id="box-content"
				style="border: 1px solid green; vertical-align: middle; text-align: center;
                    float: left; margin-top: 5px; margin-left: 10px;">
				<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'"
					fit="true"></div>
			</div>
		</div>
		<div id="box-bottom"
			style="clear: both; text-align: center; vertical-align: middle;
                color: Red; margin-top: 5px;">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="24" background="../images/main_47.gif">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="29" height="24"><img src="images/main_45.gif"
									width="29" height="24" />
								</td>
								<td>
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="369"><span class="STYLE1">版本 FL V1.0
													2014</span>
											</td>
											<td width="814" class="STYLE1">&nbsp;</td>
											<td width="185" nowrap="nowrap" class="STYLE1">
												<div align="center">
													<img src="../images/main_51.gif" width="12" height="12" />
													如有疑问请与技术人员联系
												</div>
											</td>
										</tr>
									</table>
								</td>
								<td width="14"><img src="../images/main_49.gif" width="14"
									height="24" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
