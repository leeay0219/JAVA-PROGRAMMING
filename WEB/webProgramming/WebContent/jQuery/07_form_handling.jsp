<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript" src = "../common/js/jquery-3.4.1.min.js"></script>
	</head>
	
	<body>
		<form id = "joinForm">
			ID: <input id = "mid" name = "mid" type = "text"/> <br/>
			Name: <input id = "mname" name = "mname" type = "text"/> <br/>
			PW: <input id = "mpassword" name = "mpassword" type = "password"/><br/>
			희망부서:
			<input id = "mdepartment" name = "mdepartment" type = "checkbox" value = "1"/>핀테크
			<input id = "mdepartment" name = "mdepartment" type = "checkbox" value = "2"/>SAP
			<input id = "mdepartment" name = "mdepartment" type = "checkbox" value = "3"/>데이터센터 <br/>
			성별: 
			<input id = "msex" name = "msex" type = "radio" value = "female"/> female
			<input id = "msex" name = "msex" type = "radio" value = "male"/> male<br/>
			거주지: 
			<select id = "mcity" name = "mcity">
				<option>서울</option>
				<option>부산</option>
				<option>제주</option>
				<option>평양</option>
				<option>함평</option>
			</select>
		</form>	
	</body>
</html>