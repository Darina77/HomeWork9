<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sql_rt" uri="http://java.sun.com/jstl/sql_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: Darina
  Date: 14.04.2018
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js">
    </script>
    <script type="text/javascript"
            src="<c:url value='/resources/js/script.js'/>">
    </script>
</head>
<body>
<h3>Реєстрація нового студента</h3>
<form  method="post" onsubmit="addStudent()" id="student_form">
    <label>ПІБ</label>
    <input name="pib" type="text" id = "pib"/>
    <label>Курс</label>
    <input name="curse" type="number" id = "curse"/>
    <button type="submit">Додати</button>
</form>
</body>
</html>
