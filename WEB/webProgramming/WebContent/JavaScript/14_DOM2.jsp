<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type = "text/css">
			img {
			}
			
			#img1 {
			}
			
			.class1 {
			}
		</style>
		<script type = "text/javascript">
			function fun1(){
				var imgList = document.querySelectorAll("img");
				for(var i=0;i<imgList.length;i++){
					imgList[i].src = "../common/images/photo2.jpg";
				}
			}
			
			function fun2(){
				var img = document.querySelector("#img1");
				img.src = "../common/images/photo3.jpg";
			}
			
			function fun3(){
				var imgList = document.querySelectorAll(".class1");
				for(var i=0;i<imgList.length;i++){
					imgList[i].src = "../common/images/photo4.jpg";
				}
			}
			
			function fun4(){
				var img = document.querySelector("#adv img");
				img.src = "../common/images/photo5.jpg";
			}
		</script>
	</head>
	
	<body>
		<button onclick="fun1()"> 태그 이름을 이용 </button>
		<button onclick="fun2()"> id를 이용 </button>
		<button onclick="fun3()"> class를 이용 </button>
		<button onclick="fun4()"> css를 이용 </button>
		<hr/>
		<img src="../common/images/photo1.jpg" width="200" height="100">
		<hr/>
		<img id="img1" src="../common/images/photo1.jpg" width="200" height="100">
		<hr/>
		<img class="class1" src="../common/images/photo1.jpg" width="200" height="100">
		<img class="class1" src="../common/images/photo1.jpg" width="200" height="100">
		<hr/>
		<div id="adv">
			<img src="../common/images/photo1.jpg" width="200" height="100">
		</div>
		<div id="news">
			<img src="../common/images/photo1.jpg" width="200" height="100">
		</div>
	</body>
</html>