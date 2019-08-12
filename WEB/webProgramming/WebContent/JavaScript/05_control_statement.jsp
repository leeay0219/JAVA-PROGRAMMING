<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			var var1 = 10; 
			var var2 = "a"; 
			var var3 = "cd";
			
			if (var1 == var2) {
				console.log("same");
			} else {
				console.log("different"); 
			}
			
			if (var2 != var3) {
				console.log("different");
			} else {
				console.log("same"); 
			}
			
			for (var i=0; i<5; i++) {
				console.log(i);
			}
			
			var num = 5; 
			while(true) {
				num--; 
				if (num==0) {
					break; 
				}
			}
		</script>
	</head>
	
	<body>
		
	</body>
</html>