package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import kr.ac.hansung.model.Hansung;

public class HansungMapper implements RowMapper<Hansung> {

	public Hansung mapRow(ResultSet rs, int rowNum) throws SQLException {

		Hansung hansung = new Hansung();

		hansung.setYear(rs.getInt("year"));
		hansung.setInt(rs.getInt("term"));
		hansung.setSubCode(rs.getString("sub_code"));
		hansung.setSubName(rs.getString("sub_name"));
		hansung.setDivision(rs.getString("division"));
		hansung.setCredit(rs.getInt("credit"));

		return hansung;
	}

}
