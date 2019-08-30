<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //이름이 같을 때 우선순위 -> request, session, app, page 순으로 
	String name = request.getParameter ("myname");
	//웹프로그램 전체페이지에서 공유
	application.setAttribute("name", name + ": app");
	//웹브라우저의 모든 페이지에서 공유 (사용자 1인).. 브라우저 종료시 제거
	session.setAttribute("name", name + ": sec"); 
	//요청이 유지되는 동안 유효
	request.setAttribute("name", name + ": req");
	//페이지 내에서만 유효 
	pageContext.setAttribute("name", name + ": page");
%>
<h1> 첫번째 페이지입니다. </h1>
<h1> 당신의 이름은 ${applicationScope.name } 입니다. </h1>
<h1> 당신의 이름은 ${sessionScope.name } 입니다. </h1>
<h1> 당신의 이름은 ${requestScope.name } 입니다. </h1>
<h1> 당신의 이름은 ${pageScope.name } 입니다. </h1>
<% //<jsp:forward page="scopeTest2.jsp"></jsp:forward> %>
<jsp:include page="scopeTest2.jsp"></jsp:include>

<%
	//RequestDispatcher rd = request.getRequestDispatcher("scopeTest2.jsp");
	//rd.forward(request, response);
%>

</body>
</html>