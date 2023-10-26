package com.acorn.day9;

import java.sql.*;

public class TestDB {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";

		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		//
		
		try {
			String sql1 = "insert into testdb values('a1','0000')";
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			int result = pst1.executeUpdate();
			System.out.println("1번" +result);
			//
			
			String sql2 =  "insert into testdb values('a1','1111')";
			PreparedStatement pst2 = conn.prepareStatement(sql2);
			int result2 = pst2.executeUpdate();
			System.out.println("2번" +result2);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
