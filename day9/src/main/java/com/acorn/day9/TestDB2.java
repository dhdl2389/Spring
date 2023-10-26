package com.acorn.day9;

import java.sql.*;

public class TestDB2 {
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
		
		// 트랜젝션
		try {
			// 수동 커밋 설정
			conn.setAutoCommit(false);
			String sql1 = "insert into testdb values('a4','0000')";
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			int result = pst1.executeUpdate();
			System.out.println("1번" +result);
			
			//
			String sql2 =  "insert into testdb values('a5','0000')";
			PreparedStatement pst2 = conn.prepareStatement(sql2);
			int result2 = pst2.executeUpdate();
			System.out.println("2번" +result2);
			
			// 커밋실행 둘 다 수행 되었을 때
			conn.commit();
			
		} catch (SQLException e) {

			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
		
		

	}
}
