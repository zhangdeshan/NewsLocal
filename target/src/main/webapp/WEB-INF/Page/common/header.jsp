<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<script type="text/javascript" src="${context_path}/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="${context_path}/js/jquery-ui.js"></script>
<link href="${context_path}/css/bootstrap-combined.min.css" rel="stylesheet"
	media="screen">
<script type="text/javascript" src="${context_path}/js/bootstrap.min.js"></script>
<link href="${context_path}/css/jumbotron-narrow.css" rel="stylesheet">

<link href="${context_path}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">	
<script type="text/javascript" src="${context_path}/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${context_path}/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>


	<div class="container">

		<div class="row-fluid">
			<div class="span12">
				<ul class="nav nav-pills">
					<li class="active"><s:a action="BaseAction_index" namespace="/default">首页</s:a></li>


					<s:if test="#session.user != null">
					<li>
						<s:a action="News_addNewsJump" namespace="/News"> <s:property value="#session.user.User_Name" /> </s:a>
					</li>
					<li><s:a action="News_addNewsJump" namespace="/News">发布新闻</s:a></li>	
					</s:if>
					<s:else>	
	                  <li><s:a action="User_loginJump" namespace="/User">登录</s:a>
	                  <li class="disabled"><s:a action="User_registerJump" namespace="/User">注册</s:a></li>					
	                </s:else>
			
					<li class="dropdown pull-right"><a href="#"
						data-toggle="dropdown" class="dropdown-toggle">换台<strong
							class="caret"></strong>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">本地</a></li>
							<li><a href="#">最新</a></li>
							<li><a href="#">最热</a></li>							
							<li><s:a action="News_newsListJump" namespace="/News">新闻列表</s:a></li>

							<li class="divider"></li>
							<li><a href="find.html">查找历史新闻</a></li>
						</ul></li>
				</ul>
			</div>
		</div>

		<div class="row-fluid">
			<div class="span12">
				<div class="alert alert-warning">警告！请不要提交。</div>
			</div>
		</div>
