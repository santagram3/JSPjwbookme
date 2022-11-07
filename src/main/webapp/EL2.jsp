<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="jwbook.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
   String[] myList = {"hello","hi","bye","greeting"};
   pageContext.setAttribute("myList", myList);
%>
<%
	Map<String,String> names =new HashMap<String,String>();
    names.put("name", "길동");
    names.put("id", "hong");
    names.put("addr", "서울시");
    pageContext.setAttribute("names", names);
%>
<jsp:useBean id="user" class="jwbook.model.Member" 
             scope="session"></jsp:useBean>
<jsp:setProperty property="name" name="user" value="홍길동"/>
<jsp:forward page="forwarded.jsp"></jsp:forward>
</head>
<body>
<%-- Expression Language(EL) <%=%> -> ${속성} --%>
${10+20}<br>
<%=10+20 %><br>
${10*20 }<br>
${true && false }<br>
${10>=20 }<br>
${user.name}<br><!-- 모든 scope에서 찾아서 있으면 사용함 -->
${user.name=="홍길동"?"교수":"학생" }<br>
<hr>
${myList[1]}<br> 
${names["name"]}<br>
</body>
</html>