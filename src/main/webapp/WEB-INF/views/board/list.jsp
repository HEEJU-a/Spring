<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>리스트</title>
    <link rel="stylesheet" href="/res/css/common.css">
    <link rel="stylesheet" href="/res/css/board/list.css">
    <script defer src="/res/js/board/list.js"></script>
</head>
<body>
<div>
    <span>로그인 아이디 : ${sessionScope.loginUser.iuser}</span>
    <span><a href="/user/profile">프로필</a></span>
</div>

<table>
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>글쓴이</th>
        <th>작성일시</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="item">
        <tr class="record" onclick="moveToDetail(${item.iboard});">
            <td>${item.iboard }</td>
            <td>
                <c:choose>
                    <c:when test="${param.searchType eq 1 || param.searchType eq 2 }">
                        ${item.title.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
                    </c:when>
                    <c:otherwise>
                        ${item.title}
                    </c:otherwise>
                </c:choose>
                    ${item.title }
            </td>
            <td>
                <c:choose>
                    <c:when test="${empty item.profileImg}">
                        <c:set var="img" value="/res/img/noprofile.jpg"/>
                    </c:when>
                    <c:otherwise>
                        <c:set var="img" value="/img/${item.iuser}/${item.profileImg}"/>
                    </c:otherwise>
                </c:choose>

                <c:choose>
                    <c:when test="${param.searchType eq 4}">
                        ${item.writerNm.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
                    </c:when>
                    <c:otherwise>
                        ${item.writerNm}
                    </c:otherwise>
                </c:choose>
                <img src="${img }" class="profileImg">
            </td>
            <td>${item.regdt }</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
