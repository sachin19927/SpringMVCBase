<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Reg Form</title>
<style type="text/css">
.error{color: red}
</style>
</head>
<body>

<form:form action="processform" modelAttribute="customer">
First Name:<form:input	path="firstName"/>
<br><br>
Last Name*: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br><br>

Free Passes: <form:input path="freePass"/>
<form:errors path="freePass" cssClass="error" />
<br><br>

PostalCode: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error" />
<br><br>

Cource Code: <form:input path="courceCode"/>
<form:errors path="courceCode" cssClass="error" />
<br><br>

<input type="submit" value="submit"/>
</form:form>

</body>
</html>