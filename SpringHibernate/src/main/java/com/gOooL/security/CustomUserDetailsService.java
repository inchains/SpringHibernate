package com.gOooL.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.gOooL.user.dao.UserDao;

@Transactional
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserDao userDao;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserInfo userInfo = findUserInfo(username);
		
		userDao.getUserByUserId("aa");
			
		if (userInfo == null)
			throw new UsernameNotFoundException(username);

		List<UserPermission> perms = loadPermission(userInfo.getUserId());
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		
		for (UserPermission perm : perms) {
			auth.add(new SimpleGrantedAuthority(perm.getName()));
		}
		
		return new User(username, userInfo.getPassword(), auth);
	}

	private UserInfo findUserInfo(String username) {
		return userMap.get(username);
	}

	private List<UserPermission> loadPermission(String username) {
		return permMap.get(username);
	}

	private Map<String, UserInfo> userMap = new HashMap<String, UserInfo>();
	private Map<String, List<UserPermission>> permMap = new HashMap<String, List<UserPermission>>();

	public CustomUserDetailsService() {
		userMap.put("system", new UserInfo("system", "시스템", "sys"));
		permMap.put("system", Arrays.asList(new UserPermission(1L, "SYSTEM_USER")));
	}
}
