<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>优秀学员列表</title>
     <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/custom.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/lrtk.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lrtk.js"></script>
</head>

<body>

		
	
	    &nbsp&nbsp&nbsp&nbsp
		<div class="panel panel-default" style="width: 99%">
		<div class="panel panel-heading">优秀学员列表</div>
		<div class="panle panel-body">
		<div class="row">
		<div class="col-sm-2">
		<a href="<%=request.getContextPath()%>/admainexcellent/addexcellenttrainee" class="btn btn-info">添加</a>
		</div>
		<div class="col-sm-5"></div>
		<div class="col-sm-5">
		<form action="/admainexcellent/query-web_excellent_trainee" method="POST">
  	        优秀学员姓名:&nbsp<input type="text" name="excellentTrueName" value="${param.name}"/>
  	     <input type="submit" value="条件查询优秀学员" class="btn btn-info"/>
  	   </form>
		</div>
		</div>
		<br>
		<!--表格-->
		<form action="/admainexcellent/batchdel-web_excellent_trainees" method="POST">
		<div class="table-responsive">
		<table class="table table-bordered table-striped table-hover">
			 <thead>
                            <tr>
                                <th width="5%">编号</th>
                                <th width="7%">真实姓名</th>
                                <th width="24%">所学课程</th>
                                <th width="24%">文字简介</th>
                                <th width="23%">图片</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <c:forEach items="${web_excellent_trainees}" var="web_excellent_trainees">
                        <tbody>
                      
                            <tr>
                                 <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" name="excellentID" value="${web_excellent_trainees.excellentID}" />&nbsp<c:out value="${web_excellent_trainees.excellentID}"/></td>
                                <td><c:out value="${web_excellent_trainees.excellentTrueName}"/></td>
                                <td><c:out value="${web_excellent_trainees.excellentCourseName}"/></td>
                                <td><c:out value="${web_excellent_trainees.excellentIntroductionText}"/></td>
                                <td><c:out value="${web_excellent_trainees.excellentIntroductionImage}"/></td>
                                <td style="text-align: center"><a href="<c:url value='/admainexcellent/edit-${web_excellent_trainees.excellentID}-web_excellent_trainees'/>" class="btn btn-warning">修改</a>
	  			                 &nbsp<a href="<c:url value='/admainexcellent/delete-${web_excellent_trainees.excellentID}-web_excellent_trainees'/>" class="btn btn-warning">删除</a></td>
                            </tr>

                            
      </tbody>
            	</c:forEach> 
		</table>
		</div>
<input type="submit" value="批量删除" class="btn btn-danger"/>
  	</form>
		</div>
		</div>
		</div>
	
		
		
</body>

</html>