<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'insert.jsp' starting page</title>
    
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
  	<h1>我的工作笔记</h1>
  	<form action="/Working/workingAction?method=insert" method="post">
   		<p>标题：<input type="text" name="title" required /></p>
   		<p>内容：<input type="textarea" name="content" required /></p>
   		<p>时间：<input type="text" name="createDate" required /></p>
   		<p>类别：
   			<select name="type">
 	  			<option>请选择所属分类：</option>
 	  			<option value="1">技术</option>
 	  			<option value="2">行政</option>
 	  			<option value="3">人事</option>
 	  		</select>
   		</p>
   		<p><input type="submit" value="新增" /></p>
  </body>
</html>
 <script src="/Working/js/jquery-1.12.4.js"></script>
 <script>

	$(function(){
		var insertCode='${insertCode}';
		if('true'== insertCode){
			alert('新增成功！');
			window.location.href='/Working/workingAction?method=all';
		}else if('false' == insertCode){
			alert('新增失败');
		}
	})
 </script>
