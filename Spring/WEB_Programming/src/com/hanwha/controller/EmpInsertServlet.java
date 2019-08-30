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
 * Servlet implementation class EmpInsertServlet
 */
@WebServlet("/emp/empinsert")
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DeptDAO dao = new DeptDAO();
		EmpDAO dao2 = new EmpDAO();
		request.setAttribute("deptlist", dao.selectAll());
		request.setAttribute("joblist", dao2.selectAllJob());
		request.setAttribute("managerlist", dao2.selectAllManager());
		RequestDispatcher rd = request.getRequestDispatcher("empinsert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpVO emp = makeEmp(request);
		EmpDAO dao = new EmpDAO();
		int ret = dao.insertEmp(emp);
		request.setAttribute("message", ret + "건 입력되었습니다");
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
