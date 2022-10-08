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
    <link rel="stylesheet" href="/resources/static/css/style.css">
    <title>Trade Page</title>
</head>

<body>
<section>
    <div class="nav-holder">
        <nav class="sticky-top">
            <a href="/home" class="home">Home</a>
            <a href="/home/login" class="login">Login</a>
            <a href="/home/register" class="register">Register</a>
            <a href="/home/trades" class="trades">Trades</a>
            <a href="#" class="principles">Principles</a>
            <a href="#" class="gameplan">Game Plan</a>
        </nav>
    </div>
</section>
<div class="trades_holder">
    <div class="trades_table">
        <h4 class="table_header">Trade Alerts</h4>
        <form:form action="displayTrade" method="get" modelAttribute="displayTrade">
            <table>
                <tr>
                    <th>symbol</th>
                    <th>type</th>
                    <th>strike</th>
                    <th>expiration</th>
                    <th>price</th>
                    <th>target</th>
                </tr>
                <c:forEach var="trade" items="${displayTrade}">
                    <tr>
                        <td>${trade.symbol}</td>
                        <td>${trade.type}</td>
                        <td>${trade.strike}</td>
                        <td>${trade.expiration}</td>
                        <td>${trade.price}</td>
                        <td>${trade.target}</td>
                    </tr>
                </c:forEach>
            </table>
        </form:form>
    </div>
    <div class="trades_display">
        <h1 style="margin: 0">Trades</h1>
        <form:form action="trades" method="post" modelAttribute="tradeIdea">
            <form:label path="symbol">Enter Symbol</form:label>
            <form:input path="symbol"/> <br/>
            <form:label path="type">Enter Type</form:label>
            <form:input path="type"/> <br/>
            <form:label path="strike">Enter Strike</form:label>
            <form:input path="strike"/> <br/>
            <form:label path="expiration">Enter Expiration</form:label>
            <form:input path="expiration"/> <br/>
            <form:label path="price">Enter Price</form:label>
            <form:input path="price"/> <br/>
            <form:label path="target">Enter Target</form:label>
            <form:input path="target"/> <br/>
            <form:button style="margin-top: .2%">Submit</form:button>
        </form:form>
    </div>
</div>
</body>
</html>