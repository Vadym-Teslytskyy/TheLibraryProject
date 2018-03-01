<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<header id="head" class="secondary"></header>

<!-- Intro -->
<div class="container text-center">
    <h4 class="thin">You can find best or worst of 4 books by period</h4>
    <form:form action="/books/filter" method="GET" modelAttribute="filter">
        <label>Choose books famous: </label>
        <form:radiobutton path="bookFamous" value="best" label="Best books" checked="checked"/>
        <form:radiobutton path="bookFamous" value="worst" label="Worst books"/>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <label>Choose period: </label>
                <form:radiobutton path="period" value="week" label="Week" checked="checked"/>
                <form:radiobutton path="period" value="month" label="Month"/>
                <form:radiobutton path="period" value="year" label="Year"/>
            </div>
        </div>
        <label></label>
        <button class="btn btn-action" type="submit">Find</button>
    </form:form>
</div>
<!-- /Intro-->

<!-- Highlights - jumbotron -->
<div class="jumbotron top-space">
    <div class="container">
        <div class="row">
            <c:forEach var="book" items="${books}">

                <!-- BookCard -->
                <a href="/book/${book.id}">
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
                </a>
            </c:forEach>
        </div>
        <!-- /row  -->

    </div>
</div>
<!-- /Highlights -->
