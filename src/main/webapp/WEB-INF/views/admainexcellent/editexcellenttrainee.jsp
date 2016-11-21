<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改优秀学员信息</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/custom.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/lrtk.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lrtk.js"></script>
  </head>
  <body>
 
  <div class="row">
  <div class="col-sm-1"></div>
  <div class="col-sm-10">
  <br>
   <div class="panel panel-default">
  <div class="panel-heading" >修改优秀学员信息</div>
  <div class="panel-body">
   <form role="form" action=""  method="post">
  <div class="form-group">
   <input type="hidden" name="excellentID" value="${web_excellent_trainee.excellentID}">
   <div class="table-responsive">
  <table class="table table-bordered table-striped table-hover">
  <tr>
		<td align="right">学员真实姓名</td>
		<td><input type="text" name="excellentTrueName"  value="${web_excellent_trainee.excellentTrueName}"/></td>
	</tr>
	<tr>
		<td align="right">所学课程</td>
		<td><input type="text" name="excellentCourseName"  value="${web_excellent_trainee.excellentCourseName}"/></td>
	</tr>
	<tr>
		<td align="right">文字简介</td>
		<td><input type="text" name="excellentIntroductionText"  value="${web_excellent_trainee.excellentIntroductionText}"/></td>
	</tr>
	<tr>
		<td align="right">图片存储地址</td>
		<td><input type="text" name="excellentIntroductionImage" value="${web_excellent_trainee.excellentIntroductionImage}"/></td>
	</tr>
	<tr>
		<td colspan="2" style="text-align: center;"><input type="submit"  value="修改" class="btn btn-info"/></td>
	</tr>
  
  </table>
  </div>
  </div>
  
  </form>
  </div>
   </div>
  <div class="col-sm-1"></div>
  </div>
  </div>
 
  
  
 
  </body>
