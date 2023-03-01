<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple JSP Calculator</title>
</head>
<body>
<% 
String choice = request.getParameter("operation");
int valueOne = Integer.parseInt(request.getParameter("num1"));
int valueTwo = Integer.parseInt(request.getParameter("num2"));

%>
<div style="text-align: center;height: 100vh; display:flex; align-items: center; justify-content: center;">
<% if(choice.equals("Plus")){ %>
<span>The Answer is  <%= valueOne + valueTwo %> </span>	
<% } %>
<% if(choice.equals("Minus")){ %>
<span>The Answer is  <%= valueOne - valueTwo %> </span>	
<% } %>
<% if(choice.equals("Multiply")){ %>
<span>The Answer is  <%= valueOne * valueTwo %> </span>	
<% } %>
<% if(choice.equals("Division")){ %>
<span>The Answer is  <%= valueOne / valueTwo %> </span>	
<% } %>
</div>
</body>
</html>