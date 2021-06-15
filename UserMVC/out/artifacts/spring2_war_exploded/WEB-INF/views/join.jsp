<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>
<form action="join" method="post">
    <div><input type="text" name="uid" placeholder="아이디"></div>
    <div><input type="password" name="upw" placeholder="비밀번호"></div>
    <div><input type="text" name="nm" placeholder="이름"></div>
    <input type="submit" value="회원가입">
    <input type="reset" value="초기화">
</form>
</body>
</html>
