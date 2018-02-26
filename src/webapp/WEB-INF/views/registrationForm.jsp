<%--
  Created by IntelliJ IDEA.
  User: Andriy
  Date: 26-Feb-18
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrarion form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <script src="${pageContext.request.contextPath}/resources/js/registrationFormScript.js"></script>
</head>
<body>

<form action="/user/registrationForm" method="post">
    <div class="container">

        <div class="form-group">

            <label class="col-md-4 control-label" for="firstName">First Name</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" id="firstName" name="firstName" placeholder="First Name" class="form-control">
                </div>
            </div>

            <label class="col-md-4 control-label" for="lastName">Last Name</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" id="lastName" name="lastName" placeholder="Last Name" class="form-control">
                </div>
            </div>

            <label class="col-md-4 control-label" for="login">Login</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" id="login" name="login" placeholder="Login" class="form-control">
                </div>
            </div>

            <label class="col-md-4 control-label" for="password">Password</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="password" id="password" name="password" placeholder="Password" class="form-control">
                </div>
            </div>

            <label for="birthDate" class="col-sm-4 control-label">Date of Birth</label>
            <div class="col-sm-9">
                <input type="date" id="birthDate" name="birthDate" class="form-control">
            </div>

            <label class="col-md-4 control-label" for="phoneNumber">Phone</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                    <input type="text" name="phoneNumber" id="phoneNumber"
                           placeholder="(068)111-1212" class="form-control">
                </div>
            </div>

            <label class="col-md-4 control-label" for="homeAdress">Address</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                    <input type="text" id="homeAdress" name="homeAdress" placeholder="Home Adress" class="form-control">
                </div>
            </div>

            <label class="col-md-4 control-label"></label>
            <div class="col-md-4">
                <button type="submit" class="btn btn-warning">Save<span class="glyphicon glyphicon-send"></span>
                </button>
            </div>

        </div>

    </div>
</form>

</body>
</html>
