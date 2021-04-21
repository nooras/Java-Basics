package com.infy;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSample {
	public Employee getEmployee() throws SQLException {
		//try with resource
//		try (FileInputStream f = new FileInputStream("Input.txt");
//				)
		Connection con = null;
		Employee emp = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "infy@123");
			PreparedStatement ps = con.prepareStatement("Select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));//empid
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setEmp_age(rs.getInt(3));
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			con.close();
		}
		return emp;
	}

//	public void getEmployee() {
//		// TODO Auto-generated method stub
//		
//	}
}
