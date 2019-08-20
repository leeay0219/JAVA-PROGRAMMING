<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript" src = "../common/js/jquery-3.4.1.min.js"></script>
		<script type = "text/javascript">
			function fun1() {
				var imgList = $("img");
				img.attr("src", "../common/images/photo2.jpg")
			}
			function fun2() {
				var img = $("#img");
				img.attr("src", "../common/images/photo3.jpg");
			}
			function fun3() {
				var imgList = $(".class1");
				img.attr("src", "../common/images/photo4.jpg");
			}	
		</script>
	</head>

	<body>
		<button onclick = "fun1()"> getElementsByTagName </button>
		<button onclick = "fun2()"> getElementById </button>
		<button onclick = "fun3()"> getElementsByClassName </button>
		
		<img src = "../common/images/photo1.jpg" width = "200" height = "100">
		<hr/>
		<img id = "img1" src = "../common/images/photo1.jpg" width = "200" height = "100">
		<hr/>
		<img class = "class1" src = "../common/images/photo1.jpg" width = "200" height = "100">
		<img class = "class1" src = "../common/images/photo1.jpg" width = "200" height = "100">
	</body>
</html>