<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

	function search() {
		 alert("dkdkdkd");
		 console.log("console  ok ????");


	  
		$.ajax({
			type : "GET",			  
			url : "/day4/naverList",
			success : function(data) {
				alert("dfdfdfd" +data);
				console.log(data);
				alert( data[0].title);
				
				alert( data.length);
				let result = toHTML(data);
				$("#result").html(result);
				//alert("성공");
			},
			error : function( err) {
				console.log(err);
				alert("error");
			}
		});
	}

	function toHTML(d) {
	 console.log(d);
		let str = "<ul>";
		for (let i = 0; i < d.length ; i++) {
			let item = d[i];
			str += "<li>" + item.title + " " + item.price + "</li>" + " "
					+ "<a href=" + item.link + ">" + item.link + " "
					+ "<img src=" + item.image + ">" + item.image + " ";
		}
		str += "</ul>";
		alert(str);
		
		
		return str;
		 
	}
</script>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<button onclick="search()">네이버쇼핑 칼 조회</button>
	<div id="result"></div>

</body>
</html>