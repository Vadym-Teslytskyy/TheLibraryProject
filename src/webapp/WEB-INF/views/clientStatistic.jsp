<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>
<table class="table">
    <thead class="thead-inverse">
    <tr class="text-center">
        <th>id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone</th>
        <th>Time of library using</th>
        <th>Borrowing books</th>
        <th>Not returned books</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="client" items="${clients}">
    <tr>
        <td>${client.id}</td>
        <td>${client.firstName}</td>
        <td>${client.lastName}</td>
        <td>${client.phoneNumber}</td>
        <td>
            <c:forEach var="clientsBooks" items="${client.readBooks}">
                ${clientsBooks.name}
            </c:forEach>
        </td>
        <td>
            <c:forEach var="notReturnedBooks" items="${client.readBooks}">
                ${clientsBooks.name}
            </c:forEach>
        </td>
        <td>
            <c:forEach var="usingTimeU" items="${usingTime}">
                ${usingTimeU}
            </c:forEach>
        </td>
    </tr>

    </c:forEach>
    </tbody>
</table>


