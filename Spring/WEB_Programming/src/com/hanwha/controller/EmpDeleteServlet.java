package com.hanwha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanwha.model.EmpDAO;

/**
 * Servlet implementation class EmpDeleteServlet
 */
@WebServlet("/emp/empdelete")
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("employee_id");
		int empid = Integer.parseInt(eid);
		EmpDAO dao = new EmpDAO(); 
		int ret = dao.deleteEmp(empid);
		request.setAttribute("message", ret + "건 삭제되었습니다");
		RequestDispatcher rd = request.getRequestDispatcher("empresult.jsp"); 
		rd.forward(request, response);
	}

}
