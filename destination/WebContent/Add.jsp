<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Appointments</title>
</head><center>
<body BGcolor = #606060>
<s:form action = "savedetails">
<h4>Enter details</h4>
<s:textfield name = "Sno" label = "Sno"/>
<s:textfield name = "patientname" label = "patientname"/>
<s:textfield name = "age" label = "age"/>
<s:textfield name = "complaints" label = "complaints"/>
<s:textfield name = "appointtime" label = "appointtime"/>
<s:submit value = "submit"/>
</s:form>
</body></center>
</html>