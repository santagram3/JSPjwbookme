<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>main페이지</title>
</head>
<body>
<!-- forward를 하면 현재페이지의 내용을 모두 버리고 이동 -->
<h1>메인 페이지</h1>
<jsp:forward page="header.jsp">
  <jsp:param value="My Homepage" name="title"/>
</jsp:forward>
<%-- title이름으로 My HomePage값이 전달 --%>

</body>
</html>