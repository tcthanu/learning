<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<h1>Student Registration </h1>
<html:form action="student.do" method="post" >
<bean:message key="label.user.name" /> <html:text property="firstName" name="StudentForm"></html:text>
<html:submit></html:submit>
</html:form>

</form>
</body>
</html>