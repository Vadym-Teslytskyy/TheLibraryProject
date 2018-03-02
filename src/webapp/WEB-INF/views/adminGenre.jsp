<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="head" class="secondary"></header>
<!-- container -->
<div class="container">

    <div class="row">

        <!-- Article main content -->
        <article class="col-xs-12 maincontent">
            <header class="page-header">
                <h1 class="page-title">Registration</h1>
            </header>

            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <h3 class="thin text-center">Register a new account</h3>
                        <p class="text-center text-muted">If your account already exist, please <a
                                href="/signin">Login</a> Else please enter the fields below. </p>
                        <hr>

                        <form action="/admin/genre/save" method="POST">
                            <div class="top-margin">
                                <label>Genre</label>
                                <input type="text" id="genreName" placeholder="Genre" class="form-control"
                                            name="genreName"/>
                            </div>

                            <hr>

                            <div class="row">
                                <div class="col-lg-4 text-right">
                                    <button class="btn btn-action" type="submit">Register</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>

        </article>
        <!-- /Article -->
        <table class="table">
            <thead class="thead-inverse">
            <tr class="text-center">
                <th>Nom.</th>
                <th>Genre</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <c:forEach items="${genres}" var="author">
            <tr>
                <td>${author.id}</td>
                <td>${author.genreName}</td>
                <td>
                    <a href="/admin/genre/updating/"${author.id} class="btn btn-outline-warning btn-sm">update</a>
                </td>
                <td><a href="/admin/genre/delete/"${author.id} class="btn btn-outline-warning btn-sm">delete</a></td>

            </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
<!-- /container -->