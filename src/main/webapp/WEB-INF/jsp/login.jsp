<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css">
    <title>Login Page</title>
</head>

<body>
<section>
    <div class="nav-holder" >
        <nav class="sticky-top">
            <a href="/home" class="home">Home</a>
            <a href="/home/login" class="login">Login</a>
            <a href="/home/register" class="register">Register</a>
            <a href="#" class="principles">Principles</a>
            <a href="#" class="gameplan">Game Plan</a>
        </nav>
    </div>
</section>
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