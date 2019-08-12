<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<div style = "display:flex; border:1px solid black">
			<div style = " border:1px solid black; flex-grow:1">1</div>
			<div style = "border:1px solid black; flex-grow:1">2</div>
			<div style = "border:1px solid black; flex-grow:1">3</div>
		</div>
		
		<div>
			<header style = "height: 100px; border: 2px solid black; text-align: center"> <h2>TOP</h2> </header>
			<div style = "height: 100px; border: 2px solid black;"> top menu </div>
			
			<section style = "height: 200px; display:flex; border:1px solid black">
				<article style = "border:1px solid black; flex-grow:2">1</article>
				<article style = "border:1px solid black; flex-grow:1">2</article>
				<article style = "border:1px solid black; flex-grow:1">3</article>
			</section>
			<div style = "height: 100px; border: 2px solid black;"> bottom </div>
		</div>
	</body>
</html>