<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="writeMod" method="post">
    <input type="hidden" name="iboard" value="0">
    <div><input type="text" name="title" placeholder="제목"></div>
    <div><textarea name="ctnt" placeholder="내용"></textarea> </div>
    <div>
        <input type="submit" value="등록">
        <input type="reset" value="새로작성">
    </div>
</form>