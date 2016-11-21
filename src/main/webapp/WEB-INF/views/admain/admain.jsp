<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>后台管理</title>
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/backstage1.css">
  
</head>>

<body>
    <div class="head">
            <div class="logo fl"><a href="#"></a></div>
            <h3 class="head_text fr">美勤健身后台管理系统</h3>
    </div>
    <div class="operation_user clearfix">
       
        <div class="link fr">
            <b>欢迎您
            </b>&nbsp;&nbsp;&nbsp;&nbsp;<a href="/main.html" class="icon icon_i">首页</a><span></span><a href="#" class="icon icon_j">前进</a><span></span><a href="#" class="icon icon_t">后退</a><span></span><a href="#" class="icon icon_n">刷新</a><span></span><a href="/admain/login" class="icon icon_e">退出</a>
        </div>
    </div>
    <div class="content clearfix">
        <div class="main">
            <!--右侧内容-->
            <div class="cont">
                <div class="title">后台管理</div>
      	 		<!-- 嵌套网页开始 -->         
                <iframe src=""  frameborder="0" name="mainFrame" width="100%" height="522"></iframe>
                <!-- 嵌套网页结束 -->   
            </div>
        </div>
        <!--左侧列表-->
        <div class="menu">
            <div class="cont">
                <div class="title">管理员</div>
                <ul class="mList">
                <li>
                        <h3><span onclick="show('menu2','change2')" id="change2">+</span>教练管理</h3>
                        <dl id="menu2" style="display:none;">
                        	<dd><a href="<%=request.getContextPath()%>/admaincoach/addcoach" target="mainFrame">添加教练</a></dd>
                            <dd><a href="<%=request.getContextPath()%>/admaincoach/listcoach" target="mainFrame">教练列表</a></dd>
                        </dl>
                        <h3><span onclick="show('menu3','change3')" id="change3">+</span>营养管理</h3>
                        <dl id="menu3" style="display:none;">
                        	<dd><a href="<%=request.getContextPath()%>/admainhealth/addhealth" target="mainFrame">添加营养知识</a></dd>
                            <dd><a href="<%=request.getContextPath()%>/admainhealth/listhealth" target="mainFrame">营养知识列表</a></dd>
                        </dl>
                    </li>
                    <li>
                        <h3><span onclick="show('menu5','change5')" id="change5">+</span>学员管理</h3>
                        <dl id="menu5" style="display:none;">
                        	<dd><a href="<%=request.getContextPath()%>/admaintrainee/addtrainee" target="mainFrame">添加学员</a></dd>
                            <dd><a href="<%=request.getContextPath()%>/admaintrainee/listtrainee" target="mainFrame">学员列表</a></dd>
                        </dl>
                        <h3><span onclick="show('menu4','change4')" id="change4">+</span>优秀学员管理</h3>
                        <dl id="menu4" style="display:none;">
                        	<dd><a href="<%=request.getContextPath()%>/admainexcellent/addexcellenttrainee" target="mainFrame">添加优秀学员</a></dd>
                            <dd><a href="<%=request.getContextPath()%>/admainexcellent/listexcellenttrainee" target="mainFrame">优秀学员列表</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>

    </div>
    <script type="text/javascript">
    	function show(num,change){
	    		var menu=document.getElementById(num);
	    		var change=document.getElementById(change);
	    		if(change.innerHTML=="+"){
	    				change.innerHTML="-";
	        	}else{
						change.innerHTML="+";
	            }
    		   if(menu.style.display=='none'){
    	             menu.style.display='';
    		    }else{
    		         menu.style.display='none';
    		    }
        }
    </script>
</body>
</html>

