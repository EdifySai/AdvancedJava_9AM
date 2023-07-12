
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <center>
 <h1>Add Employee</h1>
 <form:form method="post" action="./addEmployee" modelAttribute="employee">
  <form:input type="text" path="name" placeholder="enter name"/> <br><br>
  <form:input type="text" path="project" placeholder="enter project"/><br><br>
    <form:input type="text" path="location" placeholder="enter location"/><br><br>
      <form:input type="text" path="reportingManager" placeholder="enter reportingManager"/><br><br>
  <form:button>Add Employee</form:button>
  </form:form>
   <a href="./showEmployees">Show Employees</a>
 <h1> ${message}</h1> 
 
 <table>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>Employee ID: <c:out value="${employee.id}"/></td>
            <td>Employee Pass: <c:out value="${employee.name}"/></td>  
        </tr>
    </c:forEach>
</table>
  </center>
</body>
</html>
