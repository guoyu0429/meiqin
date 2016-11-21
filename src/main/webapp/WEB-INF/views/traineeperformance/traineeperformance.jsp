<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<body>
	    <%@ include file="../navbar/head.jsp" %>
		<div class= container>
		<div class="row">
		

		<div class="col-sm-12">
		
		<div class="panel panel-default">
		<div class="panel-body">当前位置：主页>学员风采展示</div>
		</div>
		<div class="panel panel-primary">
		<div class="panel-heading">学员风采展示</div>
		<div class="panel-body">
		
		 <div class="row">
   <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/wang.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>王天宇  2014年毕业 <br><br> <strong>美格菲健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">10万</span>
            </h5>
         </div>
      </div>
   </div>
   <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/chen.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>陈冰心  2014年毕业 <br><br> <strong>中体倍力健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">18万</span>
            </h5>
         </div>
      </div>
   </div>
     <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/zhan.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>詹雷  2014年毕业 <br><br> <strong>一兆韦德健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">20万</span>
            </h5>
         </div>
      </div>
   </div>
     <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/liu.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>刘志明  2012年毕业 <br><br> <strong>天津青鸟健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">28万</span>
            </h5>
         </div>
      </div>
   </div> 
</div>
<div class="row">
<div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/kang.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>康鑫  2012年毕业 <br><br> <strong>美格菲健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">28万</span>
            </h5>
         </div>
      </div>
   </div>
     <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/gao.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>高飞飞  2012年毕业 <br><br> <strong>美格菲健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">25万</span>
            </h5>
         </div>
      </div>
   </div>
    <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/liu2.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>刘伟辉  2010年毕业 <br><br> <strong>维斯塔健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">30万</span>
            </h5>
         </div>
      </div>
   </div>
    <div class="col-sm-6 col-md-3">
      <div class="thumbnail">
         <a href="#"><img src="static/image/wang2.png" width="100%"></a>
         <div class="caption" style="text-align: center">
            <h5>王凯  2009年毕业 <br><br> <strong>青鸟健身</strong><br><br>
                年薪<span style="color: red;font-size: 20px">33万</span>
            </h5>
         </div>
      </div>
   </div>
</div>
	
		
	
		
		</div>
		</div>
		</div>
		
		</div>

		</div>
		




  <%@ include file="../navbar/footer.jsp" %>

  </body>
    <script>
   $(document).ready(function(){
	   $("#main").removeClass("active");
	   $("#traineeperformance").addClass("active");
	 });
   </script>
</html>


