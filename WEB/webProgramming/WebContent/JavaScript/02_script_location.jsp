<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			//Internal JS 
			function fun1() {
				console.log("fun1()run");
			}
		</script>
		
		<!-- External JS -->
		<script type = "text/javascript" src = "../common/js/02_script.js"></script>
	</head>
	
	<body>
		<a href = "javascript: fun1()">fun1()run</a> <br>
		<button onclick = "fun1()">fun1()run</button>
		<div onclick = "fun1()" style = "width: 70px; height:30px; border: 1px solid black;">fun1()run</div>
		<hr>
		<a href = "javascript: fun2()">fun2()run</a> <br>
	</body>
</html>