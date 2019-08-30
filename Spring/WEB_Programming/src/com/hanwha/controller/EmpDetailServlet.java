package com.hanwha.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanwha.model.DeptDAO;
import com.hanwha.model.EmpDAO;
import com.hanwha.model.EmpVO;
import com.hanwha.util.DateUtil;

/**
 * Servlet implementation class EmpDetailServlet
 */
@WebServlet("/emp/empdetail")
public class EmpDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		int empid = Integer.parseInt(request.getParameter("employee_id"));
		request.setAttribute("emp", dao.selectById(empid));
		RequestDispatcher rd = request.getRequestDispatcher("empdetail.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpVO emp = makeEmp(request);
		EmpDAO dao = new EmpDAO();
		int ret = dao.updateEmp(emp);
		request.setAttribute("message", ret + "건 수정되었습니다");
		RequestDispatcher rd = request.getRequestDispatcher("empresult.jsp");
		rd.forward(request, response);
	}

	private EmpVO makeEmp(HttpServletRequest request) throws UnsupportedEncodingException {
		EmpVO emp = new EmpVO();
		request.setCharacterEncoding("UTF-8");
		String sid = request.getParameter("employee_id");
		int employee_id = Integer.parseInt(sid);
		
		String comm = request.getParameter("commission_pct");
		double commission_pct = Double.parseDouble(comm);
		
		String did = request.getParameter("department_id");
		int department_id = Integer.parseInt(did);
		
		String d = request.getParameter("hire_date");
		Date hire_date = DateUtil.transDate(d);
		
		String mid = request.getParameter("manager_id");
		int manager_id = Integer.parseInt(mid);
		
		String sal = request.getParameter("salary");
		int salary = Integer.parseInt(sal);
		
		emp.setEmployee_id(employee_id);
		emp.setCommission_pct(commission_pct);
		emp.setDepartment_id(department_id);
		emp.setHire_date(hire_date);
		emp.setManager_id(manager_id);
		emp.setSalary(salary);
		emp.setFirst_name(request.getParameter("first_name"));
		emp.setLast_name(request.getParameter("last_name"));
		emp.setEmail(request.getParameter("email")); 
		emp.setPhone_number(request.getParameter("phone_number"));
		emp.setJob_id(request.getParameter("job_id"));
		return emp;
	}


}
