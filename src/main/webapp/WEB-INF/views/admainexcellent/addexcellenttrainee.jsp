<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加优秀学员信息</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/custom.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/lrtk.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/staticjs/lrtk.js"></script>
  </head>
  <body>
 
  <div class="row">
  <div class="col-sm-1"></div>
  <div class="col-sm-10">
  <br>
   <div class="panel panel-default">
  <div class="panel-heading" >添加优秀学员</div>
  <div class="panel-body">
  <form:form method="POST" modelAttribute="web_excellent_trainee" class="form-horizontal">
  <div class="form-group">
  <form:input type="hidden" path="excellentID" id="excellentID"/>
  <div class="table-responsive">
  <table class="table table-bordered table-striped table-hover">
  
  <tr>
				<td style="text-align: center" ><label for="excellentTrueName">学员真实姓名: </label> </td>
				<td style="text-align: center" ><form:input path="excellentTrueName" id="excellentTrueName"/></td>
				<td><form:errors path="excellentTrueName" cssClass="error"/></td>
		    </tr>
	    
		
			<tr>
				<td style="text-align: center" ><label for="excellentCourseName">所学课程: </label> </td>
				<td style="text-align: center" ><form:input path="excellentCourseName" id="excellentCourseName"/></td>
				<td><form:errors path="excellentCourseName" cssClass="error"/></td>
		    </tr>
	
		    
		    <tr>
				<td style="text-align: center" ><label for="excellentIntroductionText">文字简介:</label> </td>
				<td style="text-align: center" ><form:input path="excellentIntroductionText" id="excellentIntroductionText"/></td>
				<td><form:errors path="excellentIntroductionText" cssClass="error"/></td>
		    </tr>
		    
		    <tr>
				<td style="text-align: center" ><label for="excellentIntroductionImage">图片: </label> </td>
				<td style="text-align: center" ><form:input path="excellentIntroductionImage" id="excellentIntroductionImage"/></td>
				<td><form:errors path="excellentIntroductionImage" cssClass="error"/></td>
		    </tr>
		    
			<tr>
				<td colspan="3" style="text-align: center" >
					<c:choose>
					<c:when test="${edit}">
							<input type="submit" value="修改"/>
						</c:when>
						<c:otherwise>
							<input class="btn btn-info"  type="submit" value="添加"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
  
  </table>
  </div>
  </div>
  </form:form>
  </div>
   </div>
  <div class="col-sm-1"></div>
  </div>
  </div>
 
  
  
 
  </body>





