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
 * Servlet implementation class DeptInsertServler
 */
@WebServlet("/dept/deptinsert")
public class DeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력페이지 보여주기
		RequestDispatcher rd = request.getRequestDispatcher("deptinsert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB에 입력
		String sid = request.getParameter("department_id");
		int deptid = Integer.parseInt(sid);
		String dname = request.getParameter("department_name");
		
		DeptDAO dao = new DeptDAO();
		int ret = dao.insertDept(new DeptDTO(deptid, dname));
		request.setAttribute("message", ret + "건 입력되었습니다");
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
