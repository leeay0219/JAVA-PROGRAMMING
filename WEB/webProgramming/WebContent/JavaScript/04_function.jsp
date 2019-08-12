<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
		//함수선언
			function fun1() {
				console.log("fun1()run");
			}
			function fun2(x, y) {
				var result = x+y; 
				return result; 
			}
			
		//함수호출
			fun1();
			var var1 = fun2(10, 20);
			console.log(var1); 

		</script>
	</head>
	
	<body>
		
	</body>
</html>