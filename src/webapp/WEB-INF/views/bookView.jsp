<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24.02.2018
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>

<!-- container -->
<div class="container">

    <div class="row">

        <!-- Sidebar -->
        <aside class="col-md-4 sidebar sidebar-left">

            <div class="row widget">
                <div class="col-xs-12">
                    <p>
                        <img src="https://www.penguinrandomhouse.co.uk/content/dam/prh-corporate/penguin-random-house/corporate/DesignAward/2018/9788184754759%20Animal%20Farm%20ebook%20-%20Penguin.jpg"
                             alt=""></p>
                </div>
            </div>
        </aside>
        <!-- /Sidebar -->

        <!-- Article main content -->
        <article class="col-md-8 maincontent">
            <header class="page-header">
                <h1 class="page-title page-header">Animal Farm</h1>
                <h4 class="page-title">Author: George Orwell</h4>
                <h4 class="page-title">Coauthors: Exemple, Exemple</h4>
                <h4 class="page-title page-header">Genre: Some genre</h4>
                <h5 class="page-title">Release date: 1985-10-12</h5>
                <h5 class="page-title page-header">Pages amount: 120</h5>
                <h6 class="page-title">Readers avg age: 35</h6>
            </header>


            <blockquote>
                Some description here!
                Numquam, ut iure quia facere totam quas odit illo incidunt. Voluptatem, nostrum, ex, quasi incidunt
                similique cum maxime expedita unde labore inventore excepturi veniam corporis sequi facere ullam
                voluptates amet illum quam fuga voluptatibus ipsum atque sunt eos. Ut, necessitatibus.
            </blockquote>
            <button type="button" class="btn btn-success pull-right">Rent now!</button>

        </article>
        <!-- /Article -->

    </div>
    <div class="row">
        <div class="col-md-12">
            <div id="accordion" role="tablist">
                <div class="card">
                    <div class="card-header" role="tab" id="headingOne">
                        <h5 class="mb-0">
                            <a data-toggle="collapse" href="#collapseOne" aria-expanded="true"
                               aria-controls="collapseOne">Show statistic<i class="fa fa-arrow-down ml-1"></i></a>
                        </h5>
                    </div>
                    <div id="collapseOne" class="collapse " role="tabpanel" aria-labelledby="headingOne"
                         data-parent="#accordion">
                        <div class="card-body">
                            <table class="table table-bordered">
                                <tr>
                                    <th class="text-center">General count</th>
                                    <th class="text-center">Available count</th>
                                    <th class="text-center">General rent count</th>
                                </tr>
                                <%--<c:forEach var="component" items="${components}">--%>
                                <%--<tr>--%>
                                <%--<td>${info}</td>--%>
                                <%--<td>${info}</td>--%>
                                <%--<td>${info}</td>--%>
                                <%--</tr>--%>
                                <%--</c:forEach>--%>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /container -->