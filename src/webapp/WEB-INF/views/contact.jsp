<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01.03.2018
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="head" class="secondary"></header>

<!-- container -->
<div class="container">

    <div class="row">

        <!-- Article main content -->
        <article class="col-sm-9 maincontent">
            <header class="page-header">
                <h1 class="page-title">Contact us</h1>
            </header>

            <p>
                We’d love to hear from you. Interested in working together? Fill out the form below with some info about
                your project and I will get back to you as soon as I can. Please allow a couple days for me to respond.
            </p>
            <br>
            <form>
                <div class="row">
                    <div class="col-sm-4">
                        <input class="form-control" type="text" placeholder="Name">
                    </div>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" placeholder="Email">
                    </div>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" placeholder="Phone">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-12">
                        <textarea placeholder="Type your message here..." class="form-control" rows="9"></textarea>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3 pull-right">
                        <input class="btn btn-action" type="submit" value="Send message">
                    </div>
                </div>
            </form>

        </article>
        <!-- /Article -->

        <!-- Sidebar -->
        <aside class="col-sm-3 sidebar sidebar-right">

            <div class="widget">
                <h4>Address</h4>
                <address>
                    2002 Holcombe Boulevard, Houston, TX 77030, USA
                </address>
                <h4>Phone:</h4>
                <address>
                    (713) 791-1414
                </address>
            </div>

        </aside>
        <!-- /Sidebar -->

    </div>
</div>
<!-- /container -->

<section class="container-full top-space">
    <div id="map"></div>
</section>
<!-- Google Maps -->
<script src="https://maps.googleapis.com/maps/api/js?key=&amp;sensor=false&amp;extension=.js"></script>
<script src="/resources/js/google-map.js"></script>