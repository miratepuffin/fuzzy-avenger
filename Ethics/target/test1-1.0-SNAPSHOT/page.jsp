<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <c:set var="req" value="${pageContext.request}" />
    <c:set var="baseURL" value="${fn:replace(req.requestURL, fn:substring(req.requestURI, 1, fn:length(req.requestURI)), req.contextPath)}" />
    <link href="<c:url value="${baseURL}/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
<div class="jumbotron">
    <h1>Latest Guardian Political Article</h1>
    <h2>${webTitle}</h2>
    <h3>${webPublicationDate}</h3>
    <h4>Names Found:</h4>
    <ul>
        <c:forEach var="name" items="${nameColours}">
            <li>${name.getColouredName()}</li>
        </c:forEach>
    </ul>
    <p>${body}</p>
</div>
</body>
</html>
