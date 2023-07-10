<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
  <center>
 <h1>Login here</h1>
 
 <form method="post" action="./authenticate">
  <input type="text" name="username" placeholder="enter username"> <br><br>
  <input type="text" name="password" placeholder="enter password"><br><br>
  <button>Login</button>
  </form>
 <h1 style="color:red"> ${message}</h1> 
  
  </center>
 
</body>
</html>