<%--
  Created by IntelliJ IDEA.
  User: Andriy
  Date: 26-Feb-18
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- container -->
<div class="container">

    <div class="row extra-top-space">

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

                        <form>
                            <div class="top-margin">
                                <label>First Name</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="top-margin">
                                <label>Last Name</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="top-margin">
                                <label>Email Address <span class="text-danger">*</span></label>
                                <input type="text" class="form-control">
                            </div>

                            <div class="row top-margin">
                                <div class="col-sm-6">
                                    <label>Password <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control">
                                </div>
                                <div class="col-sm-6">
                                    <label>Confirm Password <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control">
                                </div>
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

    </div>
</div>
<!-- /container -->