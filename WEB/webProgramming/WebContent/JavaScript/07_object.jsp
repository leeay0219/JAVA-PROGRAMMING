<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			//string object
			var var1 = "123456-1234567";
			console.log("문자열의 길이: " + var1.length); 
			var sexKind = var1.charAt(7);
			if (sexKind == 1 || sexKind == 3) {
				console.log("male");
			} else {
				console.log("female");
			}
			//reference copy
			var var2 = var1; 
			console.log("문자열의 길이: " + var2.length)
			
			//현재날짜정보
			var now = new Date(); 
			var year = now.getFullYear();
			var month = now.getMonth()+1;
			var date = now.getDate();
			console.log(year + "-" + month + "-" + date);
			
			//배열 객체
			var arr1 = [95, 80, 87];
			var arr2 = [];
			for (var i=0; i<arr1.length; i++) {
				console.log(arr1[i]);
			}
			arr1[3] = 90; 
			console.log(arr1[3]);
			
			//함수객체 - 아래 두개는 같다 
			function fun1() {
				console.log ("fun1() run");
			}
			
			var fun2 = fun1; 
			
			var fun3 = function() {
				console.log ("fun2() run");
			}
			
			var fun4 = fun3; 
			
			fun1();
			fun2(); 
			
		</script>	
		
	</head>
	
	<body>
		
	</body>
</html>