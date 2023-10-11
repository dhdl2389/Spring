<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
img{
width: 100px;
height: 100px;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="item" items="${list }">
		<div class="wrap">
			<h2>${item.title }</h2>			
			<img src="${item.image }">
			<a href="${item.link }">링크</a>
			<a href="${item.lprice }">가격</a>
		</div>
	</c:forEach>
</body>
</html>