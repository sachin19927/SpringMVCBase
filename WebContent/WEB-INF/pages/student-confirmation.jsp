<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Reg Form</title>
</head>
<body>
Studnet Confirmed : ${student.firstName }  ---  ${student.lastName } --- ${student.country } -- ${student.lanuage }--${student.city }

<br>
<br>
Operating system
<ul>
<c:forEach var="temp" items="${ student.oprSystem}">
<li>${temp}</li>
</c:forEach>
</ul> 
</body>
</html>