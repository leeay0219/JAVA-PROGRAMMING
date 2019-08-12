<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	<% for (int i=0; i<10; i++) {%>
		<img src = "../common/images/photo<%=i %>.jpg" style = "width:100px; height:100px; float:left;">
	<%} %>
	<hr/>
	
	<table>
		<%int totalNum = 17; 
			for (int i=1; i<=totalNum; i++) {
				if(i%5==1) {%>
					<tr>
				<%}%>
			<td>
				<div>
					<div>
					<img src = "../common/images/photo<%=i %>.jpg" style = "width:100px; height:100px; float:left;"> 
					</div>
				</div>
			</td>
			<%if (i%5 ==0 || i==totalNum) {%>
				</tr>
			<%} %>
		<%} %>
	</table>
	</body>
</html>