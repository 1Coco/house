<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'chakan.jsp' starting page</title>
    
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
  	<p>标题： ${wobj.title }</p>
  	<p>内容： ${wobj.content }</p>
  	<p>类别：
  			<c:if test="${wobj.type==1 }">技术</c:if>
  			<c:if test="${wobj.type==2 }">行政</c:if>
  			<c:if test="${wobj.type==2 }">人事</c:if>
  	</p>
  	<p>日期： ${wobj.createDate }</p>
  	<a href="list.jsp">返回</a>
  </body>
</html>
