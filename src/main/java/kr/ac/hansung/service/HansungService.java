package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.HansungDAO;

@Service
public class HansungService {
	private HansungDAO hansungDao;
	
	@Autowired
	public void setHansungDao(HansungDAO hansungDao){
		this.hansungDao = hansungDao;
	}
	
	public List<Hansung> getCurrent(){
		return hansungDao.getHansung();
	}
}
