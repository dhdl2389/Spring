<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="orderForm" method="post" action="/order">
        <label for="nickname">닉네임:</label><br>
        <input type="text" id="nickname" name="nickname" value="<%= request.getAttribute("nickname") %>"><br><br>
        <label for="userCode">유저 코드:</label><br>
        <input type="text" id="userCode" name="userCode" value="<%= request.getAttribute("userCode") %>"><br><br>
        <label for="phoneNum">전화번호:</label><br>
        <input type="text" id="phoneNum" name="phoneNum"><br><br>
        <!-- 다른 필요한 정보들을 추가하십시오 -->
        <input type="submit" value="주문하기">
    </form>
</body>
</html>