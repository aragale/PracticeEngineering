<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="user" class="entity.User"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>自身管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main1.css" rel="stylesheet">
</head>
<body>
	<div id="wrap">
		<%@include file="nav.jsp"%>
		<c:if test="${isLogedin == 'yes'}">
		<div class="container">
			<div class="page-header">
				<h1>自身管理</h1>
			</div>
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>序号</th>
							<th>用户名</th>
							<th>密码</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="user">
							<tr>
								<td>${user.id}</td>
								<td>${user.username}</td>
								<td>${user.password}</td>
								<td><a href="#">编辑</a>&nbsp;&nbsp;<a href="#">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		</c:if>
		<c:if test="${isLogedin != 'yes'}">
			<!-- 未登录 -->
			<div class="container">
				<h1>对不起，请先登录后查看</h1>
			</div>
		</c:if>
	</div>

	<div id="footer">
		<div class="container">
			<p class="text-muted credit">欢迎访问</p>
		</div>
	</div>
	<script type='text/javascript' src="js/jquery-1.9.1.min.js"></script>
	<script type='text/javascript' src="js/bootstrap.min.js"></script>
</body>
</html>