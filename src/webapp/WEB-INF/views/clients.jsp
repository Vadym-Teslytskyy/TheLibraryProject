<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>
<table class="table">
    <thead class="thead-inverse">
    <tr class="text-center">
        <th class="text-center">Name</th>
        <th class="text-center">Phone</th>
        <th class="text-center">Home address</th>
        <th class="text-center">Time of library using (days)</th>
        <th class="text-center">Read books</th>
        <th class="text-center">Not returned books</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="client" items="${clientViews}">
        <tr>
            <td class="text-center">${client.firstName} ${client.lastName}</td>
            <td class="text-center">${client.phoneNumber}</td>
            <td class="text-center">${client.homeAddress}</td>
            <td class="text-center">${client.usingLibraryDaysCount}</td>
            <td class="text-center">
                <c:forEach var="book" items="${client.readBooks}">
                    <a href="/book/${book.id}">${book.name}, </a>
                </c:forEach>
            </td>
            <td class="text-center">
                <c:forEach var="book" items="${client.notReturnedBooks}">
                    <a href="/book/${book.id}">${book.name}, </a>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


