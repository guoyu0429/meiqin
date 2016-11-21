<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/reset.css">
</head>>

<body>
<div class="headerBar">
	<div class="logoBar login_logo">
		
			<div class="row">
			<div class="col-sm-5"></div>
			<div class="col-sm-4">
		    <h3 class="welcome_title" >美勤健身后台管理系统</h3>
			</div>
			<div class="col-sm-3"></div>
			</div>
	</div>
</div>
<br><br><br>
<div class="loginBox">
	<div class="login_cont">
        <form class="form-horizontal" role="form" action="<%=request.getContextPath()%>/admain/dologin" method="POST">
        <div class="form-group">
          <label for="name" class="col-sm-4 control-label" style="font-size: 15px;">账号：</label>
          <div class="col-sm-8">
             <input type="text" class="form-control"  name="userName" placeholder="请输入管理员账号" value="${param.name}">
          </div>
       </div>
       <div class="form-group">
          <label for="name" class="col-sm-4 control-label" style="font-size: 15px;">密码：</label>
          <div class="col-sm-8">
             <input type="text" class="form-control"  name="userPassword" placeholder="请输入管理员密码" value="${param.name}">
          </div>
       </div>
       <div class="form-group">
          <label for="name" class="col-sm-4 control-label" style="font-size: 15px;">验证码：</label>
          <div class="col-sm-8">
             <input type="text" class="form-control"  name="verify" placeholder="请输入验证码" value="${param.name}">
            <br>
             <img src="/admain/getVerify" alt="" />
          </div>
       </div>
       <div class="text-center">
         <button type="submit" class="btn  btn-info">提交</button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
         <button type="reset" class="btn  btn-info">重置</button>
       </div>
       </form>
  
</div>
</div>
<br><br><br>
<div class="hr_25"></div>
<div class="footer">
	
	<p>© 2015-2016 石家庄美勤健身学院 版权所有  冀ICP备15030605号-1</p>
	
</div>
 
</body>
</html>

