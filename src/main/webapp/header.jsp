<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>
<%-- request.getParameter(파라미터명) 리턴결과 String 
   request.getAttribute(속성명,객체) 리턴결과 Object ->형변환
--%>
<h2><%=request.getParameter("title") %></h2>
</body>
</html>