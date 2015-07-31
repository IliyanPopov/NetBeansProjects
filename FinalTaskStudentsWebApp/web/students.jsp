<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students database</title>
    </head>
    <body>
        <h1>Students list</h1>        
        <table>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>email</th>
                <th>phone</th>
                <th>gpa</th>
                <th>groupId</th>
                <th>Faculty</th>
                <th>Label</th>
            </tr>            
            <c:forEach items="${students}" var="student">
                <tr>
                    <td><c:out value="${student.id}"/></td>
                    <td><c:out value="${student.firstName}"/></td>
                    <td><c:out value="${student.lastName}"/></td>
                    <td><c:out value="${student.email}"/></td>
                    <td><c:out value="${student.phone}"/></td>
                    <td><c:out value="${student.gpa}"/></td>
                    <td><c:out value="${student.groupId}"/></td> 
                    <td><c:out value="${student.faculty}"/></td>  
                    <td><c:out value="${student.label}"/></td>  
                    <td><a href="DeleteStudentServlet?id=${student.id}">Delete</a></td>
                    <td><a href="EditStudentServlet?id=${student.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
