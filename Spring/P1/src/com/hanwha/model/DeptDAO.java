package com.hanwha.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.hanwha.util.DBUtil_Oracle;

/*
 * DAO(Data Access Object):Business logic
 */
public class DeptDAO {

	public List<DeptDTO> selectAll() {
		List<DeptDTO> deptlist = new ArrayList<>();
		Connection conn = DBUtil_Oracle.getConnect();
		Statement st = null;
		ResultSet rs = null;
		String sql="select * from departments";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				int deptid = rs.getInt("department_id");
				String dname = rs.getString("department_name");
				DeptDTO dept = new DeptDTO(deptid, dname);
				deptlist.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil_Oracle.dbClose(rs, st, conn);
		}
		return deptlist;
	}
}





