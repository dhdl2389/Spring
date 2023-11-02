<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.sh.login.domain.LoginDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Order</title>
</head>
<body>
	<h2>주문 목록</h2>
	<%
	LoginDTO user = (LoginDTO) session.getAttribute("user");
	List<LoginDTO> selectedUserList = (List<LoginDTO>) session.getAttribute("selectedUser");
	if (user != null && selectedUserList != null && !selectedUserList.isEmpty()) {
		LoginDTO selectedUser = selectedUserList.get(0);
	%>
	<h2><%=selectedUser.getUser_code()%>:님
	</h2>

	<table>
		<thead>
			<tr>
				<th>주문 코드</th>
				<th>사용자 코드</th>
				<th>사용자 닉네임</th>
				<th>전화 번호</th>
				<th>게시판 ID</th>
				<th>게시판 제목</th>
				<th>가격</th>
				<th>회원 우편번호</th>
				<th>회원 주소</th>
				<th>상세 주소</th>
				<th>배송 요청</th>
				<th>주문 날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${orderList}" var="order">
				
					<tr>
						<td>${order.user_code}</td>
						<td>${order.user_nickname}</td>
						<td>${order.phone_num}</td>
						<td>${order.board_id}</td>
						<td>${order.board_title}</td>
						<td>${order.board_price}</td>
						<td>${order.member_post}</td>
						<td>${order.member_addr}</td>
						<td>${order.detailed_address}</td>
						<td>${order.delivery_req}</td>
						<td>${order.board_Date}</td>
					</tr>
				 
			</c:forEach>
		</tbody>
	</table>
	<%
	}
	%>
</body>
</html>