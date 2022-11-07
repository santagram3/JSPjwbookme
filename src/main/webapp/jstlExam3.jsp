<%@page import="jwbook.model.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>JSTL종합예제</title>
</head>
<body>
<h2>jstl 종합 예제</h2>
<hr>
<%
//	3단 	부터 6단 까지 구구단 출력 하기
	//3과 6은 <c:set으로 선언 하여 사용하기>    
%>
<c:set var="begin" value="3"/>
<c:set var="end" value="6"/>
<ul>
<c:forEach var="i" begin="${begin}" end="${end}">
  <c:forEach var="j" begin="1" end="9">
     ${i} x ${j} =${i*j} &nbsp;&nbsp;&nbsp;&nbsp;
  </c:forEach>
     <br>
</c:forEach>
</ul>
</body>
</html>