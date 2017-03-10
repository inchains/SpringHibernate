package com.gOooL.security;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.gOooL.dao.model.Authority;
import com.gOooL.dao.model.User;
import com.gOooL.user.dao.UserDao;

@Transactional
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	UserDao userDao;
	
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		UsernamePasswordAuthenticationToken authToken = (UsernamePasswordAuthenticationToken) authentication;
		User user = findUserById(authToken.getName());
		
		System.out.println("=====================================================");
		System.out.println(authToken.getName());
		System.out.println(authToken.getCredentials());
		System.out.println("=====================================================");
		
		if (user == null) {
			throw new UsernameNotFoundException(authToken.getName());
		}

		if (!matchPassword(user.getPassword(), authToken.getCredentials())) {
			throw new BadCredentialsException("not matching username or password");
		}

		List<GrantedAuthority> authorities = getAuthorities(user.getUserId());
		
		return new UsernamePasswordAuthenticationToken(
			new UserInfo(user.getUserId(), user.getName(), user.getPassword()),
			null,
			authorities
		);
	}

	private User findUserById(String userId) {		
		
		return userDao.getUserByUserId(userId);
	}

	private List<GrantedAuthority> getAuthorities(String userId) {
		
		List<Authority> auths = userDao.getAuthorityByUserId(userId);
		
		if (auths == null)
			return Collections.emptyList();

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(auths.size());
		
		for (Authority auth : auths) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}
		
		return authorities;
	}

	private boolean matchPassword(String password, Object credentials) {
		return password.equals(credentials);
	}
	
	public boolean supports(Class<?> authentication) {
		
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}
}
