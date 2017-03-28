package com.gOooL.board.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gOooL.dao.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Board> getBoards(String type) {

		return (List<Board>)sessionFactory.getCurrentSession().createQuery(" from Board where type = '" + type + "'").list();
	}

	public void insertBoard(Board board) throws RuntimeException {

		sessionFactory.getCurrentSession().save(board);
	}
}
