<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27.02.2018
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Library Online</title>

    <link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/font-awesome.min.css">

    <!-- Custom styles for our template -->
    <link rel="stylesheet" href="/resources/css/bootstrap-theme.css" media="screen">
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->--%>
    <%--<!--[if lt IE 9]>--%>
    <%--<script src="assets/js/html5shiv.js"></script>--%>
    <%--<script src="assets/js/respond.min.js"></script>--%>
    <%--<![endif]-->--%>
</head>

<body class="home">
<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top headroom">
    <div class="container">
        <div class="navbar-header">
            <!-- Button for smallest screens -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
            <a href="/"><img src="/resources/images/logo.png" alt="Logo"></a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="/">About</a></li>
                <li class="dropdown">
                    <a href="/" class="dropdown-toggle" data-toggle="dropdown">More Pages <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/">Left Sidebar</a></li>
                        <li class="active"><a href="/">Right Sidebar</a></li>
                    </ul>
                </li>
                <li><a href="/">Contact</a></li>
                <li><a class="btn" href="/">SIGN IN / SIGN UP</a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
<!-- /.navbar -->

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

<footer id="footer" class="top-space">

    <div class="footer1">
        <div class="container">
            <div class="row">

                <div class="col-md-3 widget">
                    <h3 class="widget-title">Contact</h3>
                    <div class="widget-body">
                        <p>+234 23 9873237<br>
                            <a href="mailto:#">some.email@somewhere.com</a><br>
                            <br> 234 Hidden Pond Road, Ashland City, TN 37015
                        </p>
                    </div>
                </div>

                <div class="col-md-3 widget">
                    <h3 class="widget-title">Follow me</h3>
                    <div class="widget-body">
                        <p class="follow-me-icons">
                            <a href=""><i class="fa fa-twitter fa-2"></i></a>
                            <a href=""><i class="fa fa-dribbble fa-2"></i></a>
                            <a href=""><i class="fa fa-github fa-2"></i></a>
                            <a href=""><i class="fa fa-facebook fa-2"></i></a>
                        </p>
                    </div>
                </div>

                <div class="col-md-6 widget">
                    <h3 class="widget-title">Text widget</h3>
                    <div class="widget-body">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                            Excepturi, dolores, quibusdam architecto voluptatem amet fugiat nesciunt placeat provident
                            cumque accusamus itaque voluptate modi quidem dolore optio velit hic iusto vero praesentium
                            repellat commodi ad id expedita cupiditate repellendus possimus unde?
                        </p>
                        <p>Eius consequatur nihil quibusdam! Laborum, rerum, quis, inventore ipsa autem repellat
                            provident assumenda labore soluta minima alias temporibus facere distinctio quas adipisci
                            nam sunt explicabo officia tenetur at ea quos doloribus dolorum voluptate reprehenderit
                            architecto sint libero illo et hic.
                        </p>
                    </div>
                </div>

            </div>
            <!-- /row of widgets -->
        </div>
    </div>

    <div class="footer2">
        <div class="container">
            <div class="row">

                <div class="col-md-6 widget">
                    <div class="widget-body">
                        <p class="simplenav">
                            <a href="#">Home</a> |
                            <a href="/">About</a> |
                            <a href="/">Sidebar</a> |
                            <a href="/">Contact</a> |
                            <b><a href="/">Sign up</a></b>
                        </p>
                    </div>
                </div>

                <div class="col-md-6 widget">
                    <div class="widget-body">
                        <p class="text-right">
                            Copyright &copy; 2014, Your name. Designed by libraryTeam
                        </p>
                    </div>
                </div>

            </div>
            <!-- /row of widgets -->
        </div>
    </div>

</footer>


<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="/resources/js/headroom.min.js"></script>
<script src="/resources/js/jQuery.headroom.min.js"></script>
<script src="/resources/js/template.js"></script>
</body>

</html>
