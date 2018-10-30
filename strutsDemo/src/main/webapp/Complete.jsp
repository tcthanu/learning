<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete</title>
</head>
<body>
<h1>Welcome <bean:write name="StudentForm" property="firstName"/> </h1>
<h1> Registration Completed ... </h1>
</body>
</html>