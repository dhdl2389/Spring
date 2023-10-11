<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE
html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	function delete1(id) {

		alert(id);
		$.ajax({
			type : "DELETE",
			url : "/day2/carrot/select/" + id, // URL 수정
			success : function(data) {
				alert(data);
				location.reload();
			},
			error : function(err) {
				alert("err");
				console.log(err);
			}
		});
	}

	///
	function update() {
		let id = $("#carrotId").val();
		let newPrice = $("#newPrice").val();
		let newInfo = $("#newInfo").val();

		let carrot = {
			id : id,
			price : newPrice,
			info : newInfo
		};
		let carrots = JSON.stringify(carrot);

		$.ajax({
			type : "PUT",
			url : "/day2/carrot/updatecarrot/", // 수정된 URL
			data : carrots,
			contentType : "application/json",
			success : function(data) {
				alert(data);
				location.reload();
			},
			error : function() {
				alert("오류가 발생했습니다.");
			}
		});
	}
</script>
</head>
<body>
	<h2>Carrot</h2>

	<input type="text" id="id">
	<button>등록</button>
	<table>
		<tr>
			<td>순번</td>
			<td>가격</td>
			<td>정보</td>
			<td>시간</td>
			<td></td>
		</tr>

		<c:forEach var="item" items="${carrotList}">
			<tr>
				<td>${item.id}</td>
				<td>${item.price}</td>
				<td>${item.info}</td>
				<td>${item.newTime}</td>
				<td>

					<button onclick="delete1('${item.id}')">삭제</button>
				</td>
			</tr>
		</c:forEach>

	</table>
	<input type="text" id="carrotId">
	<input type="text" id="newPrice">
	<input type="text" id="newInfo">
	<button onclick="update()">변경</button>
</body>
</html>
