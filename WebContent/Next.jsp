<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HMS</title>
</head>
<center>
<body >
<%
String Loginname = request.getParameter("name");
String Password = request.getParameter("pswd");
if(Loginname.equals("admin") && Password.equals("admin"))
{
	response.sendRedirect("OK.jsp");
}else
{
	response.sendRedirect("Failure.jsp");
}
%>
</body></center>
</html>