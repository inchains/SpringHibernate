package com.gOooL.board.service;

import java.util.List;

import com.gOooL.dao.model.Board;

public interface BoardService {

	List<Board> getBoards();

	void insertBoard(Board board) throws RuntimeException;
	
	List<Board> getTranTest() throws RuntimeException;

}
