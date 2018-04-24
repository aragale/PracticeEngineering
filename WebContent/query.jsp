<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="record" class="entity.Record"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>数据查询</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main1.css" rel="stylesheet">
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
</head>
<body>
	<div id="wrap">
		<%@include file="nav.jsp"%>

		<c:if test="${isLogedin == 'yes'}">
			<!-- 已经登录 -->
			<div class="container">
				<div class="page-header">
					<h1>数据查询</h1>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">一、查询条件</h3>
					</div>
					<div class="panel-body">
						<h4>1.时间</h4>
						<div class="input-group date form_datetime col-md-5"
							data-date="2016-12-25 00:00:00"
							data-date-format="yyyy-mm-dd hh:ii:ss"
							data-link-field="dtp_input1">
							<input class="form-control" size="16" type="text"
								name="starttime" value="" readonly="" placeholder="开始时间">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-remove"></span></span> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-th"></span></span>
						</div>
						<div class="input-group date form_datetime col-md-5"
							data-date="2016-12-25 00:00:00"
							data-date-format="yyyy-mm-dd hh:ii:ss"
							data-link-field="dtp_input1">
							<input class="form-control" size="16" type="text" name="endtime"
								value="" readonly="" placeholder="结束时间"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-remove"></span></span> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-th"></span></span>
						</div>
						<h4>2.数据类型</h4>
						<div class="btn-group">
							<button class="btn btn-primary" onclick="query('tempz')">温度(T)</button>
							<button class="btn btn-primary" onclick="query('lightz')">火焰(F)</button>
							<button class="btn btn-primary" onclick="query('wetz')">气体(G)</button>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">二、数据列表</h3>
					</div>
					 
					<c:if test="${records.size() != 0}">
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>编号</th>
										<th>类型</th>
										<th>数值</th>
										<th>时间</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${records}" var="record">
										<tr>
											<td>${record.id}</td>
											<td>${record.name}</td>
											<td>${record.value}</td>
											<td>${record.time}</td>
											<td><a href="#" onclick="deleteRecord(${record.id})">删除</a></td>
											<td></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					</c:if>
					<c:if test="${records.size() == '0'}">
					此数据类型暂时没有数据；
					</c:if>
					<c:if test="${reason != null}">
					数据发生故障，原因：${reason}
					</c:if>
				</div>
				<h2></h2>
				
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
	<script type="text/javascript" src="js/bootstrap-datetimepicker.js"
		charset="UTF-8"></script>
	<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'cn',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
</script>
</body>
</html>