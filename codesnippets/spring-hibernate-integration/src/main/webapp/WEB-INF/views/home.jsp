
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<style>

 tr{
 text-align:center
 }

</style>
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
 <h1> ${message}</h1> 
 
 <table border="1" width="100%">
     <thead>
           <th>Name</th>
            <th>Project</th>
            <th>Location</th>
            <th>Reporting Manager</th>
             <th colspan="2">Operation</th>
     </thead>
     
     <tbody>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td><c:out value="${employee.name}"/></td>
            <td><c:out value="${employee.project}"/></td>  
             <td><c:out value="${employee.location}"/></td> 
             <td><c:out value="${employee.reportingManager}"/></td> 
             <td><a href="./deleteEmployee?id=<c:out value="${employee.id}"/>">Delete</a></td>  
             <td><a href="./updateEmployee">Edit</a></td>   
        </tr>
    </c:forEach>
    </tbody>
</table>
  </center>
</body>
</html>
