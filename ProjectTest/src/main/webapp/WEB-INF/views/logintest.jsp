<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.acorn.testing.KakaoUserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li onclick="kakaoLogin();"><a href="javascript:void(0)"> <span>카카오
					로그인</span>
		</a></li>
		<li onclick="kakaoLogout();"><a href="javascript:void(0)"> <span>카카오
					로그아웃</span>
		</a></li>
	</ul>
	<!-- 카카오 스크립트 -->
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script>
      Kakao.init("c56a5ac8208747818bdaee7eb60e05ea");
      console.log(Kakao.isInitialized());
      
      function kakaoLogin() {
        Kakao.Auth.login({
          success: function (response) {
            Kakao.API.request({
              url: "/v2/user/me",
              success: function (response) {
                document.getElementById("id").value = response.id;
                document.getElementById("nickname").value =
                  response.properties.nickname;
                document.getElementById("profile_image").value =
                  response.properties.profile_image;         
                document.getElementById("myForm").submit();
              },
              fail: function (error) {
                console.log(error);
              },
            });
          },
          fail: function (error) {
            console.log(error);
          },
        });
      }
      
      function kakaoLogout() {
        if (Kakao.Auth.getAccessToken()) {
          Kakao.API.request({
            url: "/v1/user/unlink",
            success: function (response) {
              logout();
              console.log(response);
            },
            fail: function (error) {
              console.log(error);
            },
          });
          Kakao.Auth.setAccessToken(undefined);
        }
      }
      
      function logout() {
        fetch('/logout', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
        }).then(response => {
          location.reload();
        }).catch(error => console.error('Error:', error));
      }
    </script>

	<form id="myForm" method="post" action="/testing/myForm">
    <input type="text" id="user_code" name="user_code" value="" />
    <input type="text" id="id" name="id" value="" />
    <input type="text" id="nickname" name="nickname" value="" />
    <input type="text" id="profile_image" name="profile_image" value="" />
</form>

	<%
	KakaoUserDTO user = (KakaoUserDTO) session.getAttribute("user");
	if (user != null) {
	%>
	<h2>
		Welcome,
		<%=user.getNickname()%></h2>
	<%
	}
	%>
</body>
</html>