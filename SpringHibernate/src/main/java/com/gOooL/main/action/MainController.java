package com.gOooL.main.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gOooL.board.service.BoardService;
import com.gOooL.dao.model.Board;

@Controller
public class MainController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/main")
	public String main(Model model) throws RuntimeException {
		
		List<Board> aBoard = boardService.getBoards("A");
		List<Board> bBoard = boardService.getBoards("B");
		
		model.addAttribute("aBoard", aBoard);
		model.addAttribute("bBoard", bBoard);
		
		return "main/main";
	}
	
	@RequestMapping("/main/popup")
	public String popup(HttpServletRequest request, Model model) throws RuntimeException {
		
		Board bBoard = boardService.getBoard(request.getParameter("seq"));
		
		model.addAttribute("bBoard", bBoard);
		
		return "main/popup";
	}
}
