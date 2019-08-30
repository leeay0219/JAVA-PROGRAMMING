package com.hanwha.controller;

import com.hanwha.model.EmpDAO;
import com.hanwha.model.EmpVO;
import com.hanwha.view.EmpView;

public class TestScontroller {

	public static void main(String[] args) {
		EmpVO emp = new EmpVO(1321, "Ah Yeong", "Lee", "leeay0219@gmail.com", null, null, "IT_PROG", 5000, 0.0, 0, 60); 
		EmpDAO dao = new EmpDAO();
		int ret = dao.insertEmp(emp);
		EmpView.print(ret + " 입력");
		
//		int result = dao.updateEmp(100, "Hello"); 
//		EmpView.print(result + " 가 수정되었습니다.");
		
		int employee_id2 = 1321;
		int ret1 = dao.deleteEmp(employee_id2);
		EmpView.print(ret1 + " 삭제");
	}

}
