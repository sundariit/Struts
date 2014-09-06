<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PatientRecord</title>
</head>

<body BGcolor = #606060>
<center>
<s:form action = "enter">
<h4>Patient Record</h4>
<table border = 1>
<tr><th>Sno</th>
<th>patientname</th>
<th>age</th>
<th>complaints</th>
<th>appointtime</th></tr>
<tr><s:iterator value = "list">
<tr>
<td><s:property value = "Sno"/></td>
<td><s:property value = "patientname"/></td>
<td><s:property value = "age"/></td>
<td><s:property value = "complaints"/></td>
<td><s:property value = "appointtime"/></td></tr>
</s:iterator></tr></table><br>
<center>
<s:submit value = "Add"/>
</center>
</s:form>
</center>
</body>
</center>
</html>