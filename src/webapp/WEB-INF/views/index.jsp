<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27.02.2018
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body class="home">
<!-- Header -->
<header id="head">
    <div class="container">
        <div class="row">
            <h1 class="lead">THE BEST LIBRARY IN LVIV</h1>
            <p class="tagline">Pump your brain with our books</p>
            <p>
                <a class="btn btn-default btn-lg" role="button">MORE INFO</a>
                <a class="btn btn-action btn-lg" href="/">Show available books</a>
            </p>
        </div>
    </div>
</header>
<!-- /Header -->

<!-- Intro -->
<div class="container text-center">
    <br> <br>
    <h2 class="thin">Best of 4 per month</h2>
    <p class="text-muted">
        The most popular choices among readers
    </p>
</div>
<!-- /Intro-->

<!-- Highlights - jumbotron -->
<div class="jumbotron top-space">
    <div class="container">

        <div class="row">
            <c:forEach var="book" items="${books}">

            <!-- BookCard  -->
            <div class="col-md-3 col-sm-6 highlight">
                <div class="h-caption">
                    <h4><img src="https://i2.wp.com/365webresources.com/wp-content/uploads/2017/11/Paperback-Book-Mockup-PSD-Templates.png?resize=544%2C405&ssl=1" alt="">${book.name}</h4>
                </div>
                <div class="h-body text-center">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                        Atque aliquid adipisci aspernatur. Soluta quisquam dignissimos earum quasi voluptate.
                        Amet, dignissimos, tenetur vitae dolor quam iusto assumenda hic reprehenderit?
                    </p>
                </div>
            </div>
            </c:forEach>
        </div>
        <!-- /row  -->

    </div>
</div>
<!-- /Highlights -->
</body>


