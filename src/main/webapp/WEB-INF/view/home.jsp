<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/static/css/style.css">
    <title>Home</title>
</head>
<body>
<section>
    <div class="nav-holder" >
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

<section>
    <div class="mid-section">
        <p class="about-us">We trade options every week and gave out alerts to users who register. These trades/alerts aren't
        guaranteed and if you decide to make a trade, know that this is at your own risk. We give out our ideas
        and some analysis/thoughts why we believe our trades. This is 100% on YOU!</p>
        <button class="btn btn-primary">GET STARTED</button>
    </div>
</section>

<section>
    <div class="plans-section">
        <img class="plans-img" src="https://images.unsplash.com/photo-1499750310107-5fef28a66643?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80">
        <section class="plans">
            <div class="plans-container">
                <c:forEach items="${plans}" var="plan">
                    <div class="plan-card">
                        <div class="card-body">
                            <p class="card-title">${plan.name}</p>
                            <p class="card-text">${plan.description}<br/>${plan.price}</p>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </div>
</section>

<footer style="background-color: black;">
    <div class="container p-4">
        <div class="row">
            <p style="color: white">
                DISCLAIMER: WE ARE NOT GUARANTEEING MONEY WITH ANY OF OUR IDEAS. WE ONLY POST WHAT WE
                ARE DOING AND IT IS ON YOU! TO DECIDE IF YOU WANT TO EXECUTE A TRADE. PLEASE DO YOUR
                OWN DUE DILIGENCE AND ASK QUESTIONS BEFORE MAKING A MOVE
            </p>
        </div>
    </div>
    <div class="text-center p-3" style="background-color: black;">
        © 2020 Copyright:
        <a class="text-dark" href="https://mdbootstrap.com/">MDBootstrap.com</a>
    </div>
    <!-- Copyright --></footer>
</body>
</html>