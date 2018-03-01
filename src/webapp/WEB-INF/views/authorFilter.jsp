<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01.03.2018
  Time: 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<header id="head" class="secondary"></header>

<!-- Intro -->
<div class="container text-center">
    <h4 class="thin">You can find author by last name</h4>
    <%--<form:form action="/books/filter" method="GET" modelAttribute="filter">--%>
    <%--<label>Choose books famous: </label>--%>
    <%--<form:radiobutton path="bookFamous" value="best" label="Best books"/>--%>
    <%--<form:radiobutton path="bookFamous" value="worst" label="Worst books"/>--%>
    <%--<div class="row">--%>
    <%--<div class="col-md-6 col-md-offset-3">--%>
    <%--<label>Choose period: </label>--%>
    <%--<form:radiobutton path="period" value="week" label="Week"/>--%>
    <%--<form:radiobutton path="period" value="month" label="Month"/>--%>
    <%--<form:radiobutton path="period" value="year" label="Year"/>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<label></label>--%>
    <%--<button class="btn btn-action" type="submit">Find</button>--%>
    <%--</form:form>--%>
</div>
<!-- /Intro-->

<!-- Highlights - jumbotron -->
<div class="jumbotron top-space">
    <div class="container">
        <div class="row">
            <c:forEach var="author" items="${authors}">

                <!-- BookCard -->
                <a href="/author/${author.id}">
                    <div class="col-md-3 col-sm-6 highlight">
                        <div class="h-caption">
                            <h4><img
                                    src=<%--${book.photoUrl}--%>"https://pmcdeadline2.files.wordpress.com/2017/02/rexfeatures_292491a-e1486097324892.jpg?w=605"
                                    alt="">${author.firstName} ${author.lastName}</h4>
                        </div>
                        <div class="h-body text-center">
                            <p>
                                Country: ${author.country}
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
