package com.hanwha.controller;

import java.sql.*;

import com.hanwha.util.DBUtil_Oracle;

public class DBTest2 {

	public static void main(String[] args) {
		Connection conn = null; 
		Statement st = null; 
		ResultSet rs = null;
		String sql = "select * from employees";
		try {
			conn = DBUtil_Oracle.getConnect();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int empid = rs.getInt(1);
				String fname = rs.getString("first_name");
				Date hire_date = rs.getDate("hire_date");
				int sal = rs.getInt("salary");
				int deptid = rs.getInt("department_id");
				System.out.println(empid + " " + fname +  " " + hire_date + " " + sal +  " " + deptid);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 에러와 상관없이 자원 반납
			DBUtil_Oracle.dbClose(rs, st, conn);
		}
		//1. Driver load

		//2. Connection

		//3. Statement

		
		//4. SQL문 실행

		//5. DB연결 해제 (== 자원반납)

	}

}
