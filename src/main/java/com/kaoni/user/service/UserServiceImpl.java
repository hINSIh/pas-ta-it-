package com.kaoni.user.service;

import org.springframework.stereotype.Service;

import com.kaoni.user.vo.UserVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {

	@Override
	public boolean loginUser(String userId, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerAccount(String userId, String userPassword, String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO getUser(int userNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
