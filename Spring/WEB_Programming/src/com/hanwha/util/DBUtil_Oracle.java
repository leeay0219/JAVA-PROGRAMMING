package com.hanwha.util;
import java.sql.*; 

public class DBUtil_Oracle {
	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:HWORACLE";
		String user = "hr", password = "hr";
		Connection conn = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn; 
	}
	
	public static void dbClose(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) rs.close();
			if (st != null) st.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
