<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript"> 
			function printWindowSize() {
				var w = window.innerWidth
				|| document.documentElement.clientWidth
				|| document.body.clientWidth; 
			
				var h = window.innerHeight
				|| document.documentElement.clientHeight
				|| document.body.clientHeight;
				
				window.console.log("width: " + w);
				window.console.log("height: " + h);
			}
			
			function openNewWindow() {
				alert("Alert!");
			}
			
			function openNewWindow2() {
				var result = confirm("나는 씩씩 아영이의 컴퓨터");
				if (result) {
					window.console.log("confirm");
				} else {
					window.console.log("cancel");
				}
			}
			
			function openNewWindow3() {
				window.open("https://naver.com", "", "width=400, height=300");
			}
			
			var workId1;
			var workId2;
			
			function testSetInterval() {
				workId1 = window.setInterval(
					function() {
						console.log("goodmorning");
					},
					1000
				);
				
				workId2 = window.setInterval(
					function() {
						console.log("JS");
				 	},
					500
				);
			}
			
			function testClearInterval1() {
				window.clearInterval(workId1);
			}
			
			function testClearInterval2() {
				window.clearInterval(workId2);
			}
			var workId3;
			function testSetTimeout() {
				workId3 = window.setTimeout(
					function() {
						console.log("save"); 
						testSetTimeout();
					}, 3000); 
			}
			
			function testClearTimeout() {
				window.clearTimeout(workId3);
			}
			
		</script>
	</head>
	
	<body>
		<a href = "javascript:printWindowSize()">window size</a> <br>
		<a href = "javascript:openNewWindow()">alert</a> <br>
		<button onclick = "openNewWindow2()">confirm</button> <br>
		<button onclick = "openNewWindow3()">new window</button> <br>
		<button onclick = "testSetInterval()">비동기작업실행</button> <br>
		<button onclick = "testClearInterval1()">goodmorning비동기작업종료</button> <br>
		<button onclick = "testClearInterval2()">JS비동기작업종료</button> <br>
		<a href = "javascript:testSetTimeout()">timeout</a> <br>
		<a href = "javascript:testClearTimeout()">clear timeout</a>
		
	</body>
</html>