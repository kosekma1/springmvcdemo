<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student confirmation</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}
<br><br>
Language: ${student.favoriteLanguage}
<br><br>
Operating Systems:

<ul>
<c:forEach var="temp" items="${student.operatingSystems}">


<li> ${temp} </li>

</c:forEach>


</ul>



</body>
</html>