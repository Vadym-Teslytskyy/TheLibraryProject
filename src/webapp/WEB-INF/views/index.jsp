<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>

<%--This form is just for testing.--%>
<form method="post" action="login">
    <table width="100%">
        <tr>
            <td><label> <strong><spring:message
                    code="label.firstName"/></strong>
            </label></td>
            <td><input name="firstName"/></td>
        </tr>
        <tr>
            <td><label> <strong><spring:message
                    code="label.lastName"/></strong>
            </label></td>
            <td><input name="lastName"/></td>
        </tr>
        <tr>
            <spring:message code="label.submit" var="labelSubmit"></spring:message>
            <td colspan="2"><input type="submit"></td>
        </tr>
    </table>
</form>

</body>
