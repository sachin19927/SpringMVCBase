<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Reg Form</title>
</head>
<body>

<form:form action="processform" modelAttribute="student">
First Name:<form:input	path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
<%-- <form:select path="country">
<form:option value="IND" label="India"/>
<form:option value="PAK" label="Pakistan"/>
<form:option value="USA" label="America"/>
<form:option value="UK" label="London"/>
</form:select> --%>

<br><br>
<form:select path="country">
<form:options items="${student.stateoption}" />
</form:select>
<br><br>
<br>
<form:select path="city"> 
 <form:options items="${theCountryOptions}" />
</form:select>
<br>

Favuotie Lang
Java<form:radiobutton path="lanuage" value="Java"/>
Ruby<form:radiobutton path="lanuage" value="Ruby"/>
Python<form:radiobutton path="lanuage" value="Python"/>
Sql<form:radiobutton path="lanuage" value="Sql"/>

<br>
Domain
<form:radiobuttons path="domain" items="${student.domianOption}" />
<br>
Operating System Known

Windows <form:checkbox path="oprSystem" value="windows"/>
Linux <form:checkbox path="oprSystem" value="linux"/>
Ubuntu <form:checkbox path="oprSystem" value="ubnutu"/>
<br>

<input type="submit" value="submit"/>
</form:form>

</body>
</html>