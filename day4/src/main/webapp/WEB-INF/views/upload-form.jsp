<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>파일 업로드 하기</h2>

	<form action="/day4/upload" method="post" enctype="multipart/form-data">
		상품명 : <input type="text" name="goodsCode">
		파일 선택 : <input type="file" name="file"> 
		<button>전송</button>
	</form>

</body>
</html>