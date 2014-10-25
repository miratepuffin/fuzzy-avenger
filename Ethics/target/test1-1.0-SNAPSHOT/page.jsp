<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <c:set var="req" value="${pageContext.request}" />
    <c:set var="baseURL" value="${fn:replace(req.requestURL, fn:substring(req.requestURI, 1, fn:length(req.requestURI)), req.contextPath)}" />
    <link href="<c:url value="${baseURL}/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="${baseURL}/resources/css/dashboard.css" />" rel="stylesheet">
</head>
<body>
<form name="UserInput" action="${baseURL}/html/test.html" method="get">
<input type="radio" value="Child labour">Child labour<br>
<input type="radio" value="Deforestation">Desforestation<br>
<input type="radio" value="Arms trade">Arms trade<br>
<input type="radio" value="Chemical experiments">Chemical experiments<br>
<input type="radio" value="Oil">Oil<br>
<input type="radio" value="Rubber">Rubber<br>
<input type="radio" value="Bonus">Bonus<br>
<input type="radio" value="Tax evasion">Tax evasion<br>
<input type="radio" value="Animal testing">Animal testing<br><br>
<input type="submit" value="Submit">
</form>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
