
  <!--  Page Directive --> 
  
<%--   <%@ page import="java.util.ArrayList" %> --%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
      <h1>I am in Auth JSP</h1>
      
     
       <!--  Scriptlet Tag -->
        <%       
         String username  = request.getParameter("username");
         String password  = request.getParameter("password");
         System.out.println("username"+ username);
         System.out.println("password" + password);
          out.println("You are logged in successfully!");
          
          ArrayList al = new ArrayList();
          al.add(username);
          al.add(password);
        %>
        
         <%= al %>
        
        <%!
        
        public void m1(){
      	  
        }
        %>
           <!-- Expression Tag -->
         <%= "Welcome ," + username %>
        <a href="./dashboard.jsp">Dashboard</a>
</body>
</html>