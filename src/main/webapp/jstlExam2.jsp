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
	List<Member> members = new ArrayList<>();

    members.add(new Member("hong","hong@naver.com"));
    members.add(new Member("kim","kim@naver.com"));
    members.add(new Member("wang","wang@naver.com"));
    members.add(new Member("zang","zang@naver.com"));
    members.add(new Member("kang","kang@naver.com"));
    members.add(new Member("im","im@naver.com"));
    members.add(new Member("zzang","zzang@daum.net"));
    
    request.setAttribute("members", members);
    
%>
<c:set var="end" value="4"/>
<ul>
<c:forEach var="m" items="${members}" begin="0" end="${end}" varStatus="i">
  <li>${i.index}- ${m.name}-${m.email}</li>
</c:forEach>
</ul>
</body>
</html>