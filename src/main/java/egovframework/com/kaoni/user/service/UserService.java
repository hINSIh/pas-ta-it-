package egovframework.com.kaoni.user.service;

import egovframework.com.kaoni.user.vo.UserVO;

public interface UserService {
	boolean loginUser(String userId, String userPassword) throws Exception;

	boolean registerAccount(String userId, String userPassword, String userName) throws Exception;
	
	UserVO getUser(int userNo) throws Exception;
}
