<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<div>${requestScope.errMsg}</div>
<form action="login" method="post">
    <div><input type="text" name="uid" placeholder="아이디"></div>
    <div><input type="password" name="upw" placeholder="비밀번호"></div>
    <input type="submit" value="로그인">
</form>
<div>
    <a href="join"><button>회원가입</button></a>
</div>
</body>
</html>
