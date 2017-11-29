package egovframework.com.kaoni.user.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.com.kaoni.user.service.UserService;
import egovframework.com.kaoni.user.vo.UserVO;

@Controller
public class UserController {

	@Resource(name="UserService")
	private UserService service;
	
	/**
	 * 로그인
	 * @param userId
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	public String loginUser(String userId, String userPassword) throws Exception{
		try {
			service.loginUser(userId, userPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 회원가입
	 * @param userId
	 * @param userPassword
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public String registerAccount(String userId, String userPassword, String userName) throws Exception{
		try {
			service.registerAccount(userId, userPassword, userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 회원 정보 가져오기
	 * @param userNo
	 * @return
	 * @throws Exception
	 */
	public String getUser(int userNo) throws Exception{
		try {
			service.getUser(userNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
