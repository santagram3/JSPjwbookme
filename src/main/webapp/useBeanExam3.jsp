<%@page import="jwbook.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8"><title>useBean</title>
</head>
<body>
<%
    //request로 넘어온 데이타가 현재페이지에 맞도록 문자셋 을 설정
    request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="member" class="jwbook.model.Member" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="member" />
                 
이름:<jsp:getProperty property="name" name="member"/><br>
이메일:<jsp:getProperty property="email" name="member"/><br>                 
</body>
</html>
