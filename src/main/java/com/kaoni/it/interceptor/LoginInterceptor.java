package com.kaoni.it.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	/*public String loginUrl;

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String requestURI = request.getRequestURI();
		requestURI = requestURI.substring(request.getContextPath().length());
		
		System.out.println(requestURI+", "+loginUrl);
		
		if(requestURI.equalsIgnoreCase(loginUrl)) {
			return true;
		}
		
		HttpSession session = request.getSession();
		if (session.getAttribute("login") == null) {
			response.sendRedirect("./login");
			return false;
		}

		return true;
	}*/
}
