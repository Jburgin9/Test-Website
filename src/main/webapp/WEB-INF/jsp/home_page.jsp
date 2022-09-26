<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css">
    <title>Document</title>
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
        <img class="" src="https://dayswingtrader.com/wp-content/uploads/2021/04/pexels-george-morina-4960464-1536x1024.jpg"
             style="width: 400px; height:400px; margin-left: 15%">
        <section class="plans">
            <div class="plans-container">
                <c:forEach items="${plans}" var="plan">
                    <div class="plan-card">
                        <div class="card-body">
                            <p class="card-title">${plan.name}</p>
                            <p class="card-text">${plan.description}</p>
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">Pricing: $${plan.price}</li>
                            <li class="list-group-item">Tier: ${plan.tier}</li>
                        </ul>
                    </div>
                </c:forEach>
            </div>
        </section>
    </div>
</section>

</body>
</html>