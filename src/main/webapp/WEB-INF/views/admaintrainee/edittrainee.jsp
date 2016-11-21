<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加学员信息</title>
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
  <div class="panel-heading" >添加学员</div>
  <div class="panel-body">
  <form:form method="POST" modelAttribute="web_trainee" class="form-horizontal">
  <div class="form-group">
  <form:input type="hidden" path="traineeID" id="traineeID" />
  <div class="table-responsive">
  <table class="table table-bordered table-striped table-hover">
  
  <tr>
				<td style="text-align: center" ><label for="traineeTrueName">学员真实姓名: </label> </td>
				<td style="text-align: center" ><form:input path="traineeTrueName" id="traineeTrueName" /></td>
				<td><form:errors path="traineeTrueName" cssClass="error"/></td>
		    </tr>
	    
		
			<tr>
				<td style="text-align: center" ><label for="traineeSex">性别: </label> </td>
				<td style="text-align: center" ><form:input path="traineeSex" id="traineeSex"/></td>
				<td><form:errors path="traineeSex" cssClass="error"/></td>
		    </tr>
	
		    
		    <tr>
				<td style="text-align: center" ><label for="traineeAge">年龄:</label> </td>
				<td style="text-align: center" ><form:input path="traineeAge" id="traineeAge" /></td>
				<td><form:errors path="traineeAge" cssClass="error"/></td>
		    </tr>
		    
		    <tr>
				<td style="text-align: center" ><label for="traineePhone">联系方式: </label> </td>
				<td style="text-align: center" ><form:input path="traineePhone" id="traineePhone" /></td>
				<td><form:errors path="traineePhone" cssClass="error"/></td>
		    </tr>
		    
		    <tr>
				<td style="text-align: center" ><label for="traineeAds">通讯地址: </label> </td>
				<td style="text-align: center" ><form:input path="traineeAds" id="traineeAds" /></td>
				<td><form:errors path="traineeAds" cssClass="error"/></td>
		    </tr>
		    
		    <tr>
				<td style="text-align: center" ><label for="traineeStudytype">认证类型: </label> </td>
				<td style="text-align: center" ><form:input path="traineeStudytype" id="traineeStudytype" /></td>
				<td><form:errors path="traineeStudytype" cssClass="error"/></td>
		    </tr>
		    
		    
		    <tr>
				<td style="text-align: center" ><label for="traineeCertificate">申请报考认证的类型: </label> </td>
				<td style="text-align: center" ><form:input path="traineeCertificate" id="traineeCertificate" /></td>
				<td><form:errors path="traineeCertificate" cssClass="error"/></td>
		    </tr>
		    
		     <tr>
				<td style="text-align: center" ><label for="traineeEducation">申请参加学历的类型: </label> </td>
				<td style="text-align: center" ><form:input path="traineeEducation" id="traineeEducation"/></td>
				<td><form:errors path="traineeEducation" cssClass="error"/></td>
		    </tr>
		    
		    <tr>
				<td style="text-align: center" ><label for="traineeIDNumber" >身份证号: </label> </td>
				<td style="text-align: center" ><form:input path="traineeIDNumber" id="traineeIDNumber" /></td>
				<td><form:errors path="traineeIDNumber" cssClass="error"/></td>
		    </tr>
	
	
			<tr>
				<td colspan="3" style="text-align: center" >
					<c:choose>
					<c:when test="${edit}">
							<input type="submit" value="修改" class="btn btn-info"/>
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




