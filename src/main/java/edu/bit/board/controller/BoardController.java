package edu.bit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO ,Model model)throws Exception {
		log.info("content_view()");
		
		model.addAttribute("content_view",boardSrevice.getBoard(boardVO.getbId()));
		return "content_view";
		
	}
	
	@GetMapping("/delete")
	public String delet(@RequestParam("bId") int bId ,Model model)throws Exception {
		log.info("delete()");
		
		boardSrevice.delete(bId);
		return "redirect:list";
		
	}
	
	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO ,Model model)throws Exception {
		log.info("reply_view()");
		
		model.addAttribute("reply_view",boardSrevice.getBoard(boardVO.getbId()));
		return "reply_view";
		
	}
	
	@PostMapping("/reply")
	public String reply(BoardVO boardVO ,Model model)throws Exception {
		log.info("reply()");
		
		boardSrevice.reply(boardVO);
		return "redirect:list";
		
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO boardVO ,Model model)throws Exception {
		log.info("modify()");
		
		boardSrevice.modify(boardVO);
		return "redirect:list";
		
	}
	
	
	
}
