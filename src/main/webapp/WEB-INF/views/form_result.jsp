<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
param : ${param1}<br/>
<table>
	<caption>메모 입력</caption>
<tr>
	<th>이름</th>
	<td>${memoDTO.name}
	</td>
</tr>
<tr>
	<th>제목</th>
	<td>${memoDTO.title}</td>
</tr>
<tr>
	<th>비밀번호</th>
	<td>${memoDTO.password}</td>
</tr>
<tr>
	<th>내용</th>
	<td>${memoDTO.content}</td>
</tr>
<tr>
	<th>gen</th>
	<td>${memoDTO.gen}</td>
</tr>
</table>
</body>
</html>