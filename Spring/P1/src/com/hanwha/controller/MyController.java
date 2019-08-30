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
		
		System.out.println("1. �μ� ��� ��ȸ");
		System.out.println("2. ���� ��� ��ȸ");
		System.out.println("3. Ư�� �μ� ��ȸ");
		System.out.println("4. Ư�� ���� ��ȸ");
		System.out.println("5. Ư���μ��� ���� ��ȸ");
		System.out.println("6. Ư�������� ���� ��ȸ");
		System.out.println("7. �μ� �Է�");
		System.out.println("8. �μ� ����");
		System.out.println("10. ���� �Է�");
		System.out.print("�۾� ����>");
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		EmpDAO e_dao = new EmpDAO();
		
		switch (sc.nextInt()) {
		case 1: //�μ� ��� ��ȸ 
			List <DeptDTO> deptList = dao.selectAll();
			DeptView.print(deptList);
			break; 
		case 2: //���� ��ȸ 
			EmpView.print(e_dao.selectAll());
			break;
		case 3:  {
			System.out.print("��ȸ�� �μ� �Է�>");
			int deptid = sc.nextInt();
			DeptDTO dept = dao.selectByID(deptid);
			DeptView.print(dept);
			break; 
		}
		case 4:
			System.out.print("��ȸ�� ������ȣ �Է�>");
			int empid = sc.nextInt();
			EmpView.print(e_dao.selectById(empid));
			break;
		case 5: {
			System.out.print("��ȸ�� �μ� �Է�>");
			int deptid = sc.nextInt();
			EmpView.print(e_dao.selectByDept(deptid));
			break;
		}
		case 6: {
			System.out.print("��ȸ�� ���� �Է�>");
			String job = sc.next();
			System.out.print("��ȸ�� �޿� �Է�>");
			int sal = sc.nextInt(); 
			EmpView.print(e_dao.selectByJob(job, sal));
			break;
		}
		case 7: {
			System.out.println("�μ��ڵ�� �μ��̸� �Է� (e.g. 10 AA) >");
			DeptDTO dept = new DeptDTO(sc.nextInt(), sc.next()); 
			int result = dao.insertDept(dept);
			DeptView.print(result + " ���� �ԷµǾ����ϴ�.");
			break;
		}
		case 8: {
			
			System.out.println("������ �μ��ڵ�� �μ��̸� �Է� (e.g. 10 AA) >");
			DeptDTO dept = new DeptDTO(sc.nextInt(), sc.next()); 
			int result = dao.updateDept(dept);
			DeptView.print(result + " �� �����Ǿ����ϴ�.");
			break;
		}
		case 10: {
			Date d = DateUtil.transDate("2019-08-01");
			EmpVO emp = new EmpVO(33, "�浿", "��", "aa3@gmail.com", "null", d, "IT_PROG", 1000, 0, 0, 60);
			int ret = e_dao.insertEmp(emp); 
			System.out.println(emp); 
			EmpView.print(ret + "�Է�");
			break;
		}
		case 11: {
			EmpVO emp = new EmpVO(); 
			emp.setEmployee_id(33);
			emp.setFirst_name("�̸�����");
			int ret = e_dao.updateEmp(emp);
			EmpView.print(ret + "����");
			break; 
		}
		case 12: {
			int ret = e_dao.deleteEmp(33);
			EmpView.print(ret + "����");
			break; 
		}

		default:
			break;
		}
		sc.close();
	}

}
