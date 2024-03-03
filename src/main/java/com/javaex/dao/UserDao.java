package com.javaex.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	public Map<String, Object> userSelectOne(UserVo userVo) {
		System.out.println("UserDao.userSelectOne()");
		
		Map<String, Object> uMap = sqlSession.selectOne("user.selectOne");
		return uMap;
	}

}
