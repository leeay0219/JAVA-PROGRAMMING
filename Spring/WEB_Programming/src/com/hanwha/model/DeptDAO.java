package com.hanwha.model;
import java.sql.*;
import java.util.*;

import com.hanwha.util.DBUtil_Oracle; 
public class DeptDAO {
	public List <DeptDTO> selectAll() {
		List <DeptDTO> deptList = new ArrayList<>();
		Connection conn = DBUtil_Oracle.getConnect();
		//default: autocommit
		//conn.setAutoCommit(false); 로 autocommit 설정 막기 가능
		Statement st = null;
		ResultSet rs = null; 
		String sql = "select * from departments"; 
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int deptid = rs.getInt("department_id");
				String dname = rs.getString("department_name");
				DeptDTO dept = new DeptDTO(deptid, dname);
				deptList.add(dept);
			}
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil_Oracle.dbClose(rs, st, conn);
		} return deptList; 
	}

	public DeptDTO selectByID(int deptid) {
		DeptDTO dept = null;
		Connection conn = DBUtil_Oracle.getConnect();
		Statement st = null;
		ResultSet rs = null; 
		String sql = "select * from departments where department_id = " + deptid; 
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String dname = rs.getString("department_name");
				dept = new DeptDTO(deptid, dname);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil_Oracle.dbClose(rs, st, conn);
		} return dept; 
	}

	public int insertDept(DeptDTO dept) {
		Connection conn = DBUtil_Oracle.getConnect();
		PreparedStatement st = null;
		int result = 0;
		String sql = "insert into departments(department_id, department_name) values(?,?)"; 
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, dept.getDepartment_id());
			st.setString(2, dept.getDepartment_name());
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updateDept(DeptDTO dept) {
		Connection conn = DBUtil_Oracle.getConnect();
		PreparedStatement st = null;
		int result = 0;
		
		String sql = "update departments set department_name = ? where department_id = ?"; 
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, dept.getDepartment_name());
			st.setInt(2, dept.getDepartment_id());
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int deleteDept(int deptid) {
		Connection conn = DBUtil_Oracle.getConnect();
		PreparedStatement st = null;
		int result = 0;
		String sql = "delete from departments where department_id = ?"; 
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, deptid);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
