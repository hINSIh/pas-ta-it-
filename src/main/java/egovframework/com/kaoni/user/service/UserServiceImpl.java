package egovframework.com.kaoni.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.kaoni.user.dao.UserDAO;
import egovframework.com.kaoni.user.vo.UserVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {
	
	@Resource(name="UserDAO")
	private UserDAO dao;
	
	@Override
	public boolean loginUser(String userId, String userPassword) throws Exception {
		return dao.loginUser(userId, userPassword);
	}

	@Override
	public boolean registerAccount(String userId, String userPassword, String userName) throws Exception {
		return dao.registerAccount(userId, userPassword, userName);
	}

	@Override
	public UserVO getUser(int userNo) throws Exception {
		return dao.getUser(userNo);
	}

}
