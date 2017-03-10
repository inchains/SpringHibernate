package com.gOooL.user.dao;

import java.util.List;

import com.gOooL.dao.model.Authority;
import com.gOooL.dao.model.User;

public interface UserDao {

	public User getUserByUserId(String userId);

	public List<Authority> getAuthorityByUserId(String userId);
}
