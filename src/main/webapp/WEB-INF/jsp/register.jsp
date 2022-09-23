<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Login Page</title>
</head>

<body>
<div style="display: flex; justify-content: center; flex-direction: column; align-items: center; margin-top: 5%">
    <h1 style="margin: 0">Register</h1>
    <form:form action="login" method="post" modelAttribute="newUser">
        <form:label path="desiredUsername">Enter Desired Username</form:label>
        <form:input path="desiredUsername"/> <br/>
        <form:label path="desiredPassword">Enter Desired Password</form:label>
        <form:input path="desiredPassword"/> <br/>
        <form:button style="margin-top: .2%">Submit</form:button>
    </form:form>
</div>
</body>
</html>