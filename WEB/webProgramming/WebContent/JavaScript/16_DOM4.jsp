<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			function fun1() {
				var mid = document.querySelector("#text1");
				//alert(text1.value);
				console.log(typeof(mid.value));
				if (mid.value == "") {
					alert ("text1에 입력이 안됨");
				} else {
					alert(mid.value);
				}
				
				var mpassword = document.querySelector("#mpassword");
				if (mpassword.value.length < 8) {
					console.log("wrong pw");
				} else {
					console.log(mpassword.value);
				}
				//태그에 name 속성으로 객체 찾는 방법
				var mid2 = document.loginForm;
				console.log(mid2); 
			}
		</script>
	</head>
	
	<body>
		<form name = "loginForm">
			1. ID: <input id = "mid" type = "text"/>
			<input onclick = "fun1()" type = "button" value = "OK">
			<br/>
			2. PW: <input id = "mpassword" type = "text"/>
			<input onclick = "fun1()" type = "button" value = "OK">
			<br/>
		</form>
	</body>
</html>