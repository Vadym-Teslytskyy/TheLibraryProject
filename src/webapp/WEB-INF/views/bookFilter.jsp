<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>

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

                <!-- BookCard -->
                <div class="col-md-3 col-sm-6 highlight">
                    <div class="h-caption">
                        <h4><img
                                src=<%--${book.photoUrl}--%>"https://i2.wp.com/365webresources.com/wp-content/uploads/2017/11/Paperback-Book-Mockup-PSD-Templates.png?resize=544%2C405&ssl=1"
                                alt="">${book.name}</h4>
                    </div>
                    <div class="h-body text-center">
                        <p>
                            Name: ${book.name}
                        </p>
                    </div>
                </div>
            </c:forEach>
        </div>
        <!-- /row  -->

    </div>
</div>
<!-- /Highlights -->
