package com.kaoni.it.user.service;

import org.springframework.stereotype.Service;

import com.kaoni.it.user.vo.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {

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
