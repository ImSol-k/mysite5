package com.javaex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*********
	 * login */
	@RequestMapping(value="/loginform", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginform()");
		
		return "user/loginForm";
	}
	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(@RequestParam(value="id") String id,
					    @RequestParam(value="pw") String pw,
					    HttpServletRequest request) {
		System.out.println("UserController.login()");
		
		UserVo userVo = new UserVo(id, pw);
		UserVo authUser = userService.exeLogin(userVo);
		
		if(authUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("authUser", authUser);
			System.out.println(authUser);
			
			return "redirect:/main";
		} else {
			
			return "user/loginForm";
		}
		
	}
	
	/*********
	 * join	 */
	@RequestMapping(value="/joinform", method = {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
		System.out.println("UserController.joinform()");
		
		return "user/joinForm";
	}
	@RequestMapping(value="/join", method = {RequestMethod.GET, RequestMethod.POST})
	public String join() {
		System.out.println("UserController.join()");
		
		return "redirect:/user/loginform";
	}
	
	
	
	
}