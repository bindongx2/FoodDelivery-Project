package com.webproject.foodDelivery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.webproject.foodDelivery.dto.LoginVO;

@Repository
public class LoginDAO {

	private SqlSession session;
	private static String namespace = "com.webproject.foodDelivery.dao";
	
	public List<LoginVO> register() throws Exception {
		return session.selectOne(namespace+".register");
	}
	
	public LoginVO login(LoginVO vo) throws Exception{
		return session.selectOne(namespace+".login");
	}
}
