package com.kaoni.it.user.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kaoni.it.user.dao.UserDAO;

@Controller
public class UserController {

	@Resource(name="UserDAO")
	private UserDAO userDAO;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main() {
		logger.debug("222222222");

		return "login/login_main.jsp";
	}
}
