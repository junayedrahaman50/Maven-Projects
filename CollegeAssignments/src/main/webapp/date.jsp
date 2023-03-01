<%@ page import="java.io.*,java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Date Program</title>
</head>
<body>
<% Integer counter = (Integer)application.getAttribute("visits"); 
if(counter == null || counter== 0){
	counter = 1;
}
else{
	counter++;
}
application.setAttribute("visits", counter);

%>
<h4> Total number the link is clicked = <%= counter %></h4>

<%-- %><h1>Current Date is <%= new Date() %></h1> --%>
</body>
</html>