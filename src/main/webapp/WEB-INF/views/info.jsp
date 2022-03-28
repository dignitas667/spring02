<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<input type="button" id="checkJson" value="회원 정보 보내기" /><br><br>
	<div id="output"></div>
</body>
<script type="text/javascript" 
src="${contextPath}/webjars/jquery/3.6.0/dist/jquery.js"></script>
<script>
	$(function() {
		$("#checkJson").click(function() {
			var memo = {
				name : "park",
				title : "메모제목",
				password : "1234",
				content : "나는야메모",
				gen : 1
			}
			$.ajax({
				type : "POST",
				url : "${contextPath}/info",
				contentType : "application/json",
				data : JSON.stringify(memo),
				success:function(data, textStatus) {
					alert(data + ",success 수행");
				},
				error:function(data, textStatus) {
					alert("에러가 발생");
				},
				complete:function(data, textStatus) {
					alert("complete");
				}
			});
		});
	});
</script>
</html>