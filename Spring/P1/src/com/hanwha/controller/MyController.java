package com.hanwha.controller;

import java.util.List;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.hanwha.model.DeptDAO;
import com.hanwha.model.DeptDTO;
import com.hanwha.model.EmpDAO;
import com.hanwha.model.EmpVO;
import com.hanwha.util.DateUtil;
import com.hanwha.view.DeptView;
import com.hanwha.view.EmpView;

public class MyController {

	public static void main(String[] args) {
		String sdate = "2019-08-01";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		try {
			java.util.Date d = sd.parse(sdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		java.util.Date d1 = new java.util.Date();
		Date d2 = new Date(d1.getTime());
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("1. 부서 모두 조회");
		System.out.println("2. 직원 모두 조회");
		System.out.println("3. 특정 부서 조회");
		System.out.println("4. 특정 직원 조회");
		System.out.println("5. 특정부서의 직원 조회");
		System.out.println("6. 특정직업의 직원 조회");
		System.out.println("7. 부서 입력");
		System.out.println("8. 부서 수정");
		System.out.println("10. 직원 입력");
		System.out.print("작업 선택>");
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		EmpDAO e_dao = new EmpDAO();
		
		switch (sc.nextInt()) {
		case 1: //부서 모두 조회 
			List <DeptDTO> deptList = dao.selectAll();
			DeptView.print(deptList);
			break; 
		case 2: //직원 조회 
			EmpView.print(e_dao.selectAll());
			break;
		case 3:  {
			System.out.print("조회할 부서 입력>");
			int deptid = sc.nextInt();
			DeptDTO dept = dao.selectByID(deptid);
			DeptView.print(dept);
			break; 
		}
		case 4:
			System.out.print("조회할 직원번호 입력>");
			int empid = sc.nextInt();
			EmpView.print(e_dao.selectById(empid));
			break;
		case 5: {
			System.out.print("조회할 부서 입력>");
			int deptid = sc.nextInt();
			EmpView.print(e_dao.selectByDept(deptid));
			break;
		}
		case 6: {
			System.out.print("조회할 직업 입력>");
			String job = sc.next();
			System.out.print("조회할 급여 입력>");
			int sal = sc.nextInt(); 
			EmpView.print(e_dao.selectByJob(job, sal));
			break;
		}
		case 7: {
			System.out.println("부서코드와 부서이름 입력 (e.g. 10 AA) >");
			DeptDTO dept = new DeptDTO(sc.nextInt(), sc.next()); 
			int result = dao.insertDept(dept);
			DeptView.print(result + " 건이 입력되었습니다.");
			break;
		}
		case 8: {
			
			System.out.println("수정할 부서코드와 부서이름 입력 (e.g. 10 AA) >");
			DeptDTO dept = new DeptDTO(sc.nextInt(), sc.next()); 
			int result = dao.updateDept(dept);
			DeptView.print(result + " 가 수정되었습니다.");
			break;
		}
		case 10: {
			Date d = DateUtil.transDate("2019-08-01");
			EmpVO emp = new EmpVO(33, "길동", "김", "aa3@gmail.com", "null", d, "IT_PROG", 1000, 0, 0, 60);
			int ret = e_dao.insertEmp(emp); 
			System.out.println(emp); 
			EmpView.print(ret + "입력");
			break;
		}
		case 11: {
			EmpVO emp = new EmpVO(); 
			emp.setEmployee_id(33);
			emp.setFirst_name("이름수정");
			int ret = e_dao.updateEmp(emp);
			EmpView.print(ret + "수정");
			break; 
		}
		case 12: {
			int ret = e_dao.deleteEmp(33);
			EmpView.print(ret + "삭제");
			break; 
		}

		default:
			break;
		}
		sc.close();
	}

}
