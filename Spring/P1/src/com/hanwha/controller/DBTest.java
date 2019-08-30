package com.hanwha.controller;

import java.sql.*;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver load
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. driver load 성공");
		
		//2. Connection
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:HWORACLE";
		String user = "hr", password = "hr";
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공: " + conn);
		
		//3. Statement
		Statement st = null;
		String sql = "select * from employees";
		st = conn.createStatement();
		System.out.println("3. Statement 생성(SQL문장실행 통로): " + st);
		
		//4. SQL문 실행
		ResultSet rs = st.executeQuery(sql);
		System.out.println("4. ResultSet(실행결과): " + rs);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		}
		//5. DB연결 해제 (== 자원반납)
		rs.close();
		st.close();
		conn.close();
	}

}
