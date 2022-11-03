<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 현재페이제 맞도록 문자셋 설정 -->
<%-- script let(자바코드 영역) --%>
<% request.setCharacterEncoding("utf-8"); %>
<%-- expression(출력) --%>
<%=request.getParameter("name")%><br>
<%=request.getParameter("email") %><br>
<%=request.getRequestURL() %><br>
<%=request.getRequestURI() %><br>
<%=request.getScheme() %><br>
<%=request.getServerName() %><br>
<%=request.getServerPort() %><br>
<%=request.getContextPath() %><br>
<%=request.getMethod() %><br>
<%=request.isSecure()%><br>
<%=request.getLocale()%><br>
<%=request.getProtocol()%><br>
<%=request.getProtocol()%><br>
<%=request.getLocalAddr() %><br>
<%=request.getRemoteAddr() %><br>

<hr>
<%=response.getContentType() %><br>
<% List<String> names=(List<String>)response.getHeaderNames(); 
   for(String s:names)out.print(s+"<br>");
%>
<hr>
<%
   Cookie cookie = new Cookie("id","hong");
  //생성된 쿠키를 브라우저로 전달
   response.addCookie(cookie);
%>
<%--<%
   //다른페이지로 이동하도록 전달하는 메소드
   response.sendRedirect("http://www.naver.com");
--%>


</body>
</html>