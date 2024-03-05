package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Service
@RequestMapping(value="/guest")
public class GuestbookService {

	@Autowired
	GuestbookDao guestbookDao;
	
	@RequestMapping(value="/add", method = {RequestMethod.GET, RequestMethod.POST})
	public List<GuestbookVo> exeAddList() {
		System.out.println("GuestbookService.exeAddList()");
		
		List<GuestbookVo> guestList = guestbookDao.guestSelect();
		
		return guestList;
	}
	
	
	
	
	
}
