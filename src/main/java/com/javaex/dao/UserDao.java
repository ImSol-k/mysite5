package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void userSelect(UserVo userVo) {
		System.out.println("UserDao.userSelect()");
		
		System.out.println(userVo);
		
	}
	
	
	
	
}
