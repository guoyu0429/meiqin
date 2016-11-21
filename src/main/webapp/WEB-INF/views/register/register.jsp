<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	
	<title>注册</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>美勤注册</h2>
 
	<form:form method="POST" modelAttribute="register" class="form-horizontal">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="loginname">用户名: </label> </td>
				<td><form:input path="loginname" id="loginname"/></td>
				<td><form:errors path="loginname" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="pnumber">手机号: </label> </td>
				<td><form:input path="pnumber" id="pnumber"/></td>
				<td><form:errors path="pnumber" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="password">密码: </label> </td>
				<td><form:input path="password" id="password"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
		    </tr>
	
	
			<tr>
				<td colspan="3">
					<c:choose>
					<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="注册"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/main' />">美勤主页</a>
</body>
</html>