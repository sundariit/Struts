<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hospital Management System</title>
</head>
<body BGcolor = #606060>
<center><h4>Hospital Management System</h4>
<s:form action = "next">
<s:textfield name = "name" label = "Loginname"/>
<s:textfield name = "pswd" label = "Password"/>
<s:submit value = "submit"/>
</s:form></center>
</body>
</html>