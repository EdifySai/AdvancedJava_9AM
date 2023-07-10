<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
  <center>
 <h1>Login here</h1>
 
 <form:form method="post" action="./authenticate" modelAttribute="user">
  <form:input type="text" path="username" placeholder="enter username"/> <br><br>
  <form:input type="text" path="password" placeholder="enter password"/><br><br>
  <form:button>Login</form:button>
  </form:form>
 <h1 style="color:red"> ${message}</h1> 
  
  </center>
 
</body>
</html>