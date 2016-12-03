package kr.ac.hansung.model;

public class Hansung {

	private int year;
	private int term;
	private String sub_code;
	private String sub_name;
	private String division;
	private int credit;
	
	public Hansung(){
		
	}

	public Hansung(int year, int term, String sub_code, String sub_name, String division, int credit) {
		super();
		this.year = year;
		this.term = term;
		this.sub_code = sub_code;
		this.sub_name = sub_name;
		this.division = division;
		this.credit = credit;
	}
	
	
	
}
