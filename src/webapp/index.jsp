<%--
  Created by IntelliJ IDEA.
  User: ndemyanovskyi
  Date: 22.02.2018
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Головна</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/theListOfAllBooks">Знайти цікаву книгу</a></li>
                <li><a href="#">Зареєструватись</a></li>
                <li><a href="#">Увійти</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- First Container -->
<div class="container-fluid bg-1 text-center">
    <h2 class="margin">Книги - це інструмент насадження мудрості.</h2>
</div>



<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
    <p>К-сть відвідувань</p>
    <p><%=(request.getAttribute("current_count")== null ? "error": request.getAttribute("current_count"))%>></p>
</footer>

</body>
</html>
