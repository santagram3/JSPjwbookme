<%@page import="jwbook.model.Member"%><%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html><html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>memberlist</h1>
<%
List<Member>mlist =(List<Member>)request.getAttribute("mlist");
%>
<% 
	for(Member m:mlist){
%>
<%=m.getName() %><%=m.getEmail() %><br>
<%} %>

<hr>

<c:forEach var="i" begin="1" end="10">
  ${i}<br><%-- out.print(i); --%>
</c:forEach>
<hr>

<hr>
<c:forEach var="mem" items="${mlist}">
  ${mem.name},${mem.email}<br><%-- out.print(mem.getName()); --%>
</c:forEach>


</body>
</html>