package com.hanwha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanwha.model.DeptDAO;

/**
 * Servlet implementation class DeptDeleteServlet
 */
@WebServlet("/dept/deptdelete")
public class DeptDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request.getParameter("deptid");
		int deptid = Integer.parseInt(sid);
		DeptDAO dao = new DeptDAO(); 
		int ret = dao.deleteDept(deptid);
		request.setAttribute("message", ret + "건 삭제되었습니다");
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp"); 
		rd.forward(request, response);
	}

}
