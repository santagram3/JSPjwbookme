<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>회원 가입 폼 만들기 예제</title>
<style>
h2{border-radius: 5px; background-color:wheat; text-align:center;
   padding:15px 0;}
#regform{padding: 15px 20px; border-radius: 10px; margin: auto;
         width:50%; background-color: SandyBrown;} 
.result{display: none;}   
</style>
</head>
<body>
 <h2><b>회원가입</b></h2>
 <hr>
 <div id="regform">
  <form name='form1' action="useBeanExam3.jsp" method="post">
   <label>이름</label>
   <input type='text' name='name' value='일지매' size="40"><br>
   <hr>
   <label>이메일</label>
   <input type='email' name='email' value='il@daum.net' size="40"><br>
   <button type="submit" >가입</button>
  </form>
 </div>

</body>
</html>