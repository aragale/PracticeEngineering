<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main1.css" rel="stylesheet">
</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">森林火情预警监控系统</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="home.jsp">首页</a></li>
					<li><a href="Alarm?name=all">告警监控</a></li>
					<li><a href="Record">数据查询</a></li>
					<li><a href="user.jsp">自身管理</a></li>
					<c:if test="${isLogedin == 'yes'}">
						<li><a href="Logout">退出</a></li>
					</c:if>
					<c:if test="${isLogedin != 'yes'}">
						<li><a href="login.jsp">登录</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
