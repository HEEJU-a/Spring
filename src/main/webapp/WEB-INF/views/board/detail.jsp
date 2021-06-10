<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div><a href="#" onclick="goBack();">돌아가기</a></div>


    <c:if test="${requestScope.data.iuser eq sessionScope.loginUser.iuser}">
            <a href="writeMod?iboard=${param.iboard}">수정</a>
            <a href="delBoard?iboard=${param.iboard}">삭제</a>
    </c:if>



<div>글번호 : ${param.iboard}</div> <i id="favIcon" class="far fa-kiss-wink-heart pointer"></i>
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

<div id="modal" class="displayNone">
    <div class="modal_content">
        <form id="cmtModFrm" action="#">
            <input type="hidden" id="icmt">
            <input type="text" id="modCmt">
        </form>
        <input type="button" value="댓글수정" onclick="modAjax()">
        <input type="button" value="취소" onclick="closeModModal();">
    </div>
</div>

