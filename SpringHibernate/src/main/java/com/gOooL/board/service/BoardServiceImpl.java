package com.gOooL.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gOooL.board.dao.BoardDao;
import com.gOooL.dao.model.Board;


@Service
public class BoardServiceImpl implements BoardService {

	@Autowired 
	BoardDao boardDao;
	
	@Transactional
	public List<Board> getBoards(String type) {

		return boardDao.getBoards(type);
	}

	@Transactional
	public Board getBoard(String seq) {

		return boardDao.getBoard(seq);
	}
	
	public void insertBoard(Board board) throws RuntimeException {
		
		boardDao.insertBoard(board);		
	}

	@Transactional
	public List<Board> getTranTest() throws RuntimeException {

		Board board = new Board();
		board.setTitle("TITLE1");
		board.setContent("CONTENT2");
		
		insertBoard(board);
		
//		int z = 4 / 0;
		
		board = new Board();
		board.setTitle("TITLE2");
		board.setContent("CONTENT2");
		
		insertBoard(board);

		return boardDao.getBoards("B");
	}
}
