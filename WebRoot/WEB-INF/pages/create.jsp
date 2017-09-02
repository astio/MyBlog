<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'create.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Add User From</title>
  </head>
  
  <body>
    <form action="save" method="post">
        <fieldset>
        <legend>创建用户</legend>
            <p>
                <label>姓名：</label> <input type="text" id="username" name="username"
                    tabindex="1">
            </p>
            <p>
                <label>年龄：</label> <input type="text" id="userId" name="userId"
                    tabindex="2">
            </p>
            <p>
                <label>密码：</label> <input type="text" id="password" name="password"
                    tabindex="3">
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" value="取消"> <input
                    id="submit" type="submit" tabindex="5" value="创建">
            </p>
        </fieldset>
    </form>
  </body>
</html>
