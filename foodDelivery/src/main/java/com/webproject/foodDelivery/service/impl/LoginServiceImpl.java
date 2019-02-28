package com.webproject.foodDelivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webproject.foodDelivery.dao.LoginDAO;
import com.webproject.foodDelivery.dto.LoginVO;
import com.webproject.foodDelivery.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public List<LoginVO> register() throws Exception {
		// TODO 2019-02-07 회원가입시 데이터 등록(저장)
		return loginDAO.register();
	}

	@Override
	public LoginVO login(LoginVO vo) throws Exception {
		// TODO 2019-02-26 로그인
		return loginDAO.login(vo);
	}


}
