<%-- 
    Document   : ventas1
    Created on : 16-nov-2021, 12:39:33
    Author     : estela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int num =98; double num2 = 52.25; 
         double suma(){
          return num+num2;
         }
        %> 
        <% 
        String nombre="Estela";
        String usuario= request.getParameter("usuario");
        out.println("<p>"+num+"</p>");
        out.println("<p>"+suma()+"</p>");
        %>
        
        <h1>Hello <%=nombre%></h1>
        <p> <%java.util.Date fecha = new java.util.Date();%><%=fecha%></p>
    </body>
</html>
