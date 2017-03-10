package com.gOooL.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USERID")
	private String userId;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "LOGINCNT")
	private Integer loginCnt;
	
	@Column(name = "LOGINFAILCNT")
	private Integer loginFailCnt;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLoginCnt() {
		return loginCnt;
	}

	public void setLoginCnt(Integer loginCnt) {
		this.loginCnt = loginCnt;
	}

	public Integer getLoginFailCnt() {
		return loginFailCnt;
	}

	public void setLoginFailCnt(Integer loginFailCnt) {
		this.loginFailCnt = loginFailCnt;
	}
}
