package com.acorn.day2.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DramaDAO {

	@Autowired
	DataSource ds;

	public ArrayList<String> dlist() {
		String sql = "select * from drama_tbl";

		ArrayList<String> list = new ArrayList<String>();

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String title = rs.getString(2);
				String actors = rs.getString(3);
				list.add(code);
				list.add(title);
				list.add(actors);
			}
			//
			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;

	}
}
