package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Service
public class GuestbookService {

	@Autowired
	GuestbookDao guestbookDao;
	
	public List<GuestbookVo> exeAddList() {
		System.out.println("GuestbookService.exeAddList()");
		
		List<GuestbookVo> guestList = guestbookDao.guestSelect();
		
		return guestList;
	}
	
	
	
	
	
}
