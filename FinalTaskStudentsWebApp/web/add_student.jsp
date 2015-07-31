<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
        <style>
            label:nth-of-type(2){
                margin-left: 2px;
            }
            label:nth-of-type(3){
                margin-left: 33px;
            }
            label:nth-of-type(4){
                margin-left: 32px;
            }
            label:nth-of-type(5){
                margin-left: 40px;
            }
            label:nth-of-type(6){
                margin-left: 35px;
            }
            input{
                margin-top: 10px;
                margin-bottom: 10px;
            }
            select{
                margin-top: 10px;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <h2>Add Student</h2>
        <form action="AddStudentServlet" method="post">              
            <label for="firstname">First Name:</label>
            <input id="firstname" type="text" name="firstname"/><br/>
            <label for="lastname">Last Name:</label>
            <input id="lastname" type="text" name="lastname"/><br/>
            <label for="email">Email:</label>
            <input id="email" type="text" name="email"/><br/>
            <label for="phone">Phone:</label>
            <input id="phone" type="text" name="phone"/><br/>
            <label for="gpa">GPA:</label>
            <input id="gpa" type="text" name="gpa"/><br/>
            <label for="studentGroup">Label:</label>
            <select id="studentGroup" name="studentGroup">
                <c:forEach items="${groups}" var="group">
                    <option value="${group.id}"><c:out value="${group.label} and ${group.faculty}" /></option>
                </c:forEach>
            </select>
            <br/>            
            <input type="submit" value="Create student"/>
        </form>
    </body>
</html>
