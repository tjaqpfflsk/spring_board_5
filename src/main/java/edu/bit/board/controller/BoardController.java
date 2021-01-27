package edu.bit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class BoardController {
	
	private BoardService boardSrevice;

	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list",boardSrevice.getList());
		
	}
	
	@GetMapping("/write_view")
	public String write_view(Model model) {
		log.info("write_view");
		
		return "write_view";
		
	}
	
	@PostMapping("/write")
	public String write(BoardVO boardVO ,Model model)throws Exception {
		log.info("write()");
		
		boardSrevice.writeBoard(boardVO);
		
		return "redirect:list";
		
	}
	
	
	
}
