package com.hanwha.controller;
import java.sql.*;

import com.hanwha.util.DBUtil_Oracle; 

public class DBTest3 {

	public static void main(String[] args) {
		Connection conn = DBUtil_Oracle.getConnect();
		Statement st = null; 
		ResultSet rs = null; 
		String sql = "select * from departments where department_id < 100";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil_Oracle.dbClose(rs, st, conn);
		}
	}

}
