<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.sh.saveUser.UserDTO"%>
<%@ page import="com.sh.address.AddressDTO"%>
<%@ page import="com.acorn.testing.KakaoUserDTO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function findAddr() {
		new daum.Postcode({
			oncomplete : function(data) {
				console.log(data);
				var roadAddr = data.roadAddress;
				var jibunAddr = data.jibunAddress;
				document.getElementById('member_post').value = data.zonecode;
				if (roadAddr !== '') {
					document.getElementById("member_addr").value = roadAddr;
				} else if (jibunAddr !== '') {
					document.getElementById("member_addr").value = jibunAddr;
				}
			}
		}).open();
	}
</script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<style>
#member_post {
	width: 400px;
}

#member_addr {
	width: 400px;
}
</style>
</head>
<body>


	<form id="myForm12" method="post" action="/testing/myForm12">

		<input type="text" id="user_id" name="user_id" value="아이디" /> <input
			type="hidden" id="user_kakao" name="user_kakao" value="${user_kakao}" />
		<input type="text" id="user_pw" name="user_pw" value="비번" /> <input
			type="text" id="address" name="address" value="이메일" /> <input
			type="text" id="phone_num" name="phone_num" value="폰번호" /> <input
			id="member_post" name="member_post" type="text"
			placeholder="Zip Code" readonly> <input id="member_addr"
			name="member_addr" type="text" placeholder="Address" readonly>
		<br> <input id="detailed_address" name="detailed_address"
			type="text" placeholder="Detailed Address">
		<button type="button" onclick="findAddr()">주소찾기</button>




		<input type="text" id="user_birth" name="user_birth" value="생일" /> <input
			type="text" id="user_nickname" name="user_nickname"
			value="${nickname}" /> <input type="text" id="user_image"
			name="user_image" value="${profile_image}" /> <input type="text"
			id="user_heat" name="user_heat" value="평점" />
		<button type="submit" form="myForm12">제출하기</button>
	</form>

	<div>Address</div>
	<form id="addressForm" method="post" action="/testing/addressForm">
	</form>


</body>
</html>