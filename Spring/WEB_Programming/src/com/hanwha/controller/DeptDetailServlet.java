package com.hanwha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanwha.model.DeptDAO;
import com.hanwha.model.DeptDTO;

/**
 * Servlet implementation class DeptDetailServlet
 */
@WebServlet("/dept/deptdetail")
public class DeptDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sdept = request.getParameter("deptid");
		int deptid = Integer.parseInt(sdept);
		DeptDAO dao = new DeptDAO(); 
		request.setAttribute("dept", dao.selectByID(deptid)); // 부서 한건만 저장
		RequestDispatcher rd = request.getRequestDispatcher("deptdetail.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sid = req.getParameter("department_id");
		String name = req.getParameter("department_name"); 
		int deptid = Integer.parseInt(sid);
		DeptDAO dao = new DeptDAO();
		int result = dao.updateDept(new DeptDTO(deptid, name));
		req.setAttribute("message", result + "건 수정");
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);
	}
}
