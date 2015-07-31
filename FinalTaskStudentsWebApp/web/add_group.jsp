<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add group</title>
        <style>
            input{
                margin-top: 10px;
                margin-bottom: 10px;
            }
            label:nth-of-type(1){
                margin-left: 11px;
            }
        </style>
    </head>
    <body>
        <h2>Add group</h2>
        <form action="AddGroupServlet" method="post">   
            <label for="label">Label:</label>
            <input id="label" type="text" name="groupLabel"/><br/>
            <label for="faculty">Faculty:</label>
            <input id="faculty" type="text" name="groupFaculty"/><br/>
            <input type="submit" value="Create group"/>
        </form>
    </body>
</html>
