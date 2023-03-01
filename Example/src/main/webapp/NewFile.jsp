<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple JSP Program</title>
</head>
<body>
<%
String s = request.getParameter("num");
//int length = s.length();
if(s != "" && s.length() < 10){
int num = Integer.parseInt(s);
if(num %2 == 0)
	out.println(num+" is Even Number");
else
	out.println(num+" is Odd Number");
}
else{
	out.println("Wrong value!");
}
%>
</body>
</html>