package com.webproject.foodDelivery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webproject.foodDelivery.dto.LoginVO;

@Service
public interface LoginService {
	public List<LoginVO> register() throws Exception;
	public LoginVO login(LoginVO vo) throws Exception;
}
