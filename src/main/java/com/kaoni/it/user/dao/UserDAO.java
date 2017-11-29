package com.kaoni.it.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kaoni.it.user.vo.UserVO;

@Repository("UserDAO")
public class UserDAO {

	private static final String NAMESPACE = "user";
	private static final String USERJOIN = NAMESPACE + "userJoin";

	@Inject
	private SqlSession session;

	public void example() {
		Map<String, String> param = new HashMap<>();
		param.put("user_id", "jwseo99");
		param.put("user_pw", "jwjwjw");
		param.put("user_name", "서재원");
		
		List<UserVO> userVO = session.selectList("user.userLogin");
		
		// userJoin같이 파라미터 넘기는건 공부해야함
	}
}
