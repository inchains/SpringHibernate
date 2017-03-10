package com.gOooL.security;

public class UserInfo {

	private String userId;
	private String name;
	private String password;

	public UserInfo(String userId, String name, String password) {
		
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}
