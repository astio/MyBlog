<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajaxTest.jsp' starting page</title>
    
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
  <button id="button">button</button>
  
    <script type="text/javascript">  
    $(document).ready(function(){  
        var saveDataAry=[];  
        var data1={"username":"test","sex":"男"};  
        var data2={"username":"ququ","sex":"女"};  
        saveDataAry.push(data1);  
        saveDataAry.push(data2);   
        $("#button").click(function(){      
        $.ajax({ 
            type:"POST", 
            url:"MyBlog/saveUser", 
            dataType:"json",      
            contentType:"application/json",               
            data:JSON.stringify(saveData), 
            success:function(data){ 
                                       
            } 
         }); 
    })});  
</script> 

复制代码
  </body>
</html>
