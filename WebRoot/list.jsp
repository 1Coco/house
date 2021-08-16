<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
    .odd {
		background-color: yellow;
		}
	.even {
		background-color: #cef;
		}
    </style>

  </head>
  
  <body>
  <h1>工作笔记</h1>
  <a href="/Working/insert.jsp">添加笔记</a>
  <table border="1" align="center" width="70%">
  	<thead>
  		<tr><th>编号</th><th>笔记标题</th><th>笔记内容</th><th>编写时间</th><th>笔记分类</th><th>操作</th></tr>
  	</thead>
  	<tbody>
  		<c:forEach var="w" items="${list }">
  			<tr>
  				<td>${w.id } </td>
                <td>${w.title}</td>
                <td>${w.content } </td>
                <td>${w.createDate}</td>
                    <c:if test="${w.type==1}">
                     	<td>技术</td>
                    </c:if>
                    <c:if test="${w.type==2}">
                   	     <td>行政</td>
                    </c:if>
                    <c:if test="${w.type==3}">
                   	     <td>技术</td>
                    </c:if>
               <td>
                 <a href="/Working/workingAction?method=selectId&id=${w.id }">查看</a>
               </td>
  		
  			</tr>
  		
  		</c:forEach>
  	</tbody>
  
  </table>
  </body>
</html>

 <script src="/Working/js/jquery-1.12.4.js"></script>
 <script>
 $(document).ready(function() {
		$('tr').addClass('odd');
		$('tr:even').addClass('even'); //奇偶变色，添加样式
	});
 
 </script>
