package com.gOooL.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gOooL.dao.model.Authority;
import com.gOooL.dao.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public User getUserByUserId(String userId) {
		
		StringBuffer sbQry = new StringBuffer()
		.append("  from Users u 			")
		.append(" where u.userId = :userId 	");
		
		User users = (User)sessionFactory.getCurrentSession().createQuery(sbQry.toString()).setString("userId", userId).uniqueResult();
		
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<Authority> getAuthorityByUserId(String userId) {

		StringBuffer sbQry = new StringBuffer()
		.append("  from Authority a 			")
		.append(" where a.userId = :userId 		");
		
		return (List<Authority>)sessionFactory.getCurrentSession().createQuery(sbQry.toString()).setString("userId", userId).list();
	}
}
