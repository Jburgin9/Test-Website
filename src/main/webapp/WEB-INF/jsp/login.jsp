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
    <h1 style="margin: 0">Login</h1>
    <form:form action="login" method="get" modelAttribute="username">
        <form:label path="username">Enter Username</form:label>
        <form:input path="username"/> <br/>
        <form:label path="password">Enter Password</form:label>
        <form:input path="password"/> <br/>
        <form:button style="margin-top: .2%">Submit</form:button>
    </form:form>
</div>
</body>
</html>