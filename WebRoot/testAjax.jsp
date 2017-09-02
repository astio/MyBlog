<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testAjax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
    	
     
        <fieldset>
        <legend>创建用户</legend>
            <p>
                <label>姓名：</label> <input type="text" id="username" name="username"
                    tabindex="1">
            </p>
            <p>
                <label>性别：</label> <input type="text" id="sex" name="sex"
                    tabindex="2">
            </p>
            <p>
                <label>密码：</label> <input type="text" id="password" name="password"
                    tabindex="3">
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" value="取消"> 
            </p>
        </fieldset>
    	<button id="button">button</button>

<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script type="text/javascript">
$(document).ready(function(){
    var saveDataAry=[];  
        var data1={"username":username,"sex":sex};  
        var data2={"username":"ququ","sex":"女"};  
        saveDataAry.push(data1);  
        saveDataAry.push(data2);   
$("#button").click(function(){
$.ajax({
     type:"post", 
	url : "http://localhost:8080/MyBlog/saveUser",
	dataType:"json",
	contentType:"application/json",               
    data:JSON.stringify(saveDataAry), 
	success : function(data) {
	
	window.alert(data);
	}
	});
}
)})
</script>
  </body>
</html>
