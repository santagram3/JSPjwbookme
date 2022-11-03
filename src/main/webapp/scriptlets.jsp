<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립틀릿 -->
<%
   int a=10;
   int b=20;
   int result = sum(a,b); 
%>
<!-- expression  -->
<%=result %><br>
<%=number+10 %><br>
<!-- 선언(declaration) 변수나 메소드를 선언하는 영역 -->
<%-- jsp --%>
<%!
  int number =10;
public int sum(int a, int b){
	return a+b;
}
%>
<%-- <% Todo todo = new jwbook.Todo(); %> --%>
<jsp:useBean id="todo" class="jwbook.Todo"></jsp:useBean>
<%-- <% todo.setTno(5); %> --%>
<jsp:setProperty property="tno" name="todo" value="5"/>
<% todo.getTno(); %>
<jsp:getProperty property="tno" name="todo"/>
</body>
</html>