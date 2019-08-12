<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<table style = "border: 3px solid black; width: 100%">
			<tr> 
				<th> Firstname </th>
				<th> Lastname </th>
				<th> Age </th> 
			</tr>
			
			<tr> 
				<th> number </th>
				<th> title </th>
				<th> content </th> 
			</tr>
			
			<% for (int i=1; i<=10; i++) {%>
				<tr>
					<td><%=i%> </td>
				</tr>
			<%}%>
			
		</table>	
	</body>
</html>