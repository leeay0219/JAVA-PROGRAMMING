package com.hanwha.controller;

import java.sql.*;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver load
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. driver load ����");
		
		//2. Connection
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:HWORACLE";
		String user = "hr", password = "hr";
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����: " + conn);
		
		//3. Statement
		Statement st = null;
		String sql = "select * from employees";
		st = conn.createStatement();
		System.out.println("3. Statement ����(SQL������� ���): " + st);
		
		//4. SQL�� ����
		ResultSet rs = st.executeQuery(sql);
		System.out.println("4. ResultSet(������): " + rs);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		}
		//5. DB���� ���� (== �ڿ��ݳ�)
		rs.close();
		st.close();
		conn.close();
	}

}
