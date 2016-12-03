package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.ac.hansung.model.Hansung;

@Component
public class HansungDAO {
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from hansung";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public Hansung getHansung(String sub_name) {
		String sqlStatement = "select * from hansung where sub_name=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { sub_name }, new RowMapper());
	}

	public List<Hansung> getHansung() {
		String sqlStatement = "select * from hansung";

		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());

	}
	public boolean insert(Hansung hansung){
		int year = hansung.getYear();
		int term = hansung.getTerm();
		String sub_code = hansung.getSubCode();
		String sub_name = hansung.getSubName();
		String division = hansung.getDivision();
		int credit = hansung.getCredit();
		String sqlStatement = "insert into hansung(year,term,sub_code,sub_name,division,credit)values (?,?,?,?,?,?)";
		jdbcTemplateObject.update(sqlStatement, new Object[]{year,term,sub_code,sub_name,division,credit});
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,term,sub_code,sub_name,division,credit})==1);
		

	}
	
	public boolean update(Hansung hansung){
		int year = hansung.getYear();
		int term = hansung.getTerm();
		String sub_code = hansung.getSubCode();
		String sub_name = hansung.getSubName();
		String division = hansung.getDivision();
		int credit = hansung.getCredit();
		String sqlStatement = "update hansung set Year=?, Term=?, Sub_Code=?, Sub_Name=?, Division=?, Credit=?";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,term,sub_code,sub_name,division,credit})==1);
	}
	
	public boolean delete(String sub_code){
		String sqlStatement = "delet from hansung where sub_code=?";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{sub_code})==1);
	}
}
