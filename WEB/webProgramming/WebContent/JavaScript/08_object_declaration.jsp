<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript">
			//JavaScript Object Notation (JSON)
			var car = {
					"model" : "그랜저", // property name : value
					"speed" : 0,
					"color" : "black",
					"start" : function() {
						console.log("start");
					}, 
					"setSpeed" : function(speed) {
						this.speed = speed;
					}, 
					"run" : function() {
						this.start();
						this.setSpeed(30);
						console.log(this.speed + " km/h running"); 
					}
			}; 
			
			console.log(car.model);
			console.log(car.speed);
			console.log(car.color);
			car.start();
			car.setSpeed(60);
			console.log(car.speed);
			car.run();
			
			//동적 (실행 도중에) 으로 추가하는 속성과 메소드
			car.cc = 3000; 
			console.log("car.cc:" + car.cc); 
			//함수도 객체니까 객체의 번지를 대입
			car.sound = function() {
				console.log("뛰뛰빵빵");
			};
			car.sound(); 
		</script>
	</head>
	
	<body>
		
	</body>
</html>