<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>디테일</title>
    <link rel="stylesheet" href="/res/css/boardDetail.css">
    <script defer src="/res/js/boardDetail.js"></script>
</head>
<body>
<div><a href="#" onclick="goBack();">돌아가기</a></div>
<div>글번호 : ${param.iboard}</div>
<div>제목 : ${data.title} </div>
<div>내용 : <c:out value="${requestScope.data.ctnt}"/></div>
<div>글쓴이 : <c:out value="${data.writerNm}"/></div>
<div>작성일 : ${data.regdt}</div>

<c:if test="${not empty sessionScope.loginUser}">
    <div>
        <form id="cmtFrm"  onsubmit="return false;">
            <input type="text" id="cmt" placeholder="댓글">
            <input type="button" value="댓글달기" onclick="regCmt();">
        </form>
    </div>
</c:if>
<div id="cmtList" data-login-user-pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}"></div>

</body>
</html>
