<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			var var1 = "10";
			var result = var1 + 20; 
			console.log(result); //1020
			var result1 = parseInt(var1) + 20;
			console.log(result1);
			
			var var2 = "10.5";
			var result2 = parseFloat(var2) + 20; 
			console.log(result2);
			
			var var3 = "10 + 20";
			var result3 = eval(var3);
			console.log(result3); 
		</script>
	</head>
	
	<body>
		
	</body>
</html>