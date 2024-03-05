package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

@Controller
@RequestMapping("/guest")
public class GuestbookController {
	
	@Autowired
	GuestbookService guestbookService;
	
	@RequestMapping(value="/add")
	public String addList(Model model) {
		System.out.println("GuestbookController.addList()");
		
		List<GuestbookVo> guestList = guestbookService.exeAddList();
		model.addAttribute("guestList", guestList);
		
		return "guest/addList";
	}
	
	
	
	
	
}
