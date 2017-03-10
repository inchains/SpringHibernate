package com.gOooL.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.transaction.annotation.Transactional;

import com.gOooL.dao.model.User;
import com.gOooL.user.dao.UserDao;

@Transactional
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	UserDao userDao;
	
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		
		UserInfo userInfo = (UserInfo)authentication.getPrincipal();
		String userId = userInfo.getUserId();
		
		User user = userDao.getUserByUserId(userId);
		
		Integer loginCnt = user.getLoginCnt() + 1;
		
		user.setLoginCnt(loginCnt);
		
//		if (retUrl == null || retUrl.isEmpty()) {
//			response.sendRedirect(request.getContextPath() + "/");
//			return;
//		}
		
		response.sendRedirect("/index");
	}
}
