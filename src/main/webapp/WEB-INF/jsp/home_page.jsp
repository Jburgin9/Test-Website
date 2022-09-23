<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body style="background-color: aliceblue">
<section>
    <div class="container" style="display: flex; justify-content: center; align-items: center; flex-direction: column">
        <div class="company_name">
            <h1 style="font-size: 25px;">H BLOCK</h1>
        </div>
        <div class="menu_list">
            <nav>
                <a href="/home" class="home">Home</a>
                <a href="/home/login" class="login">Login</a>
                <a href="/home/register" class="register">Register</a>
                <a href="#" class="principles">Principles</a>
                <a href="#" class="gameplan">Game Plan</a>
            </nav>
        </div>
    </div>
</section>
<hr style="margin: 20px 0">

<section>
    <div style="display: flex; align-items: center; flex-direction: column; ">
        <h2 style="font-style: italic; font-size: 20px;
        inline-size: 90%; overflow-wrap: normal">Nulla malesuada pellentesque elit eget
            gravida cum sociis
            natoque penatibus. Enim eu turpis egestas pretium.
            Aliquam nulla facilisi cras fermentum odio eu feugiat pretium. Commodo viverra maecenas accumsan lacus.
            Pellentesque sit amet porttitor eget dolor morbi non arcu risus. Leo vel orci porta non pulvinar neque.
            Risus at
            ultrices mi tempus imperdiet nulla. Semper risus in hendrerit gravida rutrum quisque non tellus orci. Tempus
            egestas sed sed risus pretium quam vulputate dignissim suspendisse. A cras semper auctor neque vitae tempus.
            Aenean sed adipiscing diam donec adipiscing tristique risus. Eget sit amet tellus cras adipiscing enim eu
            turpis
            egestas. Elementum eu facilisis sed odio morbi quis commodo. Elit pellentesque habitant morbi tristique
            senectus
            et netus. Semper eget duis at tellus at urna condimentum mattis. A erat nam at lectus urna. Praesent
            elementum
            facilisis leo vel. Ut sem viverra aliquet eget sit amet tellus cras adipiscing. Eget nullam non nisi est sit
            amet facilisis magna. Est pellentesque elit ullamcorper dignissim cras.</h2>
        <button style="align-self: flex-end; margin-right: 5%">GET STARTED</button>
    </div>
</section>

<section class="mid">
    <div class="container" style="display: flex; flex-direction: row">
        <img src="https://dayswingtrader.com/wp-content/uploads/2021/04/pexels-george-morina-4960464-1536x1024.jpg"
             style="width: 400px; height:400px; margin-left: 15%">
        <div class="about" style="inline-size: 50%; overflow-wrap: normal; margin-left: 2%">
            <p>Nunc non blandit massa enim. Neque laoreet suspendisse interdum consectetur libero. Volutpat odio
                facilisis mauris sit amet massa vitae tortor condimentum. Elit ut aliquam purus sit amet. Quis eleifend
                quam adipiscing vitae proin sagittis nisl rhoncus mattis. Malesuada nunc vel risus commodo viverra
                maecenas accumsan. Egestas tellus rutrum tellus pellentesque eu. Mattis aliquam faucibus purus in massa
                tempor nec feugiat nisl. Integer quis auctor elit sed vulputate mi sit. Nam aliquam sem et tortor
                consequat id porta nibh venenatis. Enim nec dui nunc mattis enim ut tellus elementum. Nunc mattis enim
                ut tellus. Amet volutpat consequat mauris nunc congue nisi vitae suscipit tellus. Phasellus faucibus
                scelerisque eleifend donec pretium vulputate sapien nec sagittis. Nec feugiat in fermentum posuere urna
                nec tincidunt praesent semper. Non blandit massa enim nec dui nunc mattis enim ut. Pulvinar elementum
                integer enim neque volutpat ac tincidunt vitae semper.</p>
        </div>
    </div>
</section>

<hr style="margin: 20px 0">

<section class="plans">
    <div class="container" style="display: flex; flex-direction: row; justify-content: space-evenly">
        <c:forEach items="${plans}" var="plan">
            <div class="card" style="width: 18rem; padding: 15px; border: cadetblue">
                <div class="card-body">
                    <h5 class="card-title">${plan.name}</h5>
                    <p class="card-text">${plan.description}</p>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">Pricing: $${plan.price}</li>
                    <li class="list-group-item">Tier: ${plan.tier}</li>
                </ul>
<%--                <div class="card-body">--%>
<%--                    <a href="#" class="card-link">Card link</a>--%>
<%--                    <a href="#" class="card-link">Another link</a>--%>
<%--                </div>--%>
            </div>
        </c:forEach>
    </div>
</section>

</body>
</html>