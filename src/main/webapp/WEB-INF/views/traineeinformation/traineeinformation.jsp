<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>个人资料</title>
    
  </head>
  <body>
    <%@ include file="../navbar/head.jsp" %>
<!-- 			<h3>&nbsp&nbsp&nbsp添加用户</h3> -->
<div class= container>
		<div class="row">
		

		<div class="col-sm-12">
			<br/>
			<div class="panel panel-default">
			<div class="panel-body">当前位置>查看用户个人信息界面</div>
			</div>
			<div class="panel panel-primary">
			<div class="panel-heading">用户个人信息</div>
			<div class="panel-body"></div>
			
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-2">
					<img alt="160*160" src="static/image/logo.png">
					<h3>用户名</h3>
				</div>
				<div class="col-md-8">
				
				<div class="panel panel-default">
				<div class="panle-body">
				 <div class="table-responsive">
				 <table class="table table-hover">
				 <thead>
				 <tr>
				 <th> <h3 class="text-left">个人资料</h3></th>
				 <th><h3 class="text-right"><a href="edittrainee.html">编辑我的资料</a></h3></th>
				 </tr>
				 </thead>
				 <tbody>
				 <tr>
				 <th><h4 class="text-center">用户名：</h4></th>
				 <th><h4 class="text-center">Ailsa</h4></th>
				 </tr>
				 <tr>
				 <th><h4 class="text-center">性别：</h4></th>
				 <th><h4 class="text-center">女</h4></th>
				 </tr>
				 </tbody>
				 </table>
				 </div>
				 </div>
				 </div>
				 <div class="panel panel-default">
				<div class="panle-body">
				  <div class="table-responsive">
				 <table class="table table-hover">
				 <thead>
				 <tr>
				<th> <h3 class="text-left">我的课程</h3></th>
				 <th><h3 class="text-right"><a href="">更多课程</a></h3></th>
				 </tr>
				 </thead>
				 <tbody>
				 <tr>
				 <th><h4 class="text-center">中国女性减脂整形训练计划课程：</h4></th>
				 <th><h4 class="text-center">已学习20天</h4></th>
				 </tr>
				 <tr>
				 <th><h4 class="text-center">国家高级体能训练师培新及考核:</h4></th>
				 <th><h4 class="text-center">未开始</h4></th>
				 </tr>
				 </tbody>
				 </table>
				 </div>
				 </div>
				 </div>
				</div>
				</div>
				</div>
			<div>
				<div class="col-md-1"></div>
			</div>
		</div>
		<div class="col-md-1"></div>
	</div>



	
  <%@ include file="../navbar/footer.jsp" %>
  </body>
   <script>
   $(document).ready(function(){
	   $("#main").removeClass("active");
	
	 });
   </script>
</html>

