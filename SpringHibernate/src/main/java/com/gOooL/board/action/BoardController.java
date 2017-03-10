package com.gOooL.board.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gOooL.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping("/board/list.do")
	public String list(Model model) throws RuntimeException {

//		List<Board> boards = boardService.getTranTest();

		return "board/list";
	}
}
