package com.kaoni.user.service;

import com.kaoni.user.vo.UserVO;

public interface UserService {
	boolean loginUser(String userId, String userPassword);

	boolean registerAccount(String userId, String userPassword, String userName);
	
	UserVO getUser(int userNo);
}
