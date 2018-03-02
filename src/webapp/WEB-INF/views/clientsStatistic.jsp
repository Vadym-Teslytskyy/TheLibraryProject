<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>
<table class="table">
    <thead class="thead-inverse">
    <tr class="text-center">
        <th class="text-center">Average clients age</th>
        <th class="text-center">Average using library days count</th>
        <th class="text-center">Average rents count per month</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td class="text-center">${clientStatisticView.averageClientsAge}</td>
        <td class="text-center">${clientStatisticView.averageUsingLibraryDaysCount}</td>
        <td class="text-center">${clientStatisticView.averageRentsCountByPeriod}</td>
    </tr>
    </tbody>
</table>
