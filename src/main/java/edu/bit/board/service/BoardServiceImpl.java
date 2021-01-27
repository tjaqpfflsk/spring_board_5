package edu.bit.board.service;

import java.util.List;


import org.springframework.stereotype.Service;

import edu.bit.board.controller.BoardController;
import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;
import jdk.internal.org.jline.utils.Log;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		mapper.insert(boardVO);
		//안에 객체를 집어넣는다는데 
		
	}

	@Override
	public BoardVO getBoard(int bno) {
		log.info("getBoard................");
	
		return mapper.read(bno);
	}

	@Override
	public int delete(int bId) {
		log.info("delete");
		return mapper.delete(bId);
	}

	@Override
	public void reply(BoardVO boardVO) {
		mapper.reply(boardVO);
		
	}

	@Override
	public void modify(BoardVO boardVO) {
		mapper.modify(boardVO);
		
	}
	
	
	
}
