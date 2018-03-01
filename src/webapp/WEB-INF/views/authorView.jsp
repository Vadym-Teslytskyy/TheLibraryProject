<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28.02.2018
  Time: 23:37
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
                        <img src="https://pmcdeadline2.files.wordpress.com/2017/02/rexfeatures_292491a-e1486097324892.jpg?w=605"
                             alt=""></p>
                </div>
            </div>
        </aside>
        <!-- /Sidebar -->

        <!-- Article main content -->
        <article class="col-md-8 maincontent">
            <header class="page-header">
                <h1 class="page-title page-header">${author.firstName} ${author.lastName}</h1>
                <h4 class="page-title">Birth date: ${author.birthDate}</h4>
                <h4 class="page-title page-header">Country: ${author.country}</h4>
                <h5 class="page-title">Average client age: ${author.averageClientsAge}</h5>
            </header>

            <blockquote>
                Some description here! Numquam, ut iure quia facere totam quas odit illo incidunt. Voluptatem, nostrum,
                ex, quasi incidunt similique cum maxime expedita unde labore inventore excepturi veniam corporis sequi
                facere ullam voluptates amet illum quam fuga voluptatibus ipsum atque sunt eos. Ut, necessitatibus.
            </blockquote>

            <div class="row">
                <div class="col-md-12">
                    <div id="accordion" role="tablist">
                        <div class="card">
                            <div class="card-header" role="tab" id="headingOne">
                                <h5 class="mb-0">
                                    <a data-toggle="collapse" href="#collapseOne" aria-expanded="true"
                                       aria-controls="collapseOne" class="btn btn-primary">Show book list<i
                                            class="fa fa-arrow-down ml-1"></i></a>
                                </h5>
                            </div>
                            <div id="collapseOne" class="collapse " role="tabpanel" aria-labelledby="headingOne"
                                 data-parent="#accordion">
                                <div class="card-body">
                                    <table class="table table-bordered">
                                        <tr>
                                            <th class="text-center">Name</th>
                                            <th class="text-center">Genre</th>
                                            <th class="text-center">Release date</th>
                                        </tr>
                                        <c:forEach var="book" items="${books}">
                                            <tr>
                                                <td>${book.name}</td>
                                                <td>${book.genre}</td>
                                                <td>${book.releaseDate}</td>
                                            </tr>
                                        </c:forEach>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </article>
        <!-- /Article -->

    </div>
</div>
<!-- /container -->
