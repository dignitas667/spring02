<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="app" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" 
src="${app}/webjars/jquery/3.6.0/dist/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert('test jquery~');
});
</script>
</head>
<body>

</body>
</html>