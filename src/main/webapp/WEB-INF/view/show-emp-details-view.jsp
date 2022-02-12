<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME !!!</h2>
<br>
<br>

Your name : ${employee.name}
<br><br>
Your surname : ${employee.surName}
<br><br>
Your salary : ${employee.salary}
<br><br>
Your Department : ${employee.department}
<br><br>
Your car : ${employee.carBrand}
<br><br>
Language(s) :
<ul>
    <c:forEach var="lang" items="${employee.languages}">

        <li>       ${lang}        </li>


    </c:forEach>

</ul>

EmpNumber : ${employee.empNumber}

</body>

</html>
