package com.webproject.foodDelivery.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webproject.foodDelivery.controller.LoginController;
import com.webproject.foodDelivery.dto.LoginVO;
import com.webproject.foodDelivery.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	private LoginService loginservice;
	
	//로그인 컨트롤. 로그인 페이지에 들어갈 때
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute LoginVO vo) {
	}
	
	//로그인 페이지에서 form을 전송할 때
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public void loginPOST(@ModelAttribute LoginVO vo, HttpSession session, Model model,HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		session = request.getSession();
		//세션이 이미 login값이 들어있다면 이 값을 지워준다.
		if(session.getAttribute("login") != null) {
			
		}
		
		
		
		
		
		LoginVO loginvo = loginservice.login(vo);
		
		if(loginvo == null) {
			return;
		}
		
		model.addAttribute("loginVO", loginvo);
	}
}
