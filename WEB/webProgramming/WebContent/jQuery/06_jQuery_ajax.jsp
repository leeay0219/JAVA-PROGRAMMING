<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type = "text/javascript" src = "../common/js/jquery-3.4.1.min.js"></script>
		<script type = "text/javascript">
			function fun1() {
				$.ajax({
					url: "06_getAdvImg.jsp"
					success: function(response) {
						$("#adv".html(response));
					}
				});
			}
		</script>
	</head>
	
	<body>
		1. 전체 페이지 갱신: 
		<a href = "https://www.hsnc.co.kr/kr/index.do">한화시스템/ICT</a>
		<br/>
		2. 부분 갱신:
		<a href = "javascript:fun1()">광고 이미지 보기</a>
		<hr/>
		<div id = "adv" style = "width:200px; height:100px; border: 1px solid black"></div>
	</body>
</html>