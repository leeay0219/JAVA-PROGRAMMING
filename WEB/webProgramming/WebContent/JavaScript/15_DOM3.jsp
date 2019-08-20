<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			function fun1() {
				var div = document.querySelector("#adv");
				div.innerHTML += "<img src = '../common/images/photo1.jpg' width= '100' height = '50'/>"
				var a = document.querySelector("#link1");
				a.href = "http://tomcat.apache.org"
			}
			
			function fun2() {
				var img = document.querySelector("#img1");
				img.width *= 2; 
				img.height *= 2; 
			}
			
			function fun3() {
				var img = document.querySelector("#img1");
				img.width /= 2; 
				img.height /= 2; 
			}
		</script>
	</head>
	
	<body>
		<a href = "javascript:fun1()"> 동적으로 내용 넣기</a>
		<hr/>
		<div id = "adv">
		</div>
		<hr/>
		<a id = "link1" href = "#">move</a>
		<hr/>
		<a href = "javascript:fun2()"><img src = "../common/images/zoomin.JPG"></a>
		<a href = "javascript:fun3()"> <img src = "../common/images/zoomout.JPG"></a>
		<br/>
		<button>zoom-in</button>
		<button>zoom-out</button>
		<br/>
		<img id = "img1" onclick = "fun2()" src = '../common/images/photo1.jpg' width= '100' height = '50'/>"
	</body>
</html>