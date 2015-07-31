<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <p>
            <c:forEach items="${days}" var="day">
                ${day}
            </c:forEach>

        </p>    

        <p>
        <table border="1" >
            <c:forEach items="${students}" var="student">

                <tr>
                    <td>${student.name}</td>
                    <td>${student.id}</td> 

                </tr>


            </c:forEach>
        </table>

    </p>  

    <p>
        ${student.id}: ${student.name} //this is using not the field name, but the method getName
    </p>    

    <p>
        <c:if test="${!empty student.friend}">
            Friend: ${student.friend.name}
        </c:if>
        <c:if test="${empty student.friend}">
            No friends found !
        </c:if>
    </p>



</body>
</html>
