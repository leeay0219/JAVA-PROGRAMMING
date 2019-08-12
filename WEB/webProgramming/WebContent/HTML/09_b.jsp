<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h4>09_b_tag.jsp</h4>
		
		<%  request.setCharacterEncoding("UTF-8"); 
			String mid = request.getParameter("mid");
			String mpw = request.getParameter("mpw");
		%>
		Input ID: <%=mid%><br>
		Input PW: <%=mpw%><br> 
		
		<a href = "09_a_tag.jsp">back</a>
	</body>
</html>