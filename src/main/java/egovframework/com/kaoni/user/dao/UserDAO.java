package egovframework.com.kaoni.user.dao;

import org.springframework.stereotype.Repository;

import egovframework.com.kaoni.user.vo.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("UserDAO")
public class UserDAO extends EgovAbstractDAO {
	
	/**
	 * 로그인
	 * @param userId
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	public boolean loginUser(String userId, String userPassword) throws Exception{
		return false;
	}
	
	/**
	 * 회원가입
	 * @param userId
	 * @param userPassword
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean registerAccount(String userId, String userPassword, String userName) throws Exception{
		return false;
	}
	
	/**
	 * 회원정보 가져오기
	 * @param userNo
	 * @return
	 * @throws Exception
	 */
	public UserVO getUser(int userNo) throws Exception{
		return null;
	}
}
