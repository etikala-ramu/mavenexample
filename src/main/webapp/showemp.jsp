<%@page import="com.maven.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="/ServletJspDemo/InsertData" method="post">
 <p>eid:</p>  
        <!-- Create an element with mandatory name attribute, 
        so that data can be transfer to the servlet using getParameter() -->
        <br/> 
        <p>ename:</p>  
        <input type="text" name="name"/> 
        <p>email:</p>  
        <input type="text" name="mail"/>
        <br/><br/><br/> 
        <input type="submit"/> 
    </form>
</body>
</html>