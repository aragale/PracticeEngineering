<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="alarm" class="entity.Alarm"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>告警监控</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main1.css" rel="stylesheet">
</head>
<body>
	<div id="wrap">
		<%@include file="nav.jsp"%>

		<c:if test="${isLogedin == 'yes'}">
			<!-- 已经登录 -->
			<div class="container">
				<div class="page-header">
					<h1>告警监控</h1>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">一、操作</h3>
					</div>
					<div class="panel-body">
						<div class="btn-group">
							<button class="btn btn-primary" onclick="clearAlarm()">清除告警</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								设置过滤条件 <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="Alarm?name=T">只查看温度</a></li>
								<li><a href="Alarm?name=F">只查看光照</a></li>
								<li><a href="Alarm?name=G">只查看湿度</a></li>
							</ul>
							<button class="btn btn-primary" onclick="alarmSet()">告警设置</button>
							<button class="btn btn-primary" onclick="viewExpired()">查看过期告警</button>
							<button class="btn btn-primary" onclick="refresh()">刷新</button>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">二、状态</h3>
					</div>
					<div class="panel-body">
					<c:if test="${name == 'all'}">
					当前传感器类型：全部
					</c:if>
					<c:if test="${name == 'tempz'}">
					当前传感器类型：温度
					</c:if>
					<c:if test="${name == 'lightz'}">
					当前传感器类型：光照
					</c:if>
					<c:if test="${name == 'wetz'}">
					当前传感器类型：湿度
					</c:if>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">三、列表</h3>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>监控网关编码</th>
										<th>网关名称</th>
										<th>告警级别</th>
										<th>告警类型</th>
										<th>描述信息</th>
										<th>责任人</th>
										<th>发生时间</th>
										<th>是否清除</th>
										<th>清除人</th>
										<th>清除时间</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${alarms}" var="alarm">
										<tr>
											<td>${alarm.gateWayId}</td>
											<td>${alarm.gateWayName}</td>
											<td>${alarm.alarmLevel}</td>
											<td>${alarm.alarmType}</td>
											<td>${alarm.info}</td>
											<td>${alarm.chargePerson}</td>
											<td>${alarm.occurTime}</td>
											<td>${alarm.isCleared}</td>
											<td>${alarm.clearPerson}</td>
											<td>${alarm.clearTime}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
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
	<script type='text/javascript' src="js/script.js"></script>
</body>
</html>
