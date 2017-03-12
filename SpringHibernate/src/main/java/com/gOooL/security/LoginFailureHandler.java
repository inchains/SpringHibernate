package com.gOooL.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.transaction.annotation.Transactional;

import com.gOooL.dao.model.User;
import com.gOooL.user.dao.UserDao;

@Transactional
public class LoginFailureHandler implements AuthenticationFailureHandler {

	private String loginFormPath;

	@Autowired
	UserDao userDao;
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

		String userId = request.getParameter("userid");
		
		User user = userDao.getUserByUserId(userId);

		if(user != null) {

			Integer loginFailCnt = user.getLoginFailCnt() + 1;
			
			user.setLoginFailCnt(loginFailCnt);
		}

		request.getRequestDispatcher(loginFormPath).forward(request, response);
	}

	public void setLoginFormPath(String loginFormPath) {
		this.loginFormPath = loginFormPath;
	}
}
