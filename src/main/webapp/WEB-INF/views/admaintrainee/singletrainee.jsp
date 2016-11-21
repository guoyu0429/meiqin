<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>学员列表</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/custom.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/lrtk.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lrtk.js"></script>
  	
</head>

        <body>
		<div class="panel panel-default" style="width: 99%">
		<div class="panel panel-heading">学员列表</div>
		<div class="panle panel-body">
		<div class="row">
		<div class="col-sm-2">
		<a href="<%=request.getContextPath()%>/admaintrainee/addtrainee" class="btn btn-info">添加</a>
		</div>
		<div class="col-sm-6">
		</div>
		<div class="col-sm-4">
		<form action="/admaintrainee/query-web_trainee" method="POST">
  	        学员姓名:&nbsp<input type="text" name="traineeTrueName" value="${param.name}"/>
  	     <input type="submit" value="条件查询学员"/>
  	   </form>
		</div>
		</div>
		<br>
		<!--表格-->
		<form role="form" action="" method="POST">
		<div class="form-group">
		<div class="table-responsive">
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th width="5%" style="text-align: center">编号</th>
					<th width="7%" style="text-align: center">真实姓名</th>
					<th width="5%" style="text-align: center">性别</th>
					<th width="5%" style="text-align: center">年龄</th>
					<th width="10%" style="text-align: center">联系方式</th>
					<th width="10%" style="text-align: center">通讯地址</th>
					<th width="10%" style="text-align: center">申请参加学习类型</th>
					<th width="10%" style="text-align: center">认证类型</th>
					<th width="10%" style="text-align: center">学历类型</th>
					<th width="10%" style="text-align: center">身份证号</th>
					<th style="text-align: center">操作</th>
				</tr>
			</thead>
		
			<tbody>
			
			<tr>
					<td><input type="checkbox" name="traineeID" value="${web_trainees.traineeID}"/>&nbsp<c:out value="${web_trainees.traineeID}"/></td>
					<td><c:out value="${web_trainees.traineeTrueName}"/></td>
					<td><c:out value="${web_trainees.traineeSex}"/></td>
					<td><c:out value="${web_trainees.traineeAge}"/></td>
					<td><c:out value="${web_trainees.traineePhone}"/></td>
					<td><c:out value="${web_trainees.traineeAds}"/></td>
					<td><c:out value="${web_trainees.traineeStudytype}"/></td>
					<td><c:out value="${web_trainees.traineeCertificate}"/></td>
					<td><c:out value="${web_trainees.traineeEducation}"/></td>
					<td><c:out value="${web_trainees.traineeIDNumber}"/></td>
					<td style="text-align: center"><a href="<c:url value='/admaintrainee/edit-${web_trainees.traineeID}-web_trainees'/>" class="btn btn-warning">修改</a>
	  			&nbsp <a href="<c:url value='/admaintrainee/delete-${web_trainees.traineeID}-web_trainees'/>" class="btn btn-warning">删除</a></td>
				</tr> 
				 </tbody>  
		
			 
           
            	
		</table>
		</div>

  	</form>
  	<input type="submit" value="批量删除" class="btn btn-danger"/>
  	</div>
		</div>
		</div>
	
	
		
</body>

</html>