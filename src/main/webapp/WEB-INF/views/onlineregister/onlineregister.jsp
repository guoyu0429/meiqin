<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">


  <body>
   <%@ include file="../navbar/head.jsp" %>
   <div class="container">
  <h3 class="text-center">在线报名</h3>
  <div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label for="name" class="col-sm-3 control-label">名字：</label>
          <div class="col-sm-9">
             <input type="text" class="form-control" id="name" name="name" placeholder="请输入名字">
          </div>
       </div>
       <div class="form-group">
         <label for="" class="col-sm-3 control-label">性别：</label>
         <div class="col-sm-9">
           <div class="checkbox-inline">
             <label style="font-weight:0">
                <input type="radio" name="female" id="optionsRadios1"
                   value="option1" checked>女
             </label>

          </div>
          <div class="checkbox-inline">
             <label style="font-weight:0">
                <input type="radio" name="male" id="optionsRadios2"
                   value="option2">
                   男
             </label>
          </div>
         </div>
       </div>
       <div class="form-group">
         <label for="city" class="col-sm-3 control-label">籍贯：</label>
         <div class="col-sm-3">
           <select class="form-control" name="city">
              <option>北京</option>
              <option>上海</option>
              <option>河北</option>
           </select>
         </div>

       </div>
       <div class="form-group">
         <label for="address" class="col-sm-3 control-label">家庭住址：</label>
         <div class="col-sm-9">
           <input type="text" class="form-control" id="address" name="address" placeholder="请输入家庭住址">
         </div>
       </div>
       <div class="form-group">
         <label for="learncaty" class="col-sm-3 control-label">申请参加学习的类型：</label>
         <div class="col-sm-4">
           <select class="form-control" name="learncaty">
              <option>高级私教（30天）</option>
              <option>全能私教（45天）</option>
              <option>单选课程（7天）</option>
           </select>
         </div>
       </div>
       <div class="form-group">
         <label for="" class="col-sm-3 control-label">申请报考认证的类型：</label>
         <div class="col-sm-9">
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox1" value="option1"> 国家职业资格健身教练（初级）
           </label>
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox2" value="option2"> 国家职业资格健身教练（中级）
           </label>
           <br>
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox3" value="option3"> 国家高级公共营养师
           </label>
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox3" value="option3"> 国家高级保健按摩师
           </label>
           <br>
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox3" value="option3"> 国家高级心理咨询师
           </label>
           <label class="checkbox-inline">
              <input type="checkbox" id="inlineCheckbox3" value="option3"> 国家高级营养配餐师
           </label>
         </div>
       </div>
       <div class="form-group">
         <label for="educationcaty" class="col-sm-3 control-label">申请参加学历的类型：</label>
         <div class="col-sm-4">
           <select class="form-control" name="educationcaty">
              <option>初中或高中升大专</option>
              <option>初中或高中升本科</option>
              <option>大专升本科</option>
           </select>
         </div>
       </div>
       <div class="form-group">
         <label for="phone" class="col-sm-3 control-label">手机号：</label>
         <div class="col-sm-9">
           <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机号">
         </div>
       </div>
       <div class="form-group">
         <label for="email" class="col-sm-3 control-label">电子邮箱</label>
         <div class="col-sm-9">
           <input type="text" class="form-control" id="email" name="email" placeholder="请输入电子邮箱">
         </div>
       </div>
       <div class="text-center">
         <button type="submit" class="btn  btn-info">提交</button>
       </div>
      </form>
    </div>
    <div class="col-md-2"></div>
  </div>


</div>
   
   <%@ include file="../navbar/footer.jsp" %>
   </body>
   <script>
   $(document).ready(function(){
	   $("#main").removeClass("active");
	   $("#onlineregister").addClass("active");
	 });
   </script>
</html>