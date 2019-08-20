<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			function fun1() {
				var imgList = document.getElementsByTagName("img");
				for (var i=0; i<imgList; i++) {
					imgList[i].src = "../common/images/photo2.jpg";
				}
			}
			function fun2() {
				var img = document.getElementById("img1");
				img.src = "../common/images/photo3.jpg";
			}
			function fun3() {
				var imgList = document.getElementsByClassName("class1");
				for (var i=0; i<imgList; i++) {
					imgList[i].src = "../common/images/photo4.jpg";
				}	
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