<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
<input type="text" name="param1" /><br/>
<table>
	<caption>메모 입력</caption>
<tr>
	<th>이름</th>
	<td><input type="text" name="name" autofocus="autofocus" />
	</td>
</tr>
<tr>
	<th>제목</th>
	<td><input type="text" name="title" /></td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="password" /></td>
</tr>
<tr>
	<th>내용</th>
	<td><textarea name="content" rows="5" cols="40"></textarea></td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="입력완료" />
	</td>
</tr>
</table>
</form>
</body>
</html>