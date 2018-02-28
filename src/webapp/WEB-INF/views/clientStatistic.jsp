<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Andriy
  Date: 28-Feb-18
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table class="table">
    <thead class="thead-inverse">
    <tr class="text-center">
        <th>Title</th>
        <th>Main Author</th>
        <th>Genre</th>
        <th>Release date</th>
        <th>Available count</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="book" items="${books}">
    <tr>
        <td>${book.name}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
