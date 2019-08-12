<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<!-- inline element -->
		<h4>inline element</h4>
		<span style = "border: 1px solid red; width: 200px; background-color: DodgerBlue">A</span> 
		<span style = "border: 1px solid red; display: inline-block; width: 200px; background-color: #FF50FF">B</span>
		
		<!-- child block element -->
		<h4>block element</h4>
		<div style = "border: 4px solid black; display: block; width: 200px"> A </div>
		<div style = "border: 4px solid black; height:530px; width: 540px; background-image: url(https://img.hankyung.com/photo/201907/2019072016362433099-540x536.jpg)">
			<div style = "background-color: #00FF00; width: 200px; margin:auto; text-align: center; vertical-align:middle;">앙기모띵</div>
		</div> 			
	
		<!-- change display value -->
		<h4>Layout</h4>
		<span style = "border: 1px solid #00FF00; display:block;">A</span>
		<span style = "border: 1px solid #0000FF; display:inline-block;">B</span>
		<span style = "border: 1px solid #00FF00;">C</span>
		
		<!-- layout1 -->
		<div>
			<div style = "height:150px; background-color: #808080"> 
				<h1 style = "margin: auto; text-align: center; color: white; font-size: 300%;">Cities</h1> 
			</div>
			
			<div style = "width: 30%; height: 300px; background-color: lightgrey; float: left;">
				<a href = "https://www.visitlondon.com/" style = "font-size: 120%;">London</a>
				<br>
				<a href = "https://en.parisinfo.com/" style = "font-size: 120%;"> Paris</a>
				<br>
				<a href = "https://www.gotokyo.org/en/" style = "font-size: 120%;">Tokyo</a>
			</div>
			
			<div style = "width: 70%; height: 300px; background-color: #E6E6E6; float: left; border">
				<h2>London</h2>
				<p>London is the capital city of England. <br>
				   It is the most populous city in the United Kingdom, <br>
				   with a metropolitan area of over 13 million inhabitants. <br>
				   Standing on the River Thames, London has been a major settlement for two millennia, <br>
				   its history going back to its founding by the Romans, who named it Londinium.
				</p>
			</div>
			
			<div style = "width: 100%, height: 200px; background-color: #808080">
				<footer style = "margin: auto; text-align: center; color: white; font-size: 150%"> footer </footer>
			</div>
			<div></div>
		</div>
	
	</body>
</html>