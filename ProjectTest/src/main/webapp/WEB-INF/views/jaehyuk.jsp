<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.sh.login.LoginDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	  <form id="myForm12" method="post" action="/testing/myForm12">
        <input type="text" id="user_code" name="user_code" value="" /> 
        <input type="text" id="user_id" name="user_id" value="" /> 
        <input type="text" id="user_pw" name="user_pw" value="" />
        <button type="submit" form="myForm12">제출하기</button>
    </form>


</body>
</html>