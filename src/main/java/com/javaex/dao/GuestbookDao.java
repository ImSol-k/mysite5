package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<GuestbookVo> guestSelect(){
		System.out.println("GuestbookDao.guestSelect()");
		
		List<GuestbookVo> guestList = sqlSession.selectList("guest.select");
		
		return guestList;
	}
	
	
}
