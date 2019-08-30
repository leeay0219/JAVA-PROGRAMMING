package com.hanwha.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet({ "/FirstServlet", "/first", "/first2" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int count; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        System.out.println("FirstServlet ������");
        // TODO Auto-generated constructor stub
    }
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		String name = request.getParameter("myname");
		String age = request.getParameter("age");

		System.out.println(count + " ° �湮 ... FirstServlet doGet -- get ��û");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.append("Served at: ");
		out.append(request.getContextPath() + count + "°");
		out.append("<h1>" + name + "�� ȯ���մϴ�. </h1>");
		out.append("<h2>" + age + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("FirstServlet doPost -- post ��û");
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
	
	public void destroy() {
		System.out.println("destroy");
	}

}
