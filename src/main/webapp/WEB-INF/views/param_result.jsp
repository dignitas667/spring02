<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
    margin: 0;
}
.str {
    position:absolute; left: 650px; top:100px; width:90px;
    color: rgba(0,0,0,1.0);
    font-size: 1.5em;
    z-index: 10;
}
.png {
    position:absolute;
    z-index: 1;
}
</style>
</head>
<body>
[${name}]
<hr/>
<div class="str">
${iam}
</div>
 
<img class="png" src="resources/img/whoami2.png">
</body>
</html>