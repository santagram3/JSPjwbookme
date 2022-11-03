<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Required meta tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Hello, world!</title>
<style>
body{color:blue;}
h2{color:red;}
h2{background:green;}
</style>
</head>
<body>
<h2>Hello World</h2>
<button type="button" class="btn btn-danger">Danger</button>
<button type='button' class='btn btn-info'>정보</button>
<hr>
현재 날짜와 시간은 <%=LocalDateTime.now() %>
</body>
</html>