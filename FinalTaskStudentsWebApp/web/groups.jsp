<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Groups database</title>
    </head>
    <body>
        <h1>Groups list</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Label</th>
                <th>Faculty</th>                
            </tr>            
            <c:forEach items="${groups}" var="group">
                <tr>
                    <td><c:out value="${group.id}"/></td>
                    <td><c:out value="${group.label}"/></td>
                    <td><c:out value="${group.faculty}"/></td>
                    <td><a href="DeleteGroupServlet?id=${group.id}">Delete</a></td>
                    <td><a href="EditGroupServlet?id=${group.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
