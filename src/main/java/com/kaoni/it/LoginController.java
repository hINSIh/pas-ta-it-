package com.kaoni.it;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kaoni.it.user.dao.UserDAO;
import com.kaoni.it.user.vo.UserVO;

@Controller
public class LoginController {

	@Resource(name="UserDAO")
	private UserDAO userDAO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login/login_main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
		return "redirect:/";
	}

	@RequestMapping(value = "/loginTab")
	public String loginTab() {
		return "login/login";
	}

	@RequestMapping(value = "/registerTab")
	public String registerTab() {
		return "login/join";
	}
}
