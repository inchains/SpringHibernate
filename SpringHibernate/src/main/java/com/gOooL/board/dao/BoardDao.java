package com.gOooL.board.dao;

import java.util.List;

import com.gOooL.dao.model.Board;

public interface BoardDao {

	List<Board> getBoards(String type);
	
	void insertBoard(Board board) throws RuntimeException;
}
