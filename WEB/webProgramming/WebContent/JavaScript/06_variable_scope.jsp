<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			//전역변수 (전체 범위에서 사용 가능)
			var var1 = 1; 
			
			function fun1() {
				//type 선언 안한 애는 전역변수
				var2 = 2; 
				//type 선언 한 애는 지역변수
				var x = 10;
				if (true) {
					var y = 20; 
				}
				console.log("var1: " + var1);
				console.log("x: " + x);
				console.log("y: " + y);
			}
			
			fun1(); 
			console.log("var1: " + var1); 
			console.log("var2: " + var2); 
			
		</script>
	</head>
	
	<body>
		
	</body>
</html>