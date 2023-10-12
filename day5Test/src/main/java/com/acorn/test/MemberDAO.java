package com.acorn.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	@Autowired
	DataSource ds;

	public ArrayList<Member> select() {

		String sql = "select * from membertbl";
		ArrayList<Member> list = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
				System.out.println(rs.getString(4));
				list.add(new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));

			}
			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public int insert(Member member) {
		int row = 0;

		String sql = "insert into membertbl values( ?,?,?,?)";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, member.getId());
			pst.setString(2, member.getPw());
			pst.setString(3, member.getName());
			pst.setString(4, member.getTel());
			row = pst.executeUpdate();

			pst.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	public ArrayList<String> test() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("테스트항목1");
		testList.add("테스트항목2");
		// return null; // 테스트시 실패
		return testList; // 테스트시 성공
	}

}
