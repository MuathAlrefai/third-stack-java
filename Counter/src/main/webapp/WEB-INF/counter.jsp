<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/14/2023
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Counter</title>
</head>
<body style="text-align: center; font-family: sans-serif; background-color: lightgrey;">
    <h2>You have visited <a href="http://localhost:8080/">This Site</a> <c:out value="${count}"/> Times</h2>
</body>
</html>
