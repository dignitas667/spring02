<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="app" value="${request.getContextPath()}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url(${app}/resources/css/want.css);
</style>
</head>
<body>
<div id="want"><img src="${app}/resources/img/want.png" width="60%" /></div>
<div class="say"><h3>${want}</h3></div>
</body>
</html>