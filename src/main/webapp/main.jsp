<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>main페이지</title>
</head>
<body>
<h1>메인 페이지</h1>
<jsp:include page="header.jsp">
  <jsp:param value="My Homepage" name="title"/>
</jsp:include>
<%-- title이름으로 My HomePage값이 전달 --%>
</body>
</html>