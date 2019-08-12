<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h4>06_login.jsp</h4>
		<%  request.setCharacterEncoding("UTF-8"); 
			String mid = request.getParameter("mid");
			String mpw = request.getParameter("mpw");
		%>
		Input ID: <%=mid%><br>
		Input PW: <%=mpw%><br> 
	</body>
</html>