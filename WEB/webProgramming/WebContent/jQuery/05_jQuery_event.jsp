<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript" src = "../common/js/jquery-3.4.1.min.js"></script>
		<script>
			function fun1() {
				var adv = "$("#adv");
				adv.append("brn1 clicked <br/>");
			}
			
			$(function() {
				var btn2 = $("btn2");
				btn2.click(function () {});
			});
		</script>
	</head>
	
	<body>
		<button id = "btn1" onclick = "fun1()"> btn1 </button>
		<button id = "btn1"> btn1 </button>
		<hr/>
		<div id = "adv"></div>
	</body>
</html>