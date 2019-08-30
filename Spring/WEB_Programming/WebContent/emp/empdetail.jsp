<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>직원의 상세보기</h1>
<form action = "empdetail" method = "post">
직원번호: <input type = "number" disabled = "disabled" name = "aa" value = "${emp.employee_id}"><br>
			<input type = "hidden" name = "employee_id" value = "${emp.employee_id}"><br>
이름: <input type = "text" name = "first_name" value = "${emp.first_name}"><br>
성: <input type = "text" name = "last_name" value = "${emp.last_name}"><br>
이메일: <input type = "text" name = "email" value = "${emp.email}"><br>
전화번호: <input type = "text" name = "phone_number" value = "${emp.phone_number}"><br>
입사일: <input type = "date" name = "hire_date" value = "${emp.hire_date}"><br>
직무: <input type = "text" name = "job_id" value = "${emp.job_id}"><br>
연봉: <input type = "number" name = "salary" value = "${emp.salary}"><br>
커미션: <input type = "number" name = "commission_pct" value = "${emp.commission_pct}"><br>
매니저번호: <input type = "number" name = "manager_id" value = "${emp.manager_id}"><br>
부서번호: <input type = "number" name = "department_id" value = "${emp.department_id}"><br>
<input type = "submit" value = "수정하기">
</form>
</body>
</html>