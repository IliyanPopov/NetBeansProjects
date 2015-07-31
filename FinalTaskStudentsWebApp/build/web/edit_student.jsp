<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Student</title>
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
        <h2>Edit student</h2>
       <form action="SaveStudentServlet" method="post">              
            <label for="firstname">First Name:</label>
            <input id="firstname" type="text" name="firstname" value="${student.firstName}"/><br/>
            <label for="lastname">Last Name:</label>
            <input id="lastname" type="text" name="lastname" value="${student.lastName}"/><br/>
            <label for="email">Email:</label>
            <input id="email" type="text" name="email" value="${student.email}"/><br/>
            <label for="phone">Phone:</label>
            <input id="phone" type="text" name="phone" value="${student.phone}"/><br/>
            <label for="gpa">GPA:</label>
            <input id="gpa" type="text" name="gpa" value="${student.gpa}"/><br/>            
            <input type="hidden" name="id" value="${student.id}"/>
            <input type="submit" value="Update student"/>
        </form>
    </body>
</html>
