<%@page import="jwbook.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>useBean</title>
</head>
<body>
<%
    //request로 넘어온 데이타가 현재페이지에 맞도록 문자셋 을 설정
    request.setCharacterEncoding("utf-8");
	Member member =new Member();

    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
%>
<%=member.getName() %> - <%=member.getEmail() %><br>

</body>
</html>