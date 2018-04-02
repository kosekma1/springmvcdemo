<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName" /> <br><br>
Last name (*): <form:input path="lastName" cssClass="error" /> <br><br>

<br><br>

<form:select path="country">   <!-- call method student.setCountry(...) on submit -->
            
  <form:options items="${theCountryOptions}" /> <!-- new variable for load properties -->
  
</form:select>

<br><br>
Favorite language:
<form:radiobuttons path="favoriteLanguage" items="${theFavoriteLanguageOptions}" />  <!-- variable defined in controller -->

<br><br>

Operating system
Linux <form:checkbox path="operatingSystems" value="Linux" /> <!--  on submit, Spring will call student.setOperatingSystems(...) -->
Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />


<input type="submit" value="Submit">

</form:form>

</body>
</html>