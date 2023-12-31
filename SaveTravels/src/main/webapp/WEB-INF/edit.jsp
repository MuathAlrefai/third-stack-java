<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/19/2023
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Travels</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <br><h1>Edit ${expense.name}: </h1>
    <form:form action="/updateExpense/${expense.id}" method="POST" modelAttribute="expense">
        <label class="label">Expense Name</label>
        <form:input type="text" path="name"/><br>
        <form:errors path="name" class="errors"/><br>

        <label class="label">Vendor</label>
        <form:input type="text" path="vendor"/><br>
        <form:errors path="vendor" class="errors"/><br>

        <label class="label">Amount</label>
        <form:input type="number" step="0.01" path="amount"/>
        <form:errors path="amount" class="errors"/><br>

        <label class="label">Description</label>
        <form:textarea path="description" cols="40" rows="2"></form:textarea>
        <form:errors path="description" class="errors"/> <br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
