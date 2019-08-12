<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type = "text/css">
			div {
				border: 10px solid black; 
				width: 200px;
				height: 200px;
				margin: 0px 0px 5px 0px; 
			}
			
			* {
				margin: 0px; 
				padding: 0px; 
			}
			
			p {
				width: 60px; 
				height: 60px;
				background-color: #AFEEEE;
				border: 5px solid red; 
			}
			
			#p1 {
				background-color: #FFFFE0
			}
			
			#p2 {
				margin: 20px 0px 0px 0px;
			}
			
			#div1 {
				border: 10px solid green;
				width: 100px; 
				height: 100px;
				padding: 20px;
			}
			
			#div2 {
				width: 30px; 
				height: 30px; 
				border: 10px solid blue; 
			}
			
			.class1 {
				width: 30px; 
				height: 30px;
				border: 10px solid red; 
				display: inline-block;
				margin: 0px;
				padding: 0px;
			}
			
			input[type=text] {
				background-color: red; 
			}
			
			input:focus {
				background-color: green; 
			}
			
			a {
				color:green;
			}
			
			a:hover {
				color:red; 
			}
			
			#boardList, td, th{
				border-collapse: collapse; 
				border: 1px solid black;
			}
			.title {
				width: 100px; 
				margin: auto; 
				text-align: center; 
			}
		</style>
	</head>
	
	<body>
		<div>
			<p id = "p1"></p>
			<p id = "p2"></p>
		</div>	
		
		<div>
			<div id = "div1"></div>
			<div id = "div2"></div>
		</div>
		
		<div>
			<div class = "class1"></div><div class = "class1"></div>
		</div>
		
		<div>
			ID <input type = "text" value = "a"/><br>
			PW <input type = "text" value = "b"/><br>
			<a href = "#"> move to list </a> <br>
			<a href = "#"> move to login page </a> <br>
		</div>
		
		<table id = "boardList">
			<tr>
				<th>NO</th>
				<th class = "title">Title</th>
				<th>Writer</th>
				<th>Date</th>
			</tr>
			<%for (int i=1; i<=10; i++) {%>
				<tr>
					<td> <%=i %> </td>
					<td class = "title">Title <%=i %></td>
					<td>Writer <%=i %></td>
					<td>Date <%=i %></td>
				</tr>
			<%} %>
		</table>
	</body>
</html>