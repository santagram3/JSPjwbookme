<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이동한페이지: ${user.name}<br>
request범위:${requestScope.user.name }<br>
세션범위:${sessionScope.user.name }<br>
어플리케이션범위:${applicationScope.user.name }<br>
</body>
</html>