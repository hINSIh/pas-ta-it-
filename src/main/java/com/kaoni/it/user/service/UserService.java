package com.kaoni.it.user.service;

import com.kaoni.it.user.vo.UserVO;

public interface UserService {
	boolean loginUser(String userId, String userPassword);

	boolean registerAccount(String userId, String userPassword, String userName);
	
	UserVO getUser(int userNo);
}
