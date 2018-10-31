<%@page import="com.fita.sample.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<html:form action="employee" method="post" >
		FirstName :<html:text property="firstName"  name="empForm"/> <br>
		Last Name :<html:text property="lastName"  name="empForm"/> <br>
		Salary <html:text property="salary"  name="empForm"/> <br>
		<input type="submit" name="event" value="add" >
	</html:form>
 <%
 if(request.getAttribute("empList")!=null){
   List<Employee> empList =(List) request.getAttribute("empList");
 	for(Employee e:empList){
 	out.println(e.getFirstName());
 	out.println(e.getLastName());
 	out.println(e.getSalary());
 	out.println("<br>");
 	}
 }	
 %>
</body>
</html>